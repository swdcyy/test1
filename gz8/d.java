package gz8.d;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import p1a.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p1a.a$a;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import qrd.l1;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import gz8.d$b;
import erd.g;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import os5.l;
import com.kwai.feature.api.live.plugin.dva.LoadPolicy;
import android.app.Activity;
import brd.a0;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import gz8.d$a;
import sw.a;
import crd.b;
import kp.r1;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment;
import java.util.Objects;
import java.lang.Number;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import az6.a;

public final class d	// class@002529
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public static final void b(BaseFragment p0,QPhoto p1,int p2,QPhoto p3,a p4,boolean p5){
       d uod = d.class;
       int i = 1;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, uod, "1")) {
             return;
          }
       }
       a.p(p0, "fragment");
       a.p(p1, "photo");
       a.p(p3, "liveInfo");
       if (p3.getLivePlayConfig() == null) {
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("live getLivePlayConfig null"));
          return;
       }else {
          GifshowActivity activity = p0.getActivity();
          if (activity != null) {
             if (p4 != null) {
                a$a uoa = a$a.a(810, "click_head");
                uoa.n(i);
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("live_tag", "TRUE");
                uoa.p = jsonObject.toString();
                uoa.g(a.c(p1, p2));
                p4.a(uoa);
             }
             if (p5 && (p3.mEntity != null && p1.isAd())) {
                if (p1.mEntity instanceof LiveStreamFeed) {
                   i0.a().e(283, p3.mEntity).a();
                }else {
                   i0.a().e(124, p1.mEntity).d(new d$b(p3)).a();
                }
             }
             f.m(p3.getUser(), p1.getUser().mFollowStatus);
             d$a uoa1 = new d$a(activity, p3, p1, p0.f(), p0);
             LivePluginManager.f(l.class, LoadPolicy.DIALOG, activity, null, 8, null).R(p1.getUser().mFollowStatus, new a("live"));
          }
          return;
       }
    }
    public static void c(BaseFragment p0,QPhoto p1,int p2,QPhoto p3,a p4,boolean p5,int p6,Object p7){
       if (p6 & 0x04) {
          p2 = r1.y1(p1.getEntity()) + 1;
       }
       int i = p2;
       boolean b = (p6 & 0x20)? true: p5;
       d.b(p0, p1, i, p3, p4, b);
       return;
    }
    public final String a(BaseFragment p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "fragment");
       Objects.requireNonNull(p0);
       obj = PatchProxy.apply(null, p0, AdDetailVMFragment.class, "42");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          PhotoDetailParam photoDetailP = p0.rh();
          i = (photoDetailP != null)? photoDetailP.mSource: null;
       }
       String str = (i == 8)? "/rest/n/live/feed/double/hotPage/slide/more": "/rest/n/live/feed/selection/slide/more";
       return str;
    }
}
