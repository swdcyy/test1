package com.yxcorp.plugin.setting.entries.holder.h$b$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.h$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class h$b$a implements View$OnClickListener	// class@00085c
{
    public final c b;
    public final h$b c;

    public void h$b$a(h$b p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b$a.class, "1")) {
          return;
       }
       this.b.o();
       return;
    }
}
