package com.yxcorp.gifshow.map.map.presenter.MapRefreshBtnPresenter$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.map.map.presenter.MapRefreshBtnPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g6b.c;
import i6b.a;
import xl8.b;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import java.lang.Boolean;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p0;
import android.widget.Button;

public final class MapRefreshBtnPresenter$b implements View$OnClickListener	// class@001ca4
{
    public final MapRefreshBtnPresenter b;

    public void MapRefreshBtnPresenter$b(MapRefreshBtnPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       c g;
       MapRefreshBtnPresenter p;
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRefreshBtnPresenter$b.class, "1")) {
          return;
       }
       MapRefreshBtnPresenter$b tb = this.b;
       MapRefreshBtnPresenter r = tb.r;
       if (r != null) {
          g = r.g;
          if (g != null) {
             g.a = "REFRESH_BUTTON";
             p = tb.p;
             if (p != null) {
                p.d(g);
             }
          }
       }
       tb = this.b;
       r = tb.r;
       if (r != null) {
          g = r.f;
          if (g != null) {
             g.mDefaultTitle = "";
          }
       }
       p = tb.q;
       if (p != null) {
          p.d(Boolean.TRUE);
       }
       if (!p0.C(this.b.getContext())) {
          MapRefreshBtnPresenter.P8(this.b).setVisibility(8);
       }
       return;
    }
}
