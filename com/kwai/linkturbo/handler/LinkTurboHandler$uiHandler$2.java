package com.kwai.linkturbo.handler.LinkTurboHandler$uiHandler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;

public final class LinkTurboHandler$uiHandler$2 extends Lambda implements a	// class@000ae6
{
    public static final LinkTurboHandler$uiHandler$2 INSTANCE;

    static {
       LinkTurboHandler$uiHandler$2.INSTANCE = new LinkTurboHandler$uiHandler$2();
    }
    public void LinkTurboHandler$uiHandler$2(){
       super(0);
    }
    public final Handler invoke(){
       Object obj = PatchProxy.apply(null, this, LinkTurboHandler$uiHandler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Handler(Looper.getMainLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
