package cbd.g;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.kbox.weak.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import nfd.q1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateMeta;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateIcon;
import android.app.Activity;
import com.yxcorp.plugin.search.utils.k;

public final class g implements View$OnClickListener	// class@00051c
{
    public final b b;

    public void g(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g tb = this.b;
       b r = tb.r;
       if (PatchProxy.applyVoidOneRefs(r, tb, b.class, "5")) {
       }else {
          q1.H(tb.p, 1, false, false, true, "", tb.q);
          k.c(tb.q.getActivity(), r.mButton.mLinkUrl);
       }
       return;
    }
}
