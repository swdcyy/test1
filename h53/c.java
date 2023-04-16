package h53.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import fq5.b;
import o63.a;
import lp3.c;
import y43.a;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneBottomLiveCardMessage;
import h53.a;
import lf3.g;
import hf3.a;
import h53.i;
import oq5.c;
import oq5.a;
import h53.c$a;
import mq5.h;
import mq5.b;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import j77.c;
import j77.b;
import crd.b;
import java.lang.Integer;
import brd.t;
import h53.b;
import brd.x;
import h53.c$b;
import erd.g;
import o63.d;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$State;
import lnc.b9;
import h53.c$c;
import android.net.Uri;
import ekd.x0;
import android.net.Uri$Builder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import java.lang.Number;
import h53.g;
import java.lang.reflect.Type;
import el.a;
import java.util.LinkedHashMap;
import f37.a;
import com.kwai.live.gzone.util.LruMap;
import java.util.HashSet;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import android.content.Context;
import vq5.d;
import java.lang.ref.WeakReference;
import h53.h;
import java.lang.StringBuilder;
import oq5.b;

public class c extends PresenterV2	// class@002c5e
{
    public a A;
    public c$c B;
    public c C;
    public Map D;
    public Map E;
    public LinkedHashMap p;
    public a q;
    public g r;
    public b s;
    public a t;
    public b u;
    public Map v;
    public b w;
    public d x;
    public h y;
    public b z;

    public void c(){
       super();
       this.E = new HashMap();
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       this.t = this.s.t5().a(a.class);
       a uoa = new a(this);
       this.r = uoa;
       this.q.W.u0(1096, SCGzoneBottomLiveCardMessage.class, uoa);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "12")) {
          i oi = new i(this);
          this.C = oi;
          this.A.H6(oi);
       }
       c$a uoa1 = new c$a(this);
       this.y = uoa1;
       this.w.Km(uoa1);
       return;
    }
    public void J8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "14")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "18")) {
          uoc = this.v;
          if (uoc != null) {
             uoc.clear();
          }
       }
       uoc = this.C;
       if (uoc != null) {
          this.A.Q0(uoc);
       }
       this.q.W.o(1096, this.r);
       this.w.le(this.y);
       uoc = this.D;
       if (uoc != null && uoc.size() > 0) {
          Iterator iterator = this.D.keySet().iterator();
          while (iterator.hasNext()) {
             c uoc1 = this.D.get(iterator.next());
             if (uoc1 != null) {
                this.u.g(uoc1);
                this.u.d(uoc1.a);
             }
          }
       }
       return;
    }
    public void P8(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "17")) {
          return;
       }
       this.X7(p1);
       if (this.v == null) {
          this.v = new HashMap();
       }
       this.v.put(p0, p1);
       return;
    }
    public void R8(SCGzoneBottomLiveCardMessage p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "6")) {
          return;
       }
       String str = String.valueOf(p0.widgetId);
       this.V8(str);
       this.P8(str, t.just(Integer.valueOf(p1)).compose(new b(p0)).subscribe(new c$b(this, p0)));
       return;
    }
    public void S8(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "13")) {
          return;
       }
       if (p0 != null && p0.getLifecycle().getCurrentState() != Lifecycle$State.DESTROYED) {
          p0.L();
       }
       return;
    }
    public final void V8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "19")) {
          return;
       }
       c tv = this.v;
       if (tv != null) {
          b9.a(tv.remove(p0));
       }
       return;
    }
    public final void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "15")) {
          return;
       }
       this.S8(this.E.remove(p0));
       this.X8(p0);
       return;
    }
    public void X8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "16")) {
          return;
       }
       c tD = this.D;
       if (tD != null) {
          c uoc = tD.get(p0);
          if (uoc != null) {
             this.u.g(uoc);
             this.u.d(uoc.a);
          }
       }
       return;
    }
    public void Y8(c$c p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       c$c uoc1 = null;
       this.B = uoc1;
       String str = String.valueOf(p0.a.widgetId);
       this.W8(str);
       Uri$Builder uBuilder = x0.f(p0.a.krnUrl).buildUpon();
       if (!TextUtils.x(p0.a.krnContent)) {
          uBuilder.appendQueryParameter("gzonedata", p0.a.krnContent);
       }
       i3 oi3 = i3.f();
       oi3.c("pendant_id", Integer.valueOf(p0.a.widgetId));
       oi3.d("business_id", p0.a.bizId);
       uBuilder.appendQueryParameter("logparams", oi3.e());
       Uri uri = uBuilder.build();
       if (uri != null && TextUtils.n(uri.getHost(), "krndialog")) {
          uoc1 = this.t.v2(uri.toString());
       }
       c$c a = p0.a;
       if (!PatchProxy.applyVoidOneRefs(a, this, uoc, "9") && !TextUtils.x(a.frequencyKey)) {
          LinkedHashMap linkedHashMa = a.b(new g(this).getType());
          LruMap lruMap = new LruMap(10);
          if (linkedHashMa != null) {
             lruMap.putAll(linkedHashMa);
          }
          Set set = lruMap.get(Integer.valueOf(a.widgetId));
          if (set == null) {
             set = new HashSet();
             lruMap.put(Integer.valueOf(a.widgetId), set);
          }
          set.add(a.frequencyKey);
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("gzoneKrnDialogShowCountMap", b.e(lruMap));
          g.a(uEditor);
       }
       if (uoc1 == null) {
          this.x.r4(p0.a.krnUrl, this.getContext());
       }
       if (uoc1 != null) {
          this.E.put(str, uoc1);
          p0 = p0.b;
          if (p0 > null && (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(uoc1, str, Integer.valueOf(p0), this, c.class, "11"))) {
             WeakReference weakReferenc = new WeakReference(uoc1);
             if (this.D == null) {
                this.D = new HashMap();
             }
             h oh = new h(this, "krnDialog"+str, weakReferenc);
             this.D.put(str, oh);
             this.u.a(oh);
             this.u.b(oh.a, (long)p0, true);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       this.u = this.q8(b.class);
       this.x = this.r8("LIVE_ROUTER_SERVICE");
       this.w = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.z = this.q8(b.class);
       this.A = this.r8("LIVE_CONFIGURATION_SERVICE");
       return;
    }
}
