package com.yxcorp.gifshow.detail.common.information.marquee.model.d;
import ekd.q$a;
import java.lang.Object;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse$a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hr7.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.facebook.imagepipeline.request.ImageRequest;
import android.graphics.drawable.Drawable;
import wb5.i;
import lu7.f;
import java.lang.CharSequence;
import com.kuaishou.android.model.mix.QComment$CommentMarqueeTag;
import java.lang.StringBuilder;

public final class d implements q$a	// class@001430
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       Object obj1;
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       MarqueeResponse$a mMarqueeType = p0.mMarqueeType;
       Object obj = null;
       if (mMarqueeType == 1) {
          mMarqueeType = p0.mComment;
          obj1 = PatchProxy.applyOneRefs(mMarqueeType, obj, uoe, "14");
          if (obj1 != patchProxyRe) {
          label_0018 :
             obj = obj1;
          label_01bf :
             if (obj != null) {
                obj.i = p0.mDisableClick;
             }
             return obj;
          }else {
             User user = mMarqueeType.getUser();
             ImageRequest[] imageRequest = e.e(user, HeadImageSize.ADJUST_SMALL);
             String str = f.a(user);
             uoa = a.a(mMarqueeType.getId(), 1, imageRequest, i.b(user.mSex), str, f.b(mMarqueeType.mReplyToUserId, mMarqueeType.mReplyToUserName), e.f(mMarqueeType), mMarqueeType.getTag());
          }
       }else if(mMarqueeType == 6){
          mMarqueeType = p0.mComment;
          User obj2 = PatchProxy.applyOneRefs(mMarqueeType, obj, uoe, "15");
          if (obj2 != patchProxyRe) {
             obj = obj2;
             goto label_01bf ;
          }else {
             obj2 = mMarqueeType.getUser();
             String id = mMarqueeType.getId();
             ImageRequest[] imageRequest1 = e.e(obj2, HeadImageSize.ADJUST_SMALL);
             Drawable uDrawable = i.b(obj2.mSex);
             String str1 = f.a(obj2);
             String str2 = f.b(mMarqueeType.mReplyToUserId, mMarqueeType.mReplyToUserName);
             obj1 = PatchProxy.applyTwoRefs(obj2, mMarqueeType, obj, uoe, "24");
             String str3 = (obj1 != patchProxyRe)? obj1: f.c(obj2)+":  "+e.f(mMarqueeType);
             uoa = a.a(id, 6, imageRequest1, uDrawable, str1, str2, str3, mMarqueeType.getTag());
          }
       }else if(mMarqueeType == 2){
          mMarqueeType = p0.mUser;
          obj1 = PatchProxy.applyOneRefs(mMarqueeType, obj, uoe, "16");
          if (obj1 != patchProxyRe) {
             goto label_0018 ;
          }else {
             uoa = a.a(mMarqueeType.getId(), 2, e.e(mMarqueeType, HeadImageSize.ADJUST_SMALL), i.b(mMarqueeType.mSex), f.a(mMarqueeType), null, null, null);
          }
       }else if(mMarqueeType == 7){
          mMarqueeType = p0.mUser;
          obj1 = PatchProxy.applyOneRefs(mMarqueeType, obj, uoe, "17");
          if (obj1 != patchProxyRe) {
             goto label_0018 ;
          }else {
             uoa = a.a(mMarqueeType.getId(), 7, e.e(mMarqueeType, HeadImageSize.ADJUST_SMALL), i.b(mMarqueeType.mSex), f.a(mMarqueeType), null, null, null);
          }
       }else if(mMarqueeType == 3){
          mMarqueeType = p0.mUser;
          obj1 = PatchProxy.applyOneRefs(mMarqueeType, obj, uoe, "18");
          if (obj1 != patchProxyRe) {
             goto label_0018 ;
          }else {
             uoa = a.a(mMarqueeType.getId(), 3, e.e(mMarqueeType, HeadImageSize.ADJUST_SMALL), i.b(mMarqueeType.mSex), f.a(mMarqueeType), null, null, null);
          }
       }else if(mMarqueeType == 4){
          mMarqueeType = p0.mUser;
          obj1 = PatchProxy.applyOneRefs(mMarqueeType, obj, uoe, "19");
          if (obj1 != patchProxyRe) {
             goto label_0018 ;
          }else {
             uoa = a.a(mMarqueeType.getId(), 4, e.e(mMarqueeType, HeadImageSize.ADJUST_SMALL), i.b(mMarqueeType.mSex), f.a(mMarqueeType), null, null, null);
          }
       }else if(mMarqueeType == 5){
          mMarqueeType = p0.mUser;
          obj1 = PatchProxy.applyOneRefs(mMarqueeType, obj, uoe, "20");
          if (obj1 != patchProxyRe) {
             goto label_0018 ;
          }else {
             uoa = a.a(mMarqueeType.getId(), 5, e.e(mMarqueeType, HeadImageSize.ADJUST_SMALL), i.b(mMarqueeType.mSex), f.a(mMarqueeType), null, null, null);
          }
       }else if(mMarqueeType == null){
          mMarqueeType = p0.a;
          obj1 = PatchProxy.applyOneRefs(mMarqueeType, obj, uoe, "21");
          if (obj1 != patchProxyRe) {
             goto label_0018 ;
          }else {
             uoa = a.a(mMarqueeType, null, null, null, null, null, null, null);
          }
       }else {
          goto label_01bf ;
       }
       obj = uoa;
       goto label_01bf ;
    }
}
