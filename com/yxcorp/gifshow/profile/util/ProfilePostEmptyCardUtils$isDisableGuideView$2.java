package com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils$isDisableGuideView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;
import o56.a;
import xf6.i;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import java.lang.StringBuilder;

public final class ProfilePostEmptyCardUtils$isDisableGuideView$2 extends Lambda implements a	// class@0015cb
{
    public static final ProfilePostEmptyCardUtils$isDisableGuideView$2 INSTANCE;

    static {
       ProfilePostEmptyCardUtils$isDisableGuideView$2.INSTANCE = new ProfilePostEmptyCardUtils$isDisableGuideView$2();
    }
    public void ProfilePostEmptyCardUtils$isDisableGuideView$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       String obj = PatchProxy.apply(null, this, ProfilePostEmptyCardUtils$isDisableGuideView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "is_shield_profile_post_btn";
       boolean b = f.a(obj);
       String str = 1;
       if (a.d()) {
          int i = i.g(obj);
          if (i == str) {
             b = false;
          }else if(i == 2){
             b = true;
          }
       }
       ProfilePostEmptyCardUtils.e.i("isDisableGuideView", "value: "+b);
       return b;
    }
}
