package com.yxcorp.plugin.setting.entries.holder.s$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.s;
import com.yxcorp.plugin.setting.entries.holder.s$a$a;
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

public class s$a extends PresenterV2	// class@00088a
{
    public View$OnClickListener p;
    public final s q;

    public void s$a(s p0){
       this.q = p0;
       super();
       this.p = new s$a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s$a.class, "4")) {
          return;
       }
       this.q.e.setVisibility(0);
       j.d(this.q.e, QCurrentUser.ME.isAllowMissU());
       this.m8().setOnClickListener(this.p);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
          return;
       }
       this.q.e = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
