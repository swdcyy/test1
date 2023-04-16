package com.yxcorp.image.common.exception.ImageInitializeThrowable;
import java.lang.Throwable;
import java.lang.String;
import java.lang.StringBuilder;

public class ImageInitializeThrowable extends Throwable	// class@001a05
{

    public void ImageInitializeThrowable(String p0,Throwable p1){
       super("[Image initialization error occurred and error msg]:"+p0, p1);
    }
}
