package abd.g;
import android.view.View$OnClickListener;
import abd.h;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import nfd.q1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateCommonFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import com.yxcorp.plugin.search.utils.k;

public final class g implements View$OnClickListener	// class@0000c6
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, h.class, "5")) {
       }else {
          q1.v(1, tb.v, tb.w, tb.s, "FILTERABLE_SUBCARD");
          k.c(tb.getActivity(), tb.s.mCoverInfo.mLinkUrl);
       }
       return;
    }
}
