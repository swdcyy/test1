package com.yxcorp.plugin.setting.entries.holder.v;
import x07.b;
import com.yxcorp.plugin.setting.entries.holder.t$a;
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
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.setting.entries.holder.u;
import com.yxcorp.plugin.setting.entries.holder.t;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class v extends b	// class@00089b
{
    public final t$a c;

    public void v(t$a p0,int p1){
       this.c = p0;
       super(p1);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a(p0, p1, p2, p3);
       v tc = this.c;
       Objects.requireNonNull(tc);
       if (PatchProxy.isSupport(t$a.class)) {
          Object[] objArray = new Object[]{obj,p0,p1,p2,p3};
          p0 = PatchProxy.apply(objArray, tc, t$a.class, "2");
          if (p0 != PatchProxyResult.class) {
             obj = p0;
          label_0093 :
             return obj;
          }
       }
       View view = obj.findViewById(R.id.know_more_text);
       view.setVisibility(0);
       view.setOnClickListener(tc.p);
       SlipSwitchButton slipSwitchBu = obj.findViewById(R.id.switch_btn);
       obj.findViewById(R.id.switch_name_tv).setText(R.string.arg_RES_7f104a90);
       slipSwitchBu.setSwitch((QCurrentUser.ME.isAllowFindByMobilee() ^ 1));
       u ou = new u(tc);
       t a = tc.r.a;
       p3 = PatchProxy.applyOneRefs(a, ou, u.class, "2");
       ou = (p3 != PatchProxyResult.class)? p3: new j(a);
       slipSwitchBu.setOnSwitchChangeListener(ou);
       goto label_0093 ;
    }
}
