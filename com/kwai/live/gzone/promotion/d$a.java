package com.kwai.live.gzone.promotion.d$a;
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

public class d$a implements View$OnClickListener	// class@000dbc
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       tb.S8(tb.q.c.mExtraDescUrls.get(0).mJumpUrl);
       return;
    }
}
