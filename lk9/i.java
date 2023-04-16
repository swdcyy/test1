package lk9.i;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.emotion.detail.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class i implements View$OnClickListener	// class@002dfd
{
    public final e b;

    public void i(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "11")) {
       }else if(tb.getActivity() != null){
          tb.getActivity().finish();
       }
       return;
    }
}
