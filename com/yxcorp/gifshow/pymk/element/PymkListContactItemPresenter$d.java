package com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import g7c.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import e7c.b;
import g9c.a;

public final class PymkListContactItemPresenter$d extends m	// class@0016b7
{
    public final PymkListContactItemPresenter c;

    public void PymkListContactItemPresenter$d(PymkListContactItemPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       c a;
       PymkListContactItemPresenter b;
       PymkListContactItemPresenter pymkListCont = PymkListContactItemPresenter.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, PymkListContactItemPresenter$d.class, str)) {
          return;
       }
       a.p(p0, "v");
       a = c.a;
       int i = this.c.S8();
       PymkListContactItemPresenter$d tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       PymkListContactItemPresenter pymkListCont1 = PatchProxy.apply(objArray, tc, pymkListCont, str);
       if (pymkListCont1 != PatchProxyResult.class) {
       }else {
          pymkListCont1 = tc.F;
          if (pymkListCont1 == null) {
             a.S("mBaseFragment");
          }
       }
       a.a("close", i, pymkListCont1);
       PymkListContactItemPresenter$d tc1 = this.c;
       Objects.requireNonNull(tc1);
       if (!PatchProxy.applyVoid(objArray, tc1, pymkListCont, "13")) {
          pymkListCont = tc1.D;
          if (pymkListCont == null) {
             a.S("mAdapter");
          }
          if (pymkListCont instanceof b) {
             objArray = pymkListCont;
          }
          if (objArray != null) {
             b = tc1.B;
             if (b == null) {
                a.S("mRecoUser");
             }
             int i1 = objArray.P0(b);
             if (i1 != -1) {
                objArray.S0(i1);
             }
          }
       }
    label_006e :
       return;
    }
}
