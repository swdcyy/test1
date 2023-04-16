package jx0.i$b;
import com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBaseBlindDateRightPendantView$b;
import jx0.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import lp3.c;
import lp3.i;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import java.lang.Integer;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import vq5.d;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.HashSet;
import java.lang.StringBuilder;

public class i$b implements LiveBaseBlindDateRightPendantView$b	// class@002c2a
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, i$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.M.a(LiveAudienceApplyChatService.class).jh() == LiveAudienceApplyChatService$State.APPLYING)? true: false;
       return b;
    }
    public void b(String p0,int p1){
       boolean b;
       i$b uob = i$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       Object obj = PatchProxy.applyOneRefs(p0, uob, i.class, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!TextUtils.x(p0) && uob.L.P0(p0)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          uob = this.a;
          uob.L.r4(p0, uob.getContext());
       }else {
          b.Z(LiveCommonLogTag.BLIND_DATE, "getUrl success,but jumpUrl is null");
       }
       this.a.e9(p1);
       return;
    }
    public void c(String p0,int p1){
       i$b uob = i$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       this.a.R.add(p0);
       this.a.e9(p1);
       this.a.b9();
       b.Z(LiveCommonLogTag.BLIND_DATE, "BlindPendant onclick close  bizId = "+p0);
       return;
    }
}
