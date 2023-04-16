package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.b$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import rk0.b;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;

public class b$b extends m	// class@000864
{
    public final b c;

    public void b$b(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       if (this.c.R8().getActivity() != null && !this.c.R8().getActivity().isFinishing()) {
          this.c.R8().getActivity().finish();
       }
       return;
    }
}
