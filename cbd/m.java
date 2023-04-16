package cbd.m;
import n3d.a;
import com.yxcorp.plugin.search.kbox.weak.d;
import java.lang.Object;
import android.content.Intent;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class m implements a	// class@000522
{
    public final d b;

    public void m(d p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       m tb = this.b;
       if (tb.getActivity() != null) {
          tb.getActivity().s(tb.s);
       }
       return;
    }
}
