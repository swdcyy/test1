package com.kwai.sharelib.exception.ForwardCancelException;
import wo7.a;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Exception;
import nsd.u;
import java.lang.Throwable;
import com.kwai.sharelib.KsShareApi;
import android.app.Application;

public final class ForwardCancelException extends RuntimeException implements a	// class@0016bf
{
    public final String toast;

    public void ForwardCancelException(){
       super(null, null, null, 7, null);
    }
    public void ForwardCancelException(String p0){
       super(p0, null, null, 6, null);
    }
    public void ForwardCancelException(String p0,Exception p1){
       super(p0, p1, null, 4, null);
    }
    public void ForwardCancelException(String p0,Exception p1,String p2){
       super(p0, p1);
       this.toast = p2;
    }
    public void ForwardCancelException(String p0,Exception p1,String p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = null;
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = KsShareApi.s.k().getString(R.string.arg_RES_7f1047d6);
       }
       super(p0, p1, p2);
       return;
    }
    public String getToast(){
       return this.toast;
    }
}
