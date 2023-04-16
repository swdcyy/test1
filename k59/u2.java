package k59.u2;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k59.u2$a;
import nsd.u;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShareInfo;
import mxb.c;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import i2b.a;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.CharSequence;
import lnc.a1;
import k59.v2;
import android.view.View$OnClickListener;
import mxb.j0;
import mxb.i0;
import k59.u2$b;
import erd.g;
import k59.u2$c;
import com.kwai.robust.PatchProxyResult;
import k59.z2;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;

public final class u2 extends PresenterV2 implements g	// class@002b25
{
    public BaseFeed p;
    public long q;
    public View r;
    public final int s;
    public TextView t;
    public FrameLayout u;
    public View v;
    public ArrayList w;
    public ArrayList x;
    public static final u2$a y;

    static {
       u2.y = new u2$a(null);
    }
    public void u2(){
       super();
       this.s = 72;
       this.w = new ArrayList();
       this.x = new ArrayList();
    }
    public void E8(){
       u2 ou2 = u2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou2, "4")) {
          return;
       }
       PhotoAdvertisement$ShareInfo shareInfo = c.I(this.p);
       if (shareInfo != null) {
          u2 ou21 = 1;
          if (shareInfo.mShowShareInH5 == ou21) {
             View view = this.m8();
             Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
             boolean b = false;
             view = a.k(view, R.layout.arg_RES_7f0d0098, b);
             a.o(view, "KwaiLayoutInflater.infla¡­hare_head,\n        false\)");
             this.r = view;
             String str = "mWebViewHeadView";
             if (view == null) {
                a.S(str);
             }
             view = view.findViewById(R.id.ad_webview_head);
             a.o(view, "mWebViewHeadView.findVie¡­yId\(R.id.ad_webview_head\)");
             this.u = view;
             u2 tr = this.r;
             if (tr == null) {
                a.S(str);
             }
             view = tr.findViewById(R.id.ad_web_head_share_text);
             a.o(view, "mWebViewHeadView.findVie¡­d.ad_web_head_share_text\)");
             this.t = view;
             tr = this.r;
             if (tr == null) {
                a.S(str);
             }
             view = tr.findViewById(R.id.ad_web_head_share_icon);
             a.o(view, "mWebViewHeadView.findVie¡­d.ad_web_head_share_icon\)");
             this.v = view;
             if (!PatchProxy.applyVoid(objArray, this, ou2, "5")) {
                shareInfo = c.I(this.p);
                if (shareInfo != null) {
                   PhotoAdvertisement$ShareInfo mShareTitle = shareInfo.mShareTitle;
                   if (mShareTitle != null) {
                      if (mShareTitle.length() > 0) {
                         b = true;
                      }
                      if (b == ou21) {
                         ou21 = this.t;
                         if (ou21 == null) {
                            a.S("mShareTextView");
                         }
                         ou21.setText(shareInfo.mShareTitle);
                      }
                   }
                   tr = this.t;
                   if (tr == null) {
                      a.S("mShareTextView");
                   }
                   tr.setText(a1.p(R.string.arg_RES_7f1000a7));
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, ou2, "6")) {
                ou2 = this.v;
                if (ou2 == null) {
                   a.S("mShareIcon");
                }
                ou2.setOnClickListener(new v2(this));
             }
          }
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, u2.class, "7")) {
          return;
       }
       u2 tp = this.p;
       a.m(tp);
       i0.a().e(754, tp).d(new u2$b(this)).a();
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, u2.class, "8")) {
          return;
       }
       u2 tp = this.p;
       a.m(tp);
       i0.a().e(755, tp).d(new u2$c(this)).a();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new z2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, u2.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(u2.class, new z2());
       }else {
          obj.put(u2.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u2.class, "1")) {
          return;
       }
       this.p = this.q8(BaseFeed.class);
       Object obj = this.r8("WEB_ENTER_TIME");
       a.o(obj, "inject<Long>\(AdWebAccessIds.WEB_ENTER_TIME\)");
       this.q = obj.longValue();
       return;
    }
}
