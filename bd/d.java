package bd.d;
import java.io.Closeable;
import ab.h;
import java.lang.Object;
import com.facebook.imageformat.a;
import ab.e;
import com.facebook.common.references.a;
import java.lang.Boolean;
import uc.a;
import java.lang.String;
import java.lang.Math;
import com.facebook.common.memory.PooledByteBuffer;
import java.lang.StringBuilder;
import java.lang.Byte;
import java.io.InputStream;
import eb.f;
import com.facebook.imageformat.b;
import nc.a;
import com.facebook.imageutils.c;
import android.util.Pair;
import java.lang.Integer;
import java.io.IOException;
import com.kwai.video.ksheifdec.KpgImageFormat;
import j0d.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksheifdec.HeifImageDecoder;
import nd.b;
import nd.a;
import com.facebook.imageutils.a;
import com.facebook.imageutils.b;
import nd.c;

public class d implements Closeable	// class@000b17
{
    public final a b;
    public final h c;
    public a d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public a k;
    public ColorSpace l;
    public boolean m;
    public static boolean n;

    public void d(h p0){
       super();
       this.d = a.c;
       this.e = -1;
       this.f = 0;
       this.g = -1;
       this.h = -1;
       this.i = 1;
       this.j = -1;
       e.d(p0);
       this.b = null;
       this.c = p0;
    }
    public void d(a p0){
       super();
       this.d = a.c;
       this.e = -1;
       this.f = 0;
       this.g = -1;
       this.h = -1;
       this.i = 1;
       this.j = -1;
       e.a(Boolean.valueOf(a.l(p0)));
       this.b = p0.a();
       this.c = null;
    }
    public static d a(d p0){
       d uod = null;
       if (p0 != null) {
          d c = p0.c;
          if (c != null) {
             uod = new d(c);
             uod.j = p0.j;
          }else {
             a uoa = a.d(p0.b);
             if (uoa != null) {
                uod = new d(uoa);
             }
             a.f(uoa);
          }
          if (uod != null) {
             uod.c(p0);
          }
       }
       return uod;
    }
    public static void b(d p0){
       if (p0 != null) {
          p0.close();
       }
       return;
    }
    public static boolean s(d p0){
       boolean b = (p0.e >= null && (p0.g >= null && p0.h >= null))? true: false;
       return b;
    }
    public static boolean v(d p0){
       boolean b = (p0 != null && p0.u())? true: false;
       return b;
    }
    public void A(a p0){
       this.d = p0;
    }
    public void C(int p0){
       this.e = p0;
    }
    public void E(int p0){
       this.i = p0;
    }
    public void c(d p0){
       this.d = p0.j();
       this.g = p0.getWidth();
       this.h = p0.getHeight();
       this.e = p0.l();
       this.f = p0.g();
       this.i = p0.o();
       this.j = p0.p();
       this.k = p0.f();
       p0.y();
       this.l = p0.l;
       this.m = p0.m;
    }
    public void close(){
       a.f(this.b);
    }
    public a e(){
       return a.d(this.b);
    }
    public a f(){
       return this.k;
    }
    public int g(){
       this.y();
       return this.f;
    }
    public int getHeight(){
       this.y();
       return this.h;
    }
    public int getWidth(){
       this.y();
       return this.g;
    }
    public String h(int p0){
       a uoa = this.e();
       if (uoa == null) {
          return "";
       }
       p0 = Math.min(this.p(), p0);
       byte[] uobyteArray = new byte[p0];
       uoa.j().D(0, uobyteArray, 0, p0);
       uoa.close();
       StringBuilder str = new StringBuilder((p0 * 2));
       for (int i = 0; i < p0; i = i + 1) {
          Object[] objArray = new Object[]{Byte.valueOf(uobyteArray[i])};
          str = str+String.format("%02X", objArray);
       }
       return str;
    }
    public a j(){
       this.y();
       return this.d;
    }
    public InputStream k(){
       d tc = this.c;
       if (tc != null) {
          return tc.get();
       }
       a uoa = a.d(this.b);
       if (uoa == null) {
          return null;
       }
       a.f(uoa);
       return new f(uoa.j());
    }
    public int l(){
       this.y();
       return this.e;
    }
    public int o(){
       return this.i;
    }
    public int p(){
       int i;
       d tb = this.b;
       if (tb != null) {
          tb.j();
          i = this.b.j().size();
       }else {
          i = this.j;
       }
       return i;
    }
    public final void r(){
       boolean b;
       byte[] uobyteArray;
       InputStream inputStream1;
       int i2;
       int i3;
       int rotation;
       Integer integer;
       Integer integer1;
       Pair pair1;
       a uoa = b.c(this.k());
       this.d = uoa;
       int i = 1;
       b = false;
       InputStream inputStream = (a.a(uoa) || uoa == a.j)? 1: null;
       String str = "RIFF";
       int i1 = 4;
       Pair pair = null;
       if (inputStream) {
          inputStream = this.k();
          try{
             uobyteArray = new byte[i1];
             inputStream.read(uobyteArray);
             if (c.a(uobyteArray, str)) {
                c.d(inputStream);
                inputStream.read(uobyteArray);
                if (c.a(uobyteArray, "WEBP")) {
                   inputStream.read(uobyteArray);
                   str = "";
                   for (int i4 = 0; i4 < i1; i4 = i4 + 1) {
                      str = str+(char)uobyteArray[i4];
                   }
                   str = str;
                   if (("VP8 ").equals(str)) {
                      pair = c.f(inputStream);
                   }else if(("VP8L").equals(str)){
                      pair = c.g(inputStream);
                   }else if(("VP8X").equals(str)){
                      inputStream.skip(8);
                      integer = Integer.valueOf((c.h(inputStream) + i));
                      integer1 = Integer.valueOf((c.h(inputStream) + i));
                      try{
                         pair1 = new Pair(integer, integer1);
                         inputStream.close();
                      }catch(java.io.IOException e1){
                         e1.printStackTrace();
                      }
                      pair = pair1;
                   }
                }
             }
          }catch(java.io.IOException e4){
             e4.printStackTrace();
             if (!inputStream) {
             }
          }
          try{
             inputStream.close();
          }catch(java.io.IOException e1){
             e1.printStackTrace();
          }
       }else if(uoa == KpgImageFormat.KPG){
          inputStream = this.k();
          Object obj = PatchProxy.applyOneRefs(inputStream, pair, a.class, "1");
          if (obj != PatchProxyResult.class) {
             pair = obj;
          }else {
             uobyteArray = new byte[i1];
             try{
                inputStream.read(uobyteArray);
                if (a.a(uobyteArray, str)) {
                   a.b(inputStream);
                   inputStream.read(uobyteArray);
                   if (a.a(uobyteArray, "KPGB")) {
                      inputStream.read(uobyteArray);
                      if (a.a(uobyteArray, "KWVC")) {
                         a.b(inputStream);
                         integer = Integer.valueOf(a.b(inputStream));
                         integer1 = Integer.valueOf(a.b(inputStream));
                         try{
                            pair1 = new Pair(integer, integer1);
                            inputStream.close();
                         }catch(java.io.IOException e1){
                            e1.printStackTrace();
                         }
                         pair = pair1;
                      }
                   }
                }
             }catch(java.io.IOException e4){
                e4.printStackTrace();
                if (!inputStream) {
                }
             }
             try{
                inputStream.close();
             }catch(java.io.IOException e1){
                e1.printStackTrace();
             }
          }
       }else if(uoa == a.k){
          HeifImageDecoder heifImageDec = HeifImageDecoder.parseHeifImageMetadata(this);
          if (heifImageDec.getWidth() > 0 && heifImageDec.getHeight() > 0) {
             this.g = heifImageDec.getWidth();
             this.h = heifImageDec.getHeight();
             pair = new Pair(Integer.valueOf(this.g), Integer.valueOf(this.h));
          }
       }else {
          InputStream inputStream2 = this.k();
          b uob = a.a(inputStream2);
          this.l = uob.b;
          pair1 = uob.a();
          if (pair1 != null) {
             this.g = pair1.first.intValue();
             this.h = pair1.second.intValue();
          }
          inputStream2.close();
          pair = uob.a();
       }
    }
    public synchronized boolean u(){
       boolean b = (a.l(this.b) || this.c != null)? true: false;
       return b;
    }
    public void x(){
       if (!d.n) {
          this.r();
       }else if(this.m == null){
          this.r();
          this.m = true;
       }
       return;
    }
    public final void y(){
       if (this.g < null || this.h < null) {
          this.x();
       }
       return;
    }
    public void z(a p0){
       this.k = p0;
    }
}
