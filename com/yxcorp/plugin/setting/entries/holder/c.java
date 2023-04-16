package com.yxcorp.plugin.setting.entries.holder.c;
import erd.g;
import com.yxcorp.plugin.setting.entries.holder.g$a;
import android.view.View;
import com.yxcorp.plugin.setting.helper.j;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.setting.entries.holder.g;
import pgd.y;
import k2b.e0;
import java.lang.String;
import sgd.b;
import com.kwai.library.widget.button.SlipSwitchButton;
import kgd.r;

public final class c implements g	// class@000849
{
    public final g$a b;
    public final View c;
    public final j d;

    public void c(g$a p0,View p1,j p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       Objects.requireNonNull(tb);
       QCurrentUser.ME.setNotRecommendToContacts(p0.booleanValue());
       b.k(tb.r.a, "RECOMMENT_TO_CONTACT_FRIEND", y.a((p0.booleanValue() ^ 1)));
       if (!p0.booleanValue()) {
          p0 = tc.findViewById(R.id.switch_btn);
          td.l(p0, "enable_recommended_know_people", 1, new r(p0));
       }
       return;
    }
}
