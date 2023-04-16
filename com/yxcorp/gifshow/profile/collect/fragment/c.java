package com.yxcorp.gifshow.profile.collect.fragment.c;
import erd.g;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import r2c.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import s1c.r0;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserOwnerCount;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.UserProfile;
import com.yxcorp.gifshow.profile.common.model.UserCollectCount;
import x2c.a;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.profile.constant.ProfileTab;
import k2b.e0;
import t3c.c;
import y8c.t;
import j2c.j;
import java.lang.StringBuilder;
import lnc.a1;
import i2c.k;
import lkd.b;

public final class c implements g	// class@0012b4
{
    public final CollectionPostFragment b;
    public final int c;

    public void c(CollectionPostFragment p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       int i;
       User mOwnerCount;
       c tb = this.b;
       c tc = this.c;
       p0 = tb.J;
       int count = tb.q().getCount();
       i oi = i.class;
       ProfileParam profileParam = null;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(count), profileParam, oi, "1")) {
          a.p(p0, "profilePageParam");
          r0 b = p0.b;
          i = 0;
          if (b != null) {
             mOwnerCount = b.mOwnerCount;
             if (mOwnerCount != null) {
                mOwnerCount.mCollection = count;
                mOwnerCount = 1;
             label_003a :
                r0 d = p0.d;
                if (d != null) {
                   profileParam = d.mUserProfile;
                }
                UserCollectCount userCollectC = a.c(profileParam);
                if (userCollectC != null) {
                   userCollectC.mPhoto = String.valueOf(count);
                   i = 1;
                }
                if (mOwnerCount || i) {
                   p0 = p0.b;
                   if (p0 != null) {
                      p0.notifyChanged();
                   }
                }
             }
          }
          mOwnerCount = 0;
          goto label_003a ;
       }
    label_0058 :
       c.d(tb, tc, ProfileTab.TAB_COLLECT);
       if (tb.q().isEmpty()) {
          tb.sh().D(new k(a1.p(R.string.arg_RES_7f10394f)));
          tb.sh().i();
       }else {
          tb.Nh(tc, true);
          tb.Ph();
       }
       return;
    }
}
