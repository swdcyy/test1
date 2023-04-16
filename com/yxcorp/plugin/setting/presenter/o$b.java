package com.yxcorp.plugin.setting.presenter.o$b;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.presenter.o;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vo5.e;
import android.app.Activity;

public class o$b implements View$OnClickListener	// class@0008e9
{
    public final o b;

    public void o$b(o p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$b.class, "1")) {
          return;
       }
       d.a(0x3b991223).AR(this.b.s);
       return;
    }
}
