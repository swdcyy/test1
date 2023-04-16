package com.yxcorp.plugin.setting.utils.b$e;
import x07.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import erd.g;
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
import com.yxcorp.plugin.setting.utils.b;
import android.widget.TextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kwai.framework.model.user.QCurrentUser;
import ghd.p;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.helper.j;

public class b$e extends b	// class@000935
{
    public final GifshowActivity c;
    public final g d;
    public final g e;

    public void b$e(int p0,GifshowActivity p1,g p2,g p3){
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super(p0);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       b$e tc = this.c;
       b$e td = this.d;
       b$e te = this.e;
       obj = PatchProxy.applyFourRefsWithListener(view, tc, td, te, null, b.class, "12");
       if (obj != PatchProxyResult.class) {
          view = obj;
       }else {
          SlipSwitchButton slipSwitchBu = view.findViewById(R.id.switch_btn);
          view.findViewById(R.id.switch_name_tv).setText(R.string.arg_RES_7f1046f6);
          slipSwitchBu.setSwitch((QCurrentUser.ME.isAllowKnockU() ^ 0x01));
          obj = new p(td, te, tc);
          td = PatchProxy.applyOneRefs(tc, obj, p.class, "2");
          obj = (td != PatchProxyResult.class)? td: new j(tc);
          slipSwitchBu.setOnSwitchChangeListener(obj);
          PatchProxy.onMethodExit(b.class, "12");
       }
       return view;
    }
}
