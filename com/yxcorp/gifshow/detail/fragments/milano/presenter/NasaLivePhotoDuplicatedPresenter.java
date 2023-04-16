package com.yxcorp.gifshow.detail.fragments.milano.presenter.NasaLivePhotoDuplicatedPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.NasaLivePhotoDuplicatedPresenter$a;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.NasaLivePhotoDuplicatedPresenter$b;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qw6.a;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.NasaLivePhotoDuplicatedPresenter$onBind$1;
import h3.a;
import msd.a;
import v0a.m0;
import ew6.b;
import yw6.g;
import v7a.a;
import v7a.a$a;
import sy6.a;

public final class NasaLivePhotoDuplicatedPresenter extends PresenterV2	// class@001517
{
    public QPhoto p;
    public final a$a q;
    public final a r;
    public SlidePlayViewModel s;

    public void NasaLivePhotoDuplicatedPresenter(){
       super();
       this.q = new NasaLivePhotoDuplicatedPresenter$a(this);
       this.r = new NasaLivePhotoDuplicatedPresenter$b(this);
    }
    public static final SlidePlayViewModel P8(NasaLivePhotoDuplicatedPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public void E8(){
       NasaLivePhotoDuplicatedPresenter nasaLivePhot = NasaLivePhotoDuplicatedPresenter.class;
       if (PatchProxy.applyVoid(null, this, nasaLivePhot, "2")) {
          return;
       }
       NasaLivePhotoDuplicatedPresenter ts = this.s;
       String str = "mSlidePlayViewModel";
       if (ts == null) {
          a.S(str);
       }
       ts.h(this.r);
       NasaLivePhotoDuplicatedPresenter$onBind$1 oonBind$1 = new NasaLivePhotoDuplicatedPresenter$onBind$1(this);
       if (!PatchProxy.applyVoidOneRefs(oonBind$1, this, nasaLivePhot, "6")) {
          nasaLivePhot = this.s;
          if (nasaLivePhot == null) {
             a.S(str);
          }
          if (nasaLivePhot.C0() != null) {
             oonBind$1.invoke();
          }else {
             nasaLivePhot = this.s;
             if (nasaLivePhot == null) {
                a.S(str);
             }
             nasaLivePhot.R(new m0(oonBind$1));
          }
       }
       return;
    }
    public void J8(){
       NasaLivePhotoDuplicatedPresenter nasaLivePhot = NasaLivePhotoDuplicatedPresenter.class;
       if (PatchProxy.applyVoid(null, this, nasaLivePhot, "3")) {
          return;
       }
       NasaLivePhotoDuplicatedPresenter ts = this.s;
       if (ts == null) {
          a.S("mSlidePlayViewModel");
       }
       ts.l(this.r);
       if (!PatchProxy.applyVoid(null, this, nasaLivePhot, "5")) {
          nasaLivePhot = this.s;
          if (nasaLivePhot == null) {
             a.S("mSlidePlayViewModel");
          }
          g og = nasaLivePhot.P0();
          if (!og instanceof a) {
             og = null;
          }
          if (og != null) {
             og.Y0(null);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaLivePhotoDuplicatedPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(a.class);
       a.o(obj, "inject\(ISlidePlayProvider::class.java\)");
       this.s = obj;
       return;
    }
}
