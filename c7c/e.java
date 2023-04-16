package c7c.e;
import android.view.View$OnClickListener;
import c7c.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y6c.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.RecoUser;
import f7c.c;

public final class e implements View$OnClickListener	// class@000542
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, f.class, "4")) {
       }else {
          new i(tb.getActivity(), tb.t, tb.r, tb.s).b();
       }
       return;
    }
}
