package com.yxcorp.gifshow.profile.acfun.ProfileAcFunPageList$onCreateRequest$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunPageList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import qvb.n0;

public final class ProfileAcFunPageList$onCreateRequest$2 extends FunctionReferenceImpl implements l	// class@0011ef
{

    public void ProfileAcFunPageList$onCreateRequest$2(ProfileAcFunPageList p0){
       super(1, p0, ProfileAcFunPageList.class, "onCompletedEvent", "onCompletedEvent\(Ljava/lang/Object;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ProfileFeedResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileAcFunPageList$onCreateRequest$2.class, "1")) {
          return;
       }
       this.receiver.onCompletedEvent(p0);
       return;
    }
}
