package coa.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.interest.widget.InterestHistoryTagView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import msd.p;
import java.lang.Integer;
import qrd.l1;

public final class a implements View$OnClickListener	// class@00054c
{
    public final InterestHistoryTagView b;

    public void a(InterestHistoryTagView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       p mStatusLambd = this.b.getMStatusLambda();
       if (mStatusLambd != null) {
          l1 ol1 = mStatusLambd.invoke(String.valueOf(this.b.g), Integer.valueOf(3));
       }
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
