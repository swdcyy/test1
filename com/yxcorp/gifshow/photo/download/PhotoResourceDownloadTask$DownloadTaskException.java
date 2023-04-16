package com.yxcorp.gifshow.photo.download.PhotoResourceDownloadTask$DownloadTaskException;
import java.lang.Exception;
import java.lang.String;

public class PhotoResourceDownloadTask$DownloadTaskException extends Exception	// class@000ec8
{
    public int mErrorCode;

    public void PhotoResourceDownloadTask$DownloadTaskException(int p0,String p1){
       super(p1);
       this.mErrorCode = p0;
    }
    public void PhotoResourceDownloadTask$DownloadTaskException(String p0){
       super(p0);
    }
}
