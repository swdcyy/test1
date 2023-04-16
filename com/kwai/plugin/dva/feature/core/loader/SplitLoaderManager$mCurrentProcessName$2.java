package com.kwai.plugin.dva.feature.core.loader.SplitLoaderManager$mCurrentProcessName$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.feature.core.loader.SplitLoaderManager;
import kotlin.jvm.internal.a;
import android.content.Context;
import qj7.h;

public final class SplitLoaderManager$mCurrentProcessName$2 extends Lambda implements a	// class@000e68
{
    public static final SplitLoaderManager$mCurrentProcessName$2 INSTANCE;

    static {
       SplitLoaderManager$mCurrentProcessName$2.INSTANCE = new SplitLoaderManager$mCurrentProcessName$2();
    }
    public void SplitLoaderManager$mCurrentProcessName$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, this, SplitLoaderManager$mCurrentProcessName$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SplitLoaderManager.i;
       if (obj == null) {
          a.S("mContext");
       }else {
          objArray = obj;
       }
       return h.a(objArray);
    }
}
