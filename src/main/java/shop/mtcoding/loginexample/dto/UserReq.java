package shop.mtcoding.loginexample.dto;

import lombok.Getter;
import lombok.Setter;

public class UserReq {
    @Getter
    @Setter
    public static class JoinReqDto {
        private String username;
        private String password;
        private String email;
    }

    @Getter
    @Setter
    public static class LoginReqDto {
        private String username;
        private String password;
    }
}
