package kotlinx.coroutines.JobCancellationException;
import ftd.e0;
import java.util.concurrent.CancellationException;
import java.lang.String;
import java.lang.Throwable;
import ftd.z1;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StackTraceElement;
import java.lang.StringBuilder;

public final class JobCancellationException extends CancellationException implements e0	// class@001925
{
    public final z1 job;

    public void JobCancellationException(String p0,Throwable p1,z1 p2){
       super(p0);
       this.job = p2;
       if (p1 != null) {
          this.initCause(p1);
       }
       return;
    }
    public Throwable createCopy(){
       return this.createCopy();
    }
    public JobCancellationException createCopy(){
       return null;
    }
    public boolean equals(Object p0){
       boolean b = (p0 == this || (p0 instanceof JobCancellationException && (a.g(p0.getMessage(), this.getMessage()) && (a.g(p0.job, this.job) && a.g(p0.getCause(), this.getCause())))))? true: false;
       return b;
    }
    public Throwable fillInStackTrace(){
       StackTraceElement[] stackTraceEl = new StackTraceElement[0];
       this.setStackTrace(stackTraceEl);
       return this;
    }
    public int hashCode(){
       String message = this.getMessage();
       if (message == null) {
          a.L();
       }
       int i = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
       Throwable cause = this.getCause();
       int i1 = (cause != null)? cause.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       return super.toString()+"; job="+this.job;
    }
}
