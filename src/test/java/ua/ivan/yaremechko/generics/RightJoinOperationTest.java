package ua.ivan.yaremechko.generics;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import junit.framework.Assert;

public class RightJoinOperationTest {

	@Test
	public void RightJoinOperationTest() throws Exception {

		Collection<DataRow<Integer, String>> leftCollection = new ArrayList<DataRow<Integer, String>>();
		Collection<DataRow<Integer, String>> rightCollection = new ArrayList<DataRow<Integer, String>>();

		leftCollection.add(new DataRow<Integer, String>(0, "Ukraine"));
		leftCollection.add(new DataRow<Integer, String>(1, "Germany"));
		leftCollection.add(new DataRow<Integer, String>(2, "France"));

		rightCollection.add(new DataRow<Integer, String>(0, "Kyiv"));
		rightCollection.add(new DataRow<Integer, String>(1, "Berlin"));
		rightCollection.add(new DataRow<Integer, String>(3, "Budapest"));

		RightJoinOperation<Integer, String, String> rightJoinOpertion = new RightJoinOperation<Integer, String, String>();
		ArrayList<JoinedDataRow<Integer, String, String>> rightArrayList = (ArrayList<JoinedDataRow<Integer, String, String>>) rightJoinOpertion
				.join(leftCollection, rightCollection);

		Collection<JoinedDataRow<Integer, String, String>> result = new ArrayList<JoinedDataRow<Integer, String, String>>();

		result.add(new JoinedDataRow<Integer, String, String>(0, "Ukraine", "Kyiv"));
		result.add(new JoinedDataRow<Integer, String, String>(1, "Germany", "Berlin"));
		result.add(new JoinedDataRow<Integer, String, String>(3, null, "Budapest"));

		Assert.assertEquals(rightArrayList, result);

	}

}
