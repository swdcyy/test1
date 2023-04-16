package i6a.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i6a.f$a;
import nsd.u;
import lnc.a1;
import i6a.f$b;
import i6a.f$c;
import i6a.f$d;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementFeed;
import tl8.d;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementMeta;
import vy6.a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.SeekBar;
import java.lang.CharSequence;
import i6a.f$e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.util.rx.RxBus;
import ve5.b;
import brd.t;
import t45.d;
import brd.z;
import i6a.f$f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import tkd.b;
import tkd.d;
import vo5.l;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementMeta$InterestEntity;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.ArrayList;
import qrd.l1;
import wkd.b;
import psb.c;
import com.google.gson.Gson;
import cjd.e;
import erd.o;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.view.View;
import jl5.w;
import android.text.TextPaint;

public final class f extends PresenterV2	// class@002796
{
    public TextView A;
    public PhotoDetailParam B;
    public BaseFragment C;
    public InterestManagementMeta D;
    public List E;
    public SlidePlayViewModel F;
    public int G;
    public int H;
    public int I;
    public final f$b J;
    public final f$c K;
    public final f$d L;
    public LinearLayout p;
    public TextView q;
    public SeekBar r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public SeekBar w;
    public TextView x;
    public TextView y;
    public TextView z;
    public static final int M;
    public static final int N;
    public static final f$a O;

    static {
       f.O = new f$a(null);
       f.M = a1.a(0x7f061e59);
       f.N = a1.a(0x7f061ff3);
    }
    public void f(){
       super();
       this.H = 1;
       this.J = new f$b(this);
       this.K = new f$c(this);
       this.L = new f$d(this);
    }
    public static final TextView P8(f p0){
       p0 = p0.A;
       if (p0 == null) {
          a.S("leftButton");
       }
       return p0;
    }
    public static final PhotoDetailParam R8(f p0){
       p0 = p0.B;
       if (p0 == null) {
          a.S("mDetailParam");
       }
       return p0;
    }
    public static final BaseFragment S8(f p0){
       p0 = p0.C;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final List V8(f p0){
       p0 = p0.E;
       if (p0 == null) {
          a.S("mInterestList");
       }
       return p0;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, f.class, "3")) {
          return;
       }
       f tC = this.C;
       String str = "mFragment";
       if (tC == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tC.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
       this.F = slidePlayVie;
       tC = this.B;
       if (tC == null) {
          a.S("mDetailParam");
       }
       PhotoDetailParam mPhoto = tC.mPhoto;
       a.o(mPhoto, "mDetailParam.mPhoto");
       InterestManagementFeed interestMana = mPhoto.getEntity().a(InterestManagementFeed.class);
       if (interestMana != null) {
          objArray = interestMana.mInterestManagementMeta;
       }
       if (objArray != null) {
          InterestManagementMeta mInterestEnt = interestMana.mInterestManagementMeta.mInterestEntityList;
          if (mInterestEnt != null && mInterestEnt.size() >= 2) {
             f tF = this.F;
             if (tF == null) {
                a.S("mSlidePlayViewModel");
             }
             f tC1 = this.C;
             if (tC1 == null) {
                a.S(str);
             }
             tF.P(tC1, this.J);
             InterestManagementFeed mInterestMan = interestMana.mInterestManagementMeta;
             a.o(mInterestMan, "feed.mInterestManagementMeta");
             this.D = mInterestMan;
             String str1 = "mInterestMeta";
             if (mInterestMan == null) {
                a.S(str1);
             }
             mInterestEnt = mInterestMan.mInterestEntityList;
             a.o(mInterestEnt, "mInterestMeta.mInterestEntityList");
             this.E = mInterestEnt;
             this.W8();
             this.c9();
             tF = this.r;
             if (tF == null) {
                a.S("firstCardSeekbar");
             }
             tF.setOnSeekBarChangeListener(this.K);
             tF = this.s;
             if (tF == null) {
                a.S("firstCardProgressDecreaseText");
             }
             f tD = this.D;
             if (tD == null) {
                a.S(str1);
             }
             tF.setText(tD.mDecreaseOptionText);
             tF = this.t;
             if (tF == null) {
                a.S("firstCardProgressDefaultText");
             }
             tD = this.D;
             if (tD == null) {
                a.S(str1);
             }
             tF.setText(tD.mDefaultOptionText);
             tF = this.u;
             if (tF == null) {
                a.S("firstCardProgressIncreaseText");
             }
             tD = this.D;
             if (tD == null) {
                a.S(str1);
             }
             tF.setText(tD.mIncreaseOptionText);
             this.e9();
             tF = this.w;
             if (tF == null) {
                a.S("secondCardSeekbar");
             }
             tF.setOnSeekBarChangeListener(this.L);
             tF = this.x;
             if (tF == null) {
                a.S("secondCardProgressDecreaseText");
             }
             tD = this.D;
             if (tD == null) {
                a.S(str1);
             }
             tF.setText(tD.mDecreaseOptionText);
             tF = this.y;
             if (tF == null) {
                a.S("secondCardProgressDefaultText");
             }
             tD = this.D;
             if (tD == null) {
                a.S(str1);
             }
             tF.setText(tD.mDefaultOptionText);
             tF = this.z;
             if (tF == null) {
                a.S("secondCardProgressIncreaseText");
             }
             tD = this.D;
             if (tD == null) {
                a.S(str1);
             }
             tF.setText(tD.mIncreaseOptionText);
             tF = this.A;
             str = "leftButton";
             if (tF == null) {
                a.S(str);
             }
             tC1 = this.D;
             if (tC1 == null) {
                a.S(str1);
             }
             tF.setText(tC1.mChangeButtonText);
             tF = this.A;
             if (tF == null) {
                a.S(str);
             }
             tF.setOnClickListener(new f$e(this));
             this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new f$f(this), Functions.d()));
             PatchProxy.onMethodExit(f.class, "3");
             return;
          }
       }
       PatchProxy.onMethodExit(f.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "13")) {
          return;
       }
       f tp = this.p;
       if (tp == null) {
          a.S("cardsContainer");
       }
       tp.animate().cancel();
       tp = this.F;
       if (tp == null) {
          a.S("mSlidePlayViewModel");
       }
       f tC = this.C;
       if (tC == null) {
          a.S("mFragment");
       }
       tp.D(tC, this.J);
       PatchProxy.onMethodExit(f.class, "13");
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "12")) {
          return;
       }
       int i = -1820879758;
       b uob = d.a(i);
       a.o(uob, "PluginManager.get\(InterestEditPlugin::class.java\)");
       Map map = uob.K10();
       if (map != null) {
          if (map.isEmpty()) {
             PatchProxy.onMethodExit(f.class, "12");
             return;
          }else {
             f tE = this.E;
             if (tE == null) {
                a.S("mInterestList");
             }
             Iterator iterator = tE.iterator();
             while (iterator.hasNext()) {
                InterestManagementMeta$InterestEntity interestEnti = iterator.next();
                if (map.get(interestEnti.mId) != null) {
                   interestEnti.mUpdatedWeight = map.get(interestEnti.mId);
                }
             }
             d.a(i).clearCache();
          }
       }
       PatchProxy.onMethodExit(f.class, "12");
       return;
    }
    public final int X8(int p0){
       if (p0 <= 25) {
          p0 = 0;
       }else if(p0 <= 75){
          p0 = 50;
       }else {
          p0 = 100;
       }
       return p0;
    }
    public final int Y8(int p0){
       f obj;
       if (PatchProxy.isSupport2(f.class, "9")) {
          obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, f.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = p0 + 2;
       obj = this.E;
       if (obj == null) {
          a.S("mInterestList");
       }
       if (p0 >= obj.size()) {
          obj = this.E;
          if (obj == null) {
             a.S("mInterestList");
          }
          p0 = p0 - obj.size();
       }
       PatchProxy.onMethodExit(f.class, "9");
       return p0;
    }
    public final int Z8(int p0){
       int i = 100;
       if (p0 != 50) {
          if (p0 != i) {
             i = -100;
          }
       }else {
          i = 0;
       }
       return i;
    }
    public final void a9(InterestManagementMeta$InterestEntity p0,int p1){
       int i;
       if (PatchProxy.isSupport2(f.class, "4") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, f.class, "4")) {
          return;
       }
       InterestManagementMeta$InterestEntity mUpdatedWeig = p0.mUpdatedWeight;
       if (mUpdatedWeig != null) {
          a.o(mUpdatedWeig, "entity.mUpdatedWeight");
          i = mUpdatedWeig.intValue();
       }else {
          i = p0.mWeight;
       }
       if (p1 != i) {
          p0.mUpdatedWeight = Integer.valueOf(p1);
          mUpdatedWeig = p0.mId;
          a.o(mUpdatedWeig, "entity.mId");
          if (!PatchProxy.isSupport2(f.class, "11") || !PatchProxy.applyVoidTwoRefsWithListener(mUpdatedWeig, Integer.valueOf(p1), this, f.class, "11")) {
             ArrayList uArrayList = new ArrayList();
             InterestManagementMeta$InterestEntity interestEnti = new InterestManagementMeta$InterestEntity();
             interestEnti.mId = mUpdatedWeig;
             interestEnti.mWeight = p1;
             uArrayList.add(interestEnti);
             this.X7(b.a(0x1e7ef171).m(new Gson().q(uArrayList)).retry(1).map(new e()).subscribe(Functions.d(), Functions.d()));
             PatchProxy.onMethodExit(f.class, "11");
          }
          Log.b("cuijiaming", "updateCardData"+p0);
       }
       PatchProxy.onMethodExit(f.class, "4");
       return;
    }
    public final void b9(InterestManagementMeta$InterestEntity p0,SeekBar p1,TextView p2,TextView p3,TextView p4,TextView p5){
       int i1;
       int i = 0;
       if (PatchProxy.isSupport2(f.class, "7")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, f.class, "7")) {
             return;
          }
       }
       p2.setText(p0.mName);
       InterestManagementMeta$InterestEntity mUpdatedWeig = p0.mUpdatedWeight;
       if (mUpdatedWeig != null) {
          a.o(mUpdatedWeig, "entity.mUpdatedWeight");
          i1 = mUpdatedWeig.intValue();
       }else {
          p0 = p0.mWeight;
       }
       if (i1 > null) {
          i = 100;
       }else if(i1 < null){
          i = 50;
       }
       p1.setProgress(i);
       this.d9(i1, p3, p4, p5);
       PatchProxy.onMethodExit(f.class, "7");
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "5")) {
          return;
       }
       f tE = this.E;
       if (tE == null) {
          a.S("mInterestList");
       }
       Object obj = tE.get(this.G);
       f tr = this.r;
       if (tr == null) {
          a.S("firstCardSeekbar");
       }
       f tq = this.q;
       if (tq == null) {
          a.S("firstCardTitle");
       }
       f ts = this.s;
       if (ts == null) {
          a.S("firstCardProgressDecreaseText");
       }
       f tt = this.t;
       if (tt == null) {
          a.S("firstCardProgressDefaultText");
       }
       f tu = this.u;
       if (tu == null) {
          a.S("firstCardProgressIncreaseText");
       }
       this.b9(obj, tr, tq, ts, tt, tu);
       PatchProxy.onMethodExit(f.class, "5");
       return;
    }
    public final void d9(int p0,TextView p1,TextView p2,TextView p3){
       if (PatchProxy.isSupport2(f.class, "8") && PatchProxy.applyVoidFourRefsWithListener(Integer.valueOf(p0), p1, p2, p3, this, f.class, "8")) {
          return;
       }
       int m = f.M;
       p1.setTextColor(m);
       p2.setTextColor(m);
       p3.setTextColor(m);
       if (p0 != -100) {
          if (p0) {
             if (p0 == 100) {
                p3.setTextColor(f.N);
             }
          }else {
             p2.setTextColor(f.N);
          }
       }else {
          p1.setTextColor(f.N);
       }
       PatchProxy.onMethodExit(f.class, "8");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "1")) {
          return;
       }
       View view = w.a(p0, R.id.interest_cards_container);
       a.o(view, "bindWidget\(rootView, R.i¡­interest_cards_container\)");
       this.p = view;
       view = w.a(p0, R.id.interest_first_card_title);
       a.o(view, "bindWidget\(rootView, R.i¡­nterest_first_card_title\)");
       this.q = view;
       if (view == null) {
          a.S("firstCardTitle");
       }
       TextPaint paint = view.getPaint();
       a.o(paint, "firstCardTitle.paint");
       boolean b = true;
       paint.setFakeBoldText(b);
       view = w.a(p0, R.id.interest_first_card_progress);
       a.o(view, "bindWidget\(rootView, R.i¡­rest_first_card_progress\)");
       this.r = view;
       view = w.a(p0, R.id.interest_first_card_decrease);
       a.o(view, "bindWidget\(rootView, R.i¡­rest_first_card_decrease\)");
       this.s = view;
       view = w.a(p0, R.id.interest_first_card_default);
       a.o(view, "bindWidget\(rootView, R.i¡­erest_first_card_default\)");
       this.t = view;
       view = w.a(p0, R.id.interest_first_card_increase);
       a.o(view, "bindWidget\(rootView, R.i¡­rest_first_card_increase\)");
       this.u = view;
       view = w.a(p0, R.id.interest_second_card_title);
       a.o(view, "bindWidget\(rootView, R.i¡­terest_second_card_title\)");
       this.v = view;
       if (view == null) {
          a.S("secondCardTitle");
       }
       paint = view.getPaint();
       a.o(paint, "secondCardTitle.paint");
       paint.setFakeBoldText(b);
       view = w.a(p0, R.id.interest_second_card_progress);
       a.o(view, "bindWidget\(rootView, R.i¡­est_second_card_progress\)");
       this.w = view;
       view = w.a(p0, R.id.interest_second_card_decrease);
       a.o(view, "bindWidget\(rootView, R.i¡­est_second_card_decrease\)");
       this.x = view;
       view = w.a(p0, R.id.interest_second_card_default);
       a.o(view, "bindWidget\(rootView, R.i¡­rest_second_card_default\)");
       this.y = view;
       view = w.a(p0, R.id.interest_second_card_increase);
       a.o(view, "bindWidget\(rootView, R.i¡­est_second_card_increase\)");
       this.z = view;
       p0 = w.a(p0, R.id.interest_left_button);
       a.o(p0, "bindWidget\(rootView, R.id.interest_left_button\)");
       this.A = p0;
       if (p0 == null) {
          a.S("leftButton");
       }
       TextPaint paint1 = p0.getPaint();
       a.o(paint1, "leftButton.paint");
       paint1.setFakeBoldText(b);
       f tr = this.r;
       if (tr == null) {
          a.S("firstCardSeekbar");
       }
       tr.setSaveEnabled(false);
       tr = this.w;
       if (tr == null) {
          a.S("secondCardSeekbar");
       }
       tr.setSaveEnabled(false);
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "6")) {
          return;
       }
       f tE = this.E;
       if (tE == null) {
          a.S("mInterestList");
       }
       Object obj = tE.get(this.H);
       f tw = this.w;
       if (tw == null) {
          a.S("secondCardSeekbar");
       }
       f tv = this.v;
       if (tv == null) {
          a.S("secondCardTitle");
       }
       f tx = this.x;
       if (tx == null) {
          a.S("secondCardProgressDecreaseText");
       }
       f ty = this.y;
       if (ty == null) {
          a.S("secondCardProgressDefaultText");
       }
       f tz = this.z;
       if (tz == null) {
          a.S("secondCardProgressIncreaseText");
       }
       this.b9(obj, tw, tv, tx, ty, tz);
       PatchProxy.onMethodExit(f.class, "6");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "2")) {
          return;
       }
       Object obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.B = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.C = obj;
       PatchProxy.onMethodExit(f.class, "2");
       return;
    }
}
