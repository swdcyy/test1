package com.yxcorp.plugin.setting.entries.holder.y$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.y$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.entries.holder.y;
import k2b.e0;
import java.lang.Boolean;
import sgd.b;

public class y$a$a implements View$OnClickListener	// class@00089e
{
    public final y$a b;

    public void y$a$a(y$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$a$a.class, "1")) {
          return;
       }
       this.b.P8();
       b.e(this.b.r.a, "ONLINE_STATUS", null);
       return;
    }
}
