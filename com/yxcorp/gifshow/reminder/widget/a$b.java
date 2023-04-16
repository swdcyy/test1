package com.yxcorp.gifshow.reminder.widget.a$b;
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
import qu5.r;
import sec.b;

public class a$b extends m	// class@001afe
{
    public final a$c c;
    public final Activity d;
    public final Runnable e;

    public void a$b(a$c p0,Activity p1,Runnable p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.c.h0().o();
       a$b td = this.d;
       if (!PatchProxy.applyVoidTwoRefs(td, this.e, null, a.class, "5")) {
          d.a(-1497343380).Xg(td);
          td.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "3")) {
          b.b("create_group_chat");
       }
       return;
    }
}
