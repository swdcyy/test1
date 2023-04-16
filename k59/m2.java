package k59.m2;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo;
import tw.j;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import i2b.a;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.User;
import lqb.a;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import k59.q2;
import java.util.Map;
import java.util.HashMap;
import java.lang.Boolean;

public final class m2 extends PresenterV2 implements g	// class@002af7
{
    public BaseFeed p;
    public boolean q;
    public View r;
    public final int s;
    public FrameLayout t;
    public View u;

    public void m2(){
       super();
       this.s = 96;
    }
    public void E8(){
       m2 om2 = m2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om2, "4")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       PhotoAdvertisement$CaptionAdvertisementInfo uCaptionAdve = j.l(new QPhoto(this.p));
       if (uCaptionAdve != null && uCaptionAdve.mShowAvatarInfoInLandingPage == 1) {
          View view = this.m8();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          view = a.k(view, R.layout.arg_RES_7f0d0097, false);
          a.o(view, "KwaiLayoutInflater.infla¡­_avatar_info_head, false\)");
          this.r = view;
          String str = "mWebViewHeadView";
          if (view == null) {
             a.S(str);
          }
          view = view.findViewById(R.id.ad_webview_head);
          a.o(view, "mWebViewHeadView.findVie¡­yId\(R.id.ad_webview_head\)");
          this.t = view;
          m2 tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          view = tr.findViewById(R.id.ad_webview_head_statusbar);
          a.o(view, "mWebViewHeadView.findVie¡­d_webview_head_statusbar\)");
          this.u = view;
          if (view == null) {
             a.S("mStatusBarView");
          }
          Context context = this.getContext();
          a.m(context);
          view.getLayoutParams().height = n.A(context);
          if (!PatchProxy.applyVoid(objArray, this, om2, "5")) {
             QPhoto qPhoto = new QPhoto(this.p);
             m2 tr1 = this.r;
             if (tr1 == null) {
                a.S(str);
             }
             View view1 = tr1.findViewById(R.id.ad_webview_head_avatar_view);
             a.o(view1, "mWebViewHeadView.findVie¡­webview_head_avatar_view\)");
             m2 tr2 = this.r;
             if (tr2 == null) {
                a.S(str);
             }
             View view2 = tr2.findViewById(R.id.ad_web_avatar_head_name);
             a.o(view2, "mWebViewHeadView.findVie¡­.ad_web_avatar_head_name\)");
             String str1 = j.s(qPhoto);
             if (TextUtils.isEmpty(str1)) {
                m2 tp = this.p;
                if (tp != null) {
                   User user = a.a(tp);
                   if (user != null) {
                      g.k(view1, user, HeadImageSize.MIDDLE);
                   }
                }
             }else {
                view1.L(str1);
             }
             view2.setText(j.j(qPhoto));
             if (!PatchProxy.applyVoid(objArray, this, om2, "6")) {
                QPhoto qPhoto1 = new QPhoto(this.p);
                tr = this.r;
                if (tr == null) {
                   a.S(str);
                }
                view = tr.findViewById(R.id.ad_web_avatar_head_description);
                a.o(view, "mWebViewHeadView.findVie¡­_avatar_head_description\)");
                PhotoAdvertisement$CaptionAdvertisementInfo uCaptionAdve1 = j.l(qPhoto1);
                if (uCaptionAdve1 != null) {
                   objArray = uCaptionAdve1.mDescriptionInLandingPage;
                }
                if (TextUtils.isEmpty(objArray)) {
                   view.setVisibility(8);
                }else {
                   view.setText("\""+objArray+"\"");
                }
             }
          }
       }
    label_0132 :
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m2.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, m2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(m2.class, new q2());
       }else {
          obj.put(m2.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m2.class, "1")) {
          return;
       }
       this.p = this.q8(BaseFeed.class);
       Object obj = this.r8("AD_ADD_AVATAR_HEAD_INFO");
       a.o(obj, "inject\(AdWebAccessIds.AD_ADD_AVATAR_HEAD_INFO\)");
       this.q = obj.booleanValue();
       return;
    }
}
