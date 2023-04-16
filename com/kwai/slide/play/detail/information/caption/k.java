package com.kwai.slide.play.detail.information.caption.k;
import qp7.c;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import zq7.a0;
import zq7.b0;
import android.text.SpannableStringBuilder;
import java.lang.Integer;
import java.lang.Float;
import com.kwai.slide.play.detail.information.caption.k$b;
import com.kwai.slide.play.detail.information.caption.k$a;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import brd.t;

public final class k extends c	// class@0017df
{
    public final PublishSubject a;
    public final PublishSubject b;
    public final PublishSubject c;
    public final PublishSubject d;
    public final PublishSubject e;
    public final PublishSubject f;

    public void k(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.a = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<CaptionModel>\(\)");
       this.b = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<CaptionFoldEvent>\(\)");
       this.c = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<CaptionFoldEvent>\(\)");
       this.d = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<CaptionFoldProgressEvent>\(\)");
       this.e = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<CaptionDialogInfo>\(\)");
       this.f = publishSubje;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.a.onNext(Boolean.TRUE);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, k.class, "5")) {
          return;
       }
       this.c.onNext(new a0(true));
       return;
    }
    public final void c(b0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       a.p(p0, "e");
       this.e.onNext(p0);
       return;
    }
    public final void d(SpannableStringBuilder p0,boolean p1,int p2,int p3,float p4){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ok, "10")) {
             return;
          }
       }
       a.p(p0, "openContent");
       k$b uob = new k$b(p0, p1, p2, p3, p4);
       this.b.onNext(v7);
       return;
    }
    public final void e(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "12")) {
          return;
       }
       a.p(p0, "info");
       this.f.onNext(p0);
       return;
    }
    public final b f(g p0,g p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "onNext");
       a.p(p1, "onError");
       b uob = this.b.subscribe(p0, p1);
       a.o(uob, "captionChangeSubject.subscribe\(onNext, onError\)");
       return uob;
    }
    public final b g(g p0,g p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "onNext");
       a.p(p1, "onError");
       b uob = this.a.subscribe(p0, p1);
       a.o(uob, "captionClickSubject.subscribe\(onNext, onError\)");
       return uob;
    }
}
