package hfd.b$a;
import com.yxcorp.gifshow.widget.m;
import hfd.b;
import android.view.View;
import igc.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.google.gson.JsonObject;
import nfd.q1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.plugin.search.entity.kbox.KBoxExtParam;
import jfd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import com.yxcorp.gifshow.detail.helper.d;
import java.util.Objects;
import java.lang.Number;
import w99.g;
import android.net.Uri;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.utils.p;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.List;
import nfd.g3;
import d6a.f;
import android.app.Activity;
import lyb.w;
import f7d.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.utils.k;
import com.yxcorp.gifshow.activity.GifshowActivity;
import w99.f;
import v5a.g;
import aa9.b;
import com.kwai.framework.player.core.b;
import e1a.p;
import tcd.c;
import zbd.d;
import q7d.d0;
import n3d.a;
import hfd.a;
import e7d.h;
import com.yxcorp.gifshow.util.rx.RxBus;
import xed.c;
import im8.f;
import java.lang.Integer;

public class b$a extends m	// class@000f7e
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b;
       QPhoto obj;
       long l;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a tc = this.c;
       b d = tc.D;
       q1.x(1, tc.w, tc.s, d, this.c.t.getAction2(""), null, q1.r(d));
       TemplateBaseFeed mCoverExtInf = this.c.D.mCoverExtInfo;
       String str = "5";
       b = false;
       Object[] objArray = null;
       if (mCoverExtInf != null && !TextUtils.x(mCoverExtInf.mLinkUrl)) {
          tc = this.c;
          KBoxItem mExtParam = tc.t.mExtParam;
          if (mExtParam != null && mExtParam.mEnableHotResume != null) {
             obj = tc.u.c();
             if (this.c.x != null) {
                d uod = b.a(-1917741477);
                b x = this.c.x;
                Objects.requireNonNull(x);
                Object obj1 = PatchProxy.apply(objArray, x, uob, str);
                if (obj1 != patchProxyRe) {
                   l = obj1.longValue();
                }else if(x.a() != null){
                   l = x.a().m();
                }else {
                   l = 0;
                }
                uod.f(obj, l);
             }
             tc = this.c;
             tc.t.mExtParam.mUri = Uri.parse(tc.D.mCoverExtInfo.mLinkUrl);
             tc = this.c;
             if (tc.t.mExtParam.isEnableKboxSlide != null && tc.w instanceof SearchResultFragment) {
                tc.H.setTag(R.id.photo_id, obj.getPhotoId());
                tc = this.c;
                p.g(tc.s, tc.w, tc.H, b);
             }else {
                tc = this.c;
                tc = this.c;
                n.f(tc.w.getActivity(), tc.H, obj, g3.h(tc.s, true), tc.s.mKBoxItem.mExtParam.mUri, f.b(tc.w), null);
             }
          }else {
             k.c(tc.getActivity(), this.c.D.mCoverExtInfo.mLinkUrl);
          }
       }else {
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, b.class, "4")) {
             GifshowActivity activity = tc.getActivity();
             if (activity != null && tc.u.i()) {
                tc.A.c();
                obj = tc.u.c();
                b x1 = tc.x;
                if (x1 == null || (!PatchProxy.applyVoidOneRefs(obj, x1, uob, "17") && x1.a() != null)) {
                   uob = x1.a;
                   if (uob != null) {
                      p.g(uob.f(), obj);
                   }else {
                      uob = x1.b;
                      Objects.requireNonNull(uob);
                      if (!PatchProxy.applyVoid(objArray, uob, c.class, "40")) {
                         p.g(uob.k, uob.y);
                      }
                   }
                }
                p.j(d0.a(obj, tc.s), tc.w, tc.H, b, objArray);
                uob = PatchProxy.applyOneRefs(activity, tc, b.class, str);
                if (uob != patchProxyRe) {
                }else if(tc.I == null){
                   tc.I = new a(tc, activity);
                }
                uob = tc.I;
                activity.e(uob);
                tc.A.e();
                tc.A.b();
             }
          }
       }
       tc = this.c;
       uob = tc.E;
       if (tc.u.i()) {
          objArray = this.c.u.c();
       }
       uob.P(objArray, this.c.s, 3);
       if (this.c.getActivity() != null) {
          RxBus.f.b(new c(this.c.getActivity().hashCode(), this.c.z.get().intValue(), this.c.t));
       }
       return;
    }
}
