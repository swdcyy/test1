package com.yxcorp.gifshow.share.util.ForwardNotSupportedException;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.Exception;
import nsd.u;
import java.lang.Throwable;

public final class ForwardNotSupportedException extends UnsupportedOperationException	// class@001c7e
{

    public void ForwardNotSupportedException(){
       super(null, null, 3, null);
    }
    public void ForwardNotSupportedException(String p0){
       super(p0, null, 2, null);
    }
    public void ForwardNotSupportedException(String p0,Exception p1){
       super(p0, p1);
    }
    public void ForwardNotSupportedException(String p0,Exception p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
}
