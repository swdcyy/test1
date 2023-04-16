package afd.a;
import n3d.a;
import afd.c;
import java.lang.Object;
import android.content.Intent;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class a implements a	// class@00001d
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       a tb = this.b;
       if (tb.getActivity() != null) {
          tb.getActivity().s(tb.B);
       }
       return;
    }
}
