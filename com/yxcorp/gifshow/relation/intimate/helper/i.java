package com.yxcorp.gifshow.relation.intimate.helper.i;
import java.lang.Object;
import java.lang.String;
import erd.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import wkd.b;
import xac.s;
import brd.t;
import com.yxcorp.gifshow.relation.intimate.helper.h;
import erd.o;
import bbc.h;
import com.yxcorp.gifshow.relation.intimate.helper.e;
import crd.b;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import bbc.c;
import com.yxcorp.utility.TextUtils;
import bbc.j;
import com.yxcorp.gifshow.relation.intimate.helper.d;
import com.kwai.robust.PatchProxyResult;
import bbc.l;
import bbc.f;
import lnc.a1;
import wnc.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.relation.intimate.helper.f;
import bbc.k;
import bbc.g;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import bbc.o;
import java.lang.Runnable;
import ekd.k1;
import cbc.a;
import java.lang.System;
import v6d.a;
import cjd.e;
import bbc.v;
import bbc.w;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.ArrayList;
import a17.g;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import a17.c$a;
import android.app.Activity;
import java.util.List;
import bbc.p;
import a17.b$b;
import bbc.i;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import bbc.n;
import bbc.m;

public class i	// class@00190e
{

    public void i(){
       super();
    }
    public static void a(String p0,int p1,boolean p2,int p3,g p4,g p5){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, null, oi, "5")) {
             return;
          }
       }
       if (!i.f(p5)) {
          return;
       }else {
          b.a(-1334121008).p(p0, p2, p1, p3).map(h.b).subscribe(new h(p0, p1, p4), new e(p5));
          return;
       }
    }
    public static void b(IntimateRelationDialogParams p0,g p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, i.class, "3")) {
          return;
       }
       p0.setEnableProfileShow(true);
       i.c(p0.mTargetId, p0.mIntimateType, p0.mEnableProfileShow, "", new c(p0, p1), p2);
       return;
    }
    public static void c(String p0,int p1,boolean p2,String p3,g p4,g p5){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, oi, "4")) {
             return;
          }
       }
       if (!i.f(p5)) {
          return;
       }else {
          b.a(-1334121008).n(p0, p2, p1, TextUtils.I(p3)).map(h.b).subscribe(new j(p0, p4), new d(p5));
          return;
       }
    }
    public static b d(String p0,boolean p1,int p2,g p3,g p4){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),p3,p4};
          Object obj = PatchProxy.apply(objArray, null, oi, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-1334121008).f(p0, p1, p2).map(h.b).doOnNext(new l(p1, p0, p3)).doOnError(new f(p4)).subscribe();
    }
    public static String e(String p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oi, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{p0,p0,Integer.valueOf(p1)};
       return String.format(a1.p(0x7f101776), objArray);
    }
    public static boolean f(g p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.a()) {
          return true;
       }
       try{
          i = 0x7f1038e7;
          i.l(a1.p(i));
          if (p0 != null) {
             p0.accept(new Throwable(a1.p(i)));
          }
          return false;
       }catch(java.lang.Exception e0){
       }
    }
    public static void g(String p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oi, "8")) {
          return;
       }
       i.h(p0, p1, null, null);
       return;
    }
    public static void h(String p0,int p1,g p2,g p3){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, i.class, "9")) {
          return;
       }
       if (!i.f(p3)) {
          return;
       }
       b.a(-1334121008).q(p0, p1).map(f.b).doOnNext(new k(p0, p2)).doOnError(new g(p3)).subscribe();
       return;
    }
    public static void i(WeakReference p0,IntimateRelationDialogParams p1,g p2,g p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, i.class, "10")) {
          return;
       }
       if (!i.f(p3)) {
          return;
       }
       ProgressFragment progressFrag = new ProgressFragment();
       k1.s(new o(p0, progressFrag), "loading", 300);
       a.a("request dialog detail");
       if (!p1.mStartTime - null) {
          p1.setStartTime(System.currentTimeMillis());
       }
       b.a(-1334121008).v(p1.mOwnerId, p1.mTargetId, p1.mProposeId, a.g(), p1.mIntimateType, p1.mStyle, p1.mSource).map(new e()).doOnNext(new v(progressFrag, p1, p2)).doOnError(new w(progressFrag, p3)).subscribe();
       return;
    }
    public static void j(GifshowActivity p0,String p1,boolean p2,int p3){
       int i;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), null, i.class, "12")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       i = (p2)? 0x7f10427d: 0x7f1039c5;
       uArrayList.add(new g(a1.p(i), SheetItemStatus.Highlight));
       c$a uoa = new c$a(p0);
       uoa.j0(uArrayList);
       int i1 = (p2)? 0x7f10427e: 0x7f101770;
       uoa.l0(i1);
       uoa.h0(a1.p(R.string.cancel));
       uoa.i0(new p(p2, p0, p1, p3));
       uoa.J(new i(p2, p0));
       uoa.p();
       f.a(uoa).Y(PopupInterface.a);
       return;
    }
    public static void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "14")) {
          return;
       }
       k1.r(new n(p0), 250);
       return;
    }
    public static void l(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "13")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       k1.r(new m(p0), 250);
       return;
    }
}
