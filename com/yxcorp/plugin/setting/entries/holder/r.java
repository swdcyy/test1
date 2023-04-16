package com.yxcorp.plugin.setting.entries.holder.r;
import x07.b;
import com.yxcorp.plugin.setting.entries.holder.s$a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.TextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.setting.entries.holder.q;
import com.yxcorp.plugin.setting.entries.holder.s;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class r extends b	// class@000888
{
    public final s$a c;

    public void r(s$a p0,int p1){
       this.c = p0;
       super(p1);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a(p0, p1, p2, p3);
       r tc = this.c;
       Objects.requireNonNull(tc);
       if (PatchProxy.isSupport(s$a.class)) {
          Object[] objArray = new Object[]{obj,p0,p1,p2,p3};
          p0 = PatchProxy.apply(objArray, tc, s$a.class, "2");
          if (p0 != PatchProxyResult.class) {
             obj = p0;
          label_0083 :
             return obj;
          }
       }
       SlipSwitchButton slipSwitchBu = obj.findViewById(R.id.switch_btn);
       obj.findViewById(R.id.switch_name_tv).setText(R.string.arg_RES_7f103d21);
       slipSwitchBu.setSwitch(QCurrentUser.ME.isAllowMissU());
       q oq = new q(tc);
       s a = tc.q.a;
       p3 = PatchProxy.applyOneRefs(a, oq, q.class, "2");
       oq = (p3 != PatchProxyResult.class)? p3: new j(a);
       slipSwitchBu.setOnSwitchChangeListener(oq);
       goto label_0083 ;
    }
}
