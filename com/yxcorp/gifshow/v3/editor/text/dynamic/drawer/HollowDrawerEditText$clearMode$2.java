package com.yxcorp.gifshow.v3.editor.text.dynamic.drawer.HollowDrawerEditText$clearMode$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.graphics.PorterDuffXfermode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.PorterDuff$Mode;

public final class HollowDrawerEditText$clearMode$2 extends Lambda implements a	// class@0013c3
{
    public static final HollowDrawerEditText$clearMode$2 INSTANCE;

    static {
       HollowDrawerEditText$clearMode$2.INSTANCE = new HollowDrawerEditText$clearMode$2();
    }
    public void HollowDrawerEditText$clearMode$2(){
       super(0);
    }
    public final PorterDuffXfermode invoke(){
       Object obj = PatchProxy.apply(null, this, HollowDrawerEditText$clearMode$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PorterDuffXfermode(PorterDuff$Mode.CLEAR);
    }
    public Object invoke(){
       return this.invoke();
    }
}
