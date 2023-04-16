package f0d.a;
import ab.h;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.app.ActivityManager;
import tc.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Math;
import e0d.h;
import android.os.Build$VERSION;

public class a implements h	// class@0015b6
{
    public final Context a;
    public final ActivityManager b;
    public boolean c;
    public boolean d;
    public static final long e;
    public static AtomicBoolean f;

    static {
       a.e = TimeUnit.SECONDS.toMillis(1);
       a.f = new AtomicBoolean(false);
    }
    public void a(Context p0){
       super();
       this.c = false;
       this.d = true;
       this.a = p0;
       this.b = p0.getSystemService("activity");
    }
    public w b(){
       int i2;
       int i4;
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0x100000;
       int i1 = Math.min((this.b.getMemoryClass() * i), Integer.MAX_VALUE);
       if (a.f.get() && h.e() > 0) {
          w ow = new w(Math.min(i1, h.e()), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, a.e);
          return i;
       }else if(i1 < 0x2000000){
          if (this.c != null) {
             i = 0x200000;
             i2 = Float.MIN_NORMAL;
          }else {
             i2 = 0x400000;
          }
       }else if(i1 < 0x4000000){
          if (this.c != null) {
             i = 0x400000;
             i2 = 0xc00000;
          }else {
             i = 0x200000;
             i2 = 0x600000;
          }
       }else if(i1 <= 0x10000000){
          i4 = (i1 / 10) + 0xa00000;
          i = i4 / 8;
          if (this.c != null) {
             i4 = i4 * 2;
             i = i * 2;
          }
       }else if(this.c != null){
          i4 = 0x8000000;
       }else {
          i4 = (i1 / 10) + 0x1400000;
       }
       if (Build$VERSION.SDK_INT <= 23) {
          i = i4 / 8;
       }else {
          i = i4 / 4;
       }
       i2 = i4;
       int i3 = (this.d != null)? i: Integer.MAX_VALUE;
       w ow1 = new w(i2, 256, i3, Integer.MAX_VALUE, Integer.MAX_VALUE, a.e);
       return i1;
    }
    public Object get(){
       return this.b();
    }
}
