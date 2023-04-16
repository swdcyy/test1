package com.yxcorp.plugin.setting.entries.holder.t$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.t$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.d;
import com.yxcorp.plugin.setting.entries.holder.t;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import u07.b;
import com.yxcorp.plugin.setting.entries.holder.t$a$a$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;

public class t$a$a implements View$OnClickListener	// class@00088f
{
    public final t$a b;

    public void t$a$a(t$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a$a.class, "1")) {
          return;
       }
       d uod = new d(this.b.r.a);
       uod.b1(KwaiDialogOption.d);
       uod.w0(true);
       uod = b.c(uod);
       uod.L(new t$a$a$a(this, R.layout.arg_RES_7f0d06ce));
       uod.X();
       return;
    }
}
