package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a$d;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import com.kuaishou.merchant.basic.widget.BreatheButtonView;

public final class a$d extends RecyclerView$r	// class@001c2c
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       a$d uod = a$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       a$d ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, a.class, "20")) {
          a c = ta.C;
          if (c == null) {
             a.S("mNormalButton");
          }
          if (!c.getVisibility()) {
             a c1 = ta.C;
             if (c1 == null) {
                a.S("mNormalButton");
             }
             c1.a();
          }
       }
       return;
    }
}
