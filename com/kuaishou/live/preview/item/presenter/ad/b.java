package com.kuaishou.live.preview.item.presenter.ad.b;
import java.lang.Runnable;
import com.kuaishou.live.preview.item.presenter.ad.c;
import java.lang.Object;
import java.util.Collection;
import ekd.q;
import java.util.List;
import pp.a;
import java.lang.String;
import q87.c;
import wk3.f;
import java.lang.Integer;
import java.lang.StringBuilder;
import sx.d;
import el3.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.preview.item.presenter.ad.a;
import com.kwai.framework.model.feed.BaseFeed;
import kotlin.Pair;
import erd.g;
import rx.d;
import el3.e;

public final class b implements Runnable	// class@000e08
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       if (q.f(tb.v)) {
       }else {
          int i = 0;
          if (tb.x >= tb.v.size()) {
             Object[] objArray = new Object[i];
             a.C().s(c.B, "all play time has reported", objArray);
             tb.R8(i);
          }else if(!tb.t.isSelected()){
             int i1 = tb.v.get(tb.x).intValue();
             if (tb.w >= i1) {
                Object[] objArray1 = new Object[i];
                a.C().s(c.B, "report:"+i1, objArray1);
                d uod = d.P8();
                if (!i1) {
                   uod.z0(68, tb.p.mEntity, "", null, a.b);
                }else {
                   uod.z0(69, tb.p.mEntity, "", null, new e(i1));
                }
                tb.x = tb.x + 1;
             }
             tb.w = tb.w + 500;
          }
       }
       return;
    }
}
