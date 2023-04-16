package com.yxcorp.gifshow.detail.common.information.marquee.model.a;
import ekd.q$b;
import java.lang.Object;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse$a;
import com.yxcorp.gifshow.detail.common.information.marquee.model.c;
import com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class a implements q$b	// class@00142d
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean a(Object p0){
       boolean b1;
       MarqueeResponse$a obj = PatchProxy.applyOneRefs(p0, null, e.class, "5");
       int i = 0;
       boolean b = true;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(p0 != null){
          obj = p0.mMarqueeType;
          if (obj == b || obj == 6) {
             obj = p0.mComment;
             if (obj != null && obj.getUser() != null) {
                if (TextUtils.x(p0.mComment.getComment())) {
                   obj = p0.mComment;
                   if (obj.mEmotionInfo == null && obj.attachmentList == null) {
                   label_0045 :
                      b1 = false;
                   }
                }
                b1 = true;
             }else {
                goto label_0045 ;
             }
          }else {
             goto label_0045 ;
          }
       }else {
          goto label_0045 ;
       }
       if (!b1) {
          obj = (p0 != null && (p0.mMarqueeType == 3 && p0.mUser != null))? 1: null;
          if (!obj) {
             obj = (p0 != null && (p0.mMarqueeType == 5 && p0.mUser != null))? 1: null;
             if (!obj) {
                if (p0 != null) {
                   obj = p0.mMarqueeType;
                   if (obj == 2 || (obj == 7 && p0.mUser != null)) {
                      i = 1;
                   }
                }
                b = i;
             }
          }
       }
    label_007b :
       return b;
    }
}
