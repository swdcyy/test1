package com.kwai.live.gzone.promotion.d$b;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.promotion.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t67.a;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame;
import java.util.List;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame$ExtraDescUrl;

public class d$b implements View$OnClickListener	// class@000dbd
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       d$b tb = this.b;
       tb.S8(tb.q.c.mExtraDescUrls.get(1).mJumpUrl);
       return;
    }
}
