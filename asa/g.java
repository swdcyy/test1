package asa.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import asa.g$b;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.g;
import tkd.b;
import tkd.d;
import fp5.a;
import lnc.b5;
import asa.g$a;
import z1.a;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil;
import java.lang.Integer;
import ekd.i;
import android.content.Context;
import com.yxcorp.utility.n;

public abstract class g extends PresenterV2	// class@0002ec
{
    public final int p;
    public View q;
    public boolean r;
    public final g s;

    public void g(){
       super();
       this.p = a1.d(0x7f070fdf);
       this.s = new g$b(this);
    }
    public static final View P8(g p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mRootView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.R8();
       GifshowActivity activity = this.getActivity();
       if (activity != null) {
          activity.k3(this.s);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity != null) {
          activity.t3(this.s);
       }
       return;
    }
    public final void R8(){
       int i;
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, og, "4")) {
          return;
       }
       if (d.a(0x31a55ac8).s0(this.getActivity())) {
          this.r = true;
          return;
       }else {
          String str = "mRootView";
          if (b5.a(this.getActivity())) {
             if (this.r != null) {
                this.r = false;
                return;
             }else {
                og = this.q;
                if (og == null) {
                   a.S(str);
                }
                MultiWindowLayoutUtil.a(og, new g$a(this));
             }
          }else {
             g tq = this.q;
             if (tq == null) {
                a.S(str);
             }
             MultiWindowLayoutUtil.d(tq);
             tq = this.p;
             g tq1 = this.q;
             if (tq1 == null) {
                a.S(str);
             }
             if (PatchProxy.isSupport(og) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(tq), tq1, this, og, "6") && tq1 != null)) {
                if (i.c()) {
                   i = tq + n.A(tq1.getContext());
                }
                this.V8(i, tq1);
             }
          }
          return;
       }
    }
    public final void S8(int p0,View p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, og, "5")) {
          return;
       }
       if (p1 != null) {
          this.V8(p0, p1);
       }
       return;
    }
    public abstract void V8(int p0,View p1);
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       this.q = p0;
       return;
    }
}
