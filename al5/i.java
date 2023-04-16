package al5.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vk5.e;
import yk5.a;
import java.util.ArrayList;
import im8.c;
import java.lang.Integer;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import al5.i$a;
import androidx.viewpager.widget.ViewPager$i;
import al5.h;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import il5.b;
import io.reactivex.subjects.PublishSubject;
import yk5.f;
import xk5.c;
import java.util.Objects;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import zk5.a;
import el5.l;
import java.util.LinkedHashMap;
import java.util.Set;
import bk5.c;
import java.util.List;
import el5.k;
import java.util.concurrent.Callable;
import jl5.m;
import brd.z;
import el5.h;
import io.reactivex.internal.functions.Functions;
import el5.f;
import el5.f$b;
import el5.d;
import el5.b;
import android.view.View;
import jl5.w;
import android.widget.EditText;
import xk5.a;

public class i extends PresenterV2	// class@0000d5
{
    public int A;
    public int B;
    public EditText p;
    public EmotionPanelConfig q;
    public a r;
    public a s;
    public c t;
    public PublishSubject u;
    public PublishSubject v;
    public PublishSubject w;
    public PublishSubject x;
    public ViewPager y;
    public e z;

    public void i(){
       super();
       this.A = -1;
    }
    public void E8(){
       int i;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       if (this.z == null) {
          e uoe = new e(this.r);
          this.z = uoe;
          this.r.d = uoe;
          uoe.e = this.s;
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new c("EMOJI_EDIT_TEXT", this.p));
          uArrayList.add(new c("EMOTION_PANEL_CONFIG", this.q));
          uArrayList.add(new c("EMOTION_PANEL_SHOW", this.w));
          uArrayList.add(new c("EMOTION_PANEL_WIDTH", Integer.valueOf(this.B)));
          uArrayList.add(new c("EMOTION_PAGE_RESET_TOP_SUBJECT", this.x));
          i tt = this.t;
          if (tt != null) {
             uArrayList.add(new c("EMOTION_INTERACT_CALLBACK", tt));
          }
          tt = this.z;
          tt.f = uArrayList;
          this.y.setAdapter(tt);
          this.y.addOnPageChangeListener(new i$a(this));
       }
       this.X7(this.v.subscribe(new h(this)));
       if (!PatchProxy.applyVoid(objArray, this, oi, "6")) {
          oi = -1;
          if (!TextUtils.isEmpty(this.q.getInitEmotionPackageId())) {
             i = this.r.a(this.q.getInitEmotionPackageId());
          }
          if (i < 0 && this.q.isShowRecordIndex()) {
             String str = b.b("CurrentEmotionKeyboardTab");
             if (!TextUtils.isEmpty(str)) {
                i = this.r.a(str);
             }
          }
          if (i < 0) {
             i = this.q.getInitTabIndex();
          }
          i oi1 = 1;
          int i1 = 0;
          if (i < 0) {
             i = 0;
          }else if(i >= this.r.d()){
             i = this.r.d() - oi1;
          }
          if (i) {
             this.y.setCurrentItem(i);
             this.u.onNext(Integer.valueOf(i));
          }else {
             this.A = i1;
             oi = this.t;
             if (oi != null) {
                oi.j(this.r.c(i1), oi1);
             }
          }
       }
       return;
    }
    public void H8(){
       Object[] objArray = null;
       String str = "5";
       if (PatchProxy.applyVoid(objArray, this, i.class, str)) {
          return;
       }
       i tz = this.z;
       if (tz != null) {
          Objects.requireNonNull(tz);
          if (!PatchProxy.applyVoid(objArray, tz, e.class, str)) {
             if (tz.g.size() > 0) {
                Iterator iterator = tz.g.values().iterator();
                while (iterator.hasNext()) {
                   iterator.next().b();
                }
             }
             tz.g.clear();
          }
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "4")) {
          return;
       }
       l ol = l.b();
       Objects.requireNonNull(ol);
       if (!PatchProxy.applyVoid(objArray, ol, l.class, "5")) {
          l e = ol.e;
          if (e != null && e.size()) {
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator1 = ol.e.keySet().iterator();
             while (iterator1.hasNext()) {
                uArrayList1.add(0, ol.e.get(iterator1.next()));
             }
             if (uArrayList1.size() > 24) {
                uArrayList1.subList(0, 24);
             }
             t.fromCallable(new k(ol, uArrayList1)).subscribeOn(m.b).subscribe(h.b, Functions.d());
          }
       }
       f uof = f.b();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(objArray, uof, f.class, "5")) {
          f a = uof.a;
          if (a != null && a.size()) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = uof.a.values().iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next());
             }
             t.fromCallable(new d(uArrayList)).subscribeOn(m.b).subscribe(b.b, Functions.d());
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.y = w.a(p0, 0x7f0a0d07);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.t8("EMOJI_EDIT_TEXT");
       this.q = this.r8("EMOTION_PANEL_CONFIG");
       this.B = this.r8("EMOTION_PANEL_WIDTH").intValue();
       this.r = this.r8("EMOTION_PAGE_MODEL_PROVIDER");
       this.s = this.t8("EMOTION_CUSTOM_PAGE_DELEGATE");
       this.t = this.t8("EMOTION_INTERACT_CALLBACK");
       this.u = this.r8("EMOTION_PAGE_CHOOSE_TO_TAB_SUBJECT");
       this.v = this.r8("EMOTION_PAGE_CHOOSE_TO_VIEW_SUBJECT");
       this.w = this.r8("EMOTION_PANEL_SHOW");
       this.x = this.r8("EMOTION_PAGE_RESET_TOP_SUBJECT");
       return;
    }
}
