package com.yxcorp.gifshow.relation.explore.presenter.l;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.presenter.m;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.String;
import k2b.h;
import lnc.i3;
import java.lang.Boolean;
import com.google.android.material.appbar.AppBarLayout;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hac.v0;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import rkd.b;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchActivityTablet;
import android.content.Context;
import n3d.a;

public final class l implements View$OnClickListener	// class@001854
{
    public final m b;

    public void l(m p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.m("", "SEARCH_BUTTON");
       i3 oi3 = i3.f();
       oi3.a("is_list_loc", Boolean.TRUE);
       oh.n(oi3.e());
       oh.b(6);
       oh.h();
       tb.t.setExpanded(false);
       GifshowActivity activity = tb.getActivity();
       v0 ov0 = new v0(tb);
       ExploreSearchActivity uExploreSear = ExploreSearchActivity.class;
       if (PatchProxy.applyVoidTwoRefs(activity, ov0, null, uExploreSear, "1")) {
       }else if(b.g()){
          uExploreSear = ExploreSearchActivityTablet.class;
       }
       Intent intent = new Intent(activity, uExploreSear);
       intent.putExtra("activityCloseEnterAnimation", R.anim.arg_RES_7f01004c);
       activity.t1(intent, 1, ov0);
       activity.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
       return;
    }
}
