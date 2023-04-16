package com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils$postCardABType$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.abtest.f;
import o56.a;
import xf6.i;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class ProfilePostEmptyCardUtils$postCardABType$2 extends Lambda implements a	// class@0015cc
{
    public static final ProfilePostEmptyCardUtils$postCardABType$2 INSTANCE;

    static {
       ProfilePostEmptyCardUtils$postCardABType$2.INSTANCE = new ProfilePostEmptyCardUtils$postCardABType$2();
    }
    public void ProfilePostEmptyCardUtils$postCardABType$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, ProfilePostEmptyCardUtils$postCardABType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       String str = "post_card_type";
       int i = f.f(str, 0);
       if (a.d()) {
          int i1 = i.g(str);
          if (i1 > 0 && i1 <= 3) {
             i = i1 - 1;
          }
       }
       ProfilePostEmptyCardUtils.e.i("postCardABType", "value: "+i);
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
