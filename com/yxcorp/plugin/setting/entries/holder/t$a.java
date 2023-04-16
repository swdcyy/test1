package com.yxcorp.plugin.setting.entries.holder.t$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.t;
import com.yxcorp.plugin.setting.entries.holder.t$a$a;
import com.yxcorp.plugin.setting.entries.holder.t$a$b;
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

public class t$a extends PresenterV2	// class@000891
{
    public View$OnClickListener p;
    public View$OnClickListener q;
    public final t r;

    public void t$a(t p0){
       this.r = p0;
       super();
       this.p = new t$a$a(this);
       this.q = new t$a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t$a.class, "4")) {
          return;
       }
       this.r.e.setVisibility(0);
       j.d(this.r.e, (QCurrentUser.ME.isAllowFindByMobilee() ^ 0x01));
       this.m8().setOnClickListener(this.q);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a.class, "1")) {
          return;
       }
       this.r.e = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
