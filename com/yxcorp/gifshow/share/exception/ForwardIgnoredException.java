package com.yxcorp.gifshow.share.exception.ForwardIgnoredException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Exception;
import nsd.u;
import java.lang.Throwable;

public final class ForwardIgnoredException extends RuntimeException	// class@001b80
{

    public void ForwardIgnoredException(){
       super(null, null, 3, null);
    }
    public void ForwardIgnoredException(String p0,Exception p1){
       super(p0, p1);
    }
    public void ForwardIgnoredException(String p0,Exception p1,int p2,u p3){
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
