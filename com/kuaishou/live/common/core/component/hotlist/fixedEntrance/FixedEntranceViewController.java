package com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$a;
import nsd.u;
import ks5.c;
import hf3.a;
import p91.m;
import vq5.d;
import n51.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$b;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$viewModel$2;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import dn1.g;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$c;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.hotspot.fixedEntrance.LiveMarqueeTextFlipper;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import i2b.a;
import androidx.lifecycle.LiveData;
import dn1.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import dn1.b;
import dn1.d;
import dn1.e;
import android.view.View$OnClickListener;
import dn1.f;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.livestream.message.nano.LiveHotspotSimpleInfo;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.StringBuilder;
import wn1.f;
import qrd.p;
import android.animation.ValueAnimator;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$e;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$f;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$g;
import android.widget.ViewFlipper;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$h;
import wn1.e;
import java.lang.Boolean;

public final class FixedEntranceViewController extends ViewController	// class@00135a
{
    public final c j;
    public final p k;
    public View l;
    public ImageView m;
    public LiveMarqueeTextFlipper n;
    public ImageView o;
    public TextView p;
    public View q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final FixedEntranceViewController$c u;
    public final c v;
    public final a w;
    public final m x;
    public final d y;
    public final a z;
    public static final FixedEntranceViewController$a A;

    static {
       FixedEntranceViewController.A = new FixedEntranceViewController$a(null);
    }
    public void FixedEntranceViewController(c p0,a p1,m p2,d p3,a p4){
       a.p(p0, "liveTopPendantAssociateService");
       a.p(p1, "liveLongConnection");
       a.p(p2, "liveBasicContext");
       a.p(p3, "liveRouterManager");
       super();
       this.v = p0;
       this.w = p1;
       this.x = p2;
       this.y = p3;
       this.z = p4;
       this.j = FixedEntranceViewController$b.b;
       this.k = new ViewModelLazy(m0.d(g.class), new FixedEntranceViewController$$special$$inlined$viewModels$2(new FixedEntranceViewController$$special$$inlined$viewModels$1(this)), new FixedEntranceViewController$viewModel$2(this));
       this.u = new FixedEntranceViewController$c(this);
    }
    public static final View V2(FixedEntranceViewController p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("animationContainer");
       }
       return p0;
    }
    public static final ImageView W2(FixedEntranceViewController p0){
       p0 = p0.o;
       if (p0 == null) {
          a.S("coreAnchorTitle");
       }
       return p0;
    }
    public static final View X2(FixedEntranceViewController p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("fixEntranceView");
       }
       return p0;
    }
    public static final TextView Y2(FixedEntranceViewController p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("normalTitle");
       }
       return p0;
    }
    public static final LiveMarqueeTextFlipper Z2(FixedEntranceViewController p0){
       p0 = p0.n;
       if (p0 == null) {
          a.S("scrollHotListContainer");
       }
       return p0;
    }
    public void F2(){
       FixedEntranceViewController uFixedEntran = FixedEntranceViewController.class;
       if (PatchProxy.applyVoid(null, this, uFixedEntran, "2")) {
          return;
       }
       View view = a.a(this.D2(), R.layout.arg_RES_7f0d0c25);
       a.o(view, "KwaiLayoutInflater.infla¡­_hot_spot_fixed_entrance\)");
       this.l = view;
       String str = "fixEntranceView";
       if (view == null) {
          a.S(str);
       }
       view = view.findViewById(R.id.entrance_icon);
       a.o(view, "fixEntranceView.findViewById\(R.id.entrance_icon\)");
       this.m = view;
       FixedEntranceViewController tl = this.l;
       if (tl == null) {
          a.S(str);
       }
       view = tl.findViewById(R.id.hot_list_flipper_container);
       a.o(view, "fixEntranceView.findView¡­t_list_flipper_container\)");
       this.n = view;
       if (view == null) {
          a.S("scrollHotListContainer");
       }
       view.setLivePlayMainThreadTasksService(this.z);
       tl = this.l;
       if (tl == null) {
          a.S(str);
       }
       view = tl.findViewById(R.id.hot_spot_core_anchor_title);
       a.o(view, "fixEntranceView.findView¡­t_spot_core_anchor_title\)");
       this.o = view;
       tl = this.l;
       if (tl == null) {
          a.S(str);
       }
       view = tl.findViewById(R.id.hot_spot_others_title);
       a.o(view, "fixEntranceView.findView¡­id.hot_spot_others_title\)");
       this.p = view;
       tl = this.l;
       if (tl == null) {
          a.S(str);
       }
       view = tl.findViewById(R.id.animtion_container);
       a.o(view, "fixEntranceView.findView¡­\(R.id.animtion_container\)");
       this.q = view;
       g og = this.b3();
       if (!PatchProxy.applyVoidOneRefs(og, this, uFixedEntran, "4")) {
          og.x0().observe(this, new a(this));
          LiveDataOperators.c(og.e, og.w0()).observe(this, new b(this));
          LiveDataOperators.f(og.w0(), og.u0()).observe(this, new d(this));
          uFixedEntran = this.o;
          if (uFixedEntran == null) {
             a.S("coreAnchorTitle");
          }
          uFixedEntran.setOnClickListener(new e(og));
          uFixedEntran = this.p;
          if (uFixedEntran == null) {
             a.S("normalTitle");
          }
          uFixedEntran.setOnClickListener(new f(og));
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FixedEntranceViewController.class, "3")) {
          return;
       }
       FixedEntranceViewController tn = this.n;
       if (tn == null) {
          a.S("scrollHotListContainer");
       }
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoid(objArray, tn, LiveMarqueeTextFlipper.class, "7")) {
          LiveMarqueeTextFlipper l = tn.l;
          if (l != null) {
             Iterator iterator = tn.m.iterator();
             while (iterator.hasNext()) {
                l.b(iterator.next());
             }
          }
       }
       return;
    }
    public final List a3(LiveHotspotSimpleInfo[] p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, FixedEntranceViewController.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          String str = "";
          LiveHotspotSimpleInfo liveHotspotS = 2;
          for (int i1 = 1; i1 <= liveHotspotS; i1 = i1 + 1) {
             str = str+oobject.rankTitle+"    ";
          }
          LiveHotspotSimpleInfo hotspotId = oobject.hotspotId;
          a.o(hotspotId, "info.hotspotId");
          str = str+oobject.rankTitle;
          a.o(str, "content.toString\(\)");
          obj.add(new f(hotspotId, str));
       }
       return obj;
    }
    public final g b3(){
       Object obj = PatchProxy.apply(null, this, FixedEntranceViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final void c3(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FixedEntranceViewController.class, "10")) {
          return;
       }
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       a.o(valueAnimato, "showAnim");
       valueAnimato.setDuration(300);
       valueAnimato.addUpdateListener(new FixedEntranceViewController$d(p0));
       valueAnimato.start();
       ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
       a.o(valueAnimato1, "hideAnim");
       valueAnimato1.setDuration(1000);
       valueAnimato1.addUpdateListener(new FixedEntranceViewController$e(p1));
       valueAnimato1.start();
       return;
    }
    public final void d3(int p0,int p1,int p2){
       if (PatchProxy.isSupport(FixedEntranceViewController.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, FixedEntranceViewController.class, "9")) {
          return;
       }
       int[] ointArray = new int[2];
       FixedEntranceViewController tq = this.q;
       if (tq == null) {
          a.S("animationContainer");
       }
       ointArray[0] = tq.getLayoutParams().width;
       ointArray[1] = p2;
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       a.o(valueAnimato, "widthAnim");
       valueAnimato.setDuration(300);
       valueAnimato.addUpdateListener(new FixedEntranceViewController$f(this));
       valueAnimato.start();
       int[] ointArray1 = new int[]{p0,p1};
       ValueAnimator valueAnimato1 = ValueAnimator.ofArgb(ointArray1);
       if (valueAnimato1 != null) {
          valueAnimato1.setDuration(300);
       }
       if (valueAnimato1 != null) {
          valueAnimato1.addUpdateListener(new FixedEntranceViewController$g(this));
       }
       if (valueAnimato1 != null) {
          valueAnimato1.start();
       }
       return;
    }
    public final void e3(LiveHotspotSimpleInfo[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FixedEntranceViewController.class, "6")) {
          return;
       }
       int i = 1;
       FixedEntranceViewController uFixedEntran = (!p0.length)? 1: null;
       if (uFixedEntran) {
          uFixedEntran = this.n;
          if (uFixedEntran == null) {
             a.S("scrollHotListContainer");
          }
          uFixedEntran.e(this.a3(p0));
          FixedEntranceViewController tn = this.n;
          if (tn == null) {
             a.S("scrollHotListContainer");
          }
          tn.setVisibility(8);
       }else {
          uFixedEntran = this.n;
          if (uFixedEntran == null) {
             a.S("scrollHotListContainer");
          }
          uFixedEntran.setMarqueeNum(i);
          uFixedEntran = this.n;
          if (uFixedEntran == null) {
             a.S("scrollHotListContainer");
          }
          uFixedEntran.setStartScrollTimeMills(500);
          uFixedEntran = this.n;
          if (uFixedEntran == null) {
             a.S("scrollHotListContainer");
          }
          uFixedEntran.setWaitScrollTimeMills(500);
          uFixedEntran = this.n;
          if (uFixedEntran == null) {
             a.S("scrollHotListContainer");
          }
          uFixedEntran.setMarqueeTextClickListener(new FixedEntranceViewController$h(this));
          uFixedEntran = this.n;
          if (uFixedEntran == null) {
             a.S("scrollHotListContainer");
          }
          uFixedEntran.e(this.a3(p0));
       }
       return;
    }
    public final void f3(boolean p0){
       FixedEntranceViewController tn;
       FixedEntranceViewController uFixedEntran = FixedEntranceViewController.class;
       if (PatchProxy.isSupport(uFixedEntran) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFixedEntran, "12")) {
          return;
       }
       if (p0) {
          tn = this.n;
          if (tn == null) {
             a.S("scrollHotListContainer");
          }
          tn.setVisibility(8);
          tn = this.p;
          if (tn == null) {
             a.S("normalTitle");
          }
          tn.setVisibility(8);
          tn = this.o;
          if (tn == null) {
             a.S("coreAnchorTitle");
          }
          tn.setVisibility(0);
       }else if(this.t == null){
          tn = this.n;
          if (tn == null) {
             a.S("scrollHotListContainer");
          }
          tn.setVisibility(0);
          tn = this.o;
          if (tn == null) {
             a.S("coreAnchorTitle");
          }
          tn.setVisibility(8);
       }else {
          tn = this.n;
          if (tn == null) {
             a.S("scrollHotListContainer");
          }
          tn.setVisibility(8);
          tn = this.p;
          if (tn == null) {
             a.S("normalTitle");
          }
          tn.setVisibility(0);
       }
       return;
    }
}
