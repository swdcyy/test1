package com.yxcorp.gifshow.share.exception.PhotoDownloadInProgressException;
import qhc.a;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Exception;
import nsd.u;
import java.lang.Throwable;

public final class PhotoDownloadInProgressException extends RuntimeException implements a	// class@001b81
{
    public final String toast;

    public void PhotoDownloadInProgressException(){
       super(null, null, null, 7, null);
    }
    public void PhotoDownloadInProgressException(String p0,Exception p1,String p2){
       super(p0, p1);
       this.toast = p2;
    }
    public void PhotoDownloadInProgressException(String p0,Exception p1,String p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = null;
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public String getToast(){
       return this.toast;
    }
}
