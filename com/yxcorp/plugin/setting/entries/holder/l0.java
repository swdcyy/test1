package com.yxcorp.plugin.setting.entries.holder.l0;
import x07.b;
import com.yxcorp.plugin.setting.entries.holder.j0$a;
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
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.plugin.setting.entries.holder.k0;
import com.yxcorp.plugin.setting.entries.holder.j0;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class l0 extends b	// class@000870
{
    public final j0$a c;

    public void l0(j0$a p0,int p1){
       this.c = p0;
       super(p1);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, l0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a(p0, p1, p2, p3);
       l0 tc = this.c;
       Objects.requireNonNull(tc);
       if (PatchProxy.isSupport(j0$a.class)) {
          Object[] objArray = new Object[]{obj,p0,p1,p2,p3};
          p0 = PatchProxy.apply(objArray, tc, j0$a.class, "2");
          if (p0 != PatchProxyResult.class) {
             obj = p0;
          label_0092 :
             return obj;
          }
       }
       View view = obj.findViewById(R.id.know_more_text);
       view.setVisibility(0);
       view.setOnClickListener(tc.p);
       SlipSwitchButton slipSwitchBu = obj.findViewById(R.id.switch_btn);
       obj.findViewById(R.id.switch_name_tv).setText(R.string.arg_RES_7f1000bc);
       slipSwitchBu.setSwitch(j.g("programmatic_ad"));
       k0 ok0 = new k0(tc);
       j0 a = tc.r.a;
       p3 = PatchProxy.applyOneRefs(a, ok0, k0.class, "2");
       ok0 = (p3 != PatchProxyResult.class)? p3: new j(a);
       slipSwitchBu.setOnSwitchChangeListener(ok0);
       goto label_0092 ;
    }
}
