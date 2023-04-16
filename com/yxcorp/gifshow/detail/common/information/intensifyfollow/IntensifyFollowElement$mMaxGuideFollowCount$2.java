package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$mMaxGuideFollowCount$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class IntensifyFollowElement$mMaxGuideFollowCount$2 extends Lambda implements a	// class@00141d
{
    public static final IntensifyFollowElement$mMaxGuideFollowCount$2 INSTANCE;

    static {
       IntensifyFollowElement$mMaxGuideFollowCount$2.INSTANCE = new IntensifyFollowElement$mMaxGuideFollowCount$2();
    }
    public void IntensifyFollowElement$mMaxGuideFollowCount$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, IntensifyFollowElement$mMaxGuideFollowCount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("pymkVideoGuideFollowCount", 10);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
