package com.kwai.live.gzone.promotion.q;
import erd.c;
import com.kwai.live.gzone.promotion.o;
import java.lang.Object;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGameResourceListResponse;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGameListResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.Pair;

public class q implements c	// class@000dd6
{
    public final o a;

    public void q(o p0){
       this.a = p0;
       super();
    }
    public Object a(Object p0,Object p1){
       Pair pair = PatchProxy.applyTwoRefs(p0, p1, this, q.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          pair = new Pair(p1, p0);
       }
       return pair;
    }
}
