package f.c$b;
import f.m$a;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.lang.Boolean;
import f.m;
import java.lang.StringBuilder;
import f.c;
import f.c$a;
import java.lang.IllegalStateException;

public final class c$b extends m$a	// class@001f88
{
    public String a;
    public Boolean b;
    public Boolean c;
    public ScheduledFuture d;

    public void c$b(){
       super();
    }
    public m$a a(String p0){
       Objects.requireNonNull(p0, "Null tag");
       this.a = p0;
       return this;
    }
    public m$a b(ScheduledFuture p0){
       Objects.requireNonNull(p0, "Null scheduledFutureDelay");
       this.d = p0;
       return this;
    }
    public m$a c(boolean p0){
       this.c = Boolean.valueOf(p0);
       return this;
    }
    public m d(){
       String str = (this.a == null)? " tag": "";
       if (this.b == null) {
          str = str+" taskFinished";
       }
       if (this.c == null) {
          str = str+" schedulerFinished";
       }
       if (this.d == null) {
          str = str+" scheduledFutureDelay";
       }
       if (str.isEmpty()) {
          c uoc = new c(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d, null);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:"+str);
       }
    }
    public m$a e(boolean p0){
       this.b = Boolean.valueOf(p0);
       return this;
    }
}
