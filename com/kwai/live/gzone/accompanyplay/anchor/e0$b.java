package com.kwai.live.gzone.accompanyplay.anchor.e0$b;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.e0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.RuntimeException;
import java.lang.StringBuilder;

public class e0$b implements View$OnClickListener	// class@000b05
{
    public final e0 b;

    public void e0$b(e0 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$b.class, "1")) {
          return;
       }
       e0$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, e0.class, "5")) {
          LiveGzoneAccompanyFleetInfo mAccompanySt = tb.u.mAccompanyStatus;
          if (mAccompanySt != 1 && mAccompanySt != 5) {
             if (!SystemUtil.I()) {
                b.c0(LiveLogTag.LIVE_GZONE_ACCOMPANY, "error operate", "status", Integer.valueOf(tb.u.mAccompanyStatus));
             }else {
                throw new RuntimeException("error accompany status"+tb.u.mAccompanyStatus);
             }
          }else {
             tb.P8();
          }
       }
       return;
    }
}
