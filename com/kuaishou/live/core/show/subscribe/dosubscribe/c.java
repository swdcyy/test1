package com.kuaishou.live.core.show.subscribe.dosubscribe.c;
import android.view.View$OnClickListener;
import android.app.Activity;
import com.kuaishou.live.core.show.subscribe.b$a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.content.Context;
import java.lang.Boolean;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import rk2.p;
import java.util.Map;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;

public final class c implements View$OnClickListener	// class@0010e0
{
    public final View$OnClickListener b;
    public final Activity c;
    public final b$a d;
    public final c e;

    public void c(View$OnClickListener p0,Activity p1,b$a p2,c p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onClick(View p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       c te = this.e;
       if (tb != null) {
          tb.onClick(p0);
       }
       if (!PatchProxy.applyVoidTwoRefs(tc, td, null, j.class, "7")) {
          int i = 2;
          String str = "android.permission.WRITE_CALENDAR";
          String[] stringArray = new String[]{str,"android.permission.READ_CALENDAR"};
          HashMap hashMap = new HashMap();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             object oobject = stringArray[i1];
             boolean b = PermissionUtils.l(tc, oobject);
             if (!b && PermissionUtils.a(tc, oobject)) {
                b = true;
             }
             hashMap.put(oobject, Boolean.valueOf(b));
          }
          String[] stringArray1 = new String[]{str,"android.permission.READ_CALENDAR"};
          a.f(tc, R.string.arg_RES_7f101ef9, 0x7f101ef8, stringArray1).subscribe(new p(td, hashMap, tc), Functions.e);
       }
       te.q(4);
       return;
    }
}
