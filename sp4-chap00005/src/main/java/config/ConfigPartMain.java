package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.MemberDao;
import spring.MemberRegisterService;

@Configuration
@Import(ConfigPartSub.class)  //만약 임포트할 클래스가 두개 이상이면 배열로 지  @Import({A.class, B.class})
public class ConfigPartMain {

	@Bean
	public MemberDao memberDao(){
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return  new MemberRegisterService(memberDao());
	}
	
	
	
}
