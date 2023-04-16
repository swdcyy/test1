package fva.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fva.b$a;
import nsd.u;
import rx4.a;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fva.b$b;
import jva.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import hva.c;
import hva.f;
import android.app.Activity;
import hva.b;
import hva.d;
import hva.g;
import k2b.e0;
import hva.a;
import qrd.l1;
import fva.e;
import sx4.e$a;
import tx4.o;
import sx4.e;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import iva.a;
import tx4.h;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import com.google.gson.JsonArray;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import fg6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import java.lang.Long;
import java.lang.Throwable;
import qrd.j0;
import com.tkruntime.v8.V8ObjectProxy;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import brd.t;
import fva.c;
import erd.g;
import crd.b;
import fva.d;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$a;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$c;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$d;

public final class b extends PresenterV2	// class@002a04
{
    public boolean A;
    public boolean B;
    public b$b C;
    public final a D;
    public final HotSpotFragment E;
    public b p;
    public e q;
    public JsonObject r;
    public JsonObject s;
    public c t;
    public a u;
    public boolean v;
    public boolean w;
    public FrameAutoPlayCard x;
    public f y;
    public boolean z;
    public static final b$a F;

    static {
       b.F = new b$a(null);
    }
    public void b(a p0,HotSpotFragment p1){
       a.p(p1, "mFragment");
       super();
       this.D = p0;
       this.E = p1;
       this.A = true;
       this.B = true;
       this.C = new b$b(this);
    }
    public static final b P8(b p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("binding");
       }
       return p0;
    }
    public void E8(){
       Object[] objArray1;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (this.q != null) {
          this.X8();
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uob, "4")){
          try{
             b tr = this.r;
             if (tr != null) {
                JsonElement jsonElement = tr.e0("tkViewKey");
                if (jsonElement != null) {
                   objArray1 = jsonElement.w();
                }
             }
             objArray1 = objArray;
          }catch(java.lang.Exception e0){
          }
          int i = 0;
          String str = (objArray1 == null || !objArray1.length())? 1: null;
          if (!str) {
             if (!PatchProxy.applyVoid(objArray, this, e0, "5")) {
                c uoc = new c();
                f uof = new f(this.getActivity(), this.E);
                this.y = uof;
                a.m(uof);
                uoc.a(uof);
                uoc.a(new d(this.getActivity()));
                uoc.a(new g(this.E));
                uoc.a(new a(this.E));
                this.t = uoc;
             }
             uob = this.D;
             if (uob != null) {
                Object[] objArray2 = new Object[i];
                uob.f(this.t, new e(this), objArray1, objArray2);
             }
          }
       }
    label_0095 :
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       a.d().p(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       this.S8(true);
       this.W8();
       b tq = this.q;
       if (tq != null) {
          tq.close();
       }
       this.q = null;
       this.s = null;
       this.u = null;
       a.d().t(this);
       return;
    }
    public final void R8(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "18")) {
          return;
       }
       this.v = this.E.Vg().c();
       b = this.E.Vg().e();
       this.w = b;
       if (this.A != null && (this.v != null && (b && this.B != null))) {
          if (!PatchProxy.applyVoid(objArray, this, uob, "10") && this.z == null) {
             b tu = this.u;
             if (tu != null) {
                a.a(tu, "didResumePage", null, null, 6, null);
             }
             this.z = true;
          }
       }else {
          this.S8(false);
       }
       return;
    }
    public final void S8(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "11")) {
          return;
       }
       if (this.z == null) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.H("destroyCard", Boolean.valueOf(p0));
       b tu = this.u;
       if (tu != null) {
          a.a(tu, "didLeavePage", jsonObject.toString(), null, 4, null);
       }
       this.z = false;
       return;
    }
    public final void V8(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "17")) {
          return;
       }
       this.A = p0;
       this.R8();
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       this.E.h0().removeOnScrollListener(this.C);
       this.S8(true);
       return;
    }
    public final void X8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "7")) {
          return;
       }
       b tr = this.r;
       if (tr != null) {
          if (a.g(tr, this.s)) {
             return;
          }else {
             JsonArray jsonArray = tr.g0("feeds");
             if (jsonArray != null) {
                JsonElement jsonElement = CollectionsKt___CollectionsKt.n2(jsonArray);
                if (jsonElement != null) {
                   QPhoto qPhoto = a.a.c(jsonElement, QPhoto.class);
                   b ty = this.y;
                   if (ty != null) {
                      ty.b = qPhoto;
                   }
                   if (ty != null && !PatchProxy.applyVoidOneRefs(tr, ty, f.class, "2")) {
                      a.p(tr, "data");
                      ty.d.clear();
                      JsonArray jsonArray1 = tr.g0("hotSpotEventItem");
                      if (jsonArray1 != null) {
                         Iterator iterator = jsonArray1.iterator();
                         while (iterator.hasNext()) {
                            JsonElement jsonElement1 = iterator.next();
                            if (jsonElement1 instanceof JsonObject) {
                               jsonElement1 = jsonElement1.e0("wordId");
                               Long longx = (jsonElement1 != null)? Long.valueOf(jsonElement1.t()): objArray;
                               if (longx != null) {
                                  ty.d.add(longx);
                               }
                               Result.constructor-impl(l1.a);
                            }
                         }
                      }
                   }
                   ty = this.D;
                   if (ty != null) {
                      objArray = ty.o(qPhoto);
                   }
                }
             }
             b tq = this.q;
             if (tq != null) {
                Object[] objArray1 = new Object[]{tr.toString(),objArray};
                tq.setData(objArray1);
             }
             this.s = tr;
             this.z = true;
          }
       }
       return;
    }
    public void j8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       b obj = this.q8(b.class);
       a.o(obj, "inject\(HotSpotBigEventTKView::class.java\)");
       this.p = obj;
       this.r = this.q8(JsonObject.class);
       obj = this.p;
       if (obj == null) {
          a.S("binding");
       }
       this.x = obj.n1();
       if (!PatchProxy.applyVoid(objArray, this, uob, "9")) {
          this.X7(this.E.Vg().j().subscribe(new c(this)));
          this.X7(this.E.Vg().l().subscribe(new d(this)));
       }
       return;
    }
    public final void onEventMainThread(NetworkTypeMonitor$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       this.V8(true);
       return;
    }
    public final void onEventMainThread(NetworkTypeMonitor$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "16")) {
          return;
       }
       this.V8(false);
       return;
    }
    public final void onEventMainThread(NetworkTypeMonitor$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       this.V8(true);
       return;
    }
}
