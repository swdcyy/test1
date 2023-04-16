package com.kuaishou.krn.NativeToJsKt$notifyEventToJs$reactRootView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.View;
import java.lang.Boolean;
import com.facebook.react.ReactRootView;

public final class NativeToJsKt$notifyEventToJs$reactRootView$1 extends Lambda implements l	// class@0007a9
{
    public static final NativeToJsKt$notifyEventToJs$reactRootView$1 INSTANCE;

    static {
       NativeToJsKt$notifyEventToJs$reactRootView$1.INSTANCE = new NativeToJsKt$notifyEventToJs$reactRootView$1();
    }
    public void NativeToJsKt$notifyEventToJs$reactRootView$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(View p0){
       return p0 instanceof ReactRootView;
    }
}
