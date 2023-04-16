package com.kwai.plugin.dva.split.SplitManager$mAssetsInstaller$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import pj7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.split.SplitManager;
import kotlin.jvm.internal.a;
import android.content.Context;

public final class SplitManager$mAssetsInstaller$2 extends Lambda implements a	// class@001384
{
    public static final SplitManager$mAssetsInstaller$2 INSTANCE;

    static {
       SplitManager$mAssetsInstaller$2.INSTANCE = new SplitManager$mAssetsInstaller$2();
    }
    public void SplitManager$mAssetsInstaller$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, SplitManager$mAssetsInstaller$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context b = SplitManager.b;
       if (b == null) {
          a.S("mContext");
       }else {
          objArray = b;
       }
       return new a(objArray);
    }
}
