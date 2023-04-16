package com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridListView$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import vg1.e;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridListView$a$a;
import android.database.DataSetObserver;
import android.widget.BaseAdapter;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridListView$a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xz6.d;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.util.Objects;
import java.lang.Boolean;
import ug1.x;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView$a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Map;
import xz6.e;
import android.view.View;
import android.view.ViewGroup;

public class LiveGiftGridListView$a extends RecyclerView$Adapter	// class@001284
{
    public e e;
    public LiveGiftGridView$a f;
    public final Map g;

    public void LiveGiftGridListView$a(e p0){
       super();
       this.g = new HashMap();
       this.e = p0;
       p0.registerDataSetObserver(new LiveGiftGridListView$a$a(this));
    }
    public void D0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftGridListView$a.class, "3")) {
       }else {
          GiftPanelItem item = this.e.getItem(p0.b);
          LiveGiftGridListView$a te = this.e;
          Objects.requireNonNull(te);
          if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidTwoRefs(item, Boolean.FALSE, te, e.class, "28")) {
             te.x.a(item, false);
          }
       }
       return;
    }
    public void J0(LiveGiftGridView$a p0){
       this.f = p0;
    }
    public int f0(int p0){
       GiftPanelItem obj;
       LiveGiftGridListView$a uoa = LiveGiftGridListView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.e.getItem(p0).index;
       this.g.put(Integer.valueOf(obj), Integer.valueOf(p0));
       return obj;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LiveGiftGridListView$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.getCount();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       LiveGiftGridListView$a uoa = LiveGiftGridListView$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          LiveGiftGridListView$a$b a = p0.a;
          a.b.setTag(R.id.tag_view_holder, a);
          this.e.g(p1, p0.a);
          LiveGiftGridListView$a tf = this.f;
          if (tf != null) {
             tf.a(p1);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveGiftGridListView$a$b uoa$b;
       LiveGiftGridListView$a uoa = LiveGiftGridListView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoa$b = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uoa$b != PatchProxyResult.class) {
          label_003a :
             return uoa$b;
          }
       }
       Integer integer = this.g.get(Integer.valueOf(p1));
       integer = (integer == null)? 0: integer.intValue();
       e uoe = this.e.h(integer, p0);
       uoa$b = new LiveGiftGridListView$a$b(uoe.b, uoe, integer);
       goto label_003a ;
    }
}
