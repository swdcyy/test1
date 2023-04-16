package com.yxcorp.gifshow.camera.record.tab.c;
import eh9.a;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup$a;
import lnc.a1;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;
import java.util.List;
import java.lang.String;
import com.kwai.gifshow.post.api.core.model.PosterActivityTabInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import eh9.l;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import r46.e;
import java.util.Map;
import java.util.Iterator;
import eh9.n;
import android.view.ViewGroup;
import i2b.a;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import bn8.a;
import sm6.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import gh9.b;
import mm6.c;
import android.graphics.drawable.Drawable;
import java.lang.Float;
import android.widget.FrameLayout;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import uzc.b;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.tab.a;
import android.view.View$OnClickListener;
import eh9.e;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import zf6.k;
import android.content.res.ColorStateList;
import j8c.a;
import q87.c;
import tkd.b;
import tkd.d;
import a36.a;
import android.util.Pair;
import a36.b;
import com.yxcorp.gifshow.camera.record.tab.MoodTabTagManager;
import gh9.i;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import eh9.u;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagManager;
import com.yxcorp.gifshow.camera.record.tab.d;
import fn6.a;
import g26.d;
import e17.i;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import java.util.HashSet;
import android.view.ViewStub;
import java.lang.System;
import java.io.PrintStream;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.net.Uri;
import ekd.x0;
import fg6.a;
import com.google.gson.Gson;
import lnc.i3;
import k36.c;
import k36.a;
import k36.f;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.camera.record.tab.c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import gh9.a;
import gh9.c;
import erd.g;
import crd.b;
import eoc.f;
import eh9.b;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagManager$a;
import androidx.lifecycle.DefaultLifecycleObserver;
import ekd.w0;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.text.TextPaint;
import android.graphics.drawable.GradientDrawable;
import androidx.appcompat.widget.AppCompatTextView;
import vs5.b;
import eh9.q;
import vs5.c;
import eh9.p;
import zca.a;
import eh9.o;
import crd.a;
import zca.v;
import eh9.r;
import h80.h;
import h80.k;
import lnc.n4;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.LocationArg;
import com.kuaishou.android.post.PostPageArg;
import lnc.a7;
import lnc.b9;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import eh9.c;
import com.yxcorp.gifshow.camera.record.tab.b;
import android.content.res.Configuration;
import eh9.d;
import a36.b$a;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagRepo;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import gh9.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.animation.Animator$AnimatorListener;
import android.view.ViewPropertyAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.camera.record.tab.c$d;
import com.yxcorp.gifshow.camera.record.tab.c$e;
import com.yxcorp.gifshow.camera.record.tab.c$b;
import android.view.ViewGroup$MarginLayoutParams;
import pi9.n;
import com.yxcorp.gifshow.camera.record.tab.c$c;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import a2.i0;
import eh9.f;

public class c implements a, CameraScrollTabViewGroup$a	// class@000f4d
{
    public b a;
    public CameraScrollTabViewGroup b;
    public View c;
    public CameraTabTagManager d;
    public MoodTabTagManager e;
    public d f;
    public View g;
    public FrameLayout h;
    public boolean i;
    public CameraActivity j;
    public u k;
    public ViewPropertyAnimator l;
    public ViewPropertyAnimator m;
    public b n;
    public boolean o;
    public int p;
    public int q;
    public b r;
    public c s;
    public ColorStateList t;
    public boolean u;
    public Drawable v;
    public static final int w;
    public static final int x;

    static {
       c.w = a1.e(14.00f);
       c.x = a1.e(148.00f);
    }
    public void c(){
       super();
       this.o = true;
       this.p = Integer.MIN_VALUE;
       this.r = null;
       this.u = false;
       this.v = null;
    }
    public static synchronized void I(View p0,CameraScrollTabViewGroup p1,List p2,boolean p3,String p4,PosterActivityTabInfo p5){
       _monitor_enter(c.class);
       if (PatchProxy.isSupport(c.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, null, c.class, "6")) {
             _monitor_exit(c.class);
             return;
          }
       }
       if (p1 == null || p1.u != null) {
          List list = l.e(p2);
          list = (q.f(list))? l.b(): l.a(list);
          if (list.contains(CameraTab.CAMERA_TAB_ACTIVITY) || list.contains(CameraTab.CAMERA_TAB_HTML_ACTIVITY)) {
             e.b.a().put("hasActivityTab", Boolean.TRUE);
          }
          _monitor_exit(c.class);
          return;
       }else {
          p1.u = true;
          l.m(p3);
          l.n(p4, p5);
          p2 = l.e(p2);
          p2 = (q.f(p2))? l.b(): l.a(p2);
          if (p2.contains(CameraTab.CAMERA_TAB_ACTIVITY) || p2.contains(CameraTab.CAMERA_TAB_HTML_ACTIVITY)) {
             e.b.a().put("hasActivityTab", Boolean.TRUE);
          }
          Iterator iterator = p2.iterator();
          while (iterator.hasNext()) {
             n on = iterator.next();
             View view = a.k(p1, on.getItemViewId(), 0);
             p1.addView(view);
             view.setId(on.getTabId());
             String tabText = on.getTabText();
             if (view instanceof TextView && !TextUtils.x(tabText)) {
                view.setText(tabText);
                view.setTag(tabText);
             }else if(!TextUtils.x(tabText)){
                TextView textView = view.findViewById(on.getTextViewId());
                if (textView != null) {
                   textView.setText(tabText);
                }
             }
          }
          if (p0 != null) {
             b.v(p0, a.b());
          }
          _monitor_exit(c.class);
          return;
       }
    }
    public int A(int p0){
       c obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "48");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.a;
       if (obj != null) {
          Objects.requireNonNull(obj);
       }
       return -1;
    }
    public void B(int p0){
    }
    public int C(){
       return this.q;
    }
    public boolean D(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "47");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uoc = this.a;
       if (uoc != null) {
          return uoc.h(p0);
       }else {
          return false;
       }
    }
    public void E(c p0,int p1){
       boolean b;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "15")) {
          return;
       }
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, uoc, "20");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
          label_0030 :
             n on = l.d(p1);
             b = (on != null && on.a())? true: false;
          }
       }else {
          goto label_0030 ;
       }
       this.u = b;
       this.O();
       this.N();
       this.b.setBackground(p0.i9());
       this.G(this.u);
       return;
    }
    public void F(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "28")) {
          return;
       }
       this.h.setAlpha(p0);
       return;
    }
    public final void G(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "21")) {
          return;
       }
       if (p0 || this.t != null) {
          this.b.o(0, 0, 0, 0);
       }else {
          this.b.o(5.00f, 0, 0, 0x1a000000);
       }
       return;
    }
    public final List H(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj == null || obj.getIntent() == null) {
          return objArray;
       }
       return l.h(j0.e(this.j.getIntent(), "fixedCameraTabItems"));
    }
    public final boolean J(int p0){
       Iterator obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "38");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.x().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return this.j(p0);
          }
          if (obj.next().getTabId() == p0) {
             break ;
          }
       }
       return true;
    }
    public final void K(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "49")) {
          return;
       }
       c tj = this.j;
       if (tj != null && p0 != tj.W) {
          return;
       }
       int i = 0x7f0a0482;
       int i1 = 0x7f0a04a5;
       boolean b = false;
       if (!p0.Ff() && !p0.S5()) {
          if (!this.n.b()) {
             return;
          }else {
             n.Y(this.n.a(i1), 4, b);
             n.Y(this.n.a(i), 4, b);
             return;
          }
       }else {
          View view = this.n.a(i1);
          View view1 = this.n.a(i);
          n.Y(view, b, b);
          n.Y(view1, b, b);
          i1 = b.q(this.j) + c.w;
          b.w(view1, i1);
          b.w(view, (c.x - i1));
          view1.setOnClickListener(a.b);
          if (p0.S5()) {
             view.setBackgroundResource(p0.S5());
          }
          if (p0.Ff()) {
             view1.setBackgroundColor(a1.a(p0.Ff()));
          }
          return;
       }
    }
    public final void L(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       if (this.h != null) {
          f.G(this.h, new e(this, p0, a.b()));
       }
       return;
    }
    public final boolean M(){
       Object obj = PatchProxy.apply(null, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.i == null && (this.h == null || this.j.R3())) {
          return false;
       }
       if (!j0.a(this.j.getIntent(), "panel_disabled", false)) {
          return true;
       }
       this.h.setVisibility(8);
       return false;
    }
    public final void N(){
       int i;
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "18")) {
          return;
       }
       c tv = this.v;
       if (tv != null) {
          this.g.setBackground(tv);
          return;
       }else {
          tv = this.g;
          c tu = this.u;
          if (PatchProxy.isSupport(uoc)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(tu), this, uoc, "23");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else if(!k.d() && tu != null){
                i = 0x7f08044d;
             }else {
                i = 0x7f08044e;
             }
          }else {
             goto label_0035 ;
          }
          tv.setBackgroundResource(i);
          return;
       }
    }
    public final void O(){
       int i;
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "19")) {
          return;
       }
       c tt = this.t;
       if (tt != null) {
          this.b.setSelectedTextColor(tt);
          return;
       }else {
          tt = this.b;
          c tu = this.u;
          if (PatchProxy.isSupport(uoc)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(tu), this, uoc, "22");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else if(!k.d() && tu != null){
                i = 0x7f06010f;
             }else {
                i = 0x7f060112;
             }
          }else {
             goto label_0035 ;
          }
          tt.setSelectedTextColor(i);
          return;
       }
    }
    public void Z(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "42")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("CameraScrollTab", "onRenderIdle", objArray1);
       c ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, b.class, "18")) {
             Object[] objArray3 = new Object[0];
             a.D().w(ta.a, "PreloadMood", objArray3);
             ta.k = d.a(-291827557).Ct(0);
          }
       }
       ta = this.e;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, MoodTabTagManager.class, "5")) {
             Object[] objArray2 = new Object[0];
             a.D().w("MoodTabTagManager", "onRenderIdle", objArray2);
             if (i.a(ta.b.getIntent()) || PostExperimentUtils.r()) {
                ta.c = d.a(-291827557).Ct(0);
             }
          }
       }
       return;
    }
    public void a(int p0){
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "29")) {
          return;
       }
       c ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, b.class, "7")) {
             a.p(p0, "view");
             Object[] objArray = new Object[0];
             a.D().w(ta.a, "onTabSelected:"+p0.getTag(), objArray);
             int id = p0.getId();
             ta.h = id;
             if (ta.i(id)) {
                ta.f();
             }
             b d = ta.d;
             if (d == null) {
                a.S("viewStub");
             }
             d.g(0);
          }
       }
       ta = this.k;
       if (ta != null) {
          ta.a(p0.getId());
       }
       ta = this.d;
       if (ta != null) {
          ta.c(p0.getId());
       }
       ta = this.e;
       if (ta != null) {
          ta.a(p0.getId());
       }
       return;
    }
    public void c(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "31")) {
          return;
       }
       this.k.c(p0);
       return;
    }
    public View d(){
       return this.h;
    }
    public void e(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "8")) {
          return;
       }
       if (!p0) {
          uoc = this.f;
          if (uoc != null) {
             Objects.requireNonNull(uoc);
             d uod = d.class;
             if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoc, uod, "3")) {
                uoc.a(p0);
             }
          }
       }
       return;
    }
    public void f(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "27")) {
          return;
       }
       if (!this.j.R3()) {
          this.h.setVisibility(p0);
       }
       return;
    }
    public int g(){
       Object obj1;
       int i1;
       int b2;
       String str;
       int i = this;
       c obj = PatchProxy.apply(null, i, c.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = i.j;
       if (obj == null) {
          return 1;
       }
       c q = i.q;
       boolean b = a.d(obj.getIntent());
       boolean b1 = a.c(i.j.getIntent());
       if (PatchProxy.isSupport(c.class)) {
          obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(q), Boolean.valueOf(b), Boolean.valueOf(b1), this, c.class, "45");
          if (obj1 != PatchProxyResult.class) {
             i1 = obj1.intValue();
          }else if(b){
             if (b1) {
                i1 = 8;
             }else {
                i1 = 6;
             }
          }else {
             obj = i.j;
             str = (obj.U0 != null && obj.o1 == null)? 1: null;
             if (!str) {
                CameraActivity z = obj.Z;
                if (z != 2) {
                   i1 = (z != 4)? j0.b(obj.getIntent(), "camera_constant_default_select_tab", q): 8;
                }else {
                   i1 = 6;
                }
             }else {
                i1 = j0.b(obj.getIntent(), "camera_constant_default_select_tab", q);
             }
             if (i1 == 1 && !j0.a(i.j.getIntent(), "snapshot_default_disabled", 0)) {
                i1 = l.g();
             }
          }
       }else {
          int i2 = 2;
          int i3 = 0;
          goto label_0062 ;
       }
       i.q = i1;
       if (i1 == 2) {
          if (PatchProxy.isSupport(c.class)) {
             obj1 = PatchProxy.applyOneRefs(Integer.valueOf(2), i, c.class, "41");
             if (obj1 != PatchProxyResult.class) {
                b2 = obj1.booleanValue();
             }else {
             label_00c9 :
                obj = i.f;
                b2 = (obj != null)? obj.b(): true;
             }
          }else {
             goto label_00c9 ;
          }
          if (!b2) {
             return i.u(l.f());
          }
       }
       b2 = 11;
       boolean b3 = 5;
       if (i1 == b3) {
          Intent obj2 = PatchProxy.apply(null, i, c.class, "44");
          if (obj2 != PatchProxyResult.class) {
             b3 = obj2.booleanValue();
          }else {
             obj2 = i.j.getIntent();
             str = (j0.b(obj2, "camera_page_source", 0) == b2 || b3 == j0.b(obj2, "camera_constant_default_select_tab", -1))? 1: null;
             b3 = str;
          }
          if (!b3) {
             return i.u(l.f());
          }
       }
       if (i1 >= l.b) {
          return i.u(l.f());
       }else if(i1 != 6 && (i1 == 8 || i1 == 3)){
          return 1;
       }else if(i1 == b2 && !d.b()){
          i.a(R.style.arg_RES_7f110668, 0x7f101bca);
          Object[] objArray = new Object[0];
          a.D().s("CameraScrollTab", "directGotoKuaiShan\(\) called with low devices", objArray);
          b2 = l.f();
          i.q = b2;
          return b2;
       }else {
          i.q = i.u(i.q);
          return i.u(i1);
       }
    }
    public void h(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "46")) {
          return;
       }
       uoc = this.a;
       if (uoc != null) {
          Objects.requireNonNull(uoc);
          b uob = b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoc, uob, "20")) {
             b d = uoc.d;
             if (d == null) {
                a.S("viewStub");
             }
             View view = d.b(R.id.camera_time_mode_group);
             a.o(view, "viewStub.getView\(R.id.camera_time_mode_group\)");
             Objects.requireNonNull(view);
             if (!PatchProxy.isSupport(CameraScrollTabViewGroupV2.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), view, CameraScrollTabViewGroupV2.class, "37")) {
                view.b(p0, 0);
             }
          }
       }
       return;
    }
    public void i(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "26")) {
          return;
       }
       uoc = this.b;
       Objects.requireNonNull(uoc);
       if (!PatchProxy.isSupport(CameraScrollTabViewGroup.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoc, CameraScrollTabViewGroup.class, "24")) {
          uoc.p = 0;
          uoc.a(p0);
          uoc.p = 150;
       }
       return;
    }
    public boolean j(int p0){
       List obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "39");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = l.e(this.H());
       if (!i.a(this.j.getIntent())) {
          Iterator iterator = l.j(obj).iterator();
          while (iterator.hasNext()) {
             if (iterator.next().getTabId() == p0) {
                return true;
             }
          }
       }
       return false;
    }
    public void k(n p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "10")) {
          return;
       }
       uoc = this.b;
       int tabId = p0.getTabId();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.isSupport(CameraScrollTabViewGroup.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tabId), Boolean.valueOf(p1), uoc, CameraScrollTabViewGroup.class, "5")) {
          if (uoc.v != null && tabId != uoc.m) {
             if (p1) {
                uoc.w.add(Integer.valueOf(tabId));
             }else {
                uoc.w.remove(Integer.valueOf(tabId));
             }
          }else {
             View view = uoc.findViewById(tabId);
             if (view != null) {
                int i = (p1)? 0: 8;
                view.setVisibility(i);
             }
          }
       }
       return;
    }
    public void l(CameraActivity p0){
       View view;
       c b;
       List list;
       boolean b1;
       String str1;
       String stringExtra;
       Object[] objArray;
       Object[] objArray1;
       Intent intent;
       boolean b2;
       CameraTab cAMERA_TAB_A;
       c b3;
       Object[] objArray2;
       int b4;
       boolean b5;
       SharedPreferences a;
       i3 obj2;
       Uri obj3;
       CameraActivity uCameraActiv = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(obj, uCameraActiv, c.class, str)) {
          return;
       }
       try{
          uCameraActiv.j = obj;
          uCameraActiv.b = obj.findViewById(0x7f0a063e);
          uCameraActiv.c = obj.findViewById(0x7f0a063c);
          uCameraActiv.n = new b(obj.findViewById(0x7f0a063b));
          System.err.println("B237239 i "+uCameraActiv.b);
          uCameraActiv.g = obj.findViewById(0x7f0a33dc);
          view = obj.findViewById(0x7f0a063d);
          uCameraActiv.h = view;
          b = uCameraActiv.b;
          list = this.H();
          b1 = i.a(p0.getIntent());
          str1 = "activity";
          stringExtra = p0.getIntent().getStringExtra(str1);
          objArray = null;
          PosterActivityTabInfo posterActivi = PatchProxy.apply(objArray, obj, CameraActivity.class, "91");
          if (posterActivi != patchProxyRe) {
          label_0089 :
             objArray1 = posterActivi;
          }else {
             intent = p0.getIntent();
             if (intent != null) {
                String str4 = "posterActivityTabInfo";
                Serializable serializable = SerializableHook.getSerializableExtra(intent, str4);
                if (serializable instanceof PosterActivityTabInfo) {
                   objArray1 = serializable;
                }else {
                   obj3 = intent.getData();
                   if (obj3 != null) {
                      String str5 = x0.a(obj3, str4);
                      if (str5 != null) {
                         posterActivi = a.a.h(str5, PosterActivityTabInfo.class);
                         goto label_0089 ;
                      }
                   }
                }
             }
             objArray1 = objArray;
          }
       }catch(com.google.gson.JsonSyntaxException e0){
       }
       c.I(view, b, list, b1, stringExtra, objArray1);
       String str2 = 1;
       if (!PatchProxy.applyVoid(objArray, uCameraActiv, c.class, "1")) {
          obj3 = e.b.a().get("hasActivityTab");
          obj2 = i3.f();
          b5 = (obj3 != null && obj3.booleanValue())? true: false;
          obj2.a("showActivityTab", Boolean.valueOf(b5));
          c.d().g(new a("postBottomTabsConfirmEvent", obj2.e(), str2));
       }
       if (uCameraActiv.h != null) {
          if (p0.o1() && uCameraActiv.h.getLayoutParams() != null) {
             uCameraActiv.h.getLayoutParams().height = b.e(p0);
          }
          uCameraActiv.h.getViewTreeObserver().addOnGlobalLayoutListener(new c$a(uCameraActiv));
       }
       if (!i.a(uCameraActiv.j.getIntent())) {
          b uob = new b();
          uCameraActiv.a = uob;
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidOneRefs(obj, uob, b.class, "5")) {
             a.p(obj, str1);
             uob.c = obj;
             Object[] objArray4 = (p0.getIntent() == null)? objArray: l.h(j0.e(p0.getIntent(), "fixedCameraTabItems"));
             List list1 = l.e(objArray4);
             if (list1 != null && list1.size() == str2) {
                obj2 = list1.get(false);
                a.o(obj2, "fixedCameraTabItem[0]");
                if (obj2.getTabId() == 16) {
                   list1.add(CameraTab.CAMERA_TAB_SNAPSHOT);
                   list1.add(CameraTab.CAMERA_TAB_PHOTO);
                }
             }
             list1 = l.j(list1);
             a.o(list1, "CameraTabHelper.getSnaps¡­tTabs\(fixedCameraTabItem\)");
             uob.b = list1;
             ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a0634, 0x7f0a0633);
             uob.d = viewStubInfl;
             viewStubInfl.d(obj.findViewById(R.id.root_layout));
             uob.l = f.a(a.class, new c(uob, obj));
          }
          uCameraActiv.a.j = new b(uCameraActiv);
       }
       intent = uCameraActiv.j.getIntent();
       MoodTabTagManager obj1 = PatchProxy.applyOneRefs(intent, objArray, c.class, "51");
       if (obj1 != patchProxyRe) {
          b2 = obj1.booleanValue();
       }else if(intent == null){
          b2 = false;
       }else {
          b2 = j0.a(intent, "disableCameraTabBottomLine", false);
       }
       if (b2) {
          n.Y(uCameraActiv.g, 4, false);
       }
       HashSet hashSet = new HashSet();
       PosterActivityTabInfo posterActivi1 = l.i();
       c uoc = (posterActivi1 != null && posterActivi1.mIsDisableCameraTabBottomTag != null)? 1: null;
       if (!uoc) {
          cAMERA_TAB_A = CameraTab.CAMERA_TAB_ACTIVITY;
          if (uCameraActiv.b.findViewById(cAMERA_TAB_A.getTextViewId()) != null) {
             hashSet.add(cAMERA_TAB_A);
          }
          cAMERA_TAB_A = CameraTab.CAMERA_TAB_HTML_ACTIVITY;
          if (uCameraActiv.b.findViewById(cAMERA_TAB_A.getTextViewId()) != null) {
             hashSet.add(cAMERA_TAB_A);
          }
       }
       CameraTab cAMERA_TAB_T = CameraTab.CAMERA_TAB_TOOLBOX;
       if (uCameraActiv.b.findViewById(cAMERA_TAB_T.getTextViewId()) != null) {
          hashSet.add(cAMERA_TAB_T);
       }
       if (!hashSet.isEmpty()) {
          CameraTabTagManager uCameraTabTa = new CameraTabTagManager();
          uCameraActiv.d = uCameraTabTa;
          b3 = uCameraActiv.b;
          Objects.requireNonNull(uCameraTabTa);
          c uoc1 = b3;
          c uoc2 = b3;
          if (!PatchProxy.applyVoidThreeRefs(p0, uoc1, hashSet, uCameraTabTa, CameraTabTagManager.class, "1")) {
             uCameraTabTa.b = obj;
             if (p0.getIntent() != null) {
                uCameraTabTa.c = j0.a(p0.getIntent(), "kuaishan_allow_to_jump", false);
                if (PatchProxy.applyVoidTwoRefs(uoc2, hashSet, uCameraTabTa, CameraTabTagManager.class, "14")) {
                   objArray2 = null;
                }else if(uCameraTabTa.c == null && hashSet.contains(cAMERA_TAB_T)){
                   uCameraTabTa.a.put(Integer.valueOf(cAMERA_TAB_T.getTextViewId()), new CameraTabTagManager$a(cAMERA_TAB_T, uoc2.findViewById(cAMERA_TAB_T.getTextViewId()), uoc2.findViewById(cAMERA_TAB_T.getTagStubId()), 1));
                   objArray2 = null;
                   cAMERA_TAB_T.setRightTopText(objArray2);
                }else {
                   objArray2 = null;
                }
                cAMERA_TAB_A = CameraTab.CAMERA_TAB_ACTIVITY;
                b4 = 3;
                if (hashSet.contains(cAMERA_TAB_A)) {
                   cAMERA_TAB_A.setRightTopText(objArray2);
                   uCameraTabTa.a.put(Integer.valueOf(cAMERA_TAB_A.getTextViewId()), new CameraTabTagManager$a(cAMERA_TAB_A, uoc2.findViewById(cAMERA_TAB_A.getTextViewId()), uoc2.findViewById(cAMERA_TAB_A.getTagStubId()), b4));
                }
                cAMERA_TAB_A = CameraTab.CAMERA_TAB_HTML_ACTIVITY;
                if (hashSet.contains(cAMERA_TAB_A)) {
                   cAMERA_TAB_A.setRightTopText(objArray2);
                   uCameraTabTa.a.put(Integer.valueOf(cAMERA_TAB_A.getTextViewId()), new CameraTabTagManager$a(cAMERA_TAB_A, uoc2.findViewById(cAMERA_TAB_A.getTextViewId()), uoc2.findViewById(cAMERA_TAB_A.getTagStubId()), b4));
                }
                uCameraTabTa.b.G3(uCameraTabTa.d);
             }
          }
          objArray2 = null;
       }else {
          objArray2 = objArray;
       }
       if (uCameraActiv.b.findViewById(CameraTab.CAMERA_TAB_MOOD.getTextViewId()) != null) {
          MoodTabTagManager moodTabTagMa = new MoodTabTagManager(uCameraActiv.b);
          uCameraActiv.e = moodTabTagMa;
          Objects.requireNonNull(moodTabTagMa);
          obj1 = MoodTabTagManager.class;
          if (!PatchProxy.applyVoidOneRefs(obj, moodTabTagMa, obj1, "1")) {
             moodTabTagMa.b = obj;
             Intent intent2 = p0.getIntent();
             if (intent2 != null) {
                Uri data = intent2.getData();
                if (data != null && data.isHierarchical()) {
                   b4 = Boolean.parseBoolean(w0.a(data, "showMood"));
                label_0366 :
                   if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b4), moodTabTagMa, obj1, str)) {
                      a = a.a;
                      String str3 = "mood_tab_tag_count";
                      int intx = a.getInt(str3, false);
                      if (b4 || intx < 2) {
                         Object[] objArray3 = new Object[false];
                         a.D().s("MoodTabTagManager", "showMoodTabTag", objArray3);
                         moodTabTagMa.b.G3(moodTabTagMa.d);
                         SharedPreferences$Editor uEditor = a.edit();
                         uEditor.putInt(str3, (intx + 1));
                         g.a(uEditor);
                         moodTabTagMa.a.setText(R.string.arg_RES_7f1036b0);
                         moodTabTagMa.a.getPaint().setFakeBoldText(1);
                         GradientDrawable gradientDraw = new GradientDrawable();
                         gradientDraw.setColor(a1.a(R.color.arg_RES_7f0618c9));
                         moodTabTagMa.a.setBackgroundDrawable(gradientDraw);
                         n.Y(moodTabTagMa.a, false, false);
                      }
                   }
                }
             }
             b4 = false;
             goto label_0366 ;
          }
       }
       if (uCameraActiv.b.findViewById(CameraTab.CAMERA_TAB_LIVE.getTextViewId()) != null) {
          d uod = new d(uCameraActiv);
          uCameraActiv.f = uod;
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidOneRefs(obj, uod, d.class, "1")) {
             uod.a = obj;
             uod.f = f.a(b.class, new q(uod));
             uod.g = f.a(c.class, new p(uod));
             uod.e.c(f.a(a.class, new o(uod)));
             uod.e.c(f.a(v.class, new r(uod)));
             uod.b = j0.a(p0.getIntent(), "live_on", true);
             uod.d = obj.findViewById(0x7f0a063e);
          label_0446 :
             h oh = k.c();
             b4 = (oh != null && oh.i())? true: false;
             uCameraActiv.o = b4;
             this.L(p0);
             if (!PatchProxy.applyVoid(objArray2, uCameraActiv, c.class, "3")) {
                Intent intent1 = uCameraActiv.j.getIntent();
                b5 = n4.c(intent1);
                boolean b6 = j0.g(intent1, "music");
                b4 = j0.g(intent1, "tag");
                objArray = (i.g().getPublishLocation().get() != null)? 1: 0;
                boolean b7 = (!j0.a(intent1, "forceSelectVideoTab", false) && (!b5 && (!b6 && (b4 || objArray))))? true: false;
                uCameraActiv.q = a7.a(b7);
             }
             return;
          }
       }
       b3 = 1;
       goto label_0446 ;
    }
    public void m(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       if (this.n == null) {
          return;
       }
       if (this.s != p0) {
          b9.a(this.r);
          this.s = p0;
       }
       if (!p0.re() && p0.isAdded()) {
          this.K(p0);
          return;
       }else {
          RxFragment rxFragment = p0;
          t ot = rxFragment.m();
          t ot1 = ot.compose(c.c(rxFragment.m(), FragmentEvent.DETACH));
          this.r = ot1.subscribe(new c(this, p0), b.b);
          return;
       }
    }
    public int n(){
       Object obj = PatchProxy.apply(null, this, c.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getCheckedId();
    }
    public void o(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "24")) {
          return;
       }
       this.k = p0;
       c tb = this.b;
       if (tb != null) {
          tb.setOnTabSelected(this);
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "32")) {
          return;
       }
       c tj = this.j;
       if (tj != null) {
          f.F(n.f(tj), new d(this));
       }
       return;
    }
    public void onDestroy(){
       CameraTabTagManager b;
       MoodTabTagManager c;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "7")) {
          return;
       }
       c ta = this.a;
       String str = "onDestroy";
       String str1 = null;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, b.class, "19")) {
             Object[] objArray2 = new Object[str1];
             a.D().w(ta.a, str, objArray2);
             b l = ta.l;
             if (l != null) {
                l.dispose();
             }
             b k = ta.k;
             if (k != null) {
                Pair second = k.second;
                if (second != null) {
                   second.dispose();
                }
             }
          }
       }
       ta = this.f;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, d.class, "2")) {
             b9.a(ta.e);
             b9.a(ta.f);
             b9.a(ta.g);
          }
       }
       ta = this.e;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, MoodTabTagManager.class, "6")) {
             Object[] objArray1 = new Object[str1];
             a.D().w("MoodTabTagManager", str, objArray1);
             c = ta.c;
             if (c != null) {
                c.second.dispose();
             }
          }
       }
       ta = this.d;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, CameraTabTagManager.class, "2")) {
             if (!PatchProxy.applyVoid(objArray, objArray, CameraTabTagRepo.class, "4")) {
                b b1 = CameraTabTagRepo.b;
                if (b1 != null) {
                   b1.dispose();
                }
                CameraTabTagRepo.b = objArray;
             }
             b = ta.b;
             if (b != null) {
                b.V3(ta.d);
             }
          }
       }
       return;
    }
    public void onStart(){
       this.i = false;
    }
    public void onStop(){
       this.i = true;
    }
    public void p(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "25")) {
          return;
       }
       this.b.a(p0);
       return;
    }
    public void q(){
       boolean b;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "34")) {
          return;
       }
       c tf = this.f;
       if (tf != null) {
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoid(objArray, tf, d.class, "11")) {
             tf.e();
             tf.c();
          }
       }
       CameraTab cAMERA_TAB_K = CameraTab.CAMERA_TAB_KTV;
       Intent obj = PatchProxy.apply(objArray, this, uoc, "43");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.j.getIntent();
          b = (!j0.a(obj, "invisible_karoke", false) && (QCurrentUser.ME.isLogined() && !j0.a(obj, "key_hidden_ktc_entrance", false)))? true: false;
       }
       this.k(cAMERA_TAB_K, b);
       return;
    }
    public void r(int p0,CameraFragment p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("CameraScrollTab", "updataRecordMode...recordMode:"+p0+"  isSnapshot:"+p1.ih().d(d.c).a, objArray);
       return;
    }
    public void s(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "40")) {
          return;
       }
       uoc = this.a;
       if (uoc != null) {
          Objects.requireNonNull(uoc);
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), uoc, b.class, "8")) {
             b g = uoc.g;
             if (g != null) {
                g.c(p0);
             }
          }
       }
       return;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, c.class, "17")) {
          return;
       }
       this.t = null;
       this.v = null;
       this.O();
       this.N();
       this.G(this.u);
       return;
    }
    public int u(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "36");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!this.J(p0)) {
          if (p0 == 16) {
             return this.u(17);
          }else {
             p0 = l.f();
             if (!this.J(p0)) {
                p0 = this.x().get(0).getTabId();
             }
          }
       }
       return p0;
    }
    public void v(boolean p0,boolean p1){
       c tl;
       ViewPropertyAnimator viewProperty;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       String str = "CameraScrollTab";
       a.D().w(str, "showPanelRadioGroup translate:"+p0+" , isShowAnim:"+p1, objArray);
       if (this.o != null) {
          return;
       }
       if (!this.j.b3() || this.j.isFinishing()) {
          Object[] objArray1 = new Object[0];
          a.D().A(str, "CameraActivity is not resuming", objArray1);
          return;
       }else if(!this.M()){
          return;
       }else {
          uoc = this.a;
          if (uoc != null) {
             uoc.j(true, p1);
          }
          if (!p0) {
             if (!p1) {
                this.h.setVisibility(0);
             }else {
                tl = this.l;
                if (tl != null) {
                   tl.setListener(null).cancel();
                }
                viewProperty = this.h.animate().alpha(0x3f800000).setDuration(300);
                this.m = viewProperty;
                viewProperty.setInterpolator(new e());
                this.m.setListener(new c$d(this)).start();
             }
             return;
          }else if(!this.h.getVisibility() && (this.h.getAlpha() - 0x3f800000 || this.h.getTranslationY())){
             tl = this.l;
             if (tl != null) {
                tl.setListener(null).cancel();
             }
             this.h.setVisibility(0);
             viewProperty = this.h.animate().alpha(0x3f800000).translationY(0);
             this.m = viewProperty;
             if (p1) {
                viewProperty.setDuration(300);
             }
             this.m.setInterpolator(new e());
             this.m.setListener(new c$e(this)).start();
          }
          return;
       }
    }
    public void w(boolean p0,boolean p1){
       c tm;
       ViewPropertyAnimator viewProperty;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "11")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "CameraScrollTab";
       a.D().w(str, "hidePanelRadioGroup translate:"+p0+" , isShowAnim:"+p1, objArray);
       if (this.o != null) {
          return;
       }
       if (this.i != null) {
          Object[] objArray1 = new Object[i];
          a.D().A(str, "CameraActivity is not resuming", objArray1);
          return;
       }else {
          uoc = this.a;
          if (uoc != null) {
             uoc.j(i, p1);
          }
          Animator$AnimatorListener uAnimatorLis = null;
          float f = 0;
          if (!p0) {
             if (!p1) {
                this.h.setVisibility(4);
             }else {
                tm = this.m;
                if (tm != null) {
                   tm.setListener(uAnimatorLis).cancel();
                }
                viewProperty = this.h.animate().alpha(f).setDuration(300);
                this.l = viewProperty;
                viewProperty.setInterpolator(new e());
                this.l.setListener(new c$b(this)).start();
             }
             return;
          }else if(this.h.getVisibility() != 4){
             tm = this.m;
             if (tm != null) {
                tm.setListener(uAnimatorLis).cancel();
             }
             viewProperty = this.h.animate().alpha(f).translationY((float)(n.a + this.h.getLayoutParams().bottomMargin));
             this.l = viewProperty;
             if (p1) {
                viewProperty.setDuration(300);
             }
             this.l.setInterpolator(new e());
             this.l.setListener(new c$c(this)).start();
          }
          return;
       }
    }
    public List x(){
       List obj = PatchProxy.apply(null, this, c.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = l.e(this.H());
       obj = (q.f(obj))? l.b(): l.a(obj);
       return obj;
    }
    public void y(int p0,int p1){
       int[] ointArray1;
       float f;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "16")) {
          return;
       }
       int[][] ointArray = new int[][2]{ointArray1,ointArray1};
       ointArray1 = new int[]{0x10100a1};
       ointArray1 = new int[0];
       ointArray1 = new int[]{p0,p1};
       this.t = new ColorStateList(ointArray, ointArray1);
       float[] uofloatArray = new float[]{f,f,f,f,f,f,f,f};
       f = (float)a1.d(0x7f070426);
       ShapeDrawable shapeDrawabl = new ShapeDrawable(new RoundRectShape(uofloatArray, null, null));
       shapeDrawabl.getPaint().setColor(p0);
       shapeDrawabl.getPaint().setStyle(Paint$Style.FILL);
       this.v = shapeDrawabl;
       this.O();
       this.N();
       this.G(this.u);
       return;
    }
    public void z(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "12")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CameraScrollTab", "showOrHideRadioGroupOfSameAnimationWithActionBar show:"+p0, objArray);
       if (this.o != null) {
          return;
       }
       if (this.i != null) {
          Object[] objArray1 = new Object[i];
          a.D().A("CameraScrollTab", "CameraActivity is not resuming", objArray1);
          return;
       }else if(p0 && !this.M()){
          return;
       }else if(!i0.Y(this.h)){
          f.G(this.h, new f(this, p0));
       }else {
          n.a(this.h, p0, this.p, null);
       }
       return;
    }
}
