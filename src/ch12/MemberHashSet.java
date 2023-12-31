package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		//get을 이용한 순회.
//		for(int i = 0 ;i < hashSet.size();i++) {
//			Member member = hashSet.get(i);
//			
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				hashSet.remove(i);
//				return true;
//			}
//		}
		
		//Iterator를 이용한 순회.
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member =ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		
		for(Member mem:hashSet) {
			System.out.println(mem);
		}
		System.out.println();
	}

	
}
