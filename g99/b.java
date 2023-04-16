package g99.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g99.b$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j2a.b;
import ok.x;
import com.yxcorp.gifshow.model.config.InternalNegativeFeedbackConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import android.view.View;
import android.view.ViewStub;
import android.app.Activity;
import g99.b$b;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import jl5.w;

public final class b extends PresenterV2	// class@00243e
{
    public String p;
    public QPhoto q;
    public Activity r;
    public NormalDetailBizParam s;
    public ViewStub t;
    public View u;
    public static final b$a v;

    static {
       b.v = new b$a(null);
    }
    public void b(){
       super();
       this.p = "";
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "7")) {
          return;
       }
       InternalNegativeFeedbackConfig internalNega = b.a.get();
       if (internalNega != null && !TextUtils.x(internalNega.mFeedBackUrl)) {
          b ts = this.s;
          if (ts == null) {
             a.S("mNormalDetailBizParam");
          }
          if (ts.mFromSlidePlayPhotoClick == null) {
             internalNega = internalNega.mFeedBackUrl;
             a.o(internalNega, "negativeFeedbackConfig.mFeedBackUrl");
             this.p = internalNega;
             if (!PatchProxy.applyVoid(objArray, this, uob, "11")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "INTERNAL_FEEDBACK_BUTTON";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                b tq = this.q;
                if (tq == null) {
                   a.S("mPhoto");
                }
                uContentPack.photoPackage = w1.f(tq.getEntity());
                u1.u0(6, uElementPack, uContentPack);
             }
             if (this.u == null) {
                uob = this.t;
                if (uob == null) {
                   a.S("mNegativeFeedBackViewStub");
                }
                this.u = uob.inflate();
             }
             Activity activity = this.getActivity();
             a.m(activity);
             this.r = activity;
             uob = this.u;
             if (uob != null) {
                uob.setVisibility(0);
             }
             uob = this.u;
             if (uob != null) {
                uob.setOnClickListener(new b$b(this));
             }
          }
       }
    label_0092 :
       return;
    }
    public final Activity P8(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mActivity");
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       p0 = w.a(p0, R.id.detail_negative_feed_back_view_stub);
       a.o(p0, "ViewBindUtils.bindWidget¡­tive_feed_back_view_stub\)");
       this.t = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.q8(NormalDetailBizParam.class);
       a.o(obj, "inject\(NormalDetailBizParam::class.java\)");
       this.s = obj;
       return;
    }
}
