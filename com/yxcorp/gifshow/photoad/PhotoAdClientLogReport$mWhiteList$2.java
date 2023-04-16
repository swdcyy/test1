package com.yxcorp.gifshow.photoad.PhotoAdClientLogReport$mWhiteList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.photoad.PhotoAdClientLogReport$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.util.List;
import nsd.u;
import java.lang.reflect.Type;

public final class PhotoAdClientLogReport$mWhiteList$2 extends Lambda implements a	// class@000f66
{
    public static final PhotoAdClientLogReport$mWhiteList$2 INSTANCE;

    static {
       PhotoAdClientLogReport$mWhiteList$2.INSTANCE = new PhotoAdClientLogReport$mWhiteList$2();
    }
    public void PhotoAdClientLogReport$mWhiteList$2(){
       super(0);
    }
    public final PhotoAdClientLogReport$a invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PhotoAdClientLogReport$mWhiteList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("adActionTypeWhiteListForClientLog", PhotoAdClientLogReport$a.class, new PhotoAdClientLogReport$a(objArray, objArray, 3, objArray));
    }
    public Object invoke(){
       return this.invoke();
    }
}
