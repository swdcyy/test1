package com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationTemplatePageList$onCreateRequest$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationTemplatePageList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplateResponse;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import qvb.n0;

public final class ProfileCreationTemplatePageList$onCreateRequest$1 extends FunctionReferenceImpl implements l	// class@001306
{

    public void ProfileCreationTemplatePageList$onCreateRequest$1(ProfileCreationTemplatePageList p0){
       super(1, p0, ProfileCreationTemplatePageList.class, "onCompletedEvent", "onCompletedEvent\(Ljava/lang/Object;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(KwaiTemplateResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileCreationTemplatePageList$onCreateRequest$1.class, "1")) {
          return;
       }
       this.receiver.onCompletedEvent(p0);
       return;
    }
}
