package cl9.w;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import cl9.y;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import java.util.Objects;
import yk9.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import java.lang.Integer;
import o07.o;
import ek9.l1;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class w implements PopupInterface$h	// class@00067b
{
    public final y b;

    public void w(y p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
          return;
       }
       w tb = this.b;
       y x = tb.x;
       if (x != null) {
          String commentAtBub = tb.q.getCommentAtBubbleMessage();
          w tb1 = this.b;
          e0 uoe0 = f0.a(tb1.M, tb1.getActivity());
          Objects.requireNonNull(x);
          if (!PatchProxy.applyVoidTwoRefs(commentAtBub, uoe0, x, d.class, "64")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "TOAST_INFO_CARD";
             i3 oi3 = i3.f();
             oi3.d("toast_content", commentAtBub);
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             d a = x.a;
             if (a != null) {
                QPhoto mEntity = a.mEntity;
                if (mEntity != null) {
                   uContentPack.photoPackage = w1.f(mEntity);
                }
             }
             u1.B0(new ShowMetaData().setLogPage(uoe0).setType(7).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(x.a.getFeedLogCtx()));
          }
       }
       return;
    }
    public void H(c p0,int p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ow, "2")) {
          return;
       }
       o.b(this, p0, p1);
       SharedPreferences$Editor uEditor = l1.a.edit();
       uEditor.putBoolean("atGuideBubbleShown", true);
       g.a(uEditor);
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
