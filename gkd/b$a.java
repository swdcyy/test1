package gkd.b$a;
import java.io.ByteArrayOutputStream;
import gkd.b;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.AssertionError;
import java.lang.Object;

public class b$a extends ByteArrayOutputStream	// class@000f4b
{
    public final b b;

    public void b$a(b p0,int p1){
       this.b = p0;
       super(p1);
    }
    public String toString(){
       ByteArrayOutputStream tcount = this.count;
       if (tcount > null && this.buf[(tcount - 1)] == 13) {
          tcount = tcount - 1;
       }
       try{
          return new String(this.buf, 0, tcount, this.b.c.name());
       }catch(java.io.UnsupportedEncodingException e0){
          throw new AssertionError(e0);
       }
    }
}
