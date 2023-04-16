package com.kwai.library.slide.base.pagelist.DetailProfileFeedBidirectionalPageList$onCreateRequest$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.library.slide.base.pagelist.DetailProfileFeedBidirectionalPageList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class DetailProfileFeedBidirectionalPageList$onCreateRequest$2 extends FunctionReferenceImpl implements l	// class@0008ea
{

    public void DetailProfileFeedBidirectionalPageList$onCreateRequest$2(DetailProfileFeedBidirectionalPageList p0){
       super(1, p0, DetailProfileFeedBidirectionalPageList.class, "tryRemoveFirstLivePhoto", "tryRemoveFirstLivePhoto\(Lcom/yxcorp/gifshow/model/response/ProfileFeedResponse;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ProfileFeedResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailProfileFeedBidirectionalPageList$onCreateRequest$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.z2(p0);
       return;
    }
}
