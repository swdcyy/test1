package com.kwai.live.gzone.accompanyplay.edit.g$a$a;
import erd.o;
import com.kwai.live.gzone.accompanyplay.edit.g$a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyCurrentAccompanyInfo;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import brd.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.accompanyplay.edit.g;
import com.kwai.live.gzone.accompanyplay.api.LiveGzoneAccompanyFleetCreateResponse;
import brd.t;
import j37.b;
import j37.a;
import cjd.e;

public class g$a$a implements o	// class@000be5
{
    public final LiveGzoneAccompanyCurrentAccompanyInfo b;
    public final g$a c;

    public void g$a$a(g$a p0,LiveGzoneAccompanyCurrentAccompanyInfo p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public w a(LiveGzoneAccompanyFleetInfo p0){
       LiveGzoneAccompanyFleetInfo obj = PatchProxy.applyOneRefs(p0, this, g$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mBindGameAccountInfo;
       if (obj != null) {
          LiveGzoneAccompanyFleetSetting mBindGameAcc = this.c.c.mBindGameAccountInfo;
          if (mBindGameAcc != null && !TextUtils.n(mBindGameAcc.mGameUid, obj.mGameUid)) {
             g$a$a tc = this.c;
             return tc.d.f(this.b.mAccompanyId, tc.b, tc.c.mFleetId);
          }
       }
       obj = p0.mAccompanyId;
       if (obj != null && !("0").equals(obj)) {
          LiveGzoneAccompanyFleetCreateResponse liveGzoneAcc = new LiveGzoneAccompanyFleetCreateResponse();
          liveGzoneAcc.mAccompanyId = p0.mAccompanyId;
          LiveGzoneAccompanyFleetInfo mCreatingRou = p0.mCreatingRoundId;
          liveGzoneAcc.mRoundId = (mCreatingRou > 0)? String.valueOf(mCreatingRou): p0.mRoundId;
          return t.just(liveGzoneAcc);
       }else {
          g$a$a tc1 = this.c;
          return a.b().h(tc1.b, tc1.c.mFleetId).map(new e());
       }
    }
    public Object apply(Object p0){
       return this.a(p0);
    }
}
