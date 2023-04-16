package tk1.b;
import tk1.a;
import z1.k;
import vg1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xz6.d;
import com.yxcorp.gifshow.models.Gift;
import java.util.List;
import mk1.b0;
import mk1.w;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView;
import vg1.e;
import android.widget.BaseAdapter;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.util.Iterator;
import android.view.View;
import java.lang.Integer;
import java.lang.Boolean;
import cm1.a;

public abstract class b implements a	// class@003e1b
{
    public final c a;
    public final k b;

    public void b(k p0,c p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public int A2(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getCount();
    }
    public int B2(Gift p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return w.o(this.a.d(), p0).a;
    }
    public void C2(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       LiveGiftGridView liveGiftGrid = this.b.get();
       if (liveGiftGrid != null) {
          liveGiftGrid.setGiftItemAdapter(this.a);
       }
       return;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, b.class, "13")) {
          return;
       }
       this.a.notifyDataSetChanged();
       return;
    }
    public GiftPanelItem a(){
       Object obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.A();
    }
    public Gift b(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.y();
    }
    public void c(Gift p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       List list = this.a.d();
       if (!PatchProxy.applyVoidTwoRefs(list, p0, null, w.class, "32")) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Gift gift = iterator.next().getGift();
             if (gift != null && gift.equals(p0)) {
                iterator.remove();
             }
          }
       }
       return;
    }
    public abstract void d();
    public int e(){
       LiveGiftGridView obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.get();
       if (obj != null) {
          return obj.getCurrentPosition();
       }
       return -1;
    }
    public int f(){
       LiveGiftGridView obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.get();
       if (obj == null) {
          return -1;
       }
       return obj.getPageSize();
    }
    public View g(){
       Object obj = PatchProxy.apply(null, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.v();
    }
    public abstract void h(boolean p0);
    public abstract void i();
    public abstract void j(boolean p0,int p1);
    public Gift l0(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.d().get(p0).getGift();
    }
    public void m0(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       this.a.t();
       return;
    }
    public void w2(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "10")) {
          return;
       }
       if (p0 != this.a.D()) {
          this.a.Q(p0);
          this.a.notifyDataSetChanged();
       }
       return;
    }
    public int x2(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return w.n(this.a.d(), p0).a;
    }
    public boolean z2(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = this.B2(a.a(p0));
       if (p0 >= 0) {
          this.a.V(p0);
          this.a.notifyDataSetChanged();
          return true;
       }else {
          return false;
       }
    }
}
