package com.yxcorp.gifshow.share.exception.ForwardCancelException;
import qhc.a;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Exception;
import nsd.u;
import java.lang.Throwable;
import lnc.a1;

public final class ForwardCancelException extends RuntimeException implements a	// class@001b7f
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
          p2 = a1.p(R.string.arg_RES_7f1004c5);
       }
       super(p0, p1, p2);
       return;
    }
    public String getToast(){
       return this.toast;
    }
}
