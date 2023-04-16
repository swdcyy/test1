package m4.a;
import okhttp3.ResponseBody;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import okhttp3.MediaType;
import okio.d;
import m4.a$a;
import okio.n;
import okio.l;

public class a extends ResponseBody	// class@0025a9
{
    public String b;
    public ReactApplicationContext c;
    public ResponseBody d;
    public boolean e;

    public void a(ReactApplicationContext p0,String p1,ResponseBody p2,boolean p3){
       super();
       this.e = false;
       this.c = p0;
       this.b = p1;
       this.d = p2;
       this.e = p3;
    }
    public long contentLength(){
       return this.d.contentLength();
    }
    public MediaType contentType(){
       return this.d.contentType();
    }
    public d source(){
       return l.d(new a$a(this, this.d.source()));
    }
}
