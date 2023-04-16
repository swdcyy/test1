package com.yxcorp.gifshow.homepage.kcube.presenter.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.kcube.presenter.j$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import brd.t;
import dta.b1;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import im8.f;
import java.util.List;

public class j extends PresenterV2	// class@001761
{
    public f p;
    public List q;
    public boolean r;
    public final SlidingPaneLayout$d s;

    public void j(){
       super();
       this.s = new j$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       q.p0(this.getActivity()).v0(this.s);
       this.X7(q.p0(this.getActivity()).r0().subscribe(new b1(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       q.p0(this.getActivity()).C0(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.x8("HOME_PANEL_SLIDE_OPEN");
       this.q = this.r8("HOME_PANEL_SLIDE_LISTENERS");
       return;
    }
}
