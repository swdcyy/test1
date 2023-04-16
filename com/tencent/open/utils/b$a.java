package com.tencent.open.utils.b$a;
import java.lang.Object;
import java.util.Properties;
import com.tencent.open.utils.b$1;
import java.nio.ByteBuffer;
import com.tencent.open.utils.m;
import com.tencent.open.utils.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.ProtocolException;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Arrays;

public class b$a	// class@000f74
{
    public Properties a;
    public byte[] b;

    public void b$a(){
       super();
       this.a = new Properties();
    }
    public void b$a(b$1 p0){
       super();
    }
    public void a(byte[] p0){
       if (p0 == null) {
          return;
       }
       ByteBuffer uByteBuffer = ByteBuffer.wrap(p0);
       int len = b.a().a().length;
       byte[] uobyteArray = new byte[len];
       uByteBuffer.get(uobyteArray);
       if (!b.a().equals(new m(uobyteArray))) {
          throw new ProtocolException("unknow protocl ["+Arrays.toString(p0)+"]");
       }
       if ((p0.length - len) <= 2) {
          return;
       }
       uobyteArray = new byte[2];
       uByteBuffer.get(uobyteArray);
       int i = new m(uobyteArray).b();
       if (((p0.length - len) - 2) < i) {
          return;
       }
       byte[] uobyteArray1 = new byte[i];
       uByteBuffer.get(uobyteArray1);
       this.a.load(new ByteArrayInputStream(uobyteArray1));
       int i1 = ((p0.length - len) - i) - 2;
       if (i1 > 0) {
          i1 = new byte[i1];
          this.b = i1;
          uByteBuffer.get(i1);
       }
       return;
    }
    public String toString(){
       return "ApkExternalInfo [p="+this.a+", otherData="+Arrays.toString(this.b)+"]";
    }
}
