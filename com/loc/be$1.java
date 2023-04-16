package com.loc.be$1;
import java.io.ByteArrayOutputStream;
import com.loc.be;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.AssertionError;
import java.lang.Object;

public final class be$1 extends ByteArrayOutputStream	// class@00138b
{
    public final be a;

    public void be$1(be p0,int p1){
       this.a = p0;
       super(p1);
    }
    public final String toString(){
       ByteArrayOutputStream tcount = this.count;
       if (tcount > null && this.buf[(tcount - 1)] == 13) {
          tcount = tcount - 1;
       }
       try{
          return new String(this.buf, 0, tcount, be.a(this.a).name());
       }catch(java.io.UnsupportedEncodingException e0){
          throw new AssertionError(e0);
       }
    }
}
