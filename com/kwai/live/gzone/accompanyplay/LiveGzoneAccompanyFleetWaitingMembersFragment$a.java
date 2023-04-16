package com.kwai.live.gzone.accompanyplay.LiveGzoneAccompanyFleetWaitingMembersFragment$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.LiveGzoneAccompanyFleetWaitingMembersFragment;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import k37.p1;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import fq5.b;
import k37.a0;
import java.lang.Integer;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import o37.a;

public class LiveGzoneAccompanyFleetWaitingMembersFragment$a implements g	// class@000ae9
{
    public final LiveGzoneAccompanyFleetWaitingMembersFragment b;

    public void LiveGzoneAccompanyFleetWaitingMembersFragment$a(LiveGzoneAccompanyFleetWaitingMembersFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       i3 oi3;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAccompanyFleetWaitingMembersFragment$a.class, "1")) {
       }else {
          LiveGzoneAccompanyFleetWaitingMembersFragment$a tb = this.b;
          a$a a = p0.a;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(a, tb, LiveGzoneAccompanyFleetWaitingMembersFragment.class, "3")) {
             tb.H.a.w0(new UserProfile(a), LiveStreamClickType.LIVE_GZONE_ACCOMPANY, 42, true, 0);
          }
          tb = this.b;
          LiveGzoneAccompanyFleetWaitingMembersFragment k = tb.K;
          LiveGzoneAccompanyFleetWaitingMembersFragment i = tb.I;
          LiveGzoneAccompanyFleetWaitingMembersFragment j = tb.J;
          LiveGzoneAccompanyFleetWaitingMembersFragment l = tb.L;
          p0 = p0.b;
          a0 uoa0 = a0.class;
          if (PatchProxy.isSupport(uoa0)) {
             Object[] objArray = new Object[]{k,i,j,l,Integer.valueOf(p0)};
             if (!PatchProxy.applyVoid(objArray, null, uoa0, "13")) {
             }
          }else {
          }
       }
       return;
    }
}
