package com.kuaishou.merchant.transaction.purchase.presenter.a0$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.purchase.presenter.a0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$g;

public class a0$c extends m	// class@00095f
{
    public final a0 c;

    public void a0$c(a0 p0,boolean p1,long p2){
       this.c = p0;
       super(p1, p2);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$c.class, "1")) {
          return;
       }
       this.c.D.a();
       return;
    }
}
