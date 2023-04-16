package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$nebulaMyFollowSlide$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.config.model.EnableMyfollowSlide;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import kha.a;

public final class FollowConfigUtil$nebulaMyFollowSlide$2 extends Lambda implements a	// class@0010b5
{
    public static final FollowConfigUtil$nebulaMyFollowSlide$2 INSTANCE;

    static {
       FollowConfigUtil$nebulaMyFollowSlide$2.INSTANCE = new FollowConfigUtil$nebulaMyFollowSlide$2();
    }
    public void FollowConfigUtil$nebulaMyFollowSlide$2(){
       super(0);
    }
    public final EnableMyfollowSlide invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$nebulaMyFollowSlide$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(EnableMyfollowSlide.class);
    }
    public Object invoke(){
       return this.invoke();
    }
}
