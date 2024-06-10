/*
 * package org.dendrocopos.chzzkbot.core.api;
 * 
 * import org.dendrocopos.chzzkbot.core.utils.ErrorCode;
 * 
 * public class ApiResponse<T> {// 클래스 객체타입 T 지정 ApiHeader header; private
 * ApiBody body; private static int SUCCESS = 200;// 성공 상태를 알리는 코드 200
 * 
 * 
 * public ApiResponse(ApiHeader header) { //매개변수 헤더 1개만 받는 생성자. 입력받은 헤더를 클래스 헤더로
 * 지정 }
 * 
 * public ApiResponse(ApiHeader header, ApiBody body) { // 매개변수 헤더, 바디 2개 받는
 * 생성자. 입력받은 헤더와 바디를 클래스 헤더, 바디로 지정 this.header = header; this.body = body; }
 * 
 * public static <T> ApiResponse<T> OK(T data) {// Ok응답 정적 메소드 return new
 * ApiResponse<>(ApiHeader.builder()// 헤더를 메소드체이닝으로 빌더 패턴 사용해 객체 생성.
 * .resultCode(SUCCESS) .codeName("SUCCESS") .build() //
 * 
 * ,ApiBody // 바디를 메소드체이닝으로 빌더 패턴 사용해 객체 생성. .builder() .data(data) .msg(null)
 * .build() ); }
 * 
 * public static <T> ApiResponse<T> FAIL(ErrorCode errorCode) { return new
 * ApiResponse<>( // FAIL응답 정적 메소드 ApiHeader.builder() // 헤더를 메소드체이닝으로 빌더 패턴 사용해
 * 객체 생성. .resultCode(errorCode.getCode()) .codeName(errorCode.name()) .build()
 * ,ApiBody .builder() // 바디를 메소드체이닝으로 빌더 패턴 사용해 객체 생성. .data(null)
 * .msg(errorCode.getMessage()) .build() ); } }
 */