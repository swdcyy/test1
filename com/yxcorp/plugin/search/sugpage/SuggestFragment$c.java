package com.yxcorp.plugin.search.sugpage.SuggestFragment$c;
import java.lang.Runnable;
import com.yxcorp.plugin.search.sugpage.SuggestFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchSuggestResponse;
import java.util.List;
import java.util.Collection;
import ekd.q;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import wkd.b;
import kcd.o;

public class SuggestFragment$c implements Runnable	// class@00076f
{
    public final SuggestFragment b;

    public void SuggestFragment$c(SuggestFragment p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, SuggestFragment$c.class, "1")) {
          return;
       }
       if (!q.f(this.b.C5().getDelayItems())) {
          this.b.q().b(this.b.C5().getDelayItems());
          this.b.C5().getDelayItems().clear();
       }
       b.a(0x4a5206af).d(this);
       return;
    }
}
