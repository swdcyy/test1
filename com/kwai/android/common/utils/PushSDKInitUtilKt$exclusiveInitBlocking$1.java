package com.kwai.android.common.utils.PushSDKInitUtilKt$exclusiveInitBlocking$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import com.kwai.android.common.utils.PushSDKInitState;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PushSDKInitUtilKt$exclusiveInitBlocking$1 extends Lambda implements a	// class@0009a6
{
    public final a $block;

    public void PushSDKInitUtilKt$exclusiveInitBlocking$1(a p0){
       this.$block = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       PushSDKInitState iNSTANCE = PushSDKInitState.INSTANCE;
       iNSTANCE.getReentryFlag$lib_common_release().set(true);
       this.$block.invoke();
       iNSTANCE.getReentryFlag$lib_common_release().set(false);
       return;
    }
}
