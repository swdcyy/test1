package com.yxcorp.gifshow.photo.download.task.exception.DownloadException;
import java.lang.Exception;
import java.lang.String;

public class DownloadException extends Exception	// class@000ef6
{
    public int mCode;

    public void DownloadException(int p0,String p1){
       super(p1);
       this.mCode = p0;
    }
    public int getCode(){
       return this.mCode;
    }
}
