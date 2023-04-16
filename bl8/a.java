package bl8.a;
import erd.g;
import bl8.b;
import java.lang.Object;
import com.search.common.entity.SearchPresetsResponse;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.search.common.entity.TrendingItem;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;
import java.lang.String;

public final class a implements g	// class@00042a
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       SearchPresetsResponse mHotPresetTr = p0.mHotPresetTredings;
       tb.r = mHotPresetTr;
       tb.s = p0.mUssId;
       if (mHotPresetTr != null) {
          tb.t = new ArrayList();
          p0 = tb.r.iterator();
          while (p0.hasNext()) {
             tb.t.add(p0.next().mQuery);
          }
          tb.q.setPresetUssId(tb.s);
          tb.q.b(tb.t);
       }
       return;
    }
}
