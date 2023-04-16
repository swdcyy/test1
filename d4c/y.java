package d4c.y;
import android.view.View$OnClickListener;
import d4c.b0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import ekd.p0;
import e17.i;
import com.kuaishou.android.model.music.Music;
import y3c.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jp5.b;

public final class y implements View$OnClickListener	// class@0020e3
{
    public final b0 b;

    public void y(b0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       y tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b0.class, "4")) {
       }else if(!p0.C(p0.getContext())){
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       }else if(tb.y != null){
          if (tb.v.isOffline()) {
             tb.y.a(tb.v);
          }else {
             tb.y.b(tb.v);
             if (tb.getContext() != null) {
                b uob = b.m(tb.v, 6);
                uob.q("0");
                uob.l(tb.getContext());
             }
          }
       }
       return;
    }
}
