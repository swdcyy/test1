package com.kwai.live.gzone.accompanyplay.anchor.s$e;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.s;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.api.ResultResponse;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyMemberInfo;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import java.util.Iterator;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;

public class s$e implements g	// class@000b35
{
    public final boolean b;
    public final s c;

    public void s$e(s p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$e.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             boolean b = true;
             if (p0.mResult == b) {
                p0 = this.c;
                s r = p0.r;
                r.mConfirmStatus = "5";
                r.mHasEnterGame = (this.b != null)? b: false;
                p0.R8();
                p0 = this.c;
                Objects.requireNonNull(p0);
                Object obj = PatchProxy.apply(null, p0, s.class, "8");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   p0 = p0.t.I.mOnBoardMembers;
                   if (p0 != null) {
                      p0 = p0.iterator();
                      while (p0.hasNext()) {
                         if (!TextUtils.n("5", p0.next().mConfirmStatus)) {
                            b = false;
                            break ;
                         }
                      }
                   }
                }
                if (b && this.c.t.I.mAccompanyStatus == 3) {
                   i.a(R.style.arg_RES_7f11066a, 0x7f102311);
                }
             }else {
                i.d(R.style.arg_RES_7f110668, p0.mErrMsg);
             }
          }
       }
       return;
    }
}
