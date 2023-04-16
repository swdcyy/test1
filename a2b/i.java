package a2b.i;
import erd.g;
import a2b.k;
import java.lang.Object;
import eda.f;
import java.util.Objects;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView;
import java.lang.Integer;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import x1b.a;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.local.sub.entrance.function.view.LocalLifeWeakStyleRecyclerView;
import b2b.e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;

public final class i implements g	// class@00002a
{
    public final k b;

    public void i(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a mAdapter;
       i tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.a();
       if (PatchProxy.applyVoidOneRefs(p0, tb, k.class, "9")) {
       }else {
          k q = tb.q;
          if (q != null) {
             int i = a1.e((float)p0.screenWidthDp);
             if (!PatchProxy.isSupport(NearbyHeaderFunctionEntranceView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), q, NearbyHeaderFunctionEntranceView.class, "7")) {
                NearbyHeaderFunctionEntranceView e = q.e;
                Context context = q.getContext();
                a.m(context);
                List list = q.getMAdapter().Q0();
                a.o(list, "mAdapter.list");
                mAdapter = q.getMAdapter();
                NearbyHeaderFunctionEntranceView b = q.b;
                if (b == null) {
                   a.S("mFunctionListRecyclerView");
                }
                e.b(context, list, mAdapter, b, i);
                e = q.b;
                if (e == null) {
                   a.S("mFunctionListRecyclerView");
                }
                e.setAdapter(q.getMAdapter());
                q.getMAdapter().k0();
                e = q.b;
                if (e == null) {
                   a.S("mFunctionListRecyclerView");
                }
                e.requestLayout();
                NearbyHeaderFunctionEntranceView b1 = q.b;
                if (b1 == null) {
                   a.S("mFunctionListRecyclerView");
                }
                b1.invalidate();
             }
          }
       }
       return;
    }
}
