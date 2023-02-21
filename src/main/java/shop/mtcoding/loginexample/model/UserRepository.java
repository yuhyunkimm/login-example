package shop.mtcoding.loginexample.model;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import shop.mtcoding.loginexample.dto.UserReq.JoinReqDto;

@Mapper
public interface UserRepository {

    public int insert(JoinReqDto joinReqDto);

    public int updateById(User user);

    public int deleteById(int id);

    public List<User> findAll();

    public User findById(int id);

    public User findByUsernameAndPassword(@Param("username") String username, @Param("username") String password);

}
