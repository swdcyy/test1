package bl5.g;
import al5.a;
import pl8.d;
import java.util.ArrayList;
import bl5.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.util.ActivityContext;
import android.app.Activity;
import uk5.a;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import bl5.d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.Collection;
import bl5.g$b;
import vk5.b;
import pl8.a;
import sl8.b;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bl5.g$c;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.RecyclerView;
import bl5.g$d;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$l;
import java.util.List;
import ekd.q;
import dl5.a;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import android.widget.ImageView;
import android.text.Editable;
import android.widget.EditText;
import android.text.TextWatcher;
import bl5.e;
import erd.g;
import crd.b;
import brd.t;
import dk5.b;
import bk5.c;
import java.lang.Boolean;
import androidx.recyclerview.widget.LinearLayoutManager;
import ql8.a;
import yk5.c;
import lnc.a1;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import el5.l;
import android.view.View;
import jl5.w;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import bl5.c;
import android.view.View$OnClickListener;
import xk5.c;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;

public class g extends a	// class@0004d6
{
    public final List A;
    public List B;
    public long C;
    public int D;
    public boolean E;
    public final TextWatcher F;
    public g$d G;
    public EditText p;
    public EmotionPanelConfig q;
    public c r;
    public PublishSubject s;
    public EmotionLongClickRecyclerView t;
    public ImageView u;
    public b v;
    public GridLayoutManager w;
    public int x;
    public d y;
    public final List z;

    public void g(){
       super();
       this.y = new d();
       this.z = new ArrayList();
       this.A = new ArrayList();
       this.F = new g$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "4")) {
          return;
       }
       this.D = a.a(ActivityContext.d().c(), this.x);
       this.W8();
       this.V8();
       this.t.getViewTreeObserver().addOnGlobalLayoutListener(new d(this));
       if (this.v == null) {
          this.y.a(this.A);
          this.v = new b(this.y, new g$b(this));
          GridLayoutManager gridLayoutMa = new GridLayoutManager(this.getContext(), this.D);
          this.w = gridLayoutMa;
          gridLayoutMa.m1(new g$c(this));
          this.t.setItemViewCacheSize(20);
          g$d uod = new g$d(this);
          this.G = uod;
          this.t.addItemDecoration(uod);
          this.t.setLayoutManager(this.w);
          this.t.setAdapter(this.v);
          this.t.setItemAnimator(objArray);
          this.v.k0();
       }else {
          this.y.e(this.A);
          h.b(new a(q.b(this.y.b()), this.A, this.D)).d(this.v);
       }
       g tq = this.q;
       if (tq != null && !tq.isShowEmojiPageDel()) {
          this.u.setVisibility(8);
       }else {
          tq = this.p;
          if (tq != null) {
             g tu = this.u;
             boolean b = (tq.getText().length())? true: false;
             tu.setEnabled(b);
          }
       }
       tq = this.p;
       if (tq != null) {
          tq.addTextChangedListener(this.F);
       }
       this.X7(this.s.subscribe(new e(this)));
       return;
    }
    public void F8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "9")) {
          this.z.clear();
          this.z.addAll(b.e().c());
          int i = this.z.size();
          i = i - 1;
          while (i >= 0) {
             c uoc = this.z.get(i);
             if (uoc == null || uoc.d != null) {
                this.z.remove(i);
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       g tp = this.p;
       if (tp != null) {
          tp.removeTextChangedListener(this.F);
       }
       return;
    }
    public void P8(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "7")) {
          return;
       }
       this.E = true;
       if (!p0) {
          this.S8();
       }
       return;
    }
    public void R8(){
       this.E = false;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       boolean b = q.f(this.B);
       int i = this.t.getLayoutManager().h();
       if (this.W8()) {
          this.V8();
          this.y.e(this.A);
          h.b(new a(q.b(this.y.b()), this.A, this.D)).d(this.v);
          if (b && !i) {
             this.t.scrollToPosition(0);
          }
       }
       return;
    }
    public final void V8(){
       Iterator iterator;
       if (PatchProxy.applyVoid(null, this, g.class, "11")) {
          return;
       }
       this.A.clear();
       int i = 0;
       int i1 = 1;
       if (!q.f(this.B)) {
          this.A.add(new a(new c(a1.p(R.string.arg_RES_7f100d89)), i1));
          iterator = this.B.iterator();
          while (iterator.hasNext()) {
             this.A.add(new a(iterator.next(), i));
          }
       }
       this.A.add(new a(new c(a1.p(R.string.arg_RES_7f100d85)), i1));
       if (!q.f(this.z)) {
          iterator = this.z.iterator();
          while (iterator.hasNext()) {
             this.A.add(new a(iterator.next(), i));
          }
       }
       iterator = this.A.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj instanceof c) {
             obj.e = i;
             i = i + 1;
          }
       }
       return;
    }
    public final boolean W8(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int b = false;
       if (!this.q.isShowRecentlyUsedEmoji()) {
          return b;
       }
       g tC = this.C;
       if (tC && !tC - l.b().a()) {
          return b;
       }
       this.C = l.b().a();
       obj = l.b().c();
       this.B = obj;
       if (q.f(obj)) {
          return b;
       }
       int i = this.D * this.q.getShowRecentlyUsedEmojiLine();
       if (this.B.size() <= this.D) {
          for (i = this.B.size(); i < this.D; i = i + 1) {
             this.B.add(new c("[my_spacing]", objArray, objArray));
          }
          return true;
       }else if(this.B.size() < i){
          for (b = this.B.size(); b < i; b = b + 1) {
             this.B.add(new c("[my_spacing]", objArray, objArray));
          }
       }else if(this.B.size() > i){
          this.B = this.B.subList(b, i);
       }
       return true;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       EmotionLongClickRecyclerView uEmotionLong = w.a(p0, R.id.recycler_view);
       this.t = uEmotionLong;
       uEmotionLong.getRecycledViewPool().k(0, this.D);
       ImageView imageView = w.a(p0, R.id.delete_btn);
       this.u = imageView;
       imageView.setOnClickListener(new c(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.t8("EMOJI_EDIT_TEXT");
       this.q = this.r8("EMOTION_PANEL_CONFIG");
       this.r = this.t8("EMOTION_INTERACT_CALLBACK");
       this.s = this.r8("EMOTION_PANEL_SHOW");
       this.x = this.r8("EMOTION_PANEL_WIDTH").intValue();
       return;
    }
}
