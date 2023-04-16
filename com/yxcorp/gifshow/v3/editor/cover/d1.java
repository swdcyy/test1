package com.yxcorp.gifshow.v3.editor.cover.d1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.v3.editor.cover.d1$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.v3.editor.cover.d1$b;
import t36.f;
import ooc.j0;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ppc.b1;
import erd.g;
import crd.b;
import java.lang.Boolean;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import wba.z;
import im8.f;
import x59.g;
import com.yxcorp.gifshow.v3.editor.cover.v0$a;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.cover.v0;
import qaa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wba.m;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.PictureCoverParam;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import com.kuaishou.edit.draft.Cover$Type;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import ppc.k;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.cover.y0;
import t36.f$a;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.cover.z0;
import android.util.Pair;
import java.io.File;
import qkd.b;
import java.lang.System;
import com.yxcorp.gifshow.v3.editor.cover.x0;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import ppc.a1;
import erd.a;
import ppc.y0;
import ppc.c1;
import com.yxcorp.gifshow.v3.editor.cover.w0;
import java.util.Map;
import nwc.c;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;

public class d1 extends PresenterV2	// class@000e58
{
    public AtomicBoolean A;
    public final r0 B;
    public b C;
    public c p;
    public f q;
    public Map r;
    public f s;
    public PublishSubject t;
    public j0 u;
    public BaseEditorFragment v;
    public Activity w;
    public final AtomicBoolean x;
    public AtomicBoolean y;
    public AtomicBoolean z;

    public void d1(){
       super();
       this.r = new HashMap();
       this.x = new AtomicBoolean(false);
       this.y = new AtomicBoolean(false);
       this.z = new AtomicBoolean(false);
       this.A = new AtomicBoolean(false);
       this.B = new d1$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d1.class, "2")) {
          return;
       }
       this.w = this.getActivity();
       this.s.d(new d1$b(this));
       this.u.o0().d(this.B);
       this.X7(this.v.m().subscribe(new b1(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d1.class, "3")) {
          return;
       }
       this.u.o0().c(this.B);
       this.w = null;
       return;
    }
    public void P8(boolean p0){
       int b1;
       int i1;
       int i2;
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod1, "4")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PhotosGenerateCoverPresenter", "generatePhotoCover "+p0, objArray);
       if (this.p.o0() == null) {
          return;
       }
       boolean b = true;
       if (this.x.getAndSet(b)) {
          return;
       }
       uod1 = this.p;
       v0$a uoa = null;
       List list = uod1.g(uod1, i, z.B(uod1), this.q.get(), uoa);
       a uoa1 = this.p.s0();
       if (uoa1 == null || uoa1.D()) {
          this.t.onNext(Boolean.FALSE);
          this.s.s0(w0.a);
          this.x.set(i);
          return;
       }else {
          uoa1.c0();
          Cover$b uob = Integer.MAX_VALUE;
          d1 tp = this.p;
          Cover obj = PatchProxy.applyOneRefs(tp, uoa, m.class, "7");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else {
             a.p(tp, "workspaceDraft");
             obj = a.f(tp).v();
             if (obj != null && obj.hasPictureCoverParam()) {
                PictureCoverParam pictureCover1 = obj.getPictureCoverParam();
                a.o(pictureCover1, "cover.pictureCoverParam");
                if (pictureCover1.getIndexesCount()) {
                   b1 = false;
                }
             }
             b1 = true;
          }
          String str = ", mCoverPhotoInfoList.size\(\)=";
          if (b1) {
             uoa1.k().h(Cover$Type.PICTURE);
             i1 = 0;
          }else {
             PictureCoverParam pictureCover = uoa1.v().getPictureCoverParam();
             if (pictureCover.getIndexesCount() > list.size()) {
                PostUtils.D("PhotosGenerateCoverPresenter", "pictureCoverParam.getIndexesCount\(\) > mCoverPhotoInfoList.size\(\)", new IllegalStateException("generate break: pictureCoverParam.getIndexesCount\(\)="+pictureCover.getIndexesCount()+str+list.size()));
                uoa1.j();
                this.t.onNext(Boolean.valueOf(k.a(this.p)));
                this.s.s0(y0.a);
                this.x.set(i);
                return;
             }else {
                b1 = 0;
                while (b1 < pictureCover.getIndexesCount()) {
                   int indexes = pictureCover.getIndexes(b1);
                   if (indexes <= list.size()) {
                      i2 = Math.min(uob, indexes);
                   }
                   b1 = b1 + 1;
                }
                b = pictureCover.getIndexesCount();
                i1 = uob;
             }
          }
          if ((i1 + b) > list.size()) {
             PostUtils.D("PhotosGenerateCoverPresenter", "startPos + size > mCoverPhotoInfoList.size\(\)", new IllegalStateException("generate break: startPos="+i1+", size="+b+str+list.size()));
             uoa1.j();
             this.t.onNext(Boolean.valueOf(k.a(this.p)));
             this.s.s0(z0.a);
             this.x.set(i);
             return;
          }else {
             Pair[] pairArray = new Pair[b];
             for (i2 = 0; i2 < b; i2 = i2 + 1) {
                b1 = i1 + i2;
                pairArray[i2] = list.get(b1);
             }
             File uFile = b.X(PostUtils.g("[>|24|>]"), ".jpg");
             Object[] objArray1 = new Object[i];
             a.D().w("PhotosGenerateCoverPresenter", "generate start "+System.currentTimeMillis(), objArray1);
             x0 ox0 = new x0(this, pairArray, i1, uoa1, uFile);
             this.C = t.fromCallable(b).subscribeOn(d.c).observeOn(d.a).doOnDispose(new a1(uoa1)).subscribe(new y0(this, p0, uoa1, uFile), new c1(this, uoa1));
             return;
          }
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d1.class, "1")) {
          return;
       }
       this.p = this.r8("WORKSPACE");
       this.q = this.x8("BITMAP_FILTER_RENDERER_MANAGER");
       Map map = this.r8("LISTENERS_MAP");
       this.r = map;
       this.s = f.p0(map, c.class);
       this.t = this.r8("GENERATE_COVER_RESPONSE");
       this.u = ViewModelProviders.of(this.getActivity()).get(j0.class);
       this.v = this.r8("FRAGMENT");
       return;
    }
}
