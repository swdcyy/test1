package a8c.g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import s7c.c;
import com.kwai.robust.PatchProxyResult;
import rq4.d;
import u7c.a;
import u7c.a$a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import kp.r1;
import com.yxcorp.utility.TextUtils;
import zic.l0;
import k2b.e0;
import zic.m0;
import o07.o;

public class g implements PopupInterface$h	// class@00009f
{
    public final OperationModel b;
    public final GifshowActivity c;

    public void g(OperationModel p0,GifshowActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void B(c p0){
    }
    public void H(c p0,int p1){
       g og = g.class;
       String str = "1";
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, str)) {
          return;
       }
       if (p1) {
          g tb = this.b;
          g tc = this.c;
          c uoc = c.class;
          if (!PatchProxy.applyVoidTwoRefs(tb, tc, null, uoc, str)) {
             d uod = PatchProxy.applyOneRefs(tb, null, uoc, "4");
             if (uod != PatchProxyResult.class) {
             }else {
                uod = new d();
                uod.d = 17;
                uod.g = a.f.a(tb);
             }
             uod.h = 5;
             if (!PatchProxy.applyVoidThreeRefs(uod, tb, null, null, c.class, "2")) {
                if (tb.i() != null && r1.T1(tb.i()) != null) {
                   uod.j = TextUtils.k(r1.U1(tb.i()));
                }else if(tb.s() != null){
                   uod.j = TextUtils.k(tb.s().mId);
                }
                l0.b(uod, tb, null);
             }
             m0.h(uod, true, tc);
          }
       }
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
