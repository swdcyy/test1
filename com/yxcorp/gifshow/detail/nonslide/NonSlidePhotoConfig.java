package com.yxcorp.gifshow.detail.nonslide.NonSlidePhotoConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.nonslide.NonSlidePhotoConfig$photoSuspendEnabled$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NonSlidePhotoConfig	// class@0015c7
{
    public final p a;
    public final QPhoto b;

    public void NonSlidePhotoConfig(QPhoto p0){
       a.p(p0, "qPhoto");
       super();
       this.b = p0;
       this.a = s.c(new NonSlidePhotoConfig$photoSuspendEnabled$2(this));
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, NonSlidePhotoConfig.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.a.getValue();
       }
       return obj.booleanValue();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NonSlidePhotoConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NonSlidePhotoConfig && a.g(this.b, p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       NonSlidePhotoConfig obj = PatchProxy.apply(null, this, NonSlidePhotoConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NonSlidePhotoConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NonSlidePhotoConfig\(qPhoto="+this.b+"\)";
    }
}
