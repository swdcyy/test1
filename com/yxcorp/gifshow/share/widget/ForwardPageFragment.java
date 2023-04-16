package com.yxcorp.gifshow.share.widget.ForwardPageFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.share.widget.ForwardPageFragment$a;
import nsd.u;
import com.yxcorp.gifshow.share.widget.ForwardPageFragment$Companion$heightPerRow$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.share.widget.ForwardPageFragment$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.l1;
import android.widget.GridView;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Configuration;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import java.util.Objects;
import android.widget.ListAdapter;

public final class ForwardPageFragment extends Fragment	// class@001cea
{
    public GridView b;
    public final ForwardPageFragment$b c;
    public p d;
    public q e;
    public List f;
    public static final p g;
    public static final ForwardPageFragment$a h;

    static {
       ForwardPageFragment.h = new ForwardPageFragment$a(null);
       ForwardPageFragment.g = s.c(ForwardPageFragment$Companion$heightPerRow$2.INSTANCE);
    }
    public void ForwardPageFragment(){
       super();
       this.c = new ForwardPageFragment$b(this);
    }
    public final void Ug(){
       ForwardPageFragment tb;
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.applyVoid(null, this, ForwardPageFragment.class, "4")) {
          return;
       }
       if (l1.a()) {
          tb = this.b;
          if (tb != null) {
             tb.setNumColumns(6);
          }
          tb = this.b;
          if (tb != null) {
             layoutParams = tb.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.height = ForwardPageFragment.h.a() * 1;
             }
          }
       }else {
          tb = this.b;
          if (tb != null) {
             tb.setNumColumns(4);
          }
          tb = this.b;
          if (tb != null) {
             layoutParams = tb.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.height = ForwardPageFragment.h.a() * 2;
             }
          }
       }
    label_004b :
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardPageFragment.class, "3")) {
          return;
       }
       a.p(p0, "newConfig");
       super.onConfigurationChanged(p0);
       this.Ug();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ForwardPageFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d048f, p1, false);
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.GridView");
       this.b = view;
       view.setAdapter(this.c);
       this.Ug();
       return this.b;
    }
}
