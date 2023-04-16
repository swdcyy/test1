package b5a.h$a;
import com.yxcorp.gifshow.detail.nonslide.b$b;
import b5a.h;
import java.lang.Object;
import com.yxcorp.gifshow.detail.nonslide.b$a;
import wd5.e$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wd5.e;
import uw9.o;
import java.lang.Throwable;
import q87.c;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import com.yxcorp.gifshow.feed.PaidCourseAuthFailException;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;
import retrofit2.HttpException;
import com.yxcorp.retrofit.model.RetrofitException;
import com.yxcorp.gifshow.detail.nonslide.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import b5a.l;
import b5a.g;
import java.lang.Runnable;
import ekd.k1;

public class h$a implements b$b	// class@00036c
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(b$a p0){
       h r;
       b e;
       e$a uoa = e$a.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, str)) {
          return;
       }
       h$a ta = this.a;
       if (ta.s != null) {
          return;
       }
       b$a a = p0.a;
       if (a != 2) {
          String str1 = null;
          if (a != 3) {
             if (a == 4) {
                p0 = p0.c;
                Objects.requireNonNull(ta);
                h oh = h.class;
                if (!PatchProxy.applyVoidOneRefs(p0, ta, oh, "5") && ta.getActivity() != null) {
                   h t = ta.t;
                   Objects.requireNonNull(t);
                   if (!PatchProxy.applyVoid(null, t, uoa, "3") && t.a != null) {
                      e.a(8);
                      t.a = str1;
                   }
                   o.C().z("NonSlideDetailFlowPrese", "Fetch flow failed, ", p0);
                   if (p0 instanceof KwaiException) {
                      String message = p0.getMessage();
                      if (TextUtils.x(message)) {
                         message = ta.n8(R.string.arg_RES_7f100a1c);
                      }
                      i.d(R.style.arg_RES_7f110668, message);
                      ta.P8();
                   }else if(p0 instanceof PaidCourseAuthFailException){
                      PaidCourseAuthFailException mRedirectUrl = p0.mRedirectUrl;
                      if (!TextUtils.x(mRedirectUrl)) {
                         c.i(ta.getActivity(), KwaiWebViewActivity.N3(ta.getActivity(), mRedirectUrl).a());
                      }
                      ta.getActivity().finish();
                   }else if(p0 instanceof HttpException || p0 instanceof RetrofitException){
                      if (!PatchProxy.applyVoid(null, ta, oh, "6")) {
                         i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
                         if (ta.x != null) {
                            r = ta.r;
                            Objects.requireNonNull(r);
                            String str2 = PatchProxy.apply(null, r, b.class, "3");
                            if (str2 != PatchProxyResult.class) {
                            }else {
                               e = r.e;
                               str2 = (e != null)? e.getPhotoId(): r.i;
                            }
                            if (!PatchProxy.applyVoidOneRefs(str2, null, e.class, str)) {
                               ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                               ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                               uContentPack.userPackage = userPackage;
                               userPackage.identity = TextUtils.k(str2);
                               ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                               uElementPack.action = 0x7925;
                               u1.u0(4, uElementPack, uContentPack);
                            }
                            ta.x.d();
                         }
                      }
                   }else {
                      i.d(R.style.arg_RES_7f110668, ta.n8(R.string.arg_RES_7f100a1c));
                      ta.P8();
                   }
                }
             }
          }else {
             r = ta.t;
             Objects.requireNonNull(r);
             if (!PatchProxy.applyVoid(null, r, uoa, "2") && r.a != null) {
                e.a(7);
                r.a = str1;
             }
             r.s = true;
             k1.r(new g(this), 0);
          }
       }else {
          r = ta.x;
          if (r != null) {
             r.b();
          }
       }
       return;
    }
}
