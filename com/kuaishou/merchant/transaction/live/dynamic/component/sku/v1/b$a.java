package com.kuaishou.merchant.transaction.live.dynamic.component.sku.v1.b$a;
import y8c.g;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v1.b;
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
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v1.b$b;
import ml8.c;

public class b$a extends g	// class@00079e
{
    public final b w;

    public void b$a(b p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Objects.requireNonNull(this.w);
       return new f(a.e(p0, 0x7f0d10f3), new b$b(this.w));
    }
}
