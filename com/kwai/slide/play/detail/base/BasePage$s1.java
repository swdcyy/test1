package com.kwai.slide.play.detail.base.BasePage$s1;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import uq7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.kwai.slide.play.detail.event.CleanType;
import sp7.b;
import android.view.ViewGroup;
import qp7.e;
import bs7.a;
import dq7.a;
import ys7.a;
import lq7.b;
import android.view.View;
import com.kwai.slide.play.detail.utils.c;
import bq7.c;
import kotlin.jvm.internal.a;
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup;
import xq7.a;
import hs7.c;
import qp7.g;
import hs7.e;
import java.util.Objects;
import mrd.a;
import lq7.d;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;

public final class BasePage$s1 implements Observer	// class@001787
{
    public final BasePage b;

    public void BasePage$s1(BasePage p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       b uob;
       ViewGroup viewGroup1;
       c uoc;
       PlcStrongGroup plcStrongGro;
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePage$s1.class, "1")) {
       }else {
          ArrayList uArrayList = new ArrayList();
          CleanType tYPE_ALL = CleanType.TYPE_ALL;
          boolean b = true;
          ViewGroup viewGroup = null;
          if (p0.a() == tYPE_ALL || p0.a() == CleanType.TYPE_PRESS_SPEED) {
             uArrayList.add(this.b.v().u());
             if (p0.a() == tYPE_ALL) {
                uArrayList.add(this.b.P().u());
             }
             if (!this.b.u0() || !p0.b()) {
                uArrayList.add(this.b.c0().u());
             }
             uArrayList.add(this.b.A().u());
             uArrayList.add(this.b.k0().u());
             uob = this.b.C();
             if (uob != null) {
                viewGroup1 = uob.u();
                if (viewGroup1 != null) {
                   c.a(viewGroup1);
                   c.d(viewGroup1, p0.b(), b);
                }
             }
             if (this.b.s0() && (!this.b.w0() || !p0.b())) {
                uoc = this.b.x();
                if (uoc != null) {
                   viewGroup = uoc.u();
                }
                a.m(viewGroup);
                uArrayList.add(viewGroup);
             }else if(this.b.v0()){
                plcStrongGro = this.b.Y();
                if (plcStrongGro != null) {
                   viewGroup = plcStrongGro.u();
                }
                a.m(viewGroup);
                uArrayList.add(viewGroup);
             }else if(!this.b.u0()){
                uArrayList.add(this.b.N().u());
             }
          }else if(p0.a() == CleanType.TYPE_NASA || p0.a() == CleanType.TYPE_NASA_PANEL){
             if (!this.b.w0() || !p0.b()) {
                uArrayList.add(this.b.v().u());
                uArrayList.add(this.b.P().u());
             }
             uArrayList.add(this.b.A().u());
             uArrayList.add(this.b.k0().u());
             uob = this.b.C();
             if (uob != null) {
                viewGroup1 = uob.u();
                if (viewGroup1 != null) {
                   c.a(viewGroup1);
                   c.d(viewGroup1, p0.b(), b);
                }
             }
             if (this.b.s0() && (!this.b.w0() || !p0.b())) {
                uoc = this.b.x();
                if (uoc != null) {
                   viewGroup = uoc.u();
                }
                a.m(viewGroup);
                uArrayList.add(viewGroup);
             }else if(this.b.v0()){
                plcStrongGro = this.b.Y();
                if (plcStrongGro != null) {
                   viewGroup = plcStrongGro.u();
                }
                a.m(viewGroup);
                uArrayList.add(viewGroup);
             }else if(!this.b.w0() || !p0.b()){
                uArrayList.add(this.b.N().u());
             }
             if (p0.a() == CleanType.TYPE_NASA_PANEL) {
                uArrayList.add(this.b.c0().u());
             }
          }
          e uoe = this.b.c0().s();
          a.o(p0, "it");
          Objects.requireNonNull(uoe);
          String str = "screenVisibility";
          if (!PatchProxy.applyVoidOneRefs(p0, uoe, e.class, "5")) {
             a.p(p0, str);
             uoe.d.onNext(p0);
          }
          uob = this.b.C();
          if (uob != null) {
             d uod = uob.s();
             if (uod != null && !PatchProxy.applyVoidOneRefs(p0, uod, d.class, "7")) {
                a.p(p0, str);
                uod.d.onNext(p0);
             }
          }
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             View view = iterator.next();
             c.a(view);
             c.d(view, p0.b(), p0.c);
          }
       }
       return;
    }
}
