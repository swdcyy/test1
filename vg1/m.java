package vg1.m;
import vg1.l;
import vg1.m$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import vg1.m$b;
import s51.c;
import android.os.SystemClock;
import android.content.Context;
import java.lang.Exception;

public abstract class m implements l	// class@004373
{
    public int a;
    public long b;
    public m$b c;
    public static final m$a d;

    static {
       m.d = new m$a(null);
    }
    public void m(){
       super();
       this.a = -1;
       this.b = -1;
    }
    public void a(GiftPanelItem p0,int p1,boolean p2,View p3,boolean p4){
       m om = m.class;
       int i = 1;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, om, "2")) {
             return;
          }
       }
       if (this.c != null) {
          om = this.a;
          this.a = p1;
          if (p0 != null && p0.isEnableJumpByLink() == i) {
             m tc = this.c;
             if (tc == null) {
                a.S("handler");
             }
             tc.a();
             tc = this.c;
             if (tc == null) {
                a.S("handler");
             }
             c uoc = tc.c();
             if (om != -1 && ((SystemClock.elapsedRealtime() - this.b) - 1000 > 0 && uoc.P0(p0.mJumpLink))) {
                this.b = SystemClock.elapsedRealtime();
                p0 = p0.mJumpLink;
                m tc1 = this.c;
                if (tc1 == null) {
                   a.S("handler");
                }
                uoc.r4(p0, tc1.b());
             }
          label_0084 :
             m tc2 = this.c;
             if (tc2 == null) {
                a.S("handler");
             }
             tc2.m0();
             return;
          }else {
             this.b(p0, p1, p2, p3, p4);
             return;
          }
       }else {
          throw new Exception("«Îœ»÷¥––:LiveGiftItemViewSelectedViewBaseListener#setItemSelectedHandler\(\)");
       }
    }
    public abstract void b(GiftPanelItem p0,int p1,boolean p2,View p3,boolean p4);
    public final void c(m$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       a.p(p0, "handler");
       this.c = p0;
       return;
    }
}
