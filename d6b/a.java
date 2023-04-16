package d6b.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import d6b.c;
import android.view.View;
import com.yxcorp.gifshow.map.data.model.MapEntranceBubbleResponse;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import u5b.a;
import q87.c;
import com.yxcorp.gifshow.map.MapLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.NullPointerException;
import java.lang.Integer;
import o07.o;

public final class a implements PopupInterface$h	// class@002453
{
    public final c b;
    public final View c;
    public final MapEntranceBubbleResponse d;
    public final String e;

    public void a(c p0,View p1,MapEntranceBubbleResponse p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void B(c p0){
       c a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       Object[] objArray = new Object[0];
       a.c.w("PhotoMapEntranceBubbleHelper", "show", objArray);
       a te = this.e;
       a.m(te);
       a = this.b.a;
       if (a != null) {
          if (!PatchProxy.applyVoidTwoRefs(te, a, null, MapLogger.class, "13")) {
             a.p(te, "bubbleTitle");
             a.p(a, "page");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "NEARBY_TOP_BAR_ROAMING_POP_CARD";
             i3 oi3 = i3.f();
             oi3.d("pop_content", te);
             uElementPack.params = oi3.e();
             u1.C0("3421446", a, 3, uElementPack, null);
          }
          PatchProxy.onMethodExit(a.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(a.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       }
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport2(a.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, a.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       Object[] objArray = new Object[0];
       a.c.w("PhotoMapEntranceBubbleHelper", "dismiss", objArray);
       PatchProxy.onMethodExit(a.class, "2");
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
