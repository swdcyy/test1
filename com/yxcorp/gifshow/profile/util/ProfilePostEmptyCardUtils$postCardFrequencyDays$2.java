package com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils$postCardFrequencyDays$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class ProfilePostEmptyCardUtils$postCardFrequencyDays$2 extends Lambda implements a	// class@0015cd
{
    public static final ProfilePostEmptyCardUtils$postCardFrequencyDays$2 INSTANCE;

    static {
       ProfilePostEmptyCardUtils$postCardFrequencyDays$2.INSTANCE = new ProfilePostEmptyCardUtils$postCardFrequencyDays$2();
    }
    public void ProfilePostEmptyCardUtils$postCardFrequencyDays$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, ProfilePostEmptyCardUtils$postCardFrequencyDays$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("emptyProfilePostCardFrequencyDays", 14);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
