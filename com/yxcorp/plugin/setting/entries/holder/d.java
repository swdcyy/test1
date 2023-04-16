package com.yxcorp.plugin.setting.entries.holder.d;
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
import kgd.q;

public final class d implements g	// class@00084c
{
    public final g$a b;
    public final View c;
    public final j d;

    public void d(g$a p0,View p1,j p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       QCurrentUser.ME.setRecommendToOthers(p0.booleanValue());
       b.k(tb.r.a, "RECOMMENT_TO_PYMK", y.a(p0.booleanValue()));
       if (tc.getVisibility() == 8) {
          td.k(tc.findViewById(R.id.switch_btn), "not_recommend_to_contacts", (p0.booleanValue() ^ 1));
       }else if(!p0.booleanValue() && (!tc.getVisibility() && !QCurrentUser.ME.isNotRecommendToContacts())){
          p0 = tc.findViewById(R.id.switch_btn);
          td.l(p0, "not_recommend_to_contacts", 1, new q(p0));
       }
       return;
    }
}
