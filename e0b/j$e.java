package e0b.j$e;
import java.lang.Runnable;
import e0b.j;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import java.util.Collection;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.util.List;
import xza.a;
import android.widget.TextView;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.lang.CharSequence;
import e0b.o;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import e0b.j$e$a;

public final class j$e implements Runnable	// class@0025d0
{
    public final j b;
    public final ArrayList c;

    public void j$e(j p0,ArrayList p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       j f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j$e.class, "1")) {
          return;
       }
       j$e tb = this.b;
       j h = tb.H;
       if (h != null) {
          f = tb.F;
          if (f != null) {
             f.removeView(h);
          }
       }
       tb = this.b;
       j$e tc = this.c;
       Objects.requireNonNull(tb);
       View view = PatchProxy.applyOneRefs(tc, tb, j.class, "13");
       if (view != PatchProxyResult.class) {
       }else {
          view = a.c(LayoutInflater.from(tb.u()), R.layout.arg_RES_7f0d10a8, tb.F, false);
          LinearLayout linearLayout = view.findViewById(R.id.device_layout);
          int i = 1;
          if (tc.isEmpty() ^ i) {
             a.o(linearLayout, "deviceLayout");
             linearLayout.setVisibility(false);
          }
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             View view1 = a.c(LayoutInflater.from(tb.u()), R.layout.arg_RES_7f0d08de, linearLayout, false);
             View view2 = view1.findViewById(R.id.device_name_tv);
             a.o(view2, "deviceView.findViewById<¡­iew>\(R.id.device_name_tv\)");
             view2.setText(uoa.a().getName());
             linearLayout.addView(view1);
             if (i < tc.size()) {
                linearLayout.addView(a.c(LayoutInflater.from(tb.u()), R.layout.arg_RES_7f0d0fee, linearLayout, false));
             }
             i = i + 1;
             view1.setOnClickListener(new o(tb, uoa));
          }
          a.o(view, "view");
       }
       tb.H = view;
       tb = this.b;
       h = tb.F;
       if (h != null) {
          h.addView(tb.H);
       }
       f = this.b.H;
       if (f != null) {
          objArray = f.findViewById(0x7f0a0b51);
       }
       if (objArray != null) {
          objArray.setOnClickListener(new j$e$a(this, objArray));
       }
       return;
    }
}
