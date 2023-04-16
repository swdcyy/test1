package bl8.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bl8.b$a;
import android.view.View;
import qy5.c;
import qy5.d;
import oy5.c;
import iy5.d;
import java.lang.Object;
import java.lang.String;
import q87.c;

public class b extends PresenterV2	// class@00042c
{
    public String p;
    public c q;
    public List r;
    public String s;
    public List t;
    public int u;
    public final c v;

    public void b(int p0){
       super();
       this.p = "";
       this.v = new b$a(this);
       this.u = p0;
    }
    public void doBindView(View p0){
       c uoc = p0.findViewById(this.u);
       this.q = uoc;
       if (uoc != null && uoc instanceof d) {
          uoc.setSearchEntryRequestCallback(this.v);
       }else {
          Object[] objArray = new Object[0];
          d.C().t("SearchEntryPresetRequestPresenter", "ViewId is inVaild", objArray);
       }
       return;
    }
}
