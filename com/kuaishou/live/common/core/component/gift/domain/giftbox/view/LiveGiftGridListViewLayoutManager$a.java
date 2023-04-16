package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftGridListViewLayoutManager$a;
import androidx.recyclerview.widget.o;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftGridListViewLayoutManager;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Math;
import android.util.DisplayMetrics;

public class LiveGiftGridListViewLayoutManager$a extends o	// class@001218
{
    public final LiveGiftGridListViewLayoutManager q;

    public void LiveGiftGridListViewLayoutManager$a(LiveGiftGridListViewLayoutManager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public int s(int p0,int p1,int p2,int p3,int p4){
       LiveGiftGridListViewLayoutManager$a uoa = LiveGiftGridListViewLayoutManager$a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 < 0) {
          return (- p0);
       }else if(p1 > p3){
          if (!this.q.getSpanCount()) {
             return 0;
          }else if(((this.f() / this.q.getSpanCount()) + i) == (int)Math.ceil((((double)this.q.getItemCount() * 0x3ff0000000000000) / (double)this.q.getSpanCount()))){
             return (p3 - p1);
          }else {
             return ((((- p0) + p1) - p0) + p2);
          }
       }else {
          return 0;
       }
    }
    public float v(DisplayMetrics p0){
       return (150.00f / (float)p0.densityDpi);
    }
}
