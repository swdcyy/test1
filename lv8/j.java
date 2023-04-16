package lv8.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public final class j	// class@002db4
{
    public int a;
    public int b;
    public long c;

    public void j(int p0,int p1){
       super();
       this.a = p1;
       this.b = p0;
       this.c = (long)p0 | ((long)p1 << 32);
    }
    public static j a(){
       Object obj = PatchProxy.apply(null, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j((int)(System.currentTimeMillis() / TimeUnit.MINUTES.toMillis(1)), new Random().nextInt());
    }
    public byte[] b(){
       j obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       byte[] uobyteArray = new byte[8];
       for (int i = 7; i >= 0; i = i - 1) {
          long l = 255 & obj;
          uobyteArray[i] = (byte)(int)l;
          long l1 = obj >> 8;
       }
       return uobyteArray;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.c);
    }
}
