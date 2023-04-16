package io.reactivex.exceptions.OnErrorNotImplementedException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.NullPointerException;

public final class OnErrorNotImplementedException extends RuntimeException	// class@0011a1
{
    public static final long serialVersionUID = 0xa895f6ec1a8e9594;

    public void OnErrorNotImplementedException(String p0,Throwable p1){
       if (p1 != null) {
       }else {
          NullPointerException nullPointerE = new NullPointerException();
       }
       super(p0, p1);
       return;
    }
    public void OnErrorNotImplementedException(Throwable p0){
       String message = (p0 != null)? p0.getMessage(): null;
       if (p0 == null) {
          NullPointerException nullPointerE = new NullPointerException();
       }
       super(message, p0);
       return;
    }
}
