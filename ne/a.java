package ne.a;
import java.io.Closeable;
import com.facebook.common.references.a;
import ne.b;
import java.lang.Object;
import od.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.util.Objects;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.b;
import java.lang.Boolean;
import java.io.InputStream;
import ra.a;
import java.util.zip.CRC32;
import java.lang.Throwable;
import java.lang.StringBuilder;
import cb.a;
import eb.f;

public class a implements Closeable	// class@0026f2
{
    public final a b;
    public boolean c;
    public boolean d;
    public b e;
    public boolean f;
    public boolean g;

    public void a(a p0,b p1){
       super();
       this.c = false;
       this.d = false;
       this.e = null;
       this.f = false;
       this.g = false;
       a.a(a.l(p0));
       this.b = p0.a();
       if (p1 != null) {
          this.e = p1;
       }else {
          this.k();
       }
       return;
    }
    public static a a(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = null;
       Object obj = PatchProxy.applyOneRefs(p0, uoa, a.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 != null) {
          obj = PatchProxy.apply(uoa, p0, a.class, "5");
          if (obj != patchProxyRe) {
             uoa = obj;
          }else {
             a uoa1 = a.d(p0.b);
             if (uoa1 != null) {
                uoa = a.d(uoa1, p0.g());
             }
             a.f(uoa1);
             if (uoa != null) {
                uoa.f = p0.f;
                uoa.g = p0.g;
             }
          }
       }
       return uoa;
    }
    public static void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "16")) {
          return;
       }
       if (p0 != null) {
          p0.close();
       }
       return;
    }
    public static a c(MetaDiskCache p0,ByteBuffer p1,b p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       byte[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.a((p1.isDirect() ^ 0x01));
       p1.rewind();
       Objects.requireNonNull(p2);
       obj = PatchProxy.apply(null, p2, b.class, "2");
       if (obj != patchProxyRe) {
       }else {
          ByteBuffer uByteBuffer = ByteBuffer.allocate(32);
          uByteBuffer.putLong(p2.a);
          uByteBuffer.putInt(p2.b);
          uByteBuffer.putInt(p2.c);
          uByteBuffer.putInt(p2.d);
          uByteBuffer.putInt(p2.e);
          uByteBuffer.putInt(p2.f);
          uByteBuffer.putInt(p2.g);
          obj = uByteBuffer.array();
       }
       p1.put(obj).rewind();
       a uoa = a.o(p0.b.e(p1.array()));
       if (uoa.j().n().capacity() > (p2.b() + 32)) {
          uoa.j().n().limit((p2.b() + 32));
       }
       return a.d(uoa, p2);
    }
    public static a d(a p0,b p1){
       a uoa = null;
       a obj = PatchProxy.applyTwoRefs(p0, p1, uoa, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(p0, p1);
       if (obj.p()) {
          uoa = obj;
       }
       return uoa;
    }
    public static boolean o(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.l())? true: false;
       return b;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a.f(this.b);
       return;
    }
    public a e(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.d(this.b);
    }
    public ByteBuffer f(boolean p0){
       ByteBuffer obj;
       Class k;
       String str;
       ByteBuffer uByteBuffer;
       Class k1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, a.class, "14");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       int i = 32;
       if (this.g == null) {
          boolean b = false;
          if (PatchProxy.isSupport(a.class)) {
             obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, a.class, "13");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                try{
                label_0042 :
                   InputStream inputStream = this.j();
                   obj = a.a(inputStream, i, this.e.b());
                   if (obj.array().length != this.e.b()) {
                      inputStream.close();
                   }else {
                      try{
                         boolean b1 = true;
                         if (p0) {
                            CRC32 uCRC32 = new CRC32();
                            uCRC32.update(obj.array());
                            if ((int)uCRC32.getValue() != this.e.c) {
                               b1 = 0;
                            }
                            inputStream.close();
                            b = b1;
                         }else {
                            inputStream.close();
                            this.g = b1;
                            b = true;
                         }
                      }catch(java.lang.IndexOutOfBoundsException e0){
                      }
                   }
                }catch(java.io.IOException e0){
                }catch(java.lang.IndexOutOfBoundsException e0){
                }
             }
          }else {
             goto label_0042 ;
          }
          if (!b) {
             return null;
          }
       }
    }
    public b g(){
       return this.e;
    }
    public InputStream j(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       if (obj == null) {
          return objArray;
       }
       a.f(obj);
       return new f(obj.j());
    }
    public final boolean k(){
       InputStream obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.e == null && this.l()) {
          try{
             obj = this.j();
             this.e = b.a(a.a(obj, 0, 32).array());
             obj.close();
             return b;
          }catch(java.io.IOException e0){
             return v2;
          }
       }else if(this.e != null){
          b = false;
       }
       return b;
    }
    public synchronized boolean l(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.l(this.b);
    }
    public boolean p(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.f != null) {
          return true;
       }
       if (!this.k()) {
          return false;
       }
       obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a te = this.e;
          b = (!te.a - 0x12345678 && te.b() > 0)? true: false;
       }
       if (!b) {
          return false;
       }else {
          this.f = true;
          return true;
       }
    }
}
