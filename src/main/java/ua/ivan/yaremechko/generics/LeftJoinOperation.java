package ua.ivan.yaremechko.generics;

import java.util.ArrayList;
import java.util.Collection;

public class LeftJoinOperation <K, V1, V2> implements JoinOperation<DataRow<K, V1>, DataRow<K, V2>, JoinedDataRow<K, V1, V2>>{

	public Collection<JoinedDataRow<K, V1, V2>> join(Collection<DataRow<K, V1>> leftCollection,
			Collection<DataRow<K, V2>> rightCollection) {
		
		Collection<JoinedDataRow<K, V1, V2>> result = new ArrayList<JoinedDataRow<K,V1,V2>>();
		
		for(DataRow<K, V1> leftItem : leftCollection) {
			boolean found = false;
			
			for(DataRow<K, V2> rightItem : rightCollection) {
				if(leftItem.getKey() == rightItem.getKey()) {
					result.add(new JoinedDataRow<K, V1, V2>(leftItem.getKey(), leftItem.getValue(), rightItem.getValue()));
					found = true;
					break;
				}
			}
			
			if(!found) {
				result.add((JoinedDataRow<K, V1, V2>) new JoinedDataRow<K, V1, Object>(leftItem.getKey(), leftItem.getValue(), null));
			}
		}
		
		return result ;
	}


	
}
