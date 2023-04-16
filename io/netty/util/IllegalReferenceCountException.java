package io.netty.util.IllegalReferenceCountException;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;

public class IllegalReferenceCountException extends IllegalStateException	// class@0010df
{
    public static final long serialVersionUID = 0xdd3398f3e175fc84;

    public void IllegalReferenceCountException(){
       super();
    }
    public void IllegalReferenceCountException(int p0){
       super("refCnt: "+p0);
    }
    public void IllegalReferenceCountException(int p0,int p1){
       StringBuilder str1;
       StringBuilder str = "refCnt: "+p0+", ";
       if (p1 > 0) {
          str1 = "increment: ";
       }else {
          str1 = "decrement: ";
          p1 = - p1;
       }
       super(str+str1+p1);
       return;
    }
    public void IllegalReferenceCountException(String p0){
       super(p0);
    }
    public void IllegalReferenceCountException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void IllegalReferenceCountException(Throwable p0){
       super(p0);
    }
}
