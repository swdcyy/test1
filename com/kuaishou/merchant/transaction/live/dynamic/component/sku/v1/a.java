package com.kuaishou.merchant.transaction.live.dynamic.component.sku.v1.a;
import mu4.d;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v1.b;
import java.lang.Object;
import java.lang.String;
import ej4.c;
import vd4.b;
import mu4.c;

public final class a implements d	// class@00079d
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(String p0){
       a ta = this.a;
       ta.c9("mt_purchase_panel_get_local_sale_status_async", null, new c(ta));
    }
    public void destroy(){
       c.a(this);
    }
}
