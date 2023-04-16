package com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$b;
import x49.q;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import yx.j0;
import com.kwai.adclient.kscommerciallogger.snapshot.Span;
import java.lang.Throwable;

public final class AdMKPageLoadPresenter$b implements q	// class@00184a
{
    public final AdMKPageLoadPresenter a;

    public void AdMKPageLoadPresenter$b(AdMKPageLoadPresenter p0){
       this.a = p0;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdMKPageLoadPresenter$b.class, "2")) {
          return;
       }
       a.p(p0, "e");
       Object[] objArray = new Object[0];
       j0.c("AdMKLoadPresenter", "render failed "+AdMKPageLoadPresenter.P8(this.a)+' '+p0, objArray);
       this.a.W8(0);
       this.a.R8().c("render fail ,error = "+p0+' ');
       this.a.X8(0, p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AdMKPageLoadPresenter$b.class, "1")) {
          return;
       }
       this.a.R8().c("render Success ");
       Object[] objArray = new Object[0];
       j0.f("AdMKLoadPresenter", "render success "+AdMKPageLoadPresenter.P8(this.a), objArray);
       return;
    }
}
