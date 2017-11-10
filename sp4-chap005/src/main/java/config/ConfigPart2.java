package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberPrinter;

@Configuration
public class ConfigPart2 {

	@Autowired
	private MemberDao memberDao;
	
//	@Autowired                            위코드와 동일 장점은
//	 30줄    MemberDao 객체가 어떤 클래스에 정의되어 있는지 알 수 있다.				
//	private ConfigPart1 configpart1;
	
	@Bean
	public MemberPrinter printer() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao);
//		infoPrinter.setMemberDao(configpart1.memberDao());
		infoPrinter.setPrinter(printer());
		return infoPrinter;
	}
	
}
