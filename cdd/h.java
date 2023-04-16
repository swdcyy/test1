package cdd.h;
import android.view.View$OnClickListener;
import cdd.g$b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.entity.kbox.KBoxTabItem;
import com.yxcorp.plugin.search.entity.TemplateText;
import y8c.d;
import com.google.gson.JsonObject;
import com.yxcorp.plugin.search.entity.SearchItem;
import nfd.q1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.utils.k;

public final class h implements View$OnClickListener	// class@000534
{
    public final g$b b;

    public void h(g$b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, g$b.class, "4")) {
       }else {
          g$b s = tb.s;
          JsonObject jsonObject = s.buildKBoxBottomItemObject(s.mText.mText, (tb.t.get() + 1));
          q1.B(1, tb.u.k, tb.p, "BASE_NAVIGATION_BUTTON_SUBCARD", null, jsonObject, q1.a(tb.p));
          if (tb.s.mLinkUrl != null) {
             k.c(tb.getActivity(), tb.s.mLinkUrl);
          }
       }
       return;
    }
}
