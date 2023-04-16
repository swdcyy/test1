package com.yxcorp.gifshow.detail.nonslide.NonSlidePhotoConfig$photoSuspendEnabled$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.nonslide.NonSlidePhotoConfig;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import j2a.b;

public final class NonSlidePhotoConfig$photoSuspendEnabled$2 extends Lambda implements a	// class@0015c6
{
    public final NonSlidePhotoConfig this$0;

    public void NonSlidePhotoConfig$photoSuspendEnabled$2(NonSlidePhotoConfig p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NonSlidePhotoConfig$photoSuspendEnabled$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.e(this.this$0.b);
    }
}
