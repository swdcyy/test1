package dl9.n0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import dl9.m0;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import java.util.Objects;
import yk9.d;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;
import o07.o;

public class n0 implements PopupInterface$h	// class@001f87
{
    public final m0 b;

    public void n0(m0 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "1")) {
          return;
       }
       this.b.P8(true);
       n0 tb = this.b;
       m0 q = tb.q;
       QComment mEmotionInfo = tb.p.mEmotionInfo;
       e0 uoe0 = f0.a(tb.r, tb.getActivity());
       Objects.requireNonNull(q);
       d uod = d.class;
       if (!PatchProxy.applyVoidTwoRefs(mEmotionInfo, uoe0, q, uod, "63") && mEmotionInfo != null) {
          ShowMetaData showMetaData = new ShowMetaData().setLogPage(uoe0).setType(7);
          String str = "EMOTICON_OPERATION";
          ClientEvent$ElementPackage uElementPack = PatchProxy.applyTwoRefs(mEmotionInfo, str, q, uod, "56");
          if (uElementPack != PatchProxyResult.class) {
          }else {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = str;
             i3 oi3 = i3.f();
             oi3.d("emo_id", mEmotionInfo.mId);
             oi3.c("emotion_biz_type", Integer.valueOf(mEmotionInfo.mBizType));
             uElementPack.params = oi3.e();
          }
          u1.B0(showMetaData.setElementPackage(uElementPack).setFeedLogCtx(q.a.getFeedLogCtx()));
       }
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(n0.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, n0.class, "2")) {
          return;
       }
       n0 tb = this.b;
       tb.y = null;
       tb.P8(false);
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
