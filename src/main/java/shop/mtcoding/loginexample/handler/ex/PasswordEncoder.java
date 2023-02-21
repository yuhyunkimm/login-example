package shop.mtcoding.loginexample.handler.ex;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncoder {

    public static String encode(String password) throws NoSuchAlgorithmException {
        // 비밀번호를 바이트 배열로 변환
        byte[] passwordBytes = password.getBytes();

        // SHA-256 해시 함수를 사용하여 해시 생성
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(passwordBytes);
        byte[] hashBytes = messageDigest.digest();

        // 해시 값을 16진수 문자열로 변환
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : hashBytes) {
            stringBuilder.append(String.format("%02x", b));
        }
        String hash = stringBuilder.toString();

        return hash;
    }
}
