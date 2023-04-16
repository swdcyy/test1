package com.yxcorp.plugin.setting.entries.holder.j0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.j0;
import com.yxcorp.plugin.setting.entries.holder.j0$a$a;
import com.yxcorp.plugin.setting.entries.holder.j0$a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;

public class j0$a extends PresenterV2	// class@000868
{
    public View$OnClickListener p;
    public View$OnClickListener q;
    public final j0 r;

    public void j0$a(j0 p0){
       this.r = p0;
       super();
       this.p = new j0$a$a(this);
       this.q = new j0$a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j0$a.class, "4")) {
          return;
       }
       this.r.e.setVisibility(0);
       j.d(this.r.e, j.g("programmatic_ad"));
       this.m8().setOnClickListener(this.q);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0$a.class, "1")) {
          return;
       }
       this.r.e = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
