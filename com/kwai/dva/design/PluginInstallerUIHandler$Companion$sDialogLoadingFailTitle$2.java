package com.kwai.dva.design.PluginInstallerUIHandler$Companion$sDialogLoadingFailTitle$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.dva.design.PluginInstallerUIHandler;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.content.Context;

public final class PluginInstallerUIHandler$Companion$sDialogLoadingFailTitle$2 extends Lambda implements a	// class@000ac6
{
    public static final PluginInstallerUIHandler$Companion$sDialogLoadingFailTitle$2 INSTANCE;

    static {
       PluginInstallerUIHandler$Companion$sDialogLoadingFailTitle$2.INSTANCE = new PluginInstallerUIHandler$Companion$sDialogLoadingFailTitle$2();
    }
    public void PluginInstallerUIHandler$Companion$sDialogLoadingFailTitle$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, this, PluginInstallerUIHandler$Companion$sDialogLoadingFailTitle$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PluginInstallerUIHandler.B;
       if (obj == null) {
          a.S("sApp");
       }else {
          objArray = obj;
       }
       String str = objArray.getResources().getString(R.string.arg_RES_7f100a3e);
       a.o(str, "sApp.resources.getString¡­ialog_loading_fail_title\)");
       return str;
    }
}
