package com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$isPostHomeRecoEnable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class PostEntranceEveManager$isPostHomeRecoEnable$2 extends Lambda implements a	// class@00104d
{
    public static final PostEntranceEveManager$isPostHomeRecoEnable$2 INSTANCE;

    static {
       PostEntranceEveManager$isPostHomeRecoEnable$2.INSTANCE = new PostEntranceEveManager$isPostHomeRecoEnable$2();
    }
    public void PostEntranceEveManager$isPostHomeRecoEnable$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PostEntranceEveManager$isPostHomeRecoEnable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("postHomeRecoEnable", false);
    }
}
