package com.kuaishou.merchant.transaction.live.dynamic.component.message.b;
import com.kuaishou.merchant.transaction.live.dynamic.component.message.ListenKeyboardPopupWindow$a;
import com.kuaishou.merchant.transaction.live.dynamic.component.message.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.EditText;
import android.os.Handler;
import android.view.ViewGroup;

public class b implements ListenKeyboardPopupWindow$a	// class@00079b
{
    public final a a;

    public void b(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.r.setCursorVisible(true);
       this.a.x.sendEmptyMessageDelayed(0, 100);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.a.r.setCursorVisible(false);
       a u = this.a.u;
       if (u != null) {
          u.clearAnimation();
       }
       return;
    }
}
