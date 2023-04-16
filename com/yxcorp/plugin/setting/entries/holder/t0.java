package com.yxcorp.plugin.setting.entries.holder.t0;
import x07.b;
import com.yxcorp.plugin.setting.entries.holder.u0$a;
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
import com.yxcorp.plugin.setting.entries.holder.s0;
import com.yxcorp.plugin.setting.entries.holder.u0;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class t0 extends b	// class@000892
{
    public final u0$a c;

    public void t0(u0$a p0,int p1){
       this.c = p0;
       super(p1);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, t0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a(p0, p1, p2, p3);
       t0 tc = this.c;
       Objects.requireNonNull(tc);
       if (PatchProxy.isSupport(u0$a.class)) {
          Object[] objArray = new Object[]{obj,p0,p1,p2,p3};
          p0 = PatchProxy.apply(objArray, tc, u0$a.class, "2");
          if (p0 != PatchProxyResult.class) {
             obj = p0;
          label_0084 :
             return obj;
          }
       }
       SlipSwitchButton slipSwitchBu = obj.findViewById(R.id.switch_btn);
       obj.findViewById(R.id.switch_name_tv).setText(R.string.arg_RES_7f103af7);
       slipSwitchBu.setSwitch((QCurrentUser.ME.isCloseSameFollow() ^ 1));
       s0 os0 = new s0(tc);
       u0 a = tc.q.a;
       p3 = PatchProxy.applyOneRefs(a, os0, s0.class, "2");
       os0 = (p3 != PatchProxyResult.class)? p3: new j(a);
       slipSwitchBu.setOnSwitchChangeListener(os0);
       goto label_0084 ;
    }
}
