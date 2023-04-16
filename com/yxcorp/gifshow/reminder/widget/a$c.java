package com.yxcorp.gifshow.reminder.widget.a$c;
import com.yxcorp.gifshow.widget.m;
import com.kwai.library.widget.popup.bubble.a$c;
import android.app.Activity;
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
import wu5.a;
import android.content.Context;
import sec.b;

public class a$c extends m	// class@001aff
{
    public final a$c c;
    public final Activity d;

    public void a$c(a$c p0,Activity p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       this.c.h0().o();
       a$c td = this.d;
       if (!PatchProxy.applyVoidOneRefs(td, null, a.class, "6")) {
          d.a(0x6de3c81e).td(td);
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "4")) {
          b.b("find_friends");
       }
       return;
    }
}
