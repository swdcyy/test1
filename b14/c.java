package b14.c;
import f14.b;
import b14.d;
import f14.c;
import f14.h;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import dp3.g;
import fp3.d;
import f14.g;
import bq5.f;
import bq5.h;
import com.kuaishou.merchant.live.basic.LiveBasicLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;

public class c implements b	// class@0002fe
{
    public final c a;
    public final h b;
    public final d c;

    public void c(d p0,c p1,h p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(int p0,int p1,int p2,int p3,Animator p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
             return;
          }
       }
       d b = this.c.b;
       if (b != null) {
          b.y0(this.b, p0, p1, p2, p3, p4);
       }
       return;
    }
    public void b(g p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       try{
          a = this.c.a;
          if (a != null) {
             a.Oh(this.a);
          }
       }catch(java.lang.Exception e4){
          a.l(LiveBasicLogBiz.BUBBLE, "LiveBubbleManagerV2", "show bubble failed", e4);
       }
       return;
    }
    public void c(g p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       try{
          a = this.c.a;
          if (a != null) {
             a.ce(this.a);
          }
       }catch(java.lang.Exception e0){
          a.l(LiveBasicLogBiz.BUBBLE, "LiveBubbleManagerV2", "dismiss bubble failed", e0);
       }
       c tc = this.c;
       if (tc.c == p0) {
          tc.c = null;
       }
       if (tc.d == p0) {
          tc.d = null;
       }
       return;
    }
    public boolean d(){
       return true;
    }
}
