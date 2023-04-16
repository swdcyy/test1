package com.kuaishou.live.lite.tempplay.c;
import com.kuaishou.live.viewcontroller.ViewController;
import xp5.i;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import java.util.HashMap;
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
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.lite.tempplay.d;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService$TempPlayBizId;
import android.content.Context;
import ha1.b;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import android.view.ViewGroup;
import com.kuaishou.live.lite.util.viewupdater.f;
import pd3.a;
import lnc.a1;
import android.view.TouchDelegate;
import pd3.c;
import z1.a;
import pd3.b;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Integer;
import java.lang.Iterable;
import qk.m;
import pd3.e;
import ok.o;
import java.util.ArrayList;
import java.util.Collection;
import com.google.common.collect.Ordering;
import com.kuaishou.live.lite.tempplay.b;
import ok.h;
import java.util.Comparator;
import java.util.Collections;
import com.kuaishou.live.lite.tempplay.a;
import com.google.common.collect.ImmutableList;
import pd3.f;
import java.lang.Runnable;

public class c extends ViewController	// class@000b8a
{
    public final i j;
    public f k;
    public f l;
    public final a m;
    public final Map n;

    public void c(i p0,LiveLiteScatterLoadManager p1){
       super();
       this.n = new HashMap();
       this.j = p0;
       this.m = (f.h())? new a(a.b(p1)): new a(a.a());
       return;
    }
    public static void V2(c p0,View p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, c.class, "2")) {
       }else {
          LiveLiteTempPlayService$a uoa = p0.X2(p1);
          if (uoa != null) {
             uoa.c();
          }
       }
       return;
    }
    public static void W2(c p0,View p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, c.class, "3")) {
       }else {
          LiveLiteTempPlayService$a uoa = p0.X2(p1);
          if (uoa != null) {
             uoa.g();
             ClientContent$LiveStreamPackage liveStreamPa = p0.j.a();
             if (!PatchProxy.applyVoidTwoRefs(uoa, liveStreamPa, null, d.class, "1") && uoa.e()) {
                d.d(liveStreamPa, uoa.getId().mLogBtnType, uoa.f(), uoa.d());
             }
          }
       }
       return;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       View view = b.e(this.D2(), R.layout.lite_tempplay_container);
       view.setTag(d.a, LayoutViewType.TempPlayArea.name());
       this.R2(view);
       ViewGroup viewGroup = this.A2(R.id.lite_temp_play_left_container);
       this.k = new f(viewGroup);
       viewGroup.setTouchDelegate(new a(viewGroup, a1.e(4.00f)));
       viewGroup = this.A2(R.id.lite_temp_play_right_container);
       this.l = new f(viewGroup);
       viewGroup.setTouchDelegate(new a(viewGroup, a1.e(4.00f)));
       this.k.setAddViewCallback(new c(this));
       this.l.setAddViewCallback(new c(this));
       this.k.setRemoveViewCallback(new b(this));
       this.l.setRemoveViewCallback(new b(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       b.Z(LiveLiteLogTag.TEMP_PLAY_AREA, "LiteTempPlayController.onDestroy");
       this.m.b();
       this.l.release();
       this.k.release();
       return;
    }
    public final LiveLiteTempPlayService$a X2(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getTag(0x7f0a1816);
    }
    public final void Y2(List p0,int p1,f p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "5")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       m.s(p0).p(new e(p1)).n(uArrayList);
       Collections.sort(uArrayList, Ordering.natural().onResultOf(b.b));
       m om = m.s(uArrayList);
       p2.a(om.F(new a(this)).B());
       return;
    }
    public void Z2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.m.a("reloadTempPlayItems", new f(this, p0));
       return;
    }
}
