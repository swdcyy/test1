package com.kwai.framework.krn.init.view.KRNNetworkOptimizerDebugWindow$a;
import android.view.View$OnClickListener;
import com.kwai.framework.krn.init.view.KRNNetworkOptimizerDebugWindow;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jk0.b;
import jk0.c;

public class KRNNetworkOptimizerDebugWindow$a implements View$OnClickListener	// class@00161a
{
    public final KRNNetworkOptimizerDebugWindow b;

    public void KRNNetworkOptimizerDebugWindow$a(KRNNetworkOptimizerDebugWindow p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KRNNetworkOptimizerDebugWindow$a.class, "1")) {
          return;
       }
       this.b.a();
       c.a().i0(false);
       return;
    }
}