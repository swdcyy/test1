package kotlin.Result$Failure;
import java.io.Serializable;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class Result$Failure implements Serializable	// class@001c3a
{
    public final Throwable exception;

    public void Result$Failure(Throwable p0){
       a.p(p0, "exception");
       super();
       this.exception = p0;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof Result$Failure && a.g(this.exception, p0.exception))? true: false;
       return b;
    }
    public int hashCode(){
       return this.exception.hashCode();
    }
    public String toString(){
       return "Failure\("+this.exception+')';
    }
}
