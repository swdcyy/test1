package com.alipay.sdk.m.s.e$a;
import android.view.View$OnClickListener;
import com.alipay.sdk.m.s.e;
import java.lang.Object;
import android.view.View;
import com.alipay.sdk.m.s.e$a$a;
import java.lang.Runnable;
import android.os.Handler;
import com.alipay.sdk.m.s.e$g;

public class e$a implements View$OnClickListener	// class@000eac
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       e j = this.b.j;
       if (j != null) {
          p0.setEnabled(false);
          e.n.postDelayed(new e$a$a(this, p0), 256);
          e$a tb = this.b;
          if (p0 == tb.b) {
             j.b(tb);
          }else if(p0 == tb.d){
             j.h(tb);
          }
       }
       return;
    }
}
