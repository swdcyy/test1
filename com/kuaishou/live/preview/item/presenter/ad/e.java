package com.kuaishou.live.preview.item.presenter.ad.e;
import erd.g;
import com.kuaishou.live.preview.item.presenter.ad.g;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import pp.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import sx.d;
import el3.d;
import com.yxcorp.gifshow.entity.QPhoto;
import el3.m;
import com.kwai.framework.model.feed.BaseFeed;
import kotlin.Pair;
import rx.d;

public final class e implements g	// class@000e0e
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.C().s(g.B, "live play state :"+p0, objArray);
       int i = p0.intValue();
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                tb.R8();
             }
          }else {
             tb.P8();
          }
       }else {
          d.P8().z0(66, tb.p.mEntity, "", null, new m(tb));
          tb.R8();
       }
       return;
    }
}
