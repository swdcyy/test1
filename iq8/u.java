package iq8.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import iq8.q;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import iq8.u$a;
import android.graphics.Bitmap;
import android.util.LruCache;

public class u	// class@002722
{
    public final LruCache a;
    public static final u b;

    static {
       u.b = new u();
    }
    public void u(){
       long l;
       super();
       Object obj = PatchProxy.apply(null, this, u.class, "4");
       if (obj != PatchProxyResult.class) {
          l = obj.longValue();
       }else {
          ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
          q.a().getSystemService("activity").getMemoryInfo(memoryInfo);
          l = memoryInfo.availMem;
       }
       int i = (int)((float)l * 0.01f);
       u$a uoa = 0xc00000;
       if (i < 0x400000) {
          i = 0x400000;
       }else if(i > uoa){
          i = 0xc00000;
       }
       this.a = new u$a(this, i);
       return;
    }
    public static u b(){
       return u.b;
    }
    public Bitmap a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return this.a.get(p0);
    }
    public void c(String p0,Bitmap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, u.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.a.put(p0, p1);
       }
       return;
    }
}
