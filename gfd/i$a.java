package gfd.i$a;
import mcd.f;
import gfd.i;
import java.lang.Object;
import mcd.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import mfd.a;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.google.gson.JsonObject;
import nfd.q1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class i$a implements f	// class@000f0f
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       e.c(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "1")) {
          return;
       }
       i$a ta = this.a;
       boolean b = ta.p.isSelected();
       Objects.requireNonNull(ta);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), ta, oi, "4")) {
          SearchItem mKBoxItem = ta.q.mKBoxItem;
          if (mKBoxItem != null && ta.r != null) {
             i r = ta.r;
             q1.x(1, ta.s, ta.q, r, a.a(mKBoxItem, b), null, q1.r(r));
          }
       }
       return;
    }
    public void c(boolean p0){
       e.b(this, p0);
    }
}
