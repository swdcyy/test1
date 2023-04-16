package com.kuaishou.live.core.show.test.a0;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.test.z0;
import java.lang.String;
import java.util.List;
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
import java.lang.StringBuilder;
import il2.m;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog;

public final class a0 implements View$OnClickListener	// class@001193
{
    public final z0 b;
    public final String c;
    public final String d;
    public final List e;

    public void a0(z0 p0,String p1,String p2,List p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onClick(View p0){
       a0 tb = this.b;
       a0 td = this.d;
       a0 te = this.e;
       Objects.requireNonNull(tb);
       AlertDialog$Builder uBuilder = new AlertDialog$Builder(p0.getContext()).setTitle(this.c);
       String[] stringArray = PatchProxy.applyTwoRefs(td, te, tb, z0.class, "21");
       if (stringArray != PatchProxyResult.class) {
       }else {
          int i = te.size();
          String[] stringArray1 = new String[i];
          int i1 = 0;
          for (int i2 = 0; i2 < i; i2 = i2 + 1) {
             stringArray1[i2] = te.get(i2);
          }
          i = l.e(td, i1);
          stringArray1[i] = stringArray1[i]+" ¡Ì ";
          stringArray = stringArray1;
       }
       uBuilder.setItems(stringArray, new m(td)).show();
       return;
    }
}
