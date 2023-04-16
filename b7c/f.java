package b7c.f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.pymk.element.b;
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

public final class f implements View$OnClickListener	// class@0003c7
{
    public final b b;

    public void f(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "6")) {
       }else {
          new i(tb.getActivity(), tb.v, tb.r, tb.s).c();
       }
       return;
    }
}
