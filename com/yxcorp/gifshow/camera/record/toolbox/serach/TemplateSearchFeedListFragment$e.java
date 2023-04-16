package com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$e;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import k90.a;
import t90.c;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;
import qvb.i;

public final class TemplateSearchFeedListFragment$e implements Runnable	// class@000f68
{
    public final TemplateSearchFeedListFragment b;

    public void TemplateSearchFeedListFragment$e(TemplateSearchFeedListFragment p0){
       this.b = p0;
       super();
    }
    public final void run(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TemplateSearchFeedListFragment$e.class, "1")) {
          return;
       }
       TemplateSearchFeedListFragment$e tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(objArray, tb, TemplateSearchFeedListFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          obj.booleanValue();
       }else if(tb.Hh() >= 0){
          i = tb.Hh();
       }else {
          i = 0;
       }
       if (!tb.K.a()) {
          i = i + 1;
       }
       RecyclerView recyclerView = tb.h0();
       a.o(recyclerView, "recyclerView");
       i oi = tb.q();
       a.o(oi, "pageList");
       c.a.a(i, true, recyclerView, oi);
       return;
    }
}
