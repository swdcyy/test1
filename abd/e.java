package abd.e;
import erd.g;
import abd.f;
import java.lang.Object;
import com.yxcorp.plugin.search.response.SearchTVStationResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x9d.g;
import java.util.Collection;
import ekd.q;
import android.view.View;
import nfd.o3;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateCommonFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class e implements g	// class@0000c2
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "6")) {
       }else {
          tb.V8();
          if (p0 == null || q.f(p0.mTVStationFeeds)) {
             tb.X8();
          }else {
             o3.H(tb.v, 0);
             ArrayList uArrayList = new ArrayList();
             int i = 1;
             int i1 = 0;
             while (i1 < p0.mTVStationFeeds.size()) {
                TemplateCommonFeed templateComm = p0.mTVStationFeeds.get(i1);
                if (templateComm != null && TextUtils.x(templateComm.errorMsg())) {
                   templateComm.setPosition(i);
                   if (i > 18) {
                      break ;
                   }else {
                      uArrayList.add(templateComm);
                      i = i + 1;
                   }
                }
                i1 = i1 + 1;
             }
             tb.C.W0(uArrayList);
             tb.C.k0();
             tb.z.getLayoutManager().scrollToPosition(0);
             tb.D = false;
          }
       }
       return;
    }
}
