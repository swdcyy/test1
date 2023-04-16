package com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.h;
import com.smile.gifmaker.mvps.presenter.a;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.BitSet;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.h$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.h$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.b;
import t45.d;
import brd.z;
import g5b.i;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g5b.d;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.f;
import g5b.f;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.g;
import g5b.e;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.c;
import io.reactivex.android.schedulers.a;
import g5b.h;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.d;
import fw8.r;
import fw8.r$a;
import t4b.i;
import g5b.g;
import eoc.f;
import s5b.b;
import q87.c;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import java.lang.Float;
import java.lang.Boolean;
import uyb.c$a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.Map;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.MagicEmoji$a;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Iterator;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar;
import android.view.View;
import android.util.Pair;
import mrd.a;
import com.yxcorp.utility.n;
import j4b.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collection;
import ekd.m1;
import android.view.ViewStub;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import unc.d;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.MagicSeekbarSwitcher;
import g5b.c;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import g5b.k;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar$a;
import a2.i0;
import android.view.ViewTreeObserver;
import g5b.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Integer;
import java.util.Objects;
import android.widget.TextView;
import lnc.a1;

public class h extends a	// class@001c0f
{
    public c$a A;
    public PublishSubject B;
    public a C;
    public View D;
    public PrettifyDoubleSeekBar E;
    public MagicSeekbarSwitcher F;
    public MagicSeekbarSwitcher G;
    public MagicEmoji$SeekBarType H;
    public MagicEmoji$SeekBarType I;
    public MagicEmoji$SeekBarType J;
    public boolean K;
    public final Map L;
    public final Map M;
    public MagicEmoji$MagicFace N;
    public boolean O;
    public boolean P;
    public final BitSet Q;
    public final Runnable R;
    public final r$a S;
    public ViewStub r;
    public View s;
    public View t;
    public MagicEmojiFragment$Source u;
    public a v;
    public PublishSubject w;
    public MagicEmojiPageConfig x;
    public PublishSubject y;
    public PublishSubject z;
    public static final int T;

    public void h(){
       super();
       this.z = PublishSubject.g();
       this.K = false;
       this.L = new HashMap();
       this.M = new HashMap();
       this.Q = new BitSet();
       this.R = new h$a(this);
       this.S = new h$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.Q.set(0);
       this.X7(b.a().observeOn(d.a).subscribe(new i(this), e.b));
       this.X7(this.v.subscribe(new d(this), f.b));
       this.X7(this.w.subscribe(new f(this), g.b));
       this.X7(this.z.subscribe(new e(this), c.b));
       h tB = this.B;
       if (tB != null) {
          this.X7(tB.observeOn(a.c()).subscribe(new h(this), d.b));
       }
       r.c().a(this.S);
       this.X7(f.a(i.class, new g(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().s("MagicEmojiSeekBar", "onUnbind", objArray);
       r.c().g(this.S);
       this.Z8();
       return;
    }
    public final void R8(float p0,MagicEmoji$SeekBarType p1,boolean p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), p1, Boolean.valueOf(p2), this, h.class, "35")) {
          return;
       }
       h tA = this.A;
       if (tA != null) {
          tA.c(p0, p1, p2);
       }
       return;
    }
    public final void S8(){
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "11")) {
          return;
       }
       h tN = this.N;
       if (tN == null) {
          return;
       }
       SimpleMagicFace mId = tN.mId;
       if (!PatchProxy.applyVoidOneRefs(mId, this, oh, "25")) {
          Map map = this.L.get(mId);
          if (map != null && map.size() > 0) {
             map.remove(MagicEmoji$SeekBarType.LOOKUP);
             if (!map.size()) {
                this.L.remove(mId);
             }
          }
          this.d9(mId, MagicEmoji$SeekBarType.LOOKUP);
       }
       this.N.clearSeekBarConfig();
       return;
    }
    public final void V8(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().s("MagicEmojiSeekBar", "doApplyEffectIntensity "+p0, objArray);
       if (this.A == null || (p0 != null && this.N != null)) {
          HashMap seekBarConfi = p0.getSeekBarConfigs();
          if (seekBarConfi == null) {
             return;
          }else {
             Map map = this.L.get(p0.mId);
             h tH = this.H;
             this.l9(map, p0.mId, tH, seekBarConfi.get(tH));
             h tI = this.I;
             this.l9(map, p0.mId, tI, seekBarConfi.get(tI));
             this.m9();
          }
       }
       return;
    }
    public final Map W8(){
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, this, h.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.L.size()) {
          return objArray;
       }
       obj = new HashMap();
       Iterator iterator = this.L.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Float uFloat = this.L.get(str).get(MagicEmoji$SeekBarType.SLIMMING);
          if (uFloat == null) {
             uFloat = this.L.get(str).get(MagicEmoji$SeekBarType.MAKEUP);
          }
          if (uFloat != null) {
             obj.put(str, uFloat);
          }
       }
       return obj;
    }
    public MagicEmoji$a X8(MagicEmoji$SeekBarType p0){
       h obj = PatchProxy.applyOneRefs(p0, this, h.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N;
       if (obj == null || obj.getSeekBarConfigs() == null) {
          return null;
       }
       return this.N.getSeekBarConfigs().get(p0);
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, h.class, "30")) {
          return;
       }
       int i = 0;
       if (this.X8(this.J) == null) {
          Object[] objArray = new Object[i];
          b.D().w("MagicEmojiSeekBar", "SeekBar config is null during progress change", objArray);
          this.R8(((float)this.E.getProgress() / (float)this.E.getMaxProgress()), this.J, this.K);
       }else {
          float f = (float)this.E.getProgress() / (float)this.E.getMaxProgress();
          h tJ = this.J;
          if (this.K != null || this.X8(tJ).a()) {
             i = true;
          }
          this.R8(f, tJ, i);
       }
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, h.class, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().s("MagicEmojiSeekBar", "hideSeekBarAndSaveConfig", objArray);
       h tD = this.D;
       if (tD != null) {
          int i = 8;
          tD.setVisibility(i);
          tD = this.E;
          if (tD != null) {
             tD.setVisibility(i);
          }
          this.C.onNext(new Pair("SEEK_BAR_SHOW_EVENT", Boolean.FALSE));
       }
       this.S8();
       this.N = null;
       MagicEmoji$SeekBarType uNKNOWN = MagicEmoji$SeekBarType.UNKNOWN;
       this.I = uNKNOWN;
       this.H = uNKNOWN;
       if (this.O != null) {
          b.b(this.W8());
          this.O = false;
       }
       this.P = false;
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, h.class, "29")) {
          return;
       }
       n.Y(this.E, 8, false);
       this.C.onNext(new Pair("SEEK_BAR_SHOW_EVENT", Boolean.FALSE));
       if (this.O != null) {
          b.b(this.W8());
          this.O = false;
       }
       return;
    }
    public final boolean b9(String p0,MagicEmoji$SeekBarType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Map map = this.M.get(p0);
       boolean b = false;
       if (map == null) {
          return b;
       }
       if (map.get(p1) != null) {
          b = true;
       }
       return b;
    }
    public final void c9(c p0){
       c b;
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "7")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "MagicEmojiSeekBar";
       b.D().s(str, "onEffectDescriptionUpdated", objArray);
       b = p0.b;
       Map map = (b == null)? null: b.getSeekBarConfigs();
       if (map == null || map.isEmpty()) {
          this.Z8();
          return;
       }else {
          h tN = this.N;
          if (tN != null && TextUtils.equals(tN.mId, p0.b.mId)) {
             Object[] objArray1 = new Object[i];
             b.D().w(str, "onEffectDescriptionUpdated select the same Magic", objArray1);
             this.V8(this.N);
             return;
          }else if(map.size() > 1){
             this.H = MagicEmoji$SeekBarType.MAKEUP;
             MagicEmoji$SeekBarType lOOKUP = MagicEmoji$SeekBarType.LOOKUP;
             this.I = lOOKUP;
             c b1 = p0.b;
             if (!PatchProxy.applyVoidTwoRefs(b1, map, this, oh, "8") && b1 != null) {
                SimpleMagicFace mId = b1.mId;
                Map map1 = this.L.get(mId);
                if (map1 == null) {
                   map1 = new HashMap();
                }
                if (map.get(lOOKUP) != null) {
                   map1.put(lOOKUP, Float.valueOf(map.get(lOOKUP).b()));
                }
                if (this.L.get(mId) == null) {
                   this.L.put(mId, map1);
                }
             }
          }else {
             this.H = map.values().iterator().next().d();
             this.I = MagicEmoji$SeekBarType.UNKNOWN;
          }
          this.J = this.H;
          this.S8();
          this.N = p0.b;
          MagicEmoji$SeekBarType mAKEUP = MagicEmoji$SeekBarType.MAKEUP;
          if (this.J == mAKEUP) {
             MagicEmoji$a uoa = this.X8(mAKEUP);
             if (uoa == null) {
                return;
             }else if(uoa.i != null){
                h tA = this.A;
                if (tA != null) {
                   tA.d();
                }else {
                   this.k9();
                }
             }else {
                this.k9();
             }
          }else {
             this.k9();
          }
          return;
       }
    }
    public void d9(String p0,MagicEmoji$SeekBarType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().s("MagicEmojiSeekBar", "remove disable "+p1, objArray);
       Map map = this.M.get(p0);
       if (map == null) {
          return;
       }
       map.remove(p1);
       if (!map.size()) {
          this.M.remove(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a444e);
       this.s = m1.f(p0, 0x7f0a3caf);
       this.r = m1.f(p0, 0x7f0a380c);
       return;
    }
    public void e9(String p0,MagicEmoji$SeekBarType p1,float p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, h.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().s("MagicEmojiSeekBar", "disable "+p1+", "+p2, objArray);
       Map map = this.M.get(p0);
       if (map == null) {
          map = new HashMap();
       }
       map.put(p1, Float.valueOf(p2));
       this.M.put(p0, map);
       return;
    }
    public void h9(String p0,MagicEmoji$SeekBarType p1,float p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, h.class, "14")) {
          return;
       }
       Map map = this.L.get(p0);
       if (map == null) {
          map = new HashMap();
       }
       MagicEmoji$SeekBarType sLIMMING = MagicEmoji$SeekBarType.SLIMMING;
       if (p1 == sLIMMING) {
          map.clear();
       }else if(p1 == MagicEmoji$SeekBarType.MAKEUP){
          map.remove(sLIMMING);
       }
       map.put(p1, Float.valueOf(p2));
       this.L.put(p0, map);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.u = this.r8("SOURCE");
       this.v = this.r8("EFFECT_DESCRIPTION_UPDATEED_EVENT");
       this.w = this.r8("SELECTED_MAGIC_PUBLISHER");
       this.x = this.r8("MAGIC_EMOJI_PAGE_CONFIG");
       this.y = this.r8("ON_HIDDEN_CAHNGED_EVENT");
       this.z = this.r8("MAGIC_FACE_UNSELECTED_EVENT");
       this.A = this.t8("MAGIC_EMOJI_CALLBACK");
       this.B = this.r8("GENDER_DETECTION_RESULT_PUBLISHER");
       this.C = this.r8("EXTRA_BUTTONS_SHOW_EVENT");
       return;
    }
    public void j9(boolean p0,MagicEmoji$a p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oh, "31")) {
          return;
       }
       if (p1 != null && p1.d() == MagicEmoji$SeekBarType.SLIMMING) {
          int i = (p0)? 0: 4;
          n.W(this.t, i, 200);
          if (this.u != MagicEmojiFragment$Source.STORY) {
             n.W(this.s, i, 200);
          }
       }
    label_0037 :
       return;
    }
    public final void k9(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "10")) {
          return;
       }
       String str = "MagicEmojiSeekBar";
       if (!PatchProxy.applyVoid(objArray, this, oh, "27")) {
          this.Q.clear(false);
          int i = 8;
          if (this.D != null) {
             this.E.setVisibility(i);
             if (this.Q.isEmpty()) {
                this.D.setVisibility(false);
             }
          }else {
             Object[] objArray2 = new Object[false];
             b.D().w(str, "showSeekBar by inflate", objArray2);
             View view = this.r.inflate();
             this.D = view;
             d.b(view);
             this.F = this.D.findViewById(0x7f0a380b);
             this.G = this.D.findViewById(0x7f0a380a);
             PrettifyDoubleSeekBar prettifyDoub = this.D.findViewById(R.id.seek_bar);
             this.E = prettifyDoub;
             prettifyDoub.setupSeekBarMode(1);
             this.F.setOnClickListener(new c(this));
             this.E.setOnSeekBarChangeListener(new k(this));
             n.Y(this.E, i, false);
             if (!this.Q.isEmpty()) {
                this.D.setVisibility(4);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "12")) {
          h tH = this.H;
          if (!PatchProxy.applyVoidOneRefs(tH, this, oh, "13")) {
             MagicEmoji$a uoa = this.X8(tH);
             StringBuilder str1 = null;
             if (!this.b9(this.N.mId, tH)) {
                Map map = this.L.get(this.N.mId);
                if (map != null) {
                   objArray = map.get(tH);
                }
                if (objArray != null && objArray.floatValue() - str1 >= 0) {
                   if (!objArray.floatValue() - str1 && (tH != MagicEmoji$SeekBarType.MAKEUP && tH != MagicEmoji$SeekBarType.SLIMMING)) {
                      objArray = Float.valueOf(uoa.c());
                   }
                label_00fa :
                   uoa.g(objArray.floatValue(), false);
                   this.R8(objArray.floatValue(), tH, false);
                }else if(tH == MagicEmoji$SeekBarType.MAKEUP && this.P != null){
                   Float uFloat = Float.valueOf(uoa.e);
                   Object[] objArray1 = new Object[false];
                   b.D().w(str, "adapt for male, default change to "+uFloat, objArray1);
                   uoa.g(uFloat.floatValue(), false);
                   this.R8(uFloat.floatValue(), tH, false);
                }
             }else {
                uoa.g(str1, false);
                this.h9(this.N.mId, tH, str1);
                this.R8(str1, tH, false);
             }
          }
       }
       this.m9();
       return;
    }
    public final void l9(Map p0,String p1,MagicEmoji$SeekBarType p2,MagicEmoji$a p3){
       Float uFloat;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, h.class, "6")) {
          return;
       }
       if (p3 == null) {
          return;
       }
       float f = p3.b();
       MagicEmoji$a b = p3.b;
       float f1 = 0xbf800000;
       if (b - f1) {
          p3.a = b;
       }
       p3.b = f1;
       if (!p3.b() && f) {
          this.e9(p1, p2, f);
       }
       if (p3.e()) {
          if (!this.b9(p1, p2)) {
             this.e9(p1, p2, f);
          }
          return;
       }else if(p0 != null){
          uFloat = p0.get(p2);
       }else {
          uFloat = null;
       }
       if (uFloat == null) {
          return;
       }else {
          f = p3.b();
          if (f - uFloat.floatValue()) {
             if (p3.a()) {
                this.h9(p1, p2, f);
             }else {
                p3.g(uFloat.floatValue(), p3.f());
                this.R8(uFloat.floatValue(), p2, false);
             }
          }
          return;
       }
    }
    public final void m9(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "19")) {
          return;
       }
       if (this.E == null) {
          return;
       }
       MagicEmoji$a uoa = this.X8(this.J);
       int i = (int)(uoa.b() * (float)this.E.getMaxProgress());
       this.E.setProgress(i);
       this.E.setDefaultIndicatorProgress((int)(uoa.c() * (float)this.E.getMaxProgress()));
       MagicEmoji$SeekBarType mAKEUP = MagicEmoji$SeekBarType.MAKEUP;
       if (uoa.d() == mAKEUP || uoa.d() == MagicEmoji$SeekBarType.LOOKUP) {
          this.E.l();
          h tF = this.F;
          int i1 = (uoa.d() == mAKEUP)? 0x7f10318a: 0x7f103c1b;
          tF.setText(i1);
          this.G.setVisibility(8);
          this.n9(i);
       }else if(uoa.d() == MagicEmoji$SeekBarType.SLIMMING){
          this.F.setText(R.string.arg_RES_7f103165);
          this.G.setVisibility(8);
          this.n9(i);
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "20") && !this.F.Q()) {
          if (i0.Y(this.F) && (this.I == MagicEmoji$SeekBarType.UNKNOWN || i0.Y(this.G))) {
             this.o9(false);
          }else {
             this.F.getViewTreeObserver().addOnGlobalLayoutListener(new j(this));
          }
       }
       this.E.setEnabled((uoa.e() ^ 0x01));
       if (!PatchProxy.applyVoid(objArray, this, oh, "33")) {
          MagicEmoji$a uoa1 = this.X8(this.H);
          if (uoa1 != null) {
             this.F.setEnabled((uoa1.e() ^ 0x01));
          }
          uoa1 = this.X8(this.I);
          if (uoa1 != null) {
             this.G.setEnabled((uoa1.e() ^ 0x01));
          }
       }
       return;
    }
    public void n9(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "32")) {
          return;
       }
       boolean b = true;
       if (this.J == this.H) {
          oh = this.F;
          if (!p0) {
             b = false;
          }
          oh.setSelected(b);
          this.G.setSelected(false);
       }else {
          this.F.setSelected(false);
          oh = this.G;
          if (!p0) {
             b = false;
          }
          oh.setSelected(b);
       }
       return;
    }
    public void o9(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "34")) {
          return;
       }
       oh = this.F;
       int b = (this.J != this.H)? true: false;
       Objects.requireNonNull(oh);
       if (!PatchProxy.isSupport(MagicSeekbarSwitcher.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Boolean.valueOf(p0), oh, MagicSeekbarSwitcher.class, "2")) {
          if (b == oh.E) {
             int width = oh.B.getWidth();
             b = (oh.E != null)? 0: a1.e((float)R.dimen.arg_RES_7f070a77);
             if (oh.getWidth() != (width + b)) {
                if (oh.E != null) {
                   oh.L(false);
                }else {
                   oh.M(false);
                }
             }
          }else {
             oh.E = b;
             oh.F = true;
             if (!b) {
                oh.M(p0);
             }else {
                oh.L(p0);
             }
          }
       }
       this.G.setVisibility(8);
       return;
    }
}
