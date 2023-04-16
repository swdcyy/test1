package com.kuaishou.tuna_core.button.TunaButton$Companion$b;
import n3d.a;
import android.app.Activity;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_core.button.TunaButton;
import com.kuaishou.tuna_core.button.TunaButton$Companion;
import ma6.a;
import com.kuaishou.tuna_core.button.TunaButtonMonitor;

public final class TunaButton$Companion$b implements a	// class@00108d
{
    public final Activity b;
    public final TunaButtonModel c;
    public final int d;
    public final int e;

    public void TunaButton$Companion$b(Activity p0,TunaButtonModel p1,int p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(TunaButton$Companion$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, TunaButton$Companion$b.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (mE.isLogined()) {
          TunaButton.a.d(this.b, this.c, this.d);
       }else {
          mE.mFailureReason = "LoginCancelled";
       }
       TunaButtonMonitor.b.b(this.c.getTrackModel(), Integer.valueOf(this.e));
       return;
    }
}
