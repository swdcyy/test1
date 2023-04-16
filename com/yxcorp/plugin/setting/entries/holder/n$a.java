package com.yxcorp.plugin.setting.entries.holder.n$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.n;
import com.yxcorp.plugin.setting.entries.holder.n$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.setting.helper.j;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;

public class n$a extends PresenterV2	// class@000879
{
    public View$OnClickListener p;
    public final n q;

    public void n$a(n p0){
       this.q = p0;
       super();
       this.p = new n$a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n$a.class, "2")) {
          return;
       }
       this.q.e.setVisibility(0);
       j.d(this.q.e, (QCurrentUser.ME.isAllowKnockU() ^ 0x01));
       this.m8().setOnClickListener(this.p);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "1")) {
          return;
       }
       this.q.e = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
