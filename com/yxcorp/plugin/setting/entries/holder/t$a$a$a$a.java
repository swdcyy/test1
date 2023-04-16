package com.yxcorp.plugin.setting.entries.holder.t$a$a$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.t$a$a$a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class t$a$a$a$a implements View$OnClickListener	// class@00088d
{
    public final c b;
    public final t$a$a$a c;

    public void t$a$a$a$a(t$a$a$a p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a$a$a$a.class, "1")) {
          return;
       }
       this.b.o();
       return;
    }
}
