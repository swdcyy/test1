package com.kuaishou.live.core.show.test.z;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.test.z0;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import android.app.AlertDialog$Builder;
import android.content.Context;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.l;
import java.lang.System;
import java.lang.StringBuilder;
import il2.o;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog;

public final class z implements View$OnClickListener	// class@0011d1
{
    public final z0 b;
    public final String c;
    public final String d;

    public void z(z0 p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       z tb = this.b;
       z td = this.d;
       Objects.requireNonNull(tb);
       AlertDialog$Builder uBuilder = new AlertDialog$Builder(p0.getContext()).setTitle(this.c);
       String[] stringArray = PatchProxy.applyOneRefs(td, tb, z0.class, "22");
       if (stringArray != PatchProxyResult.class) {
       }else {
          int i = l.e(td, 0);
          String[] stringArray1 = new String[3];
          CharSequence[] j = z0.j;
          System.arraycopy(j, 0, stringArray1, 0, 3);
          stringArray1[i] = j[i]+" ¡Ì ";
          stringArray = stringArray1;
       }
       uBuilder.setItems(stringArray, new o(td)).show();
       return;
    }
}
