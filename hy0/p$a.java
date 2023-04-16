package hy0.p$a;
import sfc.a;
import hy0.p;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import com.google.common.base.b;
import com.yxcorp.retrofit.model.KwaiException;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.google.gson.JsonElement;
import hy0.v;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class p$a extends a	// class@0027b0
{
    public final int c;
    public final p d;

    public void p$a(p p0,int p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       try{
          super.b(p0);
          p$a td = this.d;
          p$a tc = this.c;
          Objects.requireNonNull(td);
          p op = p.class;
          if (PatchProxy.isSupport(op) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(tc), p0, td, op, "7") && p0 != null)) {
             p0 = b.c(p0);
             if (p0 instanceof KwaiException) {
                v.b(td.p.Z2.a(), 8, tc, p0.getErrorCode(), e.r(td.getActivity()), td.u, td.p.c0());
             }
             b.I(LiveLogTag.LIVE_BULLET_COMMENT, "send bullet comment error with shot code:", p0);
          }
       label_005f :
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
}
