package com.yxcorp.gifshow.comment.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import android.app.Activity;
import com.tbruyelle.rxpermissions2.g;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.comment.f;
import erd.g;
import io.reactivex.internal.functions.Functions;

public class g	// class@0010d0
{
    public b a;

    public void g(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       b9.a(this.a);
       return;
    }
    public void b(String p0,String p1,Activity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "2")) {
          return;
       }
       if (p2 != null && (p0 != null || p1 != null)) {
          a.j(new g(p2), p2, "android.permission.WRITE_EXTERNAL_STORAGE", false).observeOn(d.a).subscribe(new f(this, p0, p1, p2), Functions.d());
       }
       return;
    }
}
