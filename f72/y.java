package f72.y;
import android.view.View$OnClickListener;
import f72.a0;
import java.lang.Object;
import android.view.View;
import com.kwai.component.photo.reduce.h;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;

public final class y implements View$OnClickListener	// class@0028e1
{
    public final a0 b;

    public void y(a0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       y tb = this.b;
       View view = tb.m8();
       new h(tb.t).g(view, tb.r.mEntity);
    }
}
