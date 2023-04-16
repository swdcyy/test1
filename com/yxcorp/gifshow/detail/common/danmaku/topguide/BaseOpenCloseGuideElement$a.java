package com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement$a;
import erd.g;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class BaseOpenCloseGuideElement$a implements g	// class@0013f2
{
    public final BaseOpenCloseGuideElement b;

    public void BaseOpenCloseGuideElement$a(BaseOpenCloseGuideElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseOpenCloseGuideElement$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.x = p0.booleanValue();
       }
       return;
    }
}
