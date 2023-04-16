package com.yxcorp.gifshow.share.im.IMPhotoForward$Companion$toFactory$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import gic.a;
import mhc.p1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.im.a;

public final class IMPhotoForward$Companion$toFactory$1 extends Lambda implements l	// class@001bb9
{
    public static final IMPhotoForward$Companion$toFactory$1 INSTANCE;

    static {
       IMPhotoForward$Companion$toFactory$1.INSTANCE = new IMPhotoForward$Companion$toFactory$1();
    }
    public void IMPhotoForward$Companion$toFactory$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final p1 invoke(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMPhotoForward$Companion$toFactory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new a(p0);
    }
}
