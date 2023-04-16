package com.yxcorp.plugin.setting.entries.holder.h;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.g$a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.d;
import com.yxcorp.plugin.setting.entries.holder.g;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import u07.b;
import com.yxcorp.plugin.setting.entries.holder.h$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.plugin.setting.entries.holder.h$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;

public class h implements View$OnClickListener	// class@00085f
{
    public final c b;
    public final g$a c;

    public void h(g$a p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.b.q(3);
       d uod = new d(this.c.r.a);
       uod.b1(KwaiDialogOption.d);
       uod.w0(true);
       uod = b.c(uod);
       uod.L(new h$b(this, R.layout.arg_RES_7f0d06ce));
       uod.Y(new h$a(this));
       return;
    }
}
