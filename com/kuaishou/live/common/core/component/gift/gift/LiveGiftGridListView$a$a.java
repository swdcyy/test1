package com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridListView$a$a;
import android.database.DataSetObserver;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridListView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class LiveGiftGridListView$a$a extends DataSetObserver	// class@001282
{
    public final LiveGiftGridListView$a a;

    public void LiveGiftGridListView$a$a(LiveGiftGridListView$a p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       if (PatchProxy.applyVoid(null, this, LiveGiftGridListView$a$a.class, "1")) {
          return;
       }
       this.a.g.clear();
       this.a.k0();
       return;
    }
}
