package com.kuaishou.merchant.base.rmc.a$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.base.rmc.a;
import at3.b;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopComponentModel;
import vr3.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ys3.f;

public class a$a extends m	// class@00157f
{
    public final b c;
    public final LiveShopComponentModel d;
    public final a e;
    public final a f;

    public void a$a(a p0,b p1,LiveShopComponentModel p2,a p3){
       this.f = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a c = this.f.c;
       if (c != null) {
          c.a(this.c, this.d, this.e);
       }
       return;
    }
}
