package com.kwai.feature.api.social.reminder.push.SocialPushKt$b;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class SocialPushKt$b implements r	// class@0011c2
{
    public static final SocialPushKt$b b;

    static {
       SocialPushKt$b.b = new SocialPushKt$b();
    }
    public void SocialPushKt$b(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, SocialPushKt$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0.booleanValue();
       }
       return b;
    }
}
