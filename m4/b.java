package m4.b;
import okhttp3.ResponseBody;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.CharSequence;
import java.io.File;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Object;
import java.io.FileOutputStream;
import okhttp3.MediaType;
import okio.d;
import m4.b$a;
import okio.n;
import okio.l;

public class b extends ResponseBody	// class@0025ab
{
    public String b;
    public ResponseBody c;
    public String d;
    public long e;
    public ReactApplicationContext f;
    public FileOutputStream g;
    public boolean h;
    public static final boolean i;

    static {
    }
    public void b(ReactApplicationContext p0,String p1,ResponseBody p2,String p3,boolean p4){
       super();
       this.e = 0;
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.h = false;
       if (p3 != null) {
          int i = p4 ^ 0x01;
          p1 = p3.replace("?append=true", "");
          this.d = p1;
          File uFile = new File(p1);
          File parentFile = uFile.getParentFile();
          if (parentFile != null && (parentFile.exists() || parentFile.mkdirs())) {
             if (!uFile.exists()) {
                uFile.createNewFile();
             }
             this.g = new FileOutputStream(new File(p1), i);
          }else {
             throw new IllegalStateException("Couldn\'t create dir: "+parentFile);
          }
       }
       return;
    }
    public long contentLength(){
       return this.c.contentLength();
    }
    public MediaType contentType(){
       return this.c.contentType();
    }
    public d source(){
       return l.d(new b$a(this));
    }
}
