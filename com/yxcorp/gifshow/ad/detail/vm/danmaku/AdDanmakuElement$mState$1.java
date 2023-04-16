package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$mState$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import rm5.a;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;

public final class AdDanmakuElement$mState$1 extends FunctionReferenceImpl implements l	// class@001703
{

    public void AdDanmakuElement$mState$1(AdDanmakuElement p0){
       super(1, p0, AdDanmakuElement.class, "canShow", "canShow\(Lcom/kwai/feature/api/danmaku/state/DanmakuState;\)Z", 0);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(a p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CallableReference obj = PatchProxy.applyOneRefs(p0, this, AdDanmakuElement$mState$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "p1");
       obj = this.receiver;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, AdDanmakuElement.class, "22");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(p0.d(1) && (!p0.d(4) && !p0.d(5))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
