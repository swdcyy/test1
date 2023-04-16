package bad.b;
import t2b.a$a;
import bad.d;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.entity.kbox.KBoxTabItem;
import x9d.b;
import com.yxcorp.plugin.search.entity.TemplateText;
import java.lang.String;
import com.google.gson.JsonObject;
import com.yxcorp.plugin.search.entity.SearchItem;
import nfd.q1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class b implements a$a	// class@0003cc
{
    public final d a;

    public void b(d p0){
       this.a = p0;
    }
    public final void a(List p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       if (!q.f(p0)) {
          int i = 0;
          while (i < p0.size()) {
             KBoxTabItem kBoxTabItem = p0.get(i);
             i = i + 1;
             JsonObject jsonObject = kBoxTabItem.buildKBoxBottomItemObject(kBoxTabItem.mText.mText, i);
             q1.B(0, ta.p, ta.q, "BASE_NAVIGATION_BUTTON_SUBCARD", null, jsonObject, q1.a(ta.q));
          }
       }
       return;
    }
}
