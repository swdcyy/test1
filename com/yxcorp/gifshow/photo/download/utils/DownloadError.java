package com.yxcorp.gifshow.photo.download.utils.DownloadError;
import java.lang.RuntimeException;

public class DownloadError extends RuntimeException	// class@000f20
{
    public final int mCode;

    public void DownloadError(int p0){
       super();
       this.mCode = p0;
    }
    public int getCode(){
       return this.mCode;
    }
}
