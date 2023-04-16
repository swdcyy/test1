package k99.d0$a;
import xtd.e;
import k99.d0;
import java.lang.Object;
import xtd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import lnc.a1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import k2b.u1;
import p1a.a;
import p1a.a$a;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import az6.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.kwai.framework.model.feed.BaseFeed;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.u;

public final class d0$a implements e	// class@002b6e
{
    public final d0 a;

    public void d0$a(d0 p0){
       this.a = p0;
       super();
    }
    public final void a(b p0,int p1,float p2){
       String this;
       if (PatchProxy.isSupport(d0$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, d0$a.class, "1")) {
          return;
       }
       int i = 2;
       if (p1 == i) {
          this.a.z = false;
       }
       if (this.a.z == null) {
          int i1 = 3;
          if (p1 == i1 && p2 - (float)a1.e(0xc2f00000) < 0) {
             d0$a ta = this.a;
             ta.z = true;
             Objects.requireNonNull(ta);
             Object[] objArray = null;
             d0 obj = PatchProxy.apply(objArray, ta, d0.class, "9");
             if (obj != PatchProxyResult.class) {
                obj.booleanValue();
             }else {
                obj = ta.r;
                String str = "mLogger";
                if (obj == null) {
                   a.S(str);
                }
                a$a obj1 = obj.get();
                this = "mLogger.get\(\)";
                a.o(obj1, this);
                d0 r = ta.r;
                if (r == null) {
                   a.S(str);
                }
                d0 obj2 = r.get();
                a.o(obj2, this);
                obj1.setEntryAuthorProfileCnt((obj2.getEntryAuthorProfileCnt() + true));
                obj = ta.s;
                if (obj == null) {
                   a.S("mEnterProfileTrigger");
                }
                obj2 = ta.q;
                if (obj2 == null) {
                   a.S("mPhoto");
                }
                obj.onNext(obj2.getPhotoId());
                u1.K0(i);
                d0 t = ta.t;
                if (t == null) {
                   a.S("mLogListener");
                }
                a uoa = t.get();
                obj1 = new a$a(5, 1071, "PULL_TO_SWITCH_PAGE");
                obj1.i(i1);
                d0 q = ta.q;
                if (q == null) {
                   a.S("mPhoto");
                }
                obj1.g(a.b(q));
                uoa.a(obj1);
                t = ta.q;
                if (t == null) {
                   a.S("mPhoto");
                }
                ProfileStartParam profileStart = ProfileStartParam.l(t.getUser());
                q = ta.v;
                String str1 = "mDetailParam";
                if (q == null) {
                   a.S(str1);
                }
                if (q.mPhoto != null) {
                   q = ta.v;
                   if (q == null) {
                      a.S(str1);
                   }
                   objArray = q.mPhoto.mEntity;
                }
                q = ta.v;
                if (q == null) {
                   a.S(str1);
                }
                a mPhotoIndex = q.mPhotoIndex;
                obj2 = ta.v;
                if (obj2 == null) {
                   a.S(str1);
                }
                DetailCommonParam detailCommon = obj2.getDetailCommonParam();
                a.o(detailCommon, "mDetailParam.detailCommonParam");
                profileStart.y(objArray, mPhotoIndex, detailCommon.getPreInfo());
                Activity activity = ta.getActivity();
                a.m(activity);
                d.a(-1718536792).Nl(activity, profileStart, ta.x);
                RxBus.f.b(new u(true));
             }
          }
       }
       return;
    }
}
