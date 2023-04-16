package bbd.a;
import android.view.View$OnClickListener;
import bbd.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.template.aggregate.AttachedInfo;
import com.yxcorp.plugin.search.entity.template.base.JCAladdinModel;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pad.l;
import bbd.e;
import bbd.c;
import java.lang.Runnable;
import pad.l$a;
import bbd.d;
import bbd.b;

public final class a implements View$OnClickListener	// class@0003d2
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uof, "5")) {
       }else if(tb.u.mButton.mStatus == 1){
          if (!PatchProxy.applyVoid(objArray, tb, uof, "7")) {
             l.a(tb.getContext(), l.b(tb.u.mButton), new e(tb), new c(tb));
          }
       }else if(PatchProxy.applyVoid(objArray, tb, uof, "6")){
          l.d(tb.getContext(), l.b(tb.u.mButton), new d(tb), new b(tb));
       }
       return;
    }
}
