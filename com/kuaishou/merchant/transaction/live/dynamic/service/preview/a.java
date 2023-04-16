package com.kuaishou.merchant.transaction.live.dynamic.service.preview.a;
import vd4.b;
import androidx.fragment.app.Fragment;
import java.util.HashSet;
import gd4.d;
import gd4.d$a;
import com.kuaishou.merchant.transaction.base.sku.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.dynamic.service.preview.a$a;
import mu4.d;

public class a extends b	// class@0007db
{
    public Set A;
    public Fragment y;
    public b z;

    public void a(Fragment p0){
       super(p0);
       this.A = new HashSet();
       this.y = p0;
       this.z = d.n.a(p0).v0();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.E8();
       this.X8("mtp_show_img_preview", new a$a(this));
       return;
    }
}
