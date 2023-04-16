package com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jta.c;
import rf5.u;
import java.util.Objects;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import yy6.a;
import im8.f;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.Iterable;
import qk.m;
import com.yxcorp.gifshow.ad.detail.presenter.side.b;
import ok.o;
import com.google.common.collect.ImmutableList;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import yx.j0;

public class MilanoItemProfileSidePresenter$b extends a	// class@001695
{
    public final MilanoItemProfileSidePresenter b;

    public void MilanoItemProfileSidePresenter$b(MilanoItemProfileSidePresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, MilanoItemProfileSidePresenter$b.class, "2")) {
          return;
       }
       MilanoItemProfileSidePresenter$b tb = this.b;
       tb.W = false;
       tb.I.B(tb.Y);
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MilanoItemProfileSidePresenter$b.class, "1")) {
          return;
       }
       MilanoItemProfileSidePresenter$b tb = this.b;
       boolean b = true;
       tb.W = b;
       tb.I.j(tb.Y);
       tb = this.b;
       Objects.requireNonNull(tb);
       MilanoItemProfileSidePresenter milanoItemPr = MilanoItemProfileSidePresenter.class;
       if (!PatchProxy.applyVoid(objArray, tb, milanoItemPr, "20")) {
          MilanoItemProfileSidePresenter h = tb.H;
          if (h instanceof GrootBaseFragment) {
             SlidePlayLogger slidePlayLog = h.d1();
             if (!PatchProxy.applyVoidOneRefs(slidePlayLog, tb, milanoItemPr, "21") && slidePlayLog != null) {
                String[] stringArray = new String[]{tb.O.get(),tb.P.get()};
                ImmutableList immutableLis = m.s(Lists.e(stringArray)).p(b.b).B();
                Object[] objArray1 = new Object[false];
                j0.a("MilanoItemProfileSideP", "Update customKsOrderList "+tb.H.o()+"/"+tb.H.h5()+": "+immutableLis, objArray1);
                slidePlayLog.setCustomKsOrderList(immutableLis);
             }
          }
       }
       this.b.V8(false);
       return;
    }
}
