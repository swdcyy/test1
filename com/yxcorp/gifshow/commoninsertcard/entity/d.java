package com.yxcorp.gifshow.commoninsertcard.entity.d;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta$CardData;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta$TkConfigInfo;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import k2b.u1;

public class d	// class@0011aa
{

    public void d(){
       super();
    }
    public static boolean a(BaseFeed p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uod, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof CommonInsertCardFeed) {
          return b;
       }
       obj = PatchProxy.applyOneRefs(p0, null, uod, "3");
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(p0 != null){
          CommonInsertCardFeed mCommonInser = p0.mCommonInsertCardFeedMeta;
          if (mCommonInser != null) {
             boolean b2 = (mCommonInser.mCardData != null)? true: false;
             if (d.d(b2, 2)) {
                CommonInsertCardFeed mCommonInser1 = p0.mCommonInsertCardFeedMeta;
                Object obj1 = PatchProxy.applyOneRefs(mCommonInser1, null, uod, "4");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else {
                   CommonInsertCardFeedMeta mMetaStyle = mCommonInser1.mMetaStyle;
                   if (mMetaStyle == null) {
                      b1 = d.d(b, 1);
                   }else if(mMetaStyle == 1 && (mCommonInser1.mCardType != null || (mMetaStyle == 2 && (mCommonInser1.mRnConfigInfo != null && (!TextUtils.isEmpty(mCommonInser1.mCardData.mDynamicCardData) || d.c(mCommonInser1)))))){
                      b1 = true;
                   }else {
                      b1 = d.d(b, b);
                   }
                }
                if (b1) {
                   b = 1;
                }
             }
          }
       }
       b1 = b;
       return b1;
    }
    public static boolean b(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!d.a(p0)) {
          return false;
       }
       return d.c(p0.mCommonInsertCardFeedMeta);
    }
    public static boolean c(CommonInsertCardFeedMeta p0){
       boolean b;
       CommonInsertCardFeedMeta obj = PatchProxy.applyOneRefs(p0, null, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.mMetaStyle == 3) {
          obj = p0.mTkConfigInfo;
          if (obj != null && (!TextUtils.isEmpty(obj.mBundleId) && !TextUtils.isEmpty(p0.mCardData.mDynamicCardData))) {
             b = true;
          label_0032 :
             return b;
          }
       }
       b = false;
       goto label_0032 ;
    }
    public static boolean d(boolean p0,int p1){
       i3 obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), null, uod, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!p0) {
          obj = i3.f();
          obj.c("errorType", Integer.valueOf(p1));
          String str = obj.e();
          u1.R("extracard_loadError", str, 14);
       }
       return p0;
    }
}
