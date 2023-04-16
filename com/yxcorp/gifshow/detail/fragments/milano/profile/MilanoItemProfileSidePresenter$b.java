package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoItemProfileSidePresenter$b;
import d6a.a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoItemProfileSidePresenter;
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
import com.yxcorp.gifshow.detail.fragments.milano.profile.c;
import ok.o;
import com.google.common.collect.ImmutableList;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import uw9.o;
import q87.c;

public class MilanoItemProfileSidePresenter$b extends a	// class@00152e
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
       tb.Y = false;
       tb.K.B(tb.U0);
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MilanoItemProfileSidePresenter$b.class, "1")) {
          return;
       }
       MilanoItemProfileSidePresenter$b tb = this.b;
       boolean b = true;
       tb.Y = b;
       tb.K.j(tb.U0);
       tb = this.b;
       Objects.requireNonNull(tb);
       MilanoItemProfileSidePresenter milanoItemPr = MilanoItemProfileSidePresenter.class;
       if (!PatchProxy.applyVoid(objArray, tb, milanoItemPr, "21")) {
          MilanoItemProfileSidePresenter j = tb.J;
          if (j instanceof GrootBaseFragment) {
             SlidePlayLogger slidePlayLog = j.d1();
             if (!PatchProxy.applyVoidOneRefs(slidePlayLog, tb, milanoItemPr, "22") && slidePlayLog != null) {
                String[] stringArray = new String[]{tb.Q.get(),tb.R.get()};
                ImmutableList immutableLis = m.s(Lists.e(stringArray)).p(c.b).B();
                Object[] objArray1 = new Object[false];
                o.C().s("MilanoItemProfileSideP", "Update customKsOrderList "+tb.J.o()+"/"+tb.J.h5()+": "+immutableLis, objArray1);
                slidePlayLog.setCustomKsOrderList(immutableLis);
             }
          }
       }
       this.b.V8(false);
       return;
    }
}
