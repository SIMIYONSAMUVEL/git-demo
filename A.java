package org.gan;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {

	public static void main(String[] args) {

		Sam s = new Sam();
		s.setEmpId(100);
		s.setEmpName("Ajay");
		s.setEmpNumber(9876543210l);
//comment

		Sam s1 = new Sam();
		s1.setEmpId(200);
		s1.setEmpName("Arun");
		s1.setEmpNumber(8907654321l);

		Sam s2 = new Sam();
		s2.setEmpId(300);
		s2.setEmpName("Arjun");
		s2.setEmpNumber(976532190l);
//User defined List
		List<Sam> li = new ArrayList<>();
		li.add(s);
		li.add(s1);
		li.add(s2);

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getEmpId());
			System.out.println(li.get(i).getEmpName());
			System.out.println(li.get(i).getEmpNumber());
		}
		// User defined Set
		Set<Sam> si = new LinkedHashSet<>();
		si.add(s);
		si.add(s1);
		si.add(s2);

		for (Sam sam : si) {
			System.out.println(sam.getEmpId());
			System.out.println(sam.getEmpName());
			System.out.println(sam.getEmpNumber());
		}

		// user defined Map

		Map<Sam, Integer> mp = new LinkedHashMap<>();
		mp.put(s, 1);
		mp.put(s1, 2);
		mp.put(s2, 3);

		Set<Entry<Sam, Integer>> entrySet = mp.entrySet();
		for (Entry<Sam, Integer> entry : entrySet) {
			System.out.println(entry.getKey().getEmpId());
			System.out.println(entry.getKey().getEmpNumber());
			System.out.println(entry.getKey().getEmpName());
		}

	}

}
