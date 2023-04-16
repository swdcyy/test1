package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.a$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import q87.c;
import u07.t$a;
import android.app.Activity;
import u07.f;
import v4b.b;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import com.kwai.library.widget.popup.common.c;

public class a$a implements View$OnClickListener	// class@001bd4
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicFaceDelete", "magic delete button click", objArray);
       t$a uoa = f.e(new t$a(this.b.c));
       uoa.y0(R.string.arg_RES_7f10316d);
       uoa.S0(R.string.arg_RES_7f104270);
       uoa.Q0(R.string.cancel);
       uoa.u0(new b(this));
       uoa.v(true);
       uoa.b0().Z();
       return;
    }
}
