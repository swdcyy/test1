package com.kuaishou.merchant.home2.dynamic.HomePagePresenter$a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.home2.dynamic.HomePagePresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import iv.a;
import b04.d;

public final class HomePagePresenter$a implements View$OnClickListener	// class@0016fd
{
    public final HomePagePresenter b;

    public void HomePagePresenter$a(HomePagePresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       HomePagePresenter homePagePres;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePagePresenter$a.class, str)) {
          return;
       }
       HomePagePresenter p = this.b.p;
       if (p == null) {
          a.S("homePageViewModel");
       }
       String str1 = this.b.W8();
       HomePagePresenter$a tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(null, tb, HomePagePresenter.class, str);
       if (obj != PatchProxyResult.class) {
          homePagePres = obj;
       }else {
          HomePagePresenter q = tb.q;
          if (q == null) {
             a.S("fragment");
          }
          homePagePres = q;
       }
       View view = this.b.m8();
       HomePagePresenter r = this.b.r;
       if (r == null) {
          a.S("callerContext");
       }
       p.L0(str1, homePagePres, view, r, this.b.X8(), this.b.V8());
       return;
    }
}
