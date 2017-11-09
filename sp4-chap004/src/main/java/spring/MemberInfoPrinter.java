package spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberInfoPrinter {
	
//	@Autowired(required=false)  객체를 이용해서 사용
	
	
	@Resource(name="memberDao") // 빈 이름을 이용해서 사용
	private MemberDao memDao;
	private MemberPrinter printer;

	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}

	
//	@Autowired
//	@Qualifier("sysout")    객체를 이용해서 사용   여러개의 파라미터 받을시 파라미터 에 @Qualifier()   
//	public void setPrinter(MemberDao memberDao,
//			@Qualifier("sysout")MemberPrinter printer) {
//		this.memDao = memberDao;
//		this.printer = printer;
//	}
	
	
	@Resource(name="memberPrinter")  //빈 이름을 이용해서 사용!!
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}
}
