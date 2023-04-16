package com.kuaishou.live.livestage.utils.CommonUtil$UI_HANDLER$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;

public final class CommonUtil$UI_HANDLER$2 extends Lambda implements a	// class@000bf4
{
    public static final CommonUtil$UI_HANDLER$2 INSTANCE;

    static {
       CommonUtil$UI_HANDLER$2.INSTANCE = new CommonUtil$UI_HANDLER$2();
    }
    public void CommonUtil$UI_HANDLER$2(){
       super(0);
    }
    public final Handler invoke(){
       Object obj = PatchProxy.apply(null, this, CommonUtil$UI_HANDLER$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Handler(Looper.getMainLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
