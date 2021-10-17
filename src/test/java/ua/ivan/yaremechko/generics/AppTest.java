package ua.ivan.yaremechko.generics;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AppTest {

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}

	private static Test suite() {

		TestSuite suite = new TestSuite();

		suite.addTest(new JUnit4TestAdapter(InnerJoinOperationTest.class));
		suite.addTest(new JUnit4TestAdapter(LeftJoinOperationTest.class));
		suite.addTest(new JUnit4TestAdapter(RightJoinOperationTest.class));

		return suite;
	}

}
