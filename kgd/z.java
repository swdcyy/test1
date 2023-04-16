package kgd.z;
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
import com.yxcorp.plugin.setting.entries.holder.m;
import android.widget.TextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import ki5.b;
import java.lang.CharSequence;
import com.kwai.framework.model.user.QCurrentUser;
import kgd.a0;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.helper.j;

public class z extends b	// class@0017cd
{
    public final GifshowActivity c;
    public final g d;
    public final g e;

    public void z(int p0,GifshowActivity p1,g p2,g p3){
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super(p0);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       a0 obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       z tc = this.c;
       z td = this.d;
       z te = this.e;
       obj = PatchProxy.applyFourRefsWithListener(view, tc, td, te, null, m.class, "5");
       if (obj != PatchProxyResult.class) {
          view = obj;
       }else {
          SlipSwitchButton slipSwitchBu = view.findViewById(R.id.switch_btn);
          view.findViewById(R.id.switch_name_tv).setText(b.b().c(R.string.arg_RES_7f1046d2));
          slipSwitchBu.setSwitch(QCurrentUser.ME.isShowIntimateRelation());
          obj = new a0(td, te, tc);
          td = PatchProxy.applyOneRefs(tc, obj, a0.class, "2");
          obj = (td != PatchProxyResult.class)? td: new j(tc);
          slipSwitchBu.setOnSwitchChangeListener(obj);
          PatchProxy.onMethodExit(m.class, "5");
       }
       return view;
    }
}
