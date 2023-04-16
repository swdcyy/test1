package kgd.e;
import x07.b;
import kgd.d;
import android.app.Activity;
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
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Boolean;
import android.widget.TextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import kgd.f;
import android.content.Context;
import com.kwai.library.widget.button.SlipSwitchButton$b;

public final class e extends b	// class@00178a
{
    public final d c;
    public final Activity d;
    public final boolean e;

    public void e(d p0,Activity p1,boolean p2,int p3){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super(p3);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       e obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       View view = super.a(p0, p1, p2, p3);
       a.o(view, "super.onCreateView\(popup¡­later, container, bundle\)");
       e tc = this.c;
       e td = this.d;
       obj = this.e;
       Objects.requireNonNull(tc);
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(td, view, Boolean.valueOf(obj), p0, tc, d.class, "5")) {
          SlipSwitchButton slipSwitchBu = view.findViewById(R.id.switch_btn);
          a.o(slipSwitchBu, "switchButton");
          slipSwitchBu.setSwitch(obj);
          view.findViewById(R.id.switch_name_tv).setText(R.string.arg_RES_7f1046f4);
          slipSwitchBu.setOnSwitchChangeListener(new f(tc, td, p0));
       }
       return view;
    }
}
