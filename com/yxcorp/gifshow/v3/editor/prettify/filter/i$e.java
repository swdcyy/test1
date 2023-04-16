package com.yxcorp.gifshow.v3.editor.prettify.filter.i$e;
import d1c.e;
import com.yxcorp.gifshow.v3.editor.prettify.filter.i;
import java.lang.Object;
import android.view.View;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import k2b.s$b;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import k2b.s$d;
import k2b.s$a;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.log.EditFunnel;
import java.util.Objects;
import android.util.SparseArray;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import j16.b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$d;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$f;
import com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace$Type;
import lnc.a1;
import rsc.e;
import com.yxcorp.gifshow.prettify.filter.repo.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import voc.o;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import usc.n;
import com.yxcorp.gifshow.v3.editor.prettify.filter.j;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import msd.l;
import com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import java.util.Iterator;
import java.util.List;
import o1c.w0;
import d1c.d;
import com.kwai.feature.post.api.componet.prettify.filter.model.RecoFilterGroup;
import o0c.f;
import k2b.e0;
import o1c.x0;

public class i$e implements e	// class@001175
{
    public final i b;

    public void i$e(i p0){
       this.b = p0;
       super();
    }
    public void D0(View p0,int p1,FilterConfig p2){
       if (PatchProxy.isSupport(i$e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, i$e.class, "2")) {
          return;
       }
       if (this.b.W8() != null && this.b.p.rh()) {
          this.b.W8().f(true);
          this.b.W8().g(p0, new s$d(p2.mFilterName, p1, p2.getDisplayName()));
       }
       return;
    }
    public void J(){
    }
    public void K(FilterConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$e.class, "3")) {
          return;
       }
       i$e tb = this.b;
       tb.J[0] = p0;
       if (p0.mFilterId == tb.K) {
          tb.L = p0.mIntensity;
       }
       tb.I.onNext(p0);
       Objects.requireNonNull(EditFunnel.a);
       return;
    }
    public void L(SparseArray p0){
    }
    public void Q0(int p0,FilterConfig p1,a0 p2){
       i j;
       object oobject1;
       i$e uoe1;
       i oi1;
       i$e tb;
       BaseEditor$EditorShowMode this;
       FilterConfig uFilterConfi;
       i oi = i.class;
       i$e uoe = i$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, i$e.class, "1")) {
          return;
       }
       object oobject = this.b.J[2];
       if (!PatchProxy.applyVoidOneRefs(oobject, this, uoe, "6")) {
          float f = 0xbf800000;
          if (this.b.L - f && (oobject != null && !oobject.isEmptyFilter())) {
             uFilterConfi = this.a(oobject.mFilterId);
             if (uFilterConfi != null) {
                uoe = this.b;
                uFilterConfi.mIntensity = uoe.L;
                uoe.K = -3;
                uoe.L = f;
             }
          }
       }
       String str = "FilterEditorPresenterV2";
       boolean b = true;
       if (p2.d()) {
          b uob = null;
          if (p1.isEmptyFilter()) {
             j = this.b.J;
             if (j[0] != null) {
                oobject1 = j[0];
                if (oobject1 != null && !n.l(oobject1)) {
                   Object[] objArray = new Object[0];
                   a.D().w(str, "select filterConfig notExist id = "+oobject1.mDisplayName, objArray);
                   n.e(oobject1, uob);
                   return;
                }else {
                   this.b(oobject1, a0.i());
                }
             }
          }else {
             uFilterConfi = this.a(p1.mFilterId);
             if (uFilterConfi != null) {
                if (!n.l(uFilterConfi)) {
                   n.e(uFilterConfi, uob);
                   return;
                }else {
                   tb = this.b;
                   tb.K = uFilterConfi.mFilterId;
                   tb.L = uFilterConfi.mIntensity;
                   uFilterConfi.mIntensity = p1.mIntensity;
                   p1[p2.a()] = uFilterConfi;
                   p1 = uFilterConfi;
                }
             }else {
                this.Q0(-1, FilterConfig.getEmpty(), a0.h());
                return;
             }
          }
          uoe1 = 1;
          oi1 = null;
       }else if(p2.e()){
          this.b(p1, p2);
       }
       uoe1 = null;
       oi1 = 1;
       tb = this.b;
       this = BaseEditor$EditorShowMode.SHOW_BACKGROUND;
       boolean b1 = (tb.G == this)? true: false;
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(oi) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), tb, oi, "12") && b1)) {
          tb.w.c0();
          if (tb.X8() == Workspace$Type.PHOTO_MOVIE) {
             tb.v.c0();
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().w(str, "EditOnItemSelect : "+oobject1.mFilterName, objArray1);
       uoe = this.b;
       i h = uoe.H;
       if (h != null && (h.mFilterId == oobject1.mFilterId || uoe.G == BaseEditor$EditorShowMode.SHOW_FOREGROUND)) {
          if (oi1) {
             oi1 = uoe.N;
             if (oi1 != null) {
                oi1.e(oobject1.getDisplayName(), a1.p(R.string.arg_RES_7f103c1b));
             }
          }
          if (this.b.M.f() != oobject1 || !uoe1) {
             this.b.c9(oobject1);
          }
          if (uoe1) {
             this.b.M.o(oobject1);
          }
          this.b.Y8(oobject1, 0);
       }
       uoe1 = this.b;
       if (uoe1.G != this) {
          b = false;
       }
       Objects.requireNonNull(uoe1);
       if (PatchProxy.isSupport(oi) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uoe1, oi, "13") && b)) {
          uoe1.w.f();
          if (uoe1.X8() == Workspace$Type.PHOTO_MOVIE) {
             uoe1.v.f();
          }
       }
       uoe1 = this.b;
       uoe1.B.b(uoe1.p.kh().x().e());
       VideoContextDraftExtKt.b(this.b.p.kh().x().e(), this.b.u, j.b);
       return;
    }
    public final FilterConfig a(int p0){
       j obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i$e uoe = i$e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.b.A.getAdapter();
       FilterConfig uFilterConfi = null;
       if (obj != null) {
          j oj = j.class;
          if (PatchProxy.isSupport(oj)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, oj, "4");
             if (obj1 != patchProxyRe) {
                uFilterConfi = obj1;
             }
          }
          j g = obj.g;
          if (g != null) {
             Iterator iterator = g.iterator();
             while (iterator.hasNext()) {
                FilterConfig uFilterConfi1 = iterator.next().a();
                if (uFilterConfi1.mFilterId == p0 && !uFilterConfi1.isDivider()) {
                   uFilterConfi = uFilterConfi1;
                   break ;
                }
             }
          }
       }
       return uFilterConfi;
    }
    public final void b(FilterConfig p0,a0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$e.class, "7")) {
          return;
       }
       this.b.J[p1.a()] = p0;
       i j = this.b.J;
       j[2] = null;
       j[3] = null;
       return;
    }
    public void i(){
       d.f(this);
    }
    public void o1(FilterConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$e.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!p0 instanceof RecoFilterGroup) {
          x0.g(p0, null, this.b.C);
       }
       return;
    }
    public void q(){
       d.g(this);
    }
}
