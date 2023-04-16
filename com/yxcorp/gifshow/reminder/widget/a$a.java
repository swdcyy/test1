package com.yxcorp.gifshow.reminder.widget.a$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.library.widget.popup.bubble.a$c;
import android.app.Activity;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.reminder.widget.a;
import tkd.b;
import tkd.d;
import pu5.a;
import ofc.b;
import n3d.a;
import qu5.r;
import sec.b;

public class a$a extends m	// class@001afd
{
    public final a$c c;
    public final Activity d;
    public final Runnable e;

    public void a$a(a$c p0,Activity p1,Runnable p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.c.h0().o();
       a$a td = this.d;
       a$a te = this.e;
       if (!PatchProxy.applyVoidTwoRefs(td, te, null, a.class, "4")) {
          a uoa = d.a(-1497343380);
          b uob = (te != null)? new b(te): null;
          uoa.Wq(td, 1, uob);
          td.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "2")) {
          b.b("send_message");
       }
       return;
    }
}
