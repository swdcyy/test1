package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$j;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import qp7.x0;
import dr7.f0;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.photo.reduce.d;
import java.lang.Integer;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import p1a.a$a;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p1a.a;

public final class IntensifyFollowElement$j implements g	// class@001418
{
    public final IntensifyFollowElement b;

    public void IntensifyFollowElement$j(IntensifyFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       IntensifyFollowElement x;
       IntensifyFollowElement v;
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElement$j.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, IntensifyFollowElement.class, "44")) {
             String str = "mDetailParams";
             String str1 = "mPhotoFeedbackHelper";
             boolean b = false;
             if (p0.H().U != null) {
                if (p0.B0()) {
                   if (p0.E().h(b)) {
                      p0.b0();
                   }
                }else {
                   x = p0.C;
                   if (x == null) {
                      a.S(str1);
                   }
                   v = p0.v;
                   if (v == null) {
                      a.S(str);
                   }
                   int source = v.getSource();
                   Object obj = null;
                   IntensifyFollowElement u = p0.u;
                   if (u == null) {
                      a.S("mPhoto");
                   }
                   CommonMeta mFeedFriendI = r1.w0(u.mEntity).mFeedFriendInfo;
                   if (mFeedFriendI != null) {
                      objArray = mFeedFriendI.mPrsid;
                   }
                   u = p0.z;
                   if (u == null) {
                      a.S("mFragment");
                   }
                   String str2 = u.o();
                   Objects.requireNonNull(x);
                   if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(source), obj, objArray, str2, x, d.class, "6")) {
                      i3 oi31 = i3.f();
                      oi31.d("prsid", TextUtils.I(objArray));
                      oi31.d("page_name", TextUtils.I(str2));
                      x.a(source, null, "PYMK", 0, true, oi31, null);
                      x.g();
                   }
                }
             }else if(p0.B0()){
                if (p0.E().h(b)) {
                   p0.b0();
                }
             }else {
                x = p0.C;
                if (x == null) {
                   a.S(str1);
                }
                v = p0.v;
                if (v == null) {
                   a.S(str);
                }
                x.b(v.getSource(), objArray, "PYMK");
             }
             x = p0.x;
             if (x == null) {
                a.S("mLogListener");
             }
             a$a uoa = a$a.a(1744, "NOT_INTEREST_BUTTON");
             uoa.f("NOT_INTEREST_BUTTON");
             uoa.r(true);
             i3 oi3 = i3.f();
             oi3.d("author_source", p0.r0());
             uoa.m(oi3.e());
             p0 = p0.u;
             if (p0 == null) {
                a.S("mPhoto");
             }
             uoa.j(p0.getFeedLogCtx());
             x.a(uoa);
          }
       }
       return;
    }
}
