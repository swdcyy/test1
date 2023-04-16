package ky9.f;
import ky9.a;
import gr7.j;
import com.yxcorp.gifshow.detail.common.information.marquee.model.c;
import ly9.m;
import ly9.k;
import ly9.f;
import ly9.q;
import ly9.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ky9.f$a;
import gr7.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import java.util.Objects;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.internal.functions.Functions;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeConfig;
import java.lang.Integer;
import pp7.b;
import java.lang.Boolean;
import lnc.u1;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.e;
import ly9.l;
import crd.a;
import java.util.List;
import com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import java.util.Collection;
import ekd.q;
import java.util.Collections;
import com.yxcorp.gifshow.detail.common.information.marquee.model.d;
import ekd.q$a;

public final class f extends a	// class@002d27
{
    public final q b;
    public final j c;
    public final c d;
    public final m e;
    public final k f;
    public final f g;
    public final q h;
    public final g i;

    public void f(j p0,c p1,m p2,k p3,f p4,q p5,g p6){
       a.p(p0, "mViewModel");
       a.p(p1, "mMarqueePageList");
       a.p(p2, "mMarqueeStateHelper");
       a.p(p3, "mMarqueePlayHelper");
       a.p(p4, "mMarqueeDataHelper");
       a.p(p5, "mMarqueeViewHelper");
       a.p(p6, "mParams");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.b = new f$a(this);
    }
    public void b(){
       b obj3;
       q obj7;
       q f;
       g e3;
       Object obj9;
       j oj = j.class;
       q oq = q.class;
       k ok = k.class;
       f uof = f.class;
       h oh = h.class;
       String str = "2";
       if (PatchProxy.applyVoid(null, this, f.class, str)) {
          return;
       }
       this.d.h(this.b);
       f tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(null, tf, ok, str)) {
          tf.h.getPlayer().w(tf.m);
       }
       tf = this.f;
       Objects.requireNonNull(tf);
       String str1 = "1";
       b uob = PatchProxy.apply(null, tf, ok, str1);
       if (uob != PatchProxyResult.class) {
       }else {
          uob = tf.g.Z0().subscribe(tf.l, Functions.e);
       }
       a.o(uob, "mMarqueePlayHelper.addPageSelectListener\(\)");
       this.a(uob);
       tf = this.h;
       Objects.requireNonNull(tf);
       q obj = PatchProxy.apply(null, tf, oq, str1);
       if (obj != PatchProxyResult.class) {
       }else {
          obj = tf.b;
          f = tf.d;
          e3 = Functions.e;
          Objects.requireNonNull(obj);
          obj9 = PatchProxy.applyTwoRefs(f, e3, obj, oh, str);
          obj = (obj9 != PatchProxyResult.class)? obj9: obj.a.subscribe(f, e3);
       }
       a.o(obj, "mMarqueeViewHelper.addMarqueeItemClickListener\(\)");
       this.a(obj);
       tf = this.h;
       Objects.requireNonNull(tf);
       g obj1 = PatchProxy.apply(null, tf, oq, str);
       if (obj1 != PatchProxyResult.class) {
       }else {
          obj7 = tf.b;
          f = tf.e;
          e3 = Functions.e;
          Objects.requireNonNull(obj7);
          obj9 = PatchProxy.applyTwoRefs(f, e3, obj7, oh, "4");
          obj1 = (obj9 != PatchProxyResult.class)? obj9: obj7.c.subscribe(f, e3);
       }
       a.o(obj1, "mMarqueeViewHelper.addMa¡­ItemAvatarClickListener\(\)");
       this.a(obj1);
       tf = this.h;
       Objects.requireNonNull(tf);
       str = "3";
       f obj2 = PatchProxy.apply(null, tf, oq, str);
       if (obj2 != PatchProxyResult.class) {
       }else {
          oq = tf.b;
          f = tf.f;
          g e2 = Functions.e;
          Objects.requireNonNull(oq);
          Object obj8 = PatchProxy.applyTwoRefs(f, e2, oq, oh, "8");
          obj3 = (obj8 != PatchProxyResult.class)? obj8: oq.b.subscribe(f, e2);
       }
       a.o(obj2, "mMarqueeViewHelper.addMarqueeItemShowListener\(\)");
       this.a(obj2);
       obj2 = this.c;
       MarqueeConfig height = this.i.a.height;
       Objects.requireNonNull(obj2);
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(height), obj2, oj, "9")) {
          obj2.i.f(Integer.valueOf(height));
       }
       obj2 = this.c;
       height = this.i.a.simpleEnabled;
       Objects.requireNonNull(obj2);
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(height), obj2, oj, "11")) {
          obj2.j.f(Boolean.valueOf(height));
       }
       f tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(null, tg, uof, str1)) {
          u1.a(tg);
       }
       tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(null, tg, uof, "4")) {
          tg.g.b(tg.n);
       }
       tg = this.g;
       Objects.requireNonNull(tg);
       obj3 = PatchProxy.apply(null, tg, uof, str);
       if (obj3 != PatchProxyResult.class) {
       }else {
          obj2 = tg.e;
          tg = tg.k;
          g e1 = Functions.e;
          Objects.requireNonNull(obj2);
          obj7 = PatchProxy.applyTwoRefs(tg, e1, obj2, oh, "13");
          obj3 = (obj7 != PatchProxyResult.class)? obj7: obj2.g.subscribe(tg, e1);
       }
       a.o(obj3, "mMarqueeDataHelper.addMarqueeReplayListener\(\)");
       this.a(obj3);
       tg = this.g;
       Objects.requireNonNull(tg);
       obj3 = PatchProxy.apply(null, tg, uof, "7");
       String str2 = "6";
       if (obj3 != PatchProxyResult.class) {
       }else {
          obj2 = tg.e;
          tg = tg.l;
          obj1 = Functions.e;
          Objects.requireNonNull(obj2);
          Object obj6 = PatchProxy.applyTwoRefs(tg, obj1, obj2, oh, str2);
          obj3 = (obj6 != PatchProxyResult.class)? obj6: obj2.d.subscribe(tg, obj1);
       }
       a.o(obj3, "mMarqueeDataHelper.addMarqueePreLoadListener\(\)");
       this.a(obj3);
       tg = this.g;
       Objects.requireNonNull(tg);
       obj3 = PatchProxy.apply(null, tg, uof, str2);
       if (obj3 != PatchProxyResult.class) {
       }else {
          obj2 = tg.b;
          obj3 = (obj2 instanceof l)? obj2.h.subscribe(tg.m, Functions.e): new a();
       }
       a.o(obj3, "mMarqueeDataHelper.addCo¡­ickReplySuccessListener\(\)");
       this.a(obj3);
       tg = this.g;
       Objects.requireNonNull(tg);
       a obj4 = PatchProxy.apply(null, tg, uof, "8");
       if (obj4 != PatchProxyResult.class) {
       }else {
          obj2 = tg.e;
          tg = tg.i;
          g e = Functions.e;
          Objects.requireNonNull(obj2);
          Object obj5 = PatchProxy.applyTwoRefs(tg, e, obj2, oh, "10");
          obj3 = (obj5 != PatchProxyResult.class)? obj5: obj2.e.subscribe(tg, e);
       }
       a.o(obj4, "mMarqueeDataHelper.addMa¡­eInsertPositionListener\(\)");
       this.a(obj4);
       tg = this.f;
       Objects.requireNonNull(tg);
       obj3 = PatchProxy.apply(null, tg, ok, "4");
       if (obj3 != PatchProxyResult.class) {
       }else {
          obj3 = tg.j.subscribe(tg.n, Functions.e);
       }
       a.o(obj3, "mMarqueePlayHelper.addNo¡­oSingleImgPauseListener\(\)");
       this.a(obj3);
       return;
    }
    public void c(){
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       super.c();
       this.d.clear();
       this.d.f(this.b);
       f te = this.e;
       te.a = false;
       te.b = false;
       te.d = false;
       te.c = false;
       te.e = false;
       te.f = false;
       te.g = 0;
       te.h = false;
       te = this.g;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(null, te, uof, "2")) {
          u1.b(te);
       }
       te = this.g;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(null, te, uof, "5")) {
          te.g.j(te.n);
       }
       uof = this.f;
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(null, uof, k.class, "3")) {
          uof.h.getPlayer().O(uof.m);
       }
       this.f.d();
       return;
    }
    public final void d(){
       List list;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "1")) {
          return;
       }
       List items = this.d.getItems();
       MarqueeConfig placeHolderI = this.i.a.placeHolderItemCount;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          list = PatchProxy.applyTwoRefs(items, Integer.valueOf(placeHolderI), objArray, uoe, "7");
          if (list != PatchProxyResult.class) {
          }else if(q.f(items)){
             list = Collections.emptyList();
          }else {
             items.addAll(false, e.d(placeHolderI));
             items.addAll(e.d((placeHolderI + 1)));
             list = q.g(items, d.a);
          }
       }else {
          goto label_0032 ;
       }
       a.o(list, "MarqueeResponseExt.conve¡­fig.placeHolderItemCount\)");
       f tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(list, tc, j.class, "3")) {
          tc.f.f(list);
       }
       int i = q.f(list) ^ 0x01;
       f te = this.e;
       te.d = i;
       te.c(false);
       if (i) {
          this.f.c();
       }else {
          this.f.d();
       }
       return;
    }
}
