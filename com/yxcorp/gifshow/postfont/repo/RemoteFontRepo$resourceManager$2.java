package com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$resourceManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import jb7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import jb7.a;
import com.yxcorp.gifshow.postfont.model.FontConfigExtra;
import kb7.a;

public final class RemoteFontRepo$resourceManager$2 extends Lambda implements a	// class@0010aa
{
    public static final RemoteFontRepo$resourceManager$2 INSTANCE;

    static {
       RemoteFontRepo$resourceManager$2.INSTANCE = new RemoteFontRepo$resourceManager$2();
    }
    public void RemoteFontRepo$resourceManager$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, RemoteFontRepo$resourceManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceSdk.d(ResourceSdk.f, new a("FONT", 2, FontConfigExtra.class), null, 2, null);
    }
}
