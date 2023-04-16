package com.yxcorp.plugin.setting.entries.holder.m$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.m;
import com.yxcorp.plugin.setting.entries.holder.m$a$a;
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

public class m$a extends PresenterV2	// class@000873
{
    public TextView p;
    public View$OnClickListener q;
    public final m r;

    public void m$a(m p0){
       this.r = p0;
       super();
       this.q = new m$a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m$a.class, "2")) {
          return;
       }
       this.p.setVisibility(0);
       j.d(this.p, QCurrentUser.ME.isShowIntimateRelation());
       this.m8().setOnClickListener(this.q);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
