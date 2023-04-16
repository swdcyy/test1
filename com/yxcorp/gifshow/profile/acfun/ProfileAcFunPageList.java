package com.yxcorp.gifshow.profile.acfun.ProfileAcFunPageList;
import o3c.p;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunPageList$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import wkd.b;
import o3c.l;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunPageList$b;
import erd.g;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunPageList$onCreateRequest$2;
import t1c.e;
import msd.l;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunPageList$onCreateRequest$3;

public final class ProfileAcFunPageList extends p	// class@0011f1
{
    public final String p;
    public static final ProfileAcFunPageList$a q;

    static {
       ProfileAcFunPageList.q = new ProfileAcFunPageList$a(null);
    }
    public void ProfileAcFunPageList(String p0){
       a.p(p0, "userId");
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       ProfileFeedResponse obj = PatchProxy.apply(objArray, this, ProfileAcFunPageList.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          obj = this.L0();
          a.o(obj, "latestPage");
          objArray = obj.getCursor();
       }
       t ot = b.a(0x37313f08).m(this.p, 14, 30, objArray).map(new e()).doOnNext(ProfileAcFunPageList$b.b).doOnNext(new e(new ProfileAcFunPageList$onCreateRequest$2(this))).doOnError(new e(new ProfileAcFunPageList$onCreateRequest$3(this)));
       a.o(ot, "Singleton.get<ProfileApi¡­ror\(this::onNetworkError\)");
       return ot;
    }
}
