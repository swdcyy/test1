package aq4.l;
import cq4.n$a;
import aq4.o;
import java.lang.Object;
import com.kuaishou.post.story.edit.model.StoryStickerDrawer;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class l implements n$a	// class@0002cd
{
    public final o a;

    public void l(o p0){
       this.a = p0;
    }
    public final void a(StoryStickerDrawer p0){
       l ta = this.a;
       ta.q.Z(p0);
       GifshowActivity activity = ta.getActivity();
       if (activity != null) {
          activity.onBackPressed();
       }
       return;
    }
}
