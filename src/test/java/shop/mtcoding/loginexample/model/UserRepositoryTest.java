package shop.mtcoding.loginexample.model;

import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;

@MybatisTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    public void findByUsernameAndPassword_test() throws Exception {
        // given
        ObjectMapper om = new ObjectMapper();

        // when
        // List<UserRespDto> BoardMainRespDto = boardRepository.findAllWithUser();
        // String responseBody = om.writeValueAsString(BoardMainRespDto);
        // System.out.println("테스트 : " + responseBody);

        // // 테스트 2번
        // // BoardMainRespDto.forEach((dto)->{
        // // System.out.println("테스트 : "+dto.getId());
        // // System.out.println("테스트 : "+dto.getTitle());
        // // System.out.println("테스트 : "+dto.getUsername());
        // // });

        // then
        // assertThat(BoardMainRespDto.get(5).getUsername()).isEqualTo("love");
    }

}
