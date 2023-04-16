package com.yxcorp.plugin.setting.entries.holder.e;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.entries.holder.g$a;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.plugin.setting.entries.holder.g;
import java.util.Objects;
import com.yxcorp.plugin.setting.helper.j;
import android.widget.TextView;
import erd.g;
import pgd.y;
import k2b.e0;
import sgd.b;

public class e implements SlipSwitchButton$b	// class@000850
{
    public j a;
    public final g$a b;

    public void e(g$a p0){
       this.b = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       g e;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "1")) {
          return;
       }
       uoe = this.a;
       int i = p1 ^ 0x01;
       e = this.b.r.e;
       Objects.requireNonNull(uoe);
       if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(p0, "not_recommend_to_contacts", Boolean.valueOf(i), e, uoe, j.class, "6")) {
          uoe.n(p0, "not_recommend_to_contacts", i, e, null);
       }
       b.k(this.b.r.a, "RECOMMENT_TO_CONTACT_FRIEND", y.a(p0.getSwitch()));
       return;
    }
}
