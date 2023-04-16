package com.yxcorp.gifshow.detail.slidev2.presenter.h$e;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slidev2.presenter.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i3a.b;
import java.lang.Boolean;
import e17.i;

public class h$e extends m	// class@0019b8
{
    public final h c;

    public void h$e(h p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       Object[] objArray;
       Boolean tRUE;
       if (PatchProxy.applyVoidOneRefs(p0, this, h$e.class, "1")) {
          return;
       }
       this.c.S8("auto_play");
       b.l((b.f() ^ 1));
       this.c.V8();
       int i = 2;
       if (b.f()) {
          objArray = new Object[i];
          tRUE = Boolean.TRUE;
          objArray[0] = tRUE;
          objArray[1] = tRUE;
          i.b(R.style.arg_RES_7f11066a, 0x7f10483f, objArray);
       }else {
          objArray = new Object[i];
          tRUE = Boolean.TRUE;
          objArray[0] = tRUE;
          objArray[1] = tRUE;
          i.b(R.style.arg_RES_7f11066a, 0x7f10483e, objArray);
       }
       return;
    }
}
