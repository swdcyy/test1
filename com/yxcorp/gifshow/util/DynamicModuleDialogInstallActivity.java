package com.yxcorp.gifshow.util.DynamicModuleDialogInstallActivity;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.util.DynamicModuleDialogInstallActivity$a;
import nsd.u;
import java.util.ArrayList;
import msd.l;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Object;
import android.app.Activity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.o1;
import com.yxcorp.gifshow.util.DynamicModuleDialogInstallActivity$onCreate$1;
import lnc.p1;
import lnc.c4;

public final class DynamicModuleDialogInstallActivity extends FragmentActivity	// class@001ee5
{
    public HashMap b;
    public static List c;
    public static final DynamicModuleDialogInstallActivity$a d;

    static {
       DynamicModuleDialogInstallActivity.d = new DynamicModuleDialogInstallActivity$a(null);
       DynamicModuleDialogInstallActivity.c = new ArrayList();
    }
    public void DynamicModuleDialogInstallActivity(){
       super();
    }
    public final void E2(l p0){
       List c = DynamicModuleDialogInstallActivity.c;
       DynamicModuleDialogInstallActivity.c = new ArrayList();
       Iterator iterator = c.iterator();
       while (iterator.hasNext()) {
          p0.invoke(iterator.next());
       }
       this.finish();
       return;
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       String stringExtra = this.getIntent().getStringExtra("DYNAMIC_MODULE_NAME");
       if (stringExtra != null) {
       }else {
          stringExtra = "";
       }
       a.o(stringExtra, "intent.getStringExtra\(EX\x20\x02YNAMIC_MODULE_NAME\) ?: \"\"\x00");
       o1.a.a(this, stringExtra, new DynamicModuleDialogInstallActivity$onCreate$1(this), null);
       return;
    }
}
