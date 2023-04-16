package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$f;
import vq5.b;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import com.kuaishou.android.live.log.b;
import android.net.Uri;
import ekd.x0;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import com.kwai.framework.model.user.User;
import xp5.g;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import xp5.i;
import e73.k;
import e73.l;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupJoinButtonInfo;
import z1.a;
import h73.t;

public final class LiveLiteFansGroupPresenter$f implements b	// class@001d99
{
    public final LiveLiteFansGroupPresenter a;

    public void LiveLiteFansGroupPresenter$f(LiveLiteFansGroupPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       boolean b;
       Boolean obj = PatchProxy.apply(null, this, LiveLiteFansGroupPresenter$f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b.S(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.a.v), "open join fansGroup dialog can router", "canShowFansGroupInfo", this.a.K.e().getValue());
       obj = this.a.K.e().getValue();
       b = (obj != null)? obj.booleanValue(): false;
       return b;
    }
    public void b(Uri p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupPresenter$f.class, "1")) {
          return;
       }
       String str = x0.b(p0, "source", "ROUTER");
       LiveLiteFansGroupPresenter$f ta = this.a;
       a.o(str, "sourceType");
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(str, ta, LiveLiteFansGroupPresenter.class, "5")) {
          LiveFansGroupInfo value = ta.K.k().getValue();
          value = (value != null)? value.mLiveFansGroupJoinButtonInfo: null;
          LiveFansGroupInfo liveFansGrou = value;
          LiveLiteFansGroupPresenter m = ta.M;
          if (m != null) {
             LiveLiteFansGroupPresenter x = ta.x;
             if (x == null) {
                a.S("liveLiteAudienceInfoManager");
             }
             User user = x.I();
             x = ta.G;
             if (x == null) {
                a.S("liveLogPackageProvider");
             }
             FeedLogCtx uFeedLogCtx = x.c0();
             if (uFeedLogCtx != null) {
                str1 = uFeedLogCtx.toJsonString();
                if (str1 != null) {
                label_0064 :
                   m.h(user, liveFansGrou, str, str1, new k(ta), new l(ta));
                }
             }
             str1 = "";
             goto label_0064 ;
          }
       }
       b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.a.v), "open join fansGroup dialog from router");
       return;
    }
}
