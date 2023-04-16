package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$e;
import gk4.c$a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i;
import android.text.SpannableStringBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;

public class i$e implements c$a	// class@000829
{
    public final SpannableStringBuilder a;
    public final i b;

    public void i$e(i p0,SpannableStringBuilder p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i$e.class, "1")) {
          return;
       }
       i$e tb = this.b;
       tb.o9(this.a, tb.a9(), this.b.Z8());
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$e.class, "2")) {
          return;
       }
       i$e tb = this.b;
       tb.o9(this.a, tb.Z8(), this.b.a9());
       return;
    }
}
