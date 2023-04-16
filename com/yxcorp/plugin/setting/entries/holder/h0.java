package com.yxcorp.plugin.setting.entries.holder.h0;
import x07.b;
import com.yxcorp.plugin.setting.entries.holder.i0$a;
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
import com.yxcorp.plugin.setting.entries.holder.i0;
import kgd.e1;
import com.kwai.library.widget.button.SlipSwitchButton$b;

public class h0 extends b	// class@00085e
{
    public final i0$a c;

    public void h0(i0$a p0,int p1){
       this.c = p0;
       super(p1);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, h0.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       h0 tc = this.c;
       Objects.requireNonNull(tc);
       p2 = PatchProxy.applyOneRefs(view, tc, i0$a.class, "2");
       if (p2 != patchProxyRe) {
          view = p2;
       }else {
          SlipSwitchButton slipSwitchBu = view.findViewById(R.id.switch_btn);
          view.findViewById(R.id.switch_name_tv).setText(R.string.arg_RES_7f1046c8);
          slipSwitchBu.setSwitch(tc.q.b());
          slipSwitchBu.setOnSwitchChangeListener(new e1(tc));
       }
       return view;
    }
}
