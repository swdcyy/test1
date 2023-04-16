package com.yxcorp.gifshow.init.module.a0;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.FeedCdnResourceInitModule;
import com.yxcorp.gifshow.util.cdnresource.a;
import wkd.b;
import com.kwai.component.bifrost.BifrostActivityManager;
import com.yxcorp.gifshow.like.resource.PhotoLikeIconConfig;
import java.lang.String;
import java.lang.Class;
import java.util.List;
import com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import com.kwai.component.bifrost.res.BifrostZipResourceEntry;
import com.yxcorp.gifshow.like.resource.PhotoLikeAnimationConfig;
import com.yxcorp.gifshow.like.resource.CommentLikeAnimationConfig;
import com.yxcorp.gifshow.util.cdnresource.j;
import com.yxcorp.gifshow.util.cdnresource.k;
import com.yxcorp.gifshow.util.cdnresource.g;
import io.reactivex.g;
import brd.t;
import com.yxcorp.gifshow.util.cdnresource.h;
import erd.o;
import t45.d;
import brd.z;
import pnc.e;
import pnc.f;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.cdnresource.f;
import com.yxcorp.gifshow.like.resource.LikeActivityResourceConfig;
import m0b.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import pnc.n;
import pnc.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.util.cdnresource.m;
import com.yxcorp.gifshow.like.resource.SearchLikeResourceConfig;
import java.util.Collection;
import ekd.q;
import fz5.h;
import com.kwai.robust.PatchProxy;
import wy5.b;
import q87.c;
import fz5.f;
import java.util.concurrent.Callable;
import fz5.e;
import fz5.b;
import fz5.c;

public final class a0 implements Runnable	// class@0019af
{
    public static final a0 b;

    static {
       a0.b = new a0();
    }
    public void a0(){
       super();
    }
    public final void run(){
       int i2;
       int i = 0;
       if (!a.c) {
       }else {
          int i1 = -1568263472;
          String str1 = "PHOTO_LIKE_ICON";
          List list = b.a(i1).b(str1, PhotoLikeIconConfig.class);
          if (list != null && !list.isEmpty()) {
             for (i2 = 0; i2 < list.size(); i2 = i2 + 1) {
                PhotoLikeIconConfig photoLikeIco = list.get(i2);
                a.c(photoLikeIco.mPhotoLikeIcon, photoLikeIco.getActivityId(), str1);
             }
          }
          str1 = "PHOTO_LIKE_ANIMATION";
          list = b.a(i1).b(str1, PhotoLikeAnimationConfig.class);
          if (list != null && !list.isEmpty()) {
             for (i2 = 0; i2 < list.size(); i2 = i2 + 1) {
                PhotoLikeAnimationConfig photoLikeAni = list.get(i2);
                a.c(photoLikeAni.mPhotoLikeAnimation, photoLikeAni.getActivityId(), str1);
             }
          }
          String str2 = "COMMENT_LIKE_ANIMATION";
          List list1 = b.a(i1).b(str2, CommentLikeAnimationConfig.class);
          if (list1 != null && !list1.isEmpty()) {
             for (int i3 = 0; i3 < list1.size(); i3 = i3 + 1) {
                CommentLikeAnimationConfig uCommentLike = list1.get(i3);
                a.c(uCommentLike.mCommentLikeResource, uCommentLike.getActivityId(), str2);
             }
          }
       }
       j oj = j.b();
       if (!oj.b.b()) {
          oj.b.d(true);
          t.create(g.b).flatMap(new h(oj)).subscribeOn(d.c).observeOn(d.a).subscribe(new e(oj), new f(oj));
       }
       f.k();
       LikeActivityResourceConfig likeActivity = LikeActivityResourceConfig.class;
       String str = a.a.getString("likeActivityResourceConfig", "null");
       Object[] objArray = null;
       likeActivity = (str == null || str == "")? objArray: b.a(str, likeActivity);
       if (likeActivity != null) {
          if (n.a(likeActivity.mStartTimestamp, likeActivity.mEndTimestamp)) {
             b.a(0x44c00a7).a("ACTIVITY_RESOURCE", likeActivity.mResourceUrl, likeActivity.mKsOrderId, likeActivity.mDisplayStyle);
          }else {
             Log.d("LikeResourceUtils", "未下发CDN资源 , CDN资源不在当前时间段使用 config = "+likeActivity.toString());
          }
       }
       SearchLikeResourceConfig searchLikeRe = a.a(SearchLikeResourceConfig.class);
       if (searchLikeRe != null && !q.f(searchLikeRe.mPkgLists)) {
          m.c(searchLikeRe.mPkgLists, i);
       }
       if (!PatchProxy.applyVoid(objArray, objArray, h.class, "1")) {
          Object[] objArray1 = new Object[i];
          b.C().w("RewardCacheResourceUtil2", "cacheRewardResource: start", objArray1);
          t.fromCallable(f.b).flatMap(e.b).subscribeOn(d.c).observeOn(d.a).subscribe(b.b, c.b);
       }
       return;
    }
}
