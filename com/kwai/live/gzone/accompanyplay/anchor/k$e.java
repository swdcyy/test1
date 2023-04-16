package com.kwai.live.gzone.accompanyplay.anchor.k$e;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.k;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Editable;
import android.widget.EditText;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.i3;
import crd.b;
import lnc.b9;
import j37.b;
import j37.a;
import brd.t;
import cjd.e;
import erd.o;
import h37.c;
import erd.g;
import h37.b;
import erd.a;
import com.kwai.live.gzone.accompanyplay.anchor.k$e$a;
import sfc.a;

public class k$e implements View$OnClickListener	// class@000b21
{
    public final k b;

    public void k$e(k p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$e.class, "1")) {
          return;
       }
       String str = "";
       String str1 = (!TextUtils.isEmpty(this.b.p.getText()))? this.b.p.getText().toString(): str;
       if (!TextUtils.isEmpty(str1)) {
          i3 oi3 = i3.f();
          oi3.d("authorRoomUrl", str1);
          str = oi3.e();
       }
       b9.a(this.b.u);
       str1.u = a.b().g(str, this.b.t).map(new e()).doOnSubscribe(new c(this)).doFinally(new b(this)).subscribe(new k$e$a(this), new a());
       return;
    }
}
