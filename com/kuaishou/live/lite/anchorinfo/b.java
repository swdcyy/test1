package com.kuaishou.live.lite.anchorinfo.b;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import tj3.e;
import ec3.f;
import com.kuaishou.live.lite.util.viewupdater.a;
import com.kuaishou.live.lite.util.viewupdater.a$a;
import vd3.a;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$b;
import android.content.Context;
import ha1.b;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import android.view.ViewGroup;
import com.kuaishou.live.lite.util.viewupdater.f;
import o83.a;
import z1.a;
import o83.b;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Integer;
import java.lang.Iterable;
import qk.m;
import o83.d;
import ok.o;
import java.util.ArrayList;
import java.util.Collection;
import com.google.common.collect.Ordering;
import com.kuaishou.live.lite.anchorinfo.a;
import ok.h;
import java.util.Comparator;
import java.util.Collections;
import o83.c;
import com.google.common.collect.ImmutableList;
import tj3.k;
import java.lang.System;
import java.lang.Long;
import java.util.HashMap;

public class b extends ViewController	// class@001e45
{
    public f j;
    public f k;
    public final a l;
    public final e m;
    public boolean n;

    public void b(LiveLiteScatterLoadManager p0,e p1){
       super();
       this.n = false;
       this.l = (f.h())? new a(a.b(p0)): new a(a.a());
       this.m = p1;
       return;
    }
    public static void V2(b p0,View p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, b.class, "3")) {
       }else {
          LiveLiteAnchorInfoAreaService$b uob = p0.X2(p1);
          if (uob != null) {
             uob.onAttach();
          }
       }
       return;
    }
    public static void W2(b p0,View p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, b.class, "2")) {
       }else {
          LiveLiteAnchorInfoAreaService$b uob = p0.X2(p1);
          if (uob != null) {
             uob.onDetach();
          }
       }
       return;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       View view = b.e(this.D2(), R.layout.lite_anchor_info_area_container);
       view.setTag(d.a, LayoutViewType.AnchorInfoBar.name());
       this.R2(view);
       this.j = new f(this.A2(0x7f0a17c8));
       this.k = new f(this.A2(0x7f0a17cb));
       this.j.setAddViewCallback(new a(this));
       this.k.setAddViewCallback(new a(this));
       this.j.setRemoveViewCallback(new b(this));
       this.k.setRemoveViewCallback(new b(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       this.l.b();
       this.j.release();
       this.k.release();
       return;
    }
    public final LiveLiteAnchorInfoAreaService$b X2(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getTag(0x7f0a17c1);
    }
    public final void Y2(List p0,int p1,f p2){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "5")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       m.s(p0).p(new d(p1)).n(uArrayList);
       Collections.sort(uArrayList, Ordering.natural().onResultOf(a.b));
       m om = m.s(uArrayList);
       p2.a(om.F(new c(this)).B());
       if (!PatchProxy.applyVoid(null, this, uob, "6") && this.n == null) {
          this.n = true;
          k ok = this.m.x();
          long l = System.currentTimeMillis();
          Objects.requireNonNull(ok);
          k ok1 = k.class;
          if (!PatchProxy.isSupport(ok1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), ok, ok1, "10")) {
             ok.G0.put("page_will_appear_to_anchor_info_appear_duration", Long.valueOf((l - ok.b0)));
          }
       }
       return;
    }
}
