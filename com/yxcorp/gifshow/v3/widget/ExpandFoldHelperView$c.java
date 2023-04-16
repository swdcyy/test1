package com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$e;
import brd.a0;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$g;
import t45.d;
import brd.z;
import axc.g;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.v3.widget.c;
import crd.b;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$f;
import axc.h;
import com.yxcorp.gifshow.v3.widget.d;

public class ExpandFoldHelperView$c extends m	// class@001645
{
    public final ExpandFoldHelperView c;

    public void ExpandFoldHelperView$c(ExpandFoldHelperView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       ExpandFoldHelperView$c tc;
       ExpandFoldHelperView f;
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandFoldHelperView$c.class, "1")) {
          return;
       }
       ExpandFoldHelperView p = this.c.p;
       if (p != null && p.a(p0)) {
          return;
       }
       if (p0.getId() == 0x7f0a1716) {
          tc = this.c;
          if (tc.o != null) {
             return;
          }else {
             tc.o = true;
             p = tc.g;
             if (p != null) {
                p.b().G(d.a).n(new g(this)).R(Functions.d(), c.b);
             }else {
                f = tc.f;
                if (f != null) {
                   f.r();
                }
             }
          }
       }else if(p0.getId() == 0x7f0a3643){
          tc = this.c;
          if (tc.o != null) {
             return;
          }else {
             tc.o = true;
             p = tc.g;
             if (p != null) {
                p.a().G(d.a).n(new h(this)).R(Functions.d(), d.b);
             }else {
                f = tc.f;
                if (f != null) {
                   f.s();
                }
             }
          }
       }
       return;
    }
}
