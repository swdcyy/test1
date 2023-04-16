package ec1.l;
import bq5.h;
import lp3.a;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.PriorityQueue;
import java.util.HashMap;
import bq5.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import bq5.h$a;
import java.util.List;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import bq5.f;
import java.util.Collection;
import java.util.Iterator;
import bq5.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;
import java.util.Map$Entry;

public class l extends a implements h	// class@0020df
{
    public final List d;
    public final ConcurrentHashMap e;
    public final PriorityQueue f;
    public final HashMap g;
    public f h;

    public void l(){
       super();
       this.d = new ArrayList();
       this.e = new ConcurrentHashMap();
       this.f = new PriorityQueue();
       this.g = new HashMap();
    }
    public void A7(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       b.c0(LiveCommonLogTag.BOTTOM_BUBBLE, "removeInterceptor", "interceptor", p0);
       this.e.remove(p0);
       return;
    }
    public void Fh(h$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "5")) {
          return;
       }
       b.c0(LiveCommonLogTag.BOTTOM_BUBBLE, "registerLiveBottomBubbleListener", "listener", p0);
       if (p0 != null) {
          this.d.add(p0);
       }
       return;
    }
    public void Kb(String p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ol, "12")) {
          return;
       }
       b.c0(LiveCommonLogTag.BOTTOM_BUBBLE, "disableQueue", "token", p0);
       if (!TextUtils.isEmpty(p0)) {
          this.g.put(p0, Integer.valueOf(p1));
          this.zb();
          this.m0();
       }
       return;
    }
    public void Oh(f p0){
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "7")) {
          return;
       }
       Iterator iterator = this.g.values().iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().intValue() > p0.getPriority()) {
                b.c0(LiveCommonLogTag.BOTTOM_BUBBLE, "addBottomBubbleItem cancel", "DisableBiz", this.g.toString());
                return;
             }
          }else if(p0.a() - null < 0){
             b.Z(LiveCommonLogTag.BOTTOM_BUBBLE, "addBottomBubbleItem, return reason: left time < 0");
             if (p0.b() != null) {
                p0.b().b();
             }
             return;
          }else {
             b.c0(LiveCommonLogTag.BOTTOM_BUBBLE, "addBottomBubbleItem", "BottomBubbleItem", p0);
             this.f.add(p0);
             if (!PatchProxy.applyVoid(null, this, ol, "17")) {
                Iterator iterator1 = this.d.iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().b();
                }
             }
             break ;
          }
       }
       return;
    }
    public void Qo(){
    }
    public void Ro(){
    }
    public final void So(){
       if (PatchProxy.applyVoid(null, this, l.class, "18")) {
          return;
       }
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void a9(Class p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "1")) {
          return;
       }
       b.d0(LiveCommonLogTag.BOTTOM_BUBBLE, "addInterceptor", "interceptClass", p0.getSimpleName(), "interceptor", p1);
       this.e.put(p1, p0);
       return;
    }
    public void ce(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "8")) {
          return;
       }
       b.c0(LiveCommonLogTag.BOTTOM_BUBBLE, "removeBottomBubbleItem", "BottomBubbleItem", p0);
       this.f.remove(p0);
       p0.e(-1);
       if (p0.b() != null) {
          p0.b().b();
       }
       return;
    }
    public f dn(){
       Object obj = PatchProxy.apply(null, this, l.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.peek();
    }
    public void e9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "11")) {
          return;
       }
       b.c0(LiveCommonLogTag.BOTTOM_BUBBLE, "enableQueue", "token", p0);
       this.g.remove(p0);
       return;
    }
    public void gi(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "14")) {
          return;
       }
       b.c0(LiveCommonLogTag.BOTTOM_BUBBLE, "updateCurrentBottomBubbleItem", "BubbleItemInfo", p0);
       this.h = p0;
       return;
    }
    public boolean lj(f p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e.entrySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          Map$Entry uEntry = obj.next();
          if (uEntry.getValue().isAssignableFrom(p0.getClass()) && uEntry.getKey().a(p0)) {
             break ;
          }
       }
       return true;
    }
    public void m0(){
       if (PatchProxy.applyVoid(null, this, l.class, "15")) {
          return;
       }
       b.Z(LiveCommonLogTag.BOTTOM_BUBBLE, "breakup");
       this.So();
       return;
    }
    public boolean pa(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.f.contains(p0);
    }
    public void pj(int p0,f p1){
       boolean b;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ol, "16")) {
          return;
       }
       if (p1.getPriority() == p0) {
          b.d0(LiveCommonLogTag.BOTTOM_BUBBLE, "resetPriorityAndBreakupIfNeed, priority not change", "new priority", Integer.valueOf(p0), "BubbleItemInfo", p1);
          return;
       }else if(!this.f.contains(p1)){
          b.d0(LiveCommonLogTag.BOTTOM_BUBBLE, "resetPriorityAndBreakupIfNeed, not in queue", "new priority", Integer.valueOf(p0), "BubbleItemInfo", p1);
          p1.g(p0);
          return;
       }else {
          this.f.remove(p1);
          p1.g(p0);
          this.f.add(p1);
          b = true;
          boolean b1 = (p1 == this.h)? true: false;
          String str = (p1 == this.dn())? 1: null;
          if (b1 && (str && (b1 || !str))) {
             b = false;
          }
          b.f0(LiveCommonLogTag.BOTTOM_BUBBLE, "resetPriorityAndBreakupIfNeed", "new priority", Integer.valueOf(p0), "isCurrentItem", Boolean.valueOf(b1), "shouldBreakup", Boolean.valueOf(b), "BubbleItemInfo", p1);
          if (b) {
             this.m0();
          }
          return;
       }
    }
    public f t3(){
       return this.h;
    }
    public void xc(h$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "6")) {
          return;
       }
       b.c0(LiveCommonLogTag.BOTTOM_BUBBLE, "unregisterLiveBottomBubbleListener", "listener", p0);
       if (p0 != null) {
          this.d.remove(p0);
       }
       return;
    }
    public void z9(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       l th = this.h;
       if (th != null && this.lj(th)) {
          b.Z(LiveCommonLogTag.BOTTOM_BUBBLE, "refreshBubbleQueue, break up");
          this.So();
       }else {
          b.Z(LiveCommonLogTag.BOTTOM_BUBBLE, "refreshBubbleQueue, ignore");
       }
       return;
    }
    public void zb(){
       if (PatchProxy.applyVoid(null, this, l.class, "10")) {
          return;
       }
       b.Z(LiveCommonLogTag.BOTTOM_BUBBLE, "clearAllBottomBubbleItem");
       Iterator iterator = new PriorityQueue(this.f).iterator();
       while (iterator.hasNext()) {
          f uof = iterator.next();
          uof.e(-1);
          if (uof.b() != null) {
             uof.b().b();
          }
       }
       this.f.clear();
       return;
    }
}
