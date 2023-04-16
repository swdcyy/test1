package com.yxcorp.gifshow.feed.PaidCourseAuthFailException;
import java.lang.Exception;
import java.lang.String;

public class PaidCourseAuthFailException extends Exception	// class@000feb
{
    public String mRedirectUrl;

    public void PaidCourseAuthFailException(String p0){
       super(p0);
    }
}
