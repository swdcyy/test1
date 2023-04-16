package fv1.b;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import android.view.ViewGroup;
import z1.k;
import xp5.i;
import ks5.i;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hv1.b;
import hv1.c;
import fv1.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import gv1.f;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import fv1.b$a;
import erd.g;
import crd.b;

public final class b	// class@0023ba
{
    public final b a;
    public final c b;
    public RecyclerView c;
    public TempPlayPendantAdapter d;
    public List e;
    public final LifecycleOwner f;
    public final Activity g;
    public final ViewGroup h;
    public final k i;
    public final i j;
    public final i k;
    public final t l;

    public void b(LifecycleOwner p0,Activity p1,ViewGroup p2,k p3,i p4,i p5,t p6){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "pendantContainer");
       a.p(p3, "liveIdSupplier");
       a.p(p4, "liveLogPackageProvider");
       a.p(p5, "topPendantEnterAnimationService");
       a.p(p6, "userStatusObservable");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.k = p5;
       this.l = p6;
       b uob = new b(p3, p6);
       this.a = uob;
       c uoc = new c(uob);
       this.b = uoc;
       this.e = CollectionsKt__CollectionsKt.E();
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
       }else {
          RecyclerView recyclerView = new RecyclerView(p2.getContext());
          this.c = recyclerView;
          recyclerView.setItemAnimator(null);
          b tc = this.c;
          if (tc == null) {
             a.S("recyclerView");
          }
          tc.setLayoutManager(new LinearLayoutManager(p2.getContext(), 0, 0));
          this.d = new TempPlayPendantAdapter(p0, p1, p4, p5);
          b tc1 = this.c;
          if (tc1 == null) {
             a.S("recyclerView");
          }
          tc1.setClipToPadding(0);
          tc1 = this.c;
          if (tc1 == null) {
             a.S("recyclerView");
          }
          tc1.setClipChildren(0);
          tc1 = this.c;
          if (tc1 == null) {
             a.S("recyclerView");
          }
          b td = this.d;
          String str = "pendantAdapter";
          if (td == null) {
             a.S(str);
          }
          tc1.setAdapter(td);
          tc1 = this.c;
          if (tc1 == null) {
             a.S("recyclerView");
          }
          b td1 = this.d;
          if (td1 == null) {
             a.S(str);
          }
          tc1.addItemDecoration(new f(td1));
          tc1 = this.c;
          if (tc1 == null) {
             a.S("recyclerView");
          }
          p2.addView(tc1, new ViewGroup$LayoutParams(-2, -2));
       }
       t ot = PatchProxy.apply(null, uoc, c.class, "4");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = uoc.a.hide();
          a.o(ot, "displayItemsNotifier.hide\(\)");
       }
       ot.subscribe(new b$a(this));
       return;
    }
}
