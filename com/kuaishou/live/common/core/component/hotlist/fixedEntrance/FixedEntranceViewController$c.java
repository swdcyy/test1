package com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$c;
import ks5.b;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks5.a;
import java.lang.Integer;
import dn1.g;
import dn1.g$a$c;
import dn1.g$a;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ks5.e;
import ks5.d;
import en1.c;
import p91.m;
import lnc.i3;
import java.lang.Boolean;
import qrd.l1;

public final class FixedEntranceViewController$c implements b	// class@001351
{
    public final FixedEntranceViewController a;

    public void FixedEntranceViewController$c(FixedEntranceViewController p0){
       this.a = p0;
       super();
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, FixedEntranceViewController$c.class, "3")) {
          return;
       }
       a.d(this);
       this.a.r = false;
       return;
    }
    public void a(int p0){
       FixedEntranceViewController$c uoc = FixedEntranceViewController$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "4")) {
          return;
       }
       g og = this.a.b3();
       int i = 1;
       if (p0 != i) {
          i = false;
       }
       og.v0(new g$a$c(i));
       return;
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FixedEntranceViewController$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return FixedEntranceViewController.X2(this.a);
    }
    public boolean c(){
       return d.a(this);
    }
    public void d(ViewGroup p0){
       d.b(this, p0);
    }
    public void e(ViewGroup p0){
       d.c(this, p0);
    }
    public int getBizId(){
       return 24;
    }
    public boolean i(){
       return true;
    }
    public String k(){
       return a.a(this);
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, FixedEntranceViewController$c.class, "2")) {
          return;
       }
       a.e(this);
       c uoc = new c("LIVE_HOTSPOT_STATIC_ENTRANCE", this.a.x);
       i3 oi3 = i3.f();
       oi3.a("is_related_author", Boolean.valueOf(this.a.s));
       String str = oi3.e();
       a.o(str, "JsonStringBuilder.newIns¡­ngBuilder\)\n      .build\(\)");
       uoc.a(str);
       uoc.c();
       this.a.r = true;
       return;
    }
    public int[] p(){
       return a.b(this);
    }
}
