package com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl;
import vx4.o;
import java.lang.Object;
import java.util.HashMap;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import com.yxcorp.plugin.search.widget.UnScrollableRecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl$LinearScrollLayoutManager;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl$b;
import android.view.View$OnAttachStateChangeListener;
import com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl$c;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.List;
import java.util.ArrayList;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import com.yxcorp.plugin.search.widget.OverScrollViewGroup;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import x6d.e;
import com.yxcorp.plugin.search.widget.CenterLayoutManager;
import com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl$a;
import ted.d;
import com.yxcorp.plugin.search.widget.OverScrollViewGroup$b;
import ted.e;
import com.yxcorp.plugin.search.widget.OverScrollViewGroup$c;
import java.lang.Number;
import com.yxcorp.utility.n;
import java.lang.Float;
import java.lang.Boolean;
import lnc.a1;

public class TKSearchScrollViewPluginImpl implements o	// class@000778
{
    public Map b;
    public Map c;
    public Map d;
    public Map e;
    public Map f;
    public Map g;
    public Map h;
    public Map i;
    public TextView j;
    public int k;
    public int l;
    public View$OnAttachStateChangeListener m;
    public RecyclerView$r n;
    public Map o;
    public Map p;
    public Map q;
    public Map r;
    public Map s;
    public V8Function t;
    public JsValueRef u;

    public void TKSearchScrollViewPluginImpl(){
       super();
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = new HashMap();
       this.e = new HashMap();
       this.f = new HashMap();
       this.g = new HashMap();
       this.h = new HashMap();
       this.i = new HashMap();
       this.k = 0;
       this.l = 0;
       this.o = new HashMap();
       this.p = new HashMap();
       this.q = new HashMap();
       this.r = new HashMap();
       this.s = new HashMap();
    }
    public void A20(View p0,int p1){
       this.l = p1;
    }
    public void B40(View p0,int p1){
       TKSearchScrollViewPluginImpl tKSearchScro = TKSearchScrollViewPluginImpl.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, tKSearchScro, "12")) {
          return;
       }
       this.l = p1;
       if (this.g.get(p0) != null) {
          this.g.get(p0).smoothScrollToPosition((this.g.get(p0).getAdapter().getItemCount() - 1));
       }
       return;
    }
    public void Bu(View p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKSearchScrollViewPluginImpl.class, "3")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p1, this);
       y.c(this.q.get(p0));
       this.q.put(p0, jsValueRef);
       if (jsValueRef != null) {
          this.p.put(p0, jsValueRef.get());
       }
       return;
    }
    public void De(View p0,int p1,int p2){
       if (PatchProxy.isSupport(TKSearchScrollViewPluginImpl.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKSearchScrollViewPluginImpl.class, "10")) {
          return;
       }
       this.l = p2;
       UnScrollableRecyclerView unScrollable = this.g.get(p0);
       if (unScrollable == null) {
          return;
       }
       TKSearchScrollViewPluginImpl$LinearScrollLayoutManager linearScroll = new TKSearchScrollViewPluginImpl$LinearScrollLayoutManager(this, unScrollable.getContext());
       linearScroll.setOrientation(0);
       TKSearchScrollViewPluginImpl$b uob = new TKSearchScrollViewPluginImpl$b(this, p0);
       this.m = uob;
       unScrollable.addOnAttachStateChangeListener(uob);
       TKSearchScrollViewPluginImpl$c uoc = new TKSearchScrollViewPluginImpl$c(this, p0, unScrollable);
       this.n = uoc;
       unScrollable.addOnScrollListener(uoc);
       unScrollable.setLayoutManager(linearScroll);
       unScrollable.scrollTo(0, 0);
       unScrollable.smoothScrollToPosition((unScrollable.getAdapter().getItemCount() - 1));
       return;
    }
    public void Fs(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKSearchScrollViewPluginImpl.class, "5")) {
          return;
       }
       List list = this.b.get(p0);
       if (list == null) {
          list = new ArrayList();
       }
       list.add(p1);
       this.b.put(p0, list);
       return;
    }
    public void Kj(View p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKSearchScrollViewPluginImpl.class, "4")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p1, this);
       y.c(this.s.get(p0));
       this.s.put(p0, jsValueRef);
       if (jsValueRef != null) {
          this.r.put(p0, jsValueRef.get());
       }
       return;
    }
    public void RV(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollViewPluginImpl.class, "9")) {
          return;
       }
       this.b.remove(p0);
       y.c(this.u);
       return;
    }
    public void Ul(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollViewPluginImpl.class, "11")) {
          return;
       }
       if (this.g.get(p0) != null) {
          this.g.get(p0).stopScroll();
       }
       return;
    }
    public void V9(int p0){
       TKSearchScrollViewPluginImpl tKSearchScro = TKSearchScrollViewPluginImpl.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKSearchScro, "8")) {
          return;
       }
       tKSearchScro = this.j;
       if (tKSearchScro != null) {
          tKSearchScro.setTextColor(p0);
       }
       return;
    }
    public View b(Context p0){
       TextView obj = PatchProxy.applyOneRefs(p0, this, TKSearchScrollViewPluginImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.k = 0;
       ViewGroup viewGroup = LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d1490, null);
       OverScrollViewGroup overScrollVi = viewGroup.findViewById(R.id.overscoll_view);
       overScrollVi.setEnableInnerIntercept(ActivityContext.g().e() instanceof e);
       this.j = viewGroup.findViewById(0x7f0a28fd);
       UnScrollableRecyclerView unScrollable = viewGroup.findViewById(R.id.tk_recycler);
       unScrollable.setOverScrollMode(2);
       unScrollable.setLayoutManager(new CenterLayoutManager(p0, 0, 0, 50));
       TKSearchScrollViewPluginImpl$a uoa = new TKSearchScrollViewPluginImpl$a(this, viewGroup);
       unScrollable.setAdapter(uoa);
       obj = viewGroup.findViewById(R.id.load_more_text);
       overScrollVi.setOnTargetViewOffsetListener(new d(this, obj, viewGroup));
       overScrollVi.setOnTargetViewStopListener(new e(this, viewGroup));
       this.d.put(viewGroup, overScrollVi);
       this.g.put(viewGroup, unScrollable);
       this.c.put(viewGroup, uoa);
       this.h.put(viewGroup, obj);
       return viewGroup;
    }
    public int g8(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKSearchScrollViewPluginImpl.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.P(this.g.get(p0).getContext(), (float)this.k);
    }
    public void i(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollViewPluginImpl.class, "16")) {
          return;
       }
       this.k = 0;
       this.g.get(p0).removeOnAttachStateChangeListener(this.m);
       this.g.get(p0).removeOnScrollListener(this.n);
       this.t = null;
       this.p.remove(p0);
       this.r.remove(p0);
       this.b.remove(p0);
       this.o.remove(p0);
       this.d.remove(p0);
       this.g.remove(p0);
       this.h.remove(p0);
       this.c.remove(p0);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void k40(View p0,float p1){
       TKSearchScrollViewPluginImpl tKSearchScro = TKSearchScrollViewPluginImpl.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, tKSearchScro, "6")) {
          return;
       }
       if (p1 >= 0 && p1 - (float)this.b.get(p0).size() < 0) {
          this.g.get(p0).smoothScrollToPosition((int)p1);
       }
       return;
    }
    public void l40(View p0,boolean p1){
       TKSearchScrollViewPluginImpl tKSearchScro = TKSearchScrollViewPluginImpl.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKSearchScro, "2")) {
          return;
       }
       this.o.put(p0, Boolean.valueOf(p1));
       if (p1) {
          this.d.get(p0).setIsNeedControlBounceBack(true);
          this.h.get(p0).setVisibility(0);
       }else {
          this.d.get(p0).setIsNeedControlBounceBack(0);
          this.h.get(p0).setVisibility(8);
       }
       return;
    }
    public void lN(View p0,float p1,float p2){
       if (PatchProxy.isSupport(TKSearchScrollViewPluginImpl.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, TKSearchScrollViewPluginImpl.class, "7")) {
          return;
       }
       this.e.put(p0, Integer.valueOf(a1.e(p1)));
       this.f.put(p0, Integer.valueOf(a1.e(p2)));
       return;
    }
    public void setScrollEnabled(View p0,boolean p1){
       TKSearchScrollViewPluginImpl tKSearchScro = TKSearchScrollViewPluginImpl.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKSearchScro, "14")) {
          return;
       }
       if (this.g.get(p0) != null) {
          this.g.get(p0).setEnableScroll(p1);
       }
       return;
    }
    public void wU(View p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKSearchScrollViewPluginImpl.class, "15")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p1, this);
       y.c(this.u);
       this.u = jsValueRef;
       if (jsValueRef != null) {
          this.t = jsValueRef.get();
       }
       return;
    }
}
