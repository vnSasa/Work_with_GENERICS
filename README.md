# Having JoinOperation interface, provide three implementations of this interface:

public interface JoinOperation <D1, D2, R>{
	Collection<R> join(Collection<D1> leftCollection, Collection<D2> rightCollection);
}

# 1.	InnerJoinOperation
# 2.	LeftJoinOperation
# 3.	RightJoinOperation

D1 - is a generic type of the elements in left collection

D2 - is a generic type of the elements in right collection

R - is a generic type of the elements in resulting collection

For the InnerJoinOperation, LeftJoinOperation and RightJoinOperation create two classes that holds the data:
DataRow<K, V>, where K is a generic type of the key, V is a generic type of the value.
JoinedDataRow<K, V1, V2>, where K is a generic type of the key, V1 and V2 are generic types of the values
For our task DataRow<K, V> is your D1/D2 and JoinedDataRow<K, V1, V2> is R in the implementation classes.
So, the signature in the InnerJoinOperation, LeftJoinOperation and RightJoinOperation should look like next:
Collection<JoinedDataRow<K, V1, V2>> join(Collection<DataRow<K, V1>> leftCollection, Collection<DataRow<K, V2>> rightCollection);
Join should be performed by key: K

From algorithm point of view:

1.	For simplicity we can say there is no duplicated keys in each separate collection.
2.	Hint: start with simple approach and then think about optimizations.

Create JUnit tests for all implementations.

Junit test should be executed by mvn test command

InnerJoinOperation.join gives: [JoinedDataRow(0, "Ukraine", "Kyiv"), JoinedDataRow(1, "Germany", "Berlin")]

LeftJoinOperation.join gives: [JoinedDataRow(0, "Ukraine", "Kyiv"), JoinedDataRow(1, "Germany", "Berlin"), JoinedDataRow(2, "France", null)]

RightJoinOperation.join gives: [JoinedDataRow(0, "Ukraine", "Kyiv"), JoinedDataRow(1, "Germany", "Berlin"), JoinedDataRow(3, null, "Budapest")]
