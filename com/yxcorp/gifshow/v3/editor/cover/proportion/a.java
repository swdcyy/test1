package com.yxcorp.gifshow.v3.editor.cover.proportion.a;
import voc.y;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.LinkedHashSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import lnc.a1;
import kkd.b;
import java.lang.CharSequence;
import android.graphics.Paint;
import com.yxcorp.gifshow.v3.editor.cover.proportion.a$d;
import com.yxcorp.gifshow.v3.editor.cover.proportion.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverViewModel;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.cover.proportion.STATE;
import tyc.b2;
import tyc.n3;
import java.lang.Integer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import tpc.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import tyc.b2$a;
import android.graphics.Rect;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.widget.EditCoverSeekBar;
import java.lang.Float;
import com.yxcorp.gifshow.widget.EditCoverSeekBar$b;
import com.yxcorp.gifshow.widget.EditCoverSeekBar$a;
import tyc.s0;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.cover.proportion.a$c;
import java.lang.ref.WeakReference;
import voc.x;
import tyc.t0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.v3.editor.cover.proportion.a$a;

public final class a extends a implements y	// class@000eb7
{
    public EditCoverSeekBar$b c;
    public final Drawable d;
    public final Drawable e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final b j;
    public final b k;
    public final int l;
    public final float m;
    public final float n;
    public final a$d o;
    public final a$b p;
    public final Fragment q;
    public final EditorDelegate r;
    public final LinkedHashSet s;

    public void a(Fragment p0,View p1,EditorDelegate p2,LinkedHashSet p3){
       a.p(p0, "mFragment");
       a.p(p1, "mRootView");
       a.p(p2, "mEditorDelegate");
       a.p(p3, "mViewListeners");
       super(p1);
       this.q = p0;
       this.r = p2;
       this.s = p3;
       Drawable drawable = ContextCompat.getDrawable(a.b(), R.drawable.arg_RES_7f0808ea);
       this.d = drawable;
       Drawable drawable1 = ContextCompat.getDrawable(a.b(), R.drawable.arg_RES_7f0808e9);
       this.e = drawable1;
       Application b = a.B;
       a.o(b, "AppEnv.APP");
       Resources resources = b.getResources();
       a.o(resources, "AppEnv.APP.resources");
       float f = TypedValue.applyDimension(2, 8.00f, c.c(resources));
       this.f = f;
       Application b1 = a.B;
       a.o(b1, "AppEnv.APP");
       Resources resources1 = b1.getResources();
       a.o(resources1, "AppEnv.APP\n      .resources");
       this.g = TypedValue.applyDimension(1, 14.00f, c.c(resources1)) + (float)(a1.d(0x7f0702e3) * 2);
       this.h = a1.e(0);
       this.i = a1.e(0);
       b uob = new b(drawable, a1.p(0x7f100b7d), 0, f, -1);
       this.j = a1.e(0);
       b uob1 = new b(drawable1, a1.p(0x7f100b7d), 0, f, -1);
       this.k = a1.e(0);
       int i = a1.d(R.dimen.arg_RES_7f07030a);
       this.l = i;
       Paint paint = new Paint();
       paint.setTextSize(f);
       f = paint.measureText(a1.p(R.string.arg_RES_7f100b7d));
       this.m = f;
       this.n = f + (float)(i * 2);
       this.o = new a$d(this);
       this.p = new a$b(this);
    }
    public void B(){
       b2 value;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (this.D().r0()) {
          this.s.add(this);
          LiveData liveData = this.D().p0();
          if (liveData != null && liveData.getValue() == STATE.RUNNING) {
             a tr = this.r;
             if (!PatchProxy.applyVoidOneRefs(tr, this, uoa, "6")) {
                value = tr.F();
                if (value != null) {
                   String str = a1.p(R.string.arg_RES_7f100b7c);
                   a.o(str, "CommonUtil.string\(R.stri¡­_intellect_cover_loading\)");
                   a.p(str, "text");
                   value.b(new n3(objArray, objArray, str, objArray), true);
                }
             }
             liveData.observe(this.q, this.o);
          }
          LiveData liveData1 = this.D().q0();
          if (liveData1 != null) {
             if (liveData1.getValue() == null) {
                liveData1.observe(this.q, this.p);
             }else {
                value = liveData1.getValue();
                a.m(value);
                a.o(value, "this.value!!");
                this.F(value);
             }
          }
       }
       return;
    }
    public final RecommendCoverViewModel D(){
       ViewModel obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ViewModelProviders.of(this.r.q()).get(RecommendCoverViewModel.class);
       a.o(obj, "ViewModelProviders.of\(mE¡­verViewModel::class.java\)");
       return obj;
    }
    public final void E(EditorDelegate p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       b2 uob2 = p0.F();
       if (uob2 != null) {
          b2$a.a(uob2, false, 1, null);
       }
       return;
    }
    public final void F(a p0){
       EditCoverSeekBar uEditCoverSe1;
       EditCoverSeekBar$b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       int i = 0;
       this.j.setBounds(new Rect(i, i, (int)this.n, (int)this.g));
       this.k.setBounds(new Rect(i, i, (int)this.n, (int)this.g));
       Object[] objArray = new Object[i];
       a.D().w("RecommendCoverViewBinder", "showRecommendCoverInfo getScoreResult:  progress = "+p0.a(), objArray);
       EditCoverSeekBar uEditCoverSe = this.A().findViewById(R.id.seekBar);
       if (uEditCoverSe != null) {
          float f = p0.a();
          a ti = this.i;
          a th = this.h;
          a tj = this.j;
          a tk = this.k;
          a uoa = (tk != null)? tk: tj;
          if (PatchProxy.isSupport(EditCoverSeekBar.class)) {
             Object[] objArray1 = new Object[]{Float.valueOf(f),Integer.valueOf(ti),Integer.valueOf(th),tj,Integer.valueOf(i),uoa};
             uEditCoverSe1 = PatchProxy.apply(objArray1, uEditCoverSe, EditCoverSeekBar.class, "13");
             if (uEditCoverSe1 != PatchProxyResult.class) {
             }
          }
          if (tj.getBounds().isEmpty()) {
             uob = new EditCoverSeekBar$b(f, ti, th, tj, 0, uoa, null);
             uEditCoverSe.j = uEditCoverSe1;
          }
          uob = new EditCoverSeekBar$b(f, ti, th, tj, 0, uoa, null);
          uEditCoverSe.j = uEditCoverSe1;
          if (!PatchProxy.isSupport(EditCoverSeekBar.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), uEditCoverSe, EditCoverSeekBar.class, "15")) {
             uEditCoverSe.post(new s0(uEditCoverSe, f));
          }
          uEditCoverSe.invalidate();
          uEditCoverSe1 = uEditCoverSe.j;
       }else {
          uEditCoverSe1 = null;
       }
       this.c = uEditCoverSe1;
       if (uEditCoverSe1 != null) {
          a$c b = a$c.b;
          if (!PatchProxy.applyVoidOneRefs(b, uEditCoverSe1, EditCoverSeekBar$b.class, "1")) {
             uEditCoverSe1.j = new WeakReference(b);
          }
       }
       return;
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       EditCoverSeekBar$b a;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          return;
       }
       x.f(this);
       if (this.D().r0()) {
          LiveData liveData = this.D().p0();
          if (liveData != null) {
             liveData.removeObserver(this.o);
          }
          liveData = this.D().q0();
          if (liveData != null) {
             liveData.removeObserver(this.p);
          }
       }
       this.E(this.r);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          EditCoverSeekBar uEditCoverSe = this.A().findViewById(R.id.seekBar);
          if (uEditCoverSe != null) {
             a tc = this.c;
             if (!PatchProxy.applyVoidOneRefs(tc, uEditCoverSe, EditCoverSeekBar.class, "14") && tc == uEditCoverSe.j) {
                uEditCoverSe.j = objArray;
                if (tc != null) {
                   a = tc.a;
                   if (!PatchProxy.isSupport(EditCoverSeekBar.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(a), uEditCoverSe, EditCoverSeekBar.class, "16")) {
                      uEditCoverSe.post(new t0(uEditCoverSe, a));
                   }
                }
                uEditCoverSe.invalidate();
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, uoa, "9")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "RECOMMEND_COVER";
             uElementPack.type = 12;
             u1.u0(3, uElementPack, new ClientContent$ContentPackage());
          }
       }
       return;
    }
    public void O(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       x.e(this);
       this.A().post(new a$a(this));
       return;
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       x.a(this);
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       x.j(this);
    }
    public void z2(){
       x.c(this);
    }
}
