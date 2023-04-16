package com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter$a;
import jta.a;
import com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import jta.d;
import g19.l;
import jta.c;

public class MilanoItemProfileSidePresenter$a extends a	// class@001694
{
    public final MilanoItemProfileSidePresenter a;

    public void MilanoItemProfileSidePresenter$a(MilanoItemProfileSidePresenter p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       MilanoItemProfileSidePresenter$a uoa = MilanoItemProfileSidePresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "4")) {
          return;
       }
       Iterator iterator = this.a.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       iterator = this.a.K.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       iterator = this.a.S.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       this.a.V8(false);
       return;
    }
    public void b(float p0){
       MilanoItemProfileSidePresenter$a uoa = MilanoItemProfileSidePresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       Iterator iterator = this.a.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0);
       }
       iterator = this.a.K.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0);
       }
       return;
    }
    public void c(float p0){
       MilanoItemProfileSidePresenter$a uoa = MilanoItemProfileSidePresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "3")) {
          return;
       }
       uoa = this.a;
       if (uoa.W == null) {
          return;
       }
       Iterator iterator = uoa.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       iterator = this.a.K.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       iterator = this.a.S.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public void d(float p0){
       MilanoItemProfileSidePresenter$a uoa = MilanoItemProfileSidePresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "2")) {
          return;
       }
       uoa = this.a;
       if (uoa.W == null) {
          return;
       }
       Iterator iterator = uoa.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       iterator = this.a.K.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       iterator = this.a.S.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       this.a.V8(true);
       return;
    }
}
