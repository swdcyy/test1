package av1.a;
import ks5.b;
import android.view.ViewGroup;
import java.util.List;
import av1.b;
import java.lang.Object;
import android.content.Context;
import com.kuaishou.live.common.core.component.newpendant.top.associate.flipper.LivePendantViewFlipper;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import java.util.ArrayList;
import java.util.Collection;
import android.widget.ViewFlipper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ks5.a;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ks5.e;
import java.util.Iterator;
import java.lang.Number;

public class a implements b	// class@0002bc
{
    public final LivePendantViewFlipper a;
    public final List b;
    public final ViewGroup c;

    public void a(ViewGroup p0,List p1,int p2,b p3){
       super();
       this.c = p0;
       Context context = p0.getContext();
       LivePendantViewFlipper livePendantV = new LivePendantViewFlipper(context);
       this.a = livePendantV;
       livePendantV.setInAnimation(context, R.anim.arg_RES_7f0100a6);
       livePendantV.setOutAnimation(context, R.anim.arg_RES_7f0100a9);
       ArrayList uArrayList = new ArrayList();
       this.b = uArrayList;
       uArrayList.addAll(p1);
       livePendantV.d(p0, p1, p3);
       livePendantV.setFlipInterval(p2);
    }
    public void D(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "7")) {
          return;
       }
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, LivePendantViewFlipper.class, "5")) {
          ta.getCurrentPendantItem().D();
          ta.f();
       }
       return;
    }
    public void a(int p0){
       a.f(this, p0);
    }
    public View b(ViewGroup p0){
       return this.a;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.t().c();
    }
    public void d(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, LivePendantViewFlipper.class, "3")) {
          ta.i = true;
          if (ta.h != null) {
             Iterator iterator = ta.g.iterator();
             while (iterator.hasNext()) {
                ta.h.b(iterator.next());
             }
          }
          ta.e();
       }
       return;
    }
    public void e(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, LivePendantViewFlipper.class, "6")) {
          ta.i = false;
          if (ta.h != null) {
             Iterator iterator = ta.g.iterator();
             while (iterator.hasNext()) {
                ta.h.a(iterator.next());
             }
          }
          ta.f();
       }
       return;
    }
    public int getBizId(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.t().getBizId();
    }
    public boolean i(){
       return a.c(this);
    }
    public String k(){
       return a.a(this);
    }
    public void onShow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "6")) {
          return;
       }
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, LivePendantViewFlipper.class, "4")) {
          ta.getCurrentPendantItem().onShow();
          ta.e();
       }
       return;
    }
    public int[] p(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t().p();
    }
    public final b t(){
       Object obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.get(0);
    }
}
