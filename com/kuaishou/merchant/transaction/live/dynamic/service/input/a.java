package com.kuaishou.merchant.transaction.live.dynamic.service.input.a;
import vd4.b;
import com.kuaishou.merchant.transaction.base.dynamic.BaseDynamicFragment;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.dynamic.service.input.a$a;
import mu4.d;

public class a extends b	// class@0007d7
{
    public BaseDynamicFragment y;

    public void a(BaseDynamicFragment p0){
       super(p0);
       this.y = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.E8();
       this.X8("mtp_show_input_dialog", new a$a(this));
       return;
    }
}
