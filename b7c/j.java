package b7c.j;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.pymk.element.d;
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

public final class j implements View$OnClickListener	// class@0003cb
{
    public final d b;

    public void j(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, d.class, "5")) {
       }else {
          new i(tb.getActivity(), tb.v, tb.r, tb.s).c();
       }
       return;
    }
}
