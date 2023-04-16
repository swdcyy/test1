package com.kwai.video.clipkit.post.ClipUploadException;
import java.lang.Exception;
import java.lang.String;

public class ClipUploadException extends Exception	// class@001af2
{
    public int errorCode;

    public void ClipUploadException(int p0,String p1){
       super(p1);
       this.errorCode = p0;
    }
    public int getErrorCode(){
       return this.errorCode;
    }
}
