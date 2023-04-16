package coa.b;
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

public final class b implements View$OnClickListener	// class@00054d
{
    public final InterestHistoryTagView b;

    public void b(InterestHistoryTagView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       p mStatusLambd = this.b.getMStatusLambda();
       if (mStatusLambd != null) {
          mStatusLambd.invoke(String.valueOf(this.b.g), Integer.valueOf(2));
       }
       return;
    }
}
