package ua.ivan.yaremechko.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
	public static void main(String[] args) {

		Set<DataRow<Integer, String>> leftCollection = new LinkedHashSet<DataRow<Integer, String>>();
		Set<DataRow<Integer, String>> rightCollection = new LinkedHashSet<DataRow<Integer, String>>();

		leftCollection.add(new DataRow<Integer, String>(0, "Ukraine"));
		leftCollection.add(new DataRow<Integer, String>(1, "Germany"));
		leftCollection.add(new DataRow<Integer, String>(2, "France"));

		rightCollection.add(new DataRow<Integer, String>(0, "Kyiv"));
		rightCollection.add(new DataRow<Integer, String>(1, "Berlin"));
		rightCollection.add(new DataRow<Integer, String>(3, "Budapest"));

//    	InnerJoinOperation
		System.out.println("---InnerJoinOperation---");

		InnerJoinOperation<Integer, String, String> innerJoinOperation = new InnerJoinOperation<Integer, String, String>();
		Collection<JoinedDataRow<Integer, String, String>> innerCollection = innerJoinOperation.join(leftCollection,
				rightCollection);

		for (JoinedDataRow<Integer, String, String> item1 : innerCollection) {
			System.out.println(item1);
		}
		System.out.println();

//    	LeftJoinOperation
		System.out.println("---LeftJoinOperation---");

		LeftJoinOperation<Integer, String, String> leftJoinOperation = new LeftJoinOperation<Integer, String, String>();
		ArrayList<JoinedDataRow<Integer, String, String>> leftArrayList = (ArrayList<JoinedDataRow<Integer, String, String>>) leftJoinOperation
				.join(leftCollection, rightCollection);

		for (JoinedDataRow<Integer, String, String> item2 : leftArrayList) {
			System.out.println(item2);
		}
		System.out.println();

//    	RightJoinOperation
		System.out.println("---RightJoinOperation---");

		RightJoinOperation<Integer, String, String> rightJoinOpertion = new RightJoinOperation<Integer, String, String>();
		ArrayList<JoinedDataRow<Integer, String, String>> rightArrayList = (ArrayList<JoinedDataRow<Integer, String, String>>) rightJoinOpertion
				.join(leftCollection, rightCollection);

		for (JoinedDataRow<Integer, String, String> item3 : rightArrayList) {
			System.out.println(item3);
		}

	}
}
