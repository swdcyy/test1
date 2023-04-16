package com.yxcorp.plugin.setting.entries.holder.k$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.k;
import com.yxcorp.plugin.setting.entries.holder.k$a$a;
import com.yxcorp.plugin.setting.entries.holder.k$a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;

public class k$a extends PresenterV2	// class@00086d
{
    public TextView p;
    public View$OnClickListener q;
    public View$OnClickListener r;
    public final k s;

    public void k$a(k p0){
       this.s = p0;
       super();
       this.q = new k$a$a(this);
       this.r = new k$a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "2")) {
          return;
       }
       this.p.setVisibility(0);
       j.d(this.p, j.g("personalise_reco"));
       this.m8().setOnClickListener(this.q);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
