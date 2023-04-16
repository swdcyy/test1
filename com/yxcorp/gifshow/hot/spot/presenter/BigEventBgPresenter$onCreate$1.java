package com.yxcorp.gifshow.hot.spot.presenter.BigEventBgPresenter$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.presenter.BigEventBgPresenter;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zf6.k;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import wq6.d;
import as6.a;
import zq6.r;
import bo5.a;
import zq6.p;
import gsa.e0;
import un5.b;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import wq6.h;
import com.kwai.framework.model.kcube.ActionBarSkinConfig;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import kotlin.Result;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.graphics.Color;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import uh5.e;
import java.lang.Throwable;
import qrd.j0;
import wq6.e;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import ro5.b;
import pn5.a;
import androidx.recyclerview.widget.RecyclerView$r;

public final class BigEventBgPresenter$onCreate$1 extends Lambda implements l	// class@001846
{
    public final BigEventBgPresenter this$0;

    public void BigEventBgPresenter$onCreate$1(BigEventBgPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       BigEventBgPresenter p;
       RecyclerView recyclerView;
       int i;
       p e1;
       p d;
       BigEventBgPresenter uBigEventBgP = BigEventBgPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, BigEventBgPresenter$onCreate$1.class, "1")) {
          return;
       }
       if (p0 != null) {
          BigEventBgPresenter$onCreate$1 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          Object[] objArray = null;
          Object obj = PatchProxy.apply(objArray, tthis$0, uBigEventBgP, "5");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): k.d();
          if (!b) {
             tthis$0 = this.this$0;
             Objects.requireNonNull(tthis$0);
             if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, uBigEventBgP, "4")) {
                uBigEventBgP = tthis$0.p;
                if (uBigEventBgP == null) {
                   a.S("mFragment");
                }
                if (!uBigEventBgP.isDetached()) {
                   uBigEventBgP = tthis$0.p;
                   if (uBigEventBgP == null) {
                      a.S("mFragment");
                   }
                   d uod = a.e(uBigEventBgP);
                   if (uod != null) {
                      r or = uod.e0();
                      if (or != null) {
                         if (tthis$0.s == null) {
                            tthis$0.s = true;
                            p e = a.e;
                            a.o(e, "HomeTopStateId.TAB_BAR_VIEW_INFO");
                            tthis$0.q = or.d(e);
                            e = b.a;
                            a.o(e, "HomeCommonStateId.STATUS_BAR_CONTENT_DARK");
                            tthis$0.r = or.d(e);
                            tthis$0.u = HomeActionBarSkinHelper.a.g(uod);
                         }
                         String str = "actionBarSkin";
                         if (p0.s0(str)) {
                            try{
                               objArray = a.a.h(p0.e0(str).toString(), ActionBarSkinConfig.class);
                            }catch(com.google.gson.JsonSyntaxException e0){
                            }
                         }
                      }
                   }
                }
             }
          }else {
          label_014c :
             this.this$0.R8();
          }
       }else {
          goto label_014c ;
       }
    label_0151 :
       return;
    }
}
