package com.yxcorp.plugin.setting.entries.holder.i0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.i0;
import com.yxcorp.plugin.setting.entries.holder.i0$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;

public class i0$a extends PresenterV2	// class@000863
{
    public final View$OnClickListener p;
    public final i0 q;

    public void i0$a(i0 p0){
       this.q = p0;
       super();
       this.p = new i0$a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i0$a.class, "4")) {
          return;
       }
       this.q.e.setVisibility(0);
       i0$a tq = this.q;
       j.d(tq.e, tq.b());
       this.m8().setOnClickListener(this.p);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a.class, "1")) {
          return;
       }
       this.q.e = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
