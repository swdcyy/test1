package com.yxcorp.plugin.setting.entries.holder.g0;
import x07.b;
import com.yxcorp.plugin.setting.entries.holder.e0$a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.yxcorp.plugin.setting.entries.holder.e0;
import com.yxcorp.plugin.setting.entries.holder.g0$a;
import com.kwai.library.widget.button.SlipSwitchButton$a;

public class g0 extends b	// class@000859
{
    public final e0$a c;

    public void g0(e0$a p0,int p1){
       this.c = p0;
       super(p1);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, g0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       view.findViewById(R.id.switch_name_tv).setText(R.string.arg_RES_7f103f79);
       SlipSwitchButton slipSwitchBu = view.findViewById(R.id.switch_btn);
       slipSwitchBu.setSwitch(e0.b());
       slipSwitchBu.setOnSwitchChangeListener2(new g0$a(this));
       return view;
    }
}
