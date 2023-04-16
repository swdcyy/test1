package bjd.a;
import bjd.a$a;
import nsd.u;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Exception;
import kotlin.jvm.internal.a;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import java.net.SocketException;
import java.net.UnknownHostException;
import org.apache.http.NoHttpResponseException;
import java.lang.Class;
import zsd.u;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.StringBuilder;

public final class a	// class@000268
{
    public Integer a;
    public boolean b;
    public Exception c;
    public static final Pattern d;
    public static final a$a e;

    static {
       a.e = new a$a(null);
       a.d = Pattern.compile(".*\(ECONN\(RESET|REFUSED|ABORTED\)|ETIMEDOUT|ENETUNREACH|EHOSTUNREACH\).*", 2);
    }
    public void a(int p0,boolean p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = false;
       }
       super();
       this.a = Integer.valueOf(p0);
       this.b = p1;
       return;
    }
    public void a(Exception p0,boolean p1){
       a.q(p0, "cause");
       super();
       this.c = p0;
       this.b = p1;
    }
    public final Integer a(){
       return this.a;
    }
    public final boolean b(){
       a tc = this.c;
       Pattern pattern = null;
       if (tc != null) {
          if (tc instanceof IOException && (!tc instanceof SocketTimeoutException && (!tc instanceof ConnectTimeoutException && (!tc instanceof SocketException && (tc instanceof UnknownHostException || tc instanceof NoHttpResponseException))))) {
             return true;
          }else if(u.I1(tc.getClass().getSimpleName(), "ErrnoException", true)){
             String message = tc.getMessage();
             if (message != null) {
                pattern = a.d.matcher(message).find();
             }
          }
       }
       return pattern;
    }
    public String toString(){
       return "CdnException\(httpCode="+this.a+", "+"requireToSwitchHost="+this.b+", cause="+this.c+')';
    }
}
