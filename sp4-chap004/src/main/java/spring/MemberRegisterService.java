package spring;

//import static org.junit.Assert.assertFalse;

import java.util.Date;

import javax.annotation.Resource;

//import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {
	@Resource(name="memberDao")   // 빈이름으로 사용!
	private MemberDao memberDao;

//	@Autowired(required = false)   //타입을 이용해서 사용!!
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public MemberRegisterService() {
	}

	public void regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		if (member != null) {
			throw new AlreadyExistingMemberException("dup email " + req.getEmail());
		}
		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), new Date());
		memberDao.insert(newMember);
	}
}
