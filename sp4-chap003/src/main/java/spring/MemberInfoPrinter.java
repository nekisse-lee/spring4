package spring;

public class MemberInfoPrinter {
	private MemberDao memDao;
	private MemberPrinter printer;

	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}

	public void setMemberPrinter(MemberPrinter memberPrinter) {
		this.printer = memberPrinter;
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
