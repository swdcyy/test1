package com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c$a;
import y8c.g;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import android.view.View;
import xm4.a;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c$b;
import ml8.c;

public class c$a extends g	// class@0007a4
{
    public int w;
    public final c x;

    public void c$a(c p0,int p1){
       this.x = p0;
       super();
       this.w = 0;
       this.w = p1;
    }
    public f h1(ViewGroup p0,int p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Objects.requireNonNull(this.x);
       return new f(a.e(p0, 0x7f0d10f4), new c$b(this.x, this.w));
    }
}
