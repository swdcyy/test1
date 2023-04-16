package com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.ViewModel;
import xvc.f;
import tvc.e;
import tvc.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$c;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$a;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$store$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$stateLiveData$2;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tvc.f;
import androidx.lifecycle.LiveData;
import java.util.List;
import xvc.h;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$d;
import xvc.m;
import xvc.j;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$e;
import xvc.c;
import xvc.b;
import xvc.g;
import ooc.g;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.b;

public abstract class EditReduxViewModel extends ViewModel	// class@001536
{
    public boolean a;
    public final List b;
    public final PublishSubject c;
    public b d;
    public final EditReduxViewModel$c e;
    public final p f;
    public final p g;
    public final boolean h;
    public final f i;
    public final e j;
    public final VideoSDKPlayerView k;

    public void EditReduxViewModel(boolean p0,f p1,e p2,c[] p3,VideoSDKPlayerView p4){
       b uob;
       a.p(p2, "initState");
       a.p(p3, "_middlewareList");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p4;
       this.a = true;
       this.b = new ArrayList();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.c = publishSubje;
       this.e = new EditReduxViewModel$c();
       if (p1 == null) {
          uob = null;
       }else if(p0){
          uob = p1.c().subscribe(new EditReduxViewModel$a(this));
       }else {
          uob = p1.d().subscribe(new EditReduxViewModel$b(this));
       }
       this.d = uob;
       this.f = s.c(new EditReduxViewModel$store$2(this, p3));
       this.g = s.c(new EditReduxViewModel$stateLiveData$2(this));
       return;
    }
    public void EditReduxViewModel(boolean p0,f p1,e p2,c[] p3,VideoSDKPlayerView p4,int p5,u p6){
       super(p0, p1, p2, p3, null);
    }
    public final e o0(){
       e obj = PatchProxy.apply(null, this, EditReduxViewModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r0().getValue();
       if (obj == null) {
          obj = this.u0();
       }
       return obj;
    }
    public final List p0(){
       return this.b;
    }
    public c q0(){
       h oh;
       EditReduxViewModel obj = PatchProxy.apply(null, this, EditReduxViewModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i == null) {
          obj = this.e;
       }else if(this.h != null){
          oh = new h(this.y0(), this.i, new EditReduxViewModel$d(this));
       }else {
          oh = new j(this.y0(), this.i, new EditReduxViewModel$e(this));
       }
       return obj;
    }
    public final f r0(){
       Object obj = PatchProxy.apply(null, this, EditReduxViewModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final c s0(){
       Object obj = PatchProxy.apply(null, this, EditReduxViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public void t0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditReduxViewModel.class, "5")) {
          return;
       }
       a.p(p0, "action");
       this.s0().e(p0);
       return;
    }
    public final e u0(){
       e obj = PatchProxy.apply(null, this, EditReduxViewModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s0().f();
       if (obj == null) {
          EditReduxViewModel tj = this.j;
       }
       return obj;
    }
    public abstract e v0(b p0,e p1);
    public abstract e w0(g p0,e p1);
    public void x0(g p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditReduxViewModel.class, "9")) {
          return;
       }
       a.p(p0, "func");
       a.p(p1, "draftState");
       if (CollectionsKt___CollectionsKt.H1(this.b, p0) && p0 instanceof EditorItemFunc) {
          this.s0().g(this.s0().b());
          this.s0().c(this.w0(p1, this.s0().b()));
       }
       return;
    }
    public abstract EditorItemFunc y0();
}
