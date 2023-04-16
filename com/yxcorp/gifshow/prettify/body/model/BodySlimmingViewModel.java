package com.yxcorp.gifshow.prettify.body.model.BodySlimmingViewModel;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingViewModel$a;
import nsd.u;
import java.util.LinkedHashSet;
import x0c.c;
import java.lang.String;
import x0c.a;
import msd.l;
import x0c.b;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingViewModel$none$1;
import msd.a;
import kotlin.Pair;
import java.lang.Integer;
import java.lang.Object;
import qrd.r0;
import java.util.HashMap;
import trd.t0;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingViewModel$global$1;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingPanelItem;
import trd.n;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar;
import xyb.a;
import q87.c;
import android.view.View;
import java.util.Set;

public final class BodySlimmingViewModel extends ViewModel	// class@001135
{
    public Set a;
    public int b;
    public final c c;
    public final c d;
    public final c e;
    public final c f;
    public final c g;
    public final c h;
    public final c i;
    public final c j;
    public final b k;
    public final HashMap l;
    public final b m;
    public final c[] n;
    public final BodySlimmingPanelItem[] o;
    public final MutableLiveData p;
    public final MutableLiveData q;
    public static final BodySlimmingViewModel$a r;

    static {
       BodySlimmingViewModel.r = new BodySlimmingViewModel$a(null);
    }
    public void BodySlimmingViewModel(){
       BodySlimmingViewModel uBodySlimmin = this;
       super();
       uBodySlimmin.a = new LinkedHashSet();
       c uoc = new c(0, 0, "", null, null, true, 16, null);
       uBodySlimmin.c = v1;
       a uoa = new a(2, 0, 0, 0, 0, false, 62, null);
       c uoc1 = new c(0x7f101c96, 0x7f081b30, "lengthen_leg", v15, null, false, 48, null);
       uBodySlimmin.d = uoc;
       uoa = new a(3, 0, 0, 0, 0, false, 62, null);
       c uoc2 = new c(0x7f104cae, 0x7f081b4f, "thin_waist", v13, null, false, 48, null);
       uBodySlimmin.e = v12;
       a uoa1 = new a(4, 0, 0, false, 0, false, 30, null);
       c uoc3 = new c(0x7f101ce1, 0x7f081b2e, "small_head", v4, null, false, 48, null);
       uBodySlimmin.f = uoc2;
       uoa1 = new a(5, 0, 0, 0, 0, false, 30, null);
       c uoc4 = new c(0x7f104b60, 0x7f081b44, "lengthen_neck", v27, null, false, 48, null);
       uBodySlimmin.g = v4;
       uoa1 = new a(6, 0, 0, 0, 0, false, 30, null);
       c uoc5 = new c(0x7f104cad, 0x7f081b4b, "slim_shoulder", v6, null, false, 48, null);
       uBodySlimmin.h = v5;
       uoa1 = new a(7, 0, 0, 0, 0, false, 62, null);
       c uoc6 = new c(0x7f1003a2, 0x7f081b15, "breast", v26, null, false, 48, null);
       uBodySlimmin.i = v6;
       uoa1 = new a(8, 0, 0, -100, 100, false, 38, null);
       uoc5 = new c(0x7f10039e, 0x7f0802ea, "hip", v8, null, false, 48, null);
       uBodySlimmin.j = v7;
       b uob = new b(0x7f1039a6, 0x7f081d28, "not_use", null, null, new BodySlimmingViewModel$none$1(uBodySlimmin), 24, null);
       uBodySlimmin.k = v8;
       Pair[] pairArray = new Pair[]{r0.a(Integer.valueOf(2), Integer.valueOf(66)),r0.a(Integer.valueOf(3), Integer.valueOf(45)),r0.a(Integer.valueOf(5), Integer.valueOf(40))};
       uBodySlimmin.l = t0.M(pairArray);
       b uob1 = new b(0x7f1040bc, 0x7f081b43, "global_slim", null, null, new BodySlimmingViewModel$global$1(uBodySlimmin), 24, null);
       uBodySlimmin.m = v9;
       c[] uocArray = new c[]{uoc,v12,uoc2,v4,v5,v6,v7};
       uBodySlimmin.n = uocArray;
       BodySlimmingPanelItem[] uBodySlimmin1 = new BodySlimmingPanelItem[]{v8,v9,v1};
       BodySlimmingPanelItem[] uBodySlimmin2 = n.V2(uBodySlimmin1, uocArray);
       uBodySlimmin.o = uBodySlimmin2;
       uBodySlimmin.p = new MutableLiveData(uBodySlimmin2[uBodySlimmin.b]);
       uBodySlimmin.q = new MutableLiveData(v8);
    }
    public static final ArrayList y0(){
       Object obj = PatchProxy.apply(null, null, BodySlimmingViewModel.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BodySlimmingViewModel.r.b();
    }
    public final c[] A0(){
       return this.n;
    }
    public final c C0(){
       return this.e;
    }
    public final boolean D0(){
       BodySlimmingViewModel obj = PatchProxy.apply(null, this, BodySlimmingViewModel.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.n;
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (obj[i].q()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final boolean E0(){
       BodySlimmingViewModel obj = PatchProxy.apply(null, this, BodySlimmingViewModel.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.g(this.p.getValue(), this.k)) {
          return false;
       }
       obj = this.o;
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (obj[i].k()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public final boolean F0(){
       BodySlimmingViewModel obj = PatchProxy.apply(null, this, BodySlimmingViewModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.p.getValue() == null || a.g(this.p.getValue(), this.k)) {
          return b;
       }
       if (a.g(this.p.getValue(), this.m)) {
          obj = this.n;
          int len = obj.length;
          int i = 0;
          while (true) {
             if (i >= len) {
                return b;
             }
             object oobject = obj[i];
             if (this.l.containsKey(Integer.valueOf(oobject.p())) && oobject.r()) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return true;
       }else {
          Object value = this.p.getValue();
          Objects.requireNonNull(value, "null cannot be cast to non-null type com.yxcorp.gifshow.prettify.body.model.BodySlimmingSingleItem");
          return value.r();
       }
    }
    public final void G0(BodySlimmingPanelItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BodySlimmingViewModel.class, "7")) {
          return;
       }
       a.p(p0, "targetItem");
       BodySlimmingPanelItem value = this.p.getValue();
       if (value != null) {
          value.setSelected(false);
       }
       if (p0 instanceof b) {
          this.q.setValue(p0);
       }
       this.p.setValue(p0);
       p0.h();
       return;
    }
    public final void H0(PrettifyDoubleSeekBar p0){
       int i1;
       Integer value1;
       if (PatchProxy.applyVoidOneRefs(p0, this, BodySlimmingViewModel.class, "16")) {
          return;
       }
       a.p(p0, "seekBar");
       BodySlimmingPanelItem value = this.p.getValue();
       if (value != null) {
          int i = 0;
          if (value instanceof b) {
             Object[] objArray = new Object[i];
             a.D().s("BodySlimming", "Ignore group for seek bar update", objArray);
             return;
          }else {
             BodySlimmingPanelItem uBodySlimmin = value;
             if (!a.g(this.q.getValue(), this.k)) {
                a uoa1 = uBodySlimmin.n();
                if (uoa1 != null) {
                   i1 = uoa1.a();
                label_004c :
                   a uoa = uBodySlimmin.n();
                   if (uoa != null) {
                      MutableLiveData mutableLiveD = uoa.c();
                      if (mutableLiveD != null) {
                         value1 = mutableLiveD.getValue();
                      label_0060 :
                         a.m(value1);
                         a.o(value1, "it.getBodySlimmingConfig\(\)?.intensity?.value!!");
                         int i2 = value1.intValue();
                         if (a.g(value, this.j)) {
                            p0.setupSeekBarMode(i);
                         }else {
                            p0.setupSeekBarMode(true);
                         }
                         p0.m(i2, String.valueOf(i2));
                         p0.setDefaultIndicatorProgress(i1);
                         if (!p0.getVisibility()) {
                            p0.a(true);
                         }else {
                            p0.setVisibility(i);
                         }
                      }
                   }
                   value1 = null;
                   goto label_0060 ;
                }
             }
             i1 = 0;
             goto label_004c ;
          }
       }
       return;
    }
    public final BodySlimmingPanelItem o0(int p0){
       BodySlimmingViewModel tk;
       switch (p0){
           case 0:
             tk = this.k;
             break;
           case 1:
             tk = this.m;
             break;
           case 2:
             tk = this.d;
             break;
           case 3:
             tk = this.e;
             break;
           case 4:
             tk = this.f;
             break;
           case 5:
             tk = this.g;
             break;
           case 6:
             tk = this.h;
             break;
           case 7:
             tk = this.i;
             break;
           case 8:
             tk = this.j;
             break;
           default:
             tk = null;
       }
       return tk;
    }
    public final c p0(){
       return this.i;
    }
    public final MutableLiveData q0(){
       return this.p;
    }
    public final BodySlimmingPanelItem[] r0(){
       return this.o;
    }
    public final b s0(){
       return this.m;
    }
    public final c t0(){
       return this.f;
    }
    public final c u0(){
       return this.j;
    }
    public final Set v0(){
       return this.a;
    }
    public final c w0(){
       return this.d;
    }
    public final c x0(){
       return this.g;
    }
    public final c z0(){
       return this.h;
    }
}
