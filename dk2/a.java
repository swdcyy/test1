package dk2.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ekd.j0;
import java.lang.Boolean;
import android.content.BroadcastReceiver;
import dk2.a$a;
import java.util.HashSet;
import com.kuaishou.live.core.show.statusbar.LiveBatteryStatusManager$1;
import android.content.IntentFilter;
import android.app.Application;
import o56.a;
import java.lang.ref.WeakReference;
import java.util.Set;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;

public class a	// class@002539
{
    public Set a;
    public BroadcastReceiver b;
    public Intent c;

    public void a(){
       super();
    }
    public final float a(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return ((float)j0.b(p0, "level", -1) / (float)j0.b(p0, "scale", -1));
    }
    public final boolean b(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = j0.b(p0, "status", -1);
       i = (i == 2 || i == 5)? true: false;
       return i;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.a = null;
       a tb = this.b;
       if (tb != null) {
          this.e(tb);
       }
       this.b = null;
       this.c = null;
       return;
    }
    public void d(a$a p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.a == null) {
          Intent intent = PatchProxy.apply(null, this, uoa, "2");
          if (intent != PatchProxyResult.class) {
          }else {
             this.a = new HashSet();
             uoa = this.b;
             if (uoa != null) {
                this.e(uoa);
             }
             this.b = new LiveBatteryStatusManager$1(this);
             intent = a.b().registerReceiver(this.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
          }
          if (intent != null) {
             this.c = new Intent(intent);
          }
       }
       this.a.add(new WeakReference(p0));
       uoa = this.c;
       if (uoa != null) {
          p0.a(this.a(uoa), this.b(this.c));
       }
       return;
    }
    public final void e(BroadcastReceiver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       try{
          a.b().unregisterReceiver(p0);
       }catch(java.lang.IllegalArgumentException e3){
          b.I(LiveLogTag.GZONE, "safeUnregisterReceiver", e3);
       }
       return;
    }
    public void f(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       if (p0 != null) {
          a ta = this.a;
          if (ta != null) {
             Iterator iterator = ta.iterator();
             while (iterator.hasNext()) {
                WeakReference weakReferenc = iterator.next();
                if (weakReferenc.get() == null || weakReferenc.get() == p0) {
                   iterator.remove();
                }
             }
             if (this.a.isEmpty()) {
                this.c();
             }
          }
       }
       return;
    }
}
