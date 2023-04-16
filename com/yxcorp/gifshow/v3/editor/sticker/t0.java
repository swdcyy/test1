package com.yxcorp.gifshow.v3.editor.sticker.t0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashSet;
import com.yxcorp.gifshow.v3.editor.sticker.t0$a;
import com.yxcorp.gifshow.v3.editor.sticker.t0$b;
import com.yxcorp.gifshow.v3.editor.sticker.q0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.sticker.r0;
import com.yxcorp.gifshow.v3.editor.sticker.s0;
import erd.g;
import crd.b;
import brd.t;
import android.view.View$OnClickListener;
import ekd.m1;
import ooc.g1;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$c;
import itc.r2;
import java.util.List;
import mrd.a;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$d;
import x59.e$d;
import android.view.ViewPropertyAnimator;
import itc.t2;
import java.lang.Runnable;
import itc.q2;
import com.kwai.robust.PatchProxyResult;
import itc.w2;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;
import im8.f;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;

public class t0 extends PresenterV2 implements g	// class@0012ab
{
    public EditorDelegate A;
    public int B;
    public String C;
    public f D;
    public Set E;
    public a F;
    public StickerLibraryFragment G;
    public boolean H;
    public boolean I;
    public final e$d J;
    public y K;
    public final e$c L;
    public View p;
    public View q;
    public View r;
    public View s;
    public View t;
    public boolean u;
    public BaseEditorFragment v;
    public List w;
    public Set x;
    public PublishSubject y;
    public a z;

    public void t0(){
       super();
       this.u = false;
       this.x = new HashSet();
       this.H = false;
       this.I = false;
       this.J = new t0$a(this);
       this.K = new t0$b(this);
       this.L = q0.a;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "3")) {
          return;
       }
       this.q.setVisibility(0);
       this.r.getLayoutParams().leftMargin = a1.e(65.00f);
       DisplayMetrics uDisplayMetr = c.c(this.getActivity().getResources());
       if (((float)uDisplayMetr.widthPixels / uDisplayMetr.xdpi) - 0x40200000 <= 0) {
          this.I = true;
       }
       this.x.add(this.L);
       this.X7(this.y.subscribe(new r0(this), s0.b));
       this.E.add(this.K);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t0.class, "4")) {
          return;
       }
       t0 tp = this.p;
       if (tp != null) {
          m1.a(tp, objArray, R.id.sticker_library);
       }
       this.E.remove(this.K);
       this.x.remove(this.L);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "5")) {
          return;
       }
       g1.v(this.B, this.C, "click_sticker_store");
       StickerLibraryFragment stickerLibra = new StickerLibraryFragment();
       this.G = stickerLibra;
       StickerLibraryFragment$c uoc = new StickerLibraryFragment$c(this.w, this.x, this.z, new r2(this));
       uoc.b(this.I);
       uoc.c(this.J);
       stickerLibra.Th(uoc);
       this.s.animate().translationY(0).setDuration(0).withEndAction(new t2(this)).start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t0.class, "2")) {
          return;
       }
       this.p = p0;
       this.t = m1.f(p0, 0x7f0a3ef6);
       this.s = m1.f(p0, 0x7f0a3b67);
       this.q = m1.f(p0, 0x7f0a3b66);
       this.r = m1.f(p0, 0x7f0a0a70);
       m1.a(p0, new q2(this), R.id.sticker_library);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new w2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, t0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(t0.class, new w2());
       }else {
          obj.put(t0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "1")) {
          return;
       }
       this.v = this.r8("FRAGMENT");
       this.w = this.t8("STICKER_GROUP_INFO");
       this.x = this.r8("STICKER_LISTENERS");
       this.y = this.r8("HIDE_STICKER_LIBRARY_EVENT");
       this.B = this.r8("VIDEO_EDIT_OPERATION_PACKAGE").intValue();
       this.C = this.r8("SUB_TYPE");
       this.D = this.x8("AUTO_SHOW_STICKER_LIBRARY");
       this.E = this.r8("EDITOR_VIEW_LISTENERS");
       this.F = this.r8("SELECT_STICKER_EVENT");
       this.z = this.r8("STICKER_REQUEST_EVENT");
       this.A = this.r8("EDITOR_DELEGATE");
       return;
    }
}
