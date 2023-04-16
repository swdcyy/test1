package cl3.f$e;
import cl3.m;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import cl3.g;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Boolean;
import android.widget.FrameLayout;
import at5.a;
import cl3.f;
import androidx.collection.ArraySet;
import android.util.Pair;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import cl3.i;
import msd.a;
import cl3.j;
import android.view.View;
import msd.l;
import androidx.core.view.ViewKt;
import java.lang.Number;
import cl3.h;
import cl3.k;
import cl3.l;
import java.util.Set;
import java.util.Objects;
import com.kuaishou.live.basic.playview.LivePlayViewHelper;
import rkd.b;
import java.lang.Math;
import cl3.n;
import com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;

public class f$e implements m	// class@000593
{
    public f a;

    public void f$e(){
       super();
    }
    public Object a(int p0){
       f$e uoe = f$e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return k0.a(this.h(), new g(p0)).orNull();
    }
    public void b(boolean p0){
       f$e uoe = f$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "8")) {
          return;
       }
       LivePlayTextureView livePlayText = this.h();
       if (livePlayText != null) {
          int i = (p0)? 0: 8;
          livePlayText.setVisibility(i);
       }
       return;
    }
    public void c(int p0,Object p1){
       f$e uoe = f$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "14")) {
          return;
       }
       LivePlayTextureView livePlayText = this.h();
       if (livePlayText != null) {
          livePlayText.setTag(p0, p1);
       }
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$e.class, "4")) {
          return;
       }
       f$e ta = this.a;
       if (ta != null) {
          ta.w.remove(p0);
       }
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$e.class, "3")) {
          return;
       }
       f$e ta = this.a;
       if (ta != null) {
          ta.w.add(p0);
       }
       return;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, f$e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.p() != null)? true: false;
       return b;
    }
    public ViewGroup$LayoutParams g(){
       Object obj = PatchProxy.apply(null, this, f$e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k0.a(this.m(), i.a).orNull();
    }
    public final LivePlayTextureView h(){
       f$e ta = this.a;
       LivePlayTextureView livePlayText = (ta == null)? null: ta.t;
       return livePlayText;
    }
    public void i(ViewGroup$LayoutParams p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$e.class, "9")) {
          return;
       }
       ViewGroup viewGroup = this.m();
       if (viewGroup != null) {
          viewGroup.setLayoutParams(p0);
          if (p1 != null) {
             ViewKt.b(viewGroup, new j(p1));
          }
       }
       return;
    }
    public float j(){
       ViewGroup obj = PatchProxy.apply(null, this, f$e.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.m();
       float translationY = (obj != null)? obj.getTranslationY(): 0;
       return translationY;
    }
    public ViewGroup$LayoutParams k(){
       Object obj = PatchProxy.apply(null, this, f$e.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k0.a(this.h(), h.a).orNull();
    }
    public void l(ViewGroup$LayoutParams p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$e.class, "10")) {
          return;
       }
       LivePlayTextureView livePlayText = this.h();
       if (livePlayText != null) {
          livePlayText.setLayoutParams(p0);
          if (p1 != null) {
             ViewKt.b(livePlayText, new k(p1));
          }
       }
       return;
    }
    public final ViewGroup m(){
       f$e ta = this.a;
       ViewGroup viewGroup = (ta == null)? null: ta.e;
       return viewGroup;
    }
    public void n(boolean p0){
       f$e uoe = f$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "7")) {
          return;
       }
       ViewGroup viewGroup = this.m();
       if (viewGroup != null) {
          int i = (p0)? 0: 8;
          viewGroup.setVisibility(i);
       }
       return;
    }
    public void o(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$e.class, "1")) {
          return;
       }
       f$e ta = this.a;
       if (ta != null) {
          ta.x.add(p0);
       }
       return;
    }
    public Pair p(){
       Object[] objArray = null;
       LivePlayTextureView obj = PatchProxy.apply(objArray, this, f$e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h();
       if (obj != null) {
          objArray = new Pair(Integer.valueOf(obj.getWidth()), Integer.valueOf(obj.getHeight()));
       }
       return objArray;
    }
    public void q(){
       int i;
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$e.class, "15")) {
          return;
       }
       f$e ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (PatchProxy.applyVoid(objArray, ta, f.class, "11") || (!LivePlayViewHelper.c.a() && (ta.o != null && (ta.p > null && ta.q > null)))) {
             if (b.e()) {
                i = Math.max(ta.p, ta.q);
                i1 = Math.min(ta.p, ta.q);
             }else {
                i = Math.min(ta.p, ta.q);
                i1 = Math.max(ta.p, ta.q);
             }
             ta.p = i;
             ta.q = i1;
             f o = ta.o;
             ta.h(o.a, o.b, AdaptPlayViewReason.DEFAULT);
             ta.g();
          }
       }
    label_006c :
       return;
    }
    public void r(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$e.class, "2")) {
          return;
       }
       f$e ta = this.a;
       if (ta != null) {
          ta.x.remove(p0);
       }
       return;
    }
}
