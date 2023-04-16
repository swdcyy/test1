package com.yxcorp.gifshow.follow.stagger.post.IPublishPhotoViewImpl$mMockPresenter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IPublishPhotoViewImpl$mMockPresenter$2 extends Lambda implements a	// class@0011be
{
    public static final IPublishPhotoViewImpl$mMockPresenter$2 INSTANCE;

    static {
       IPublishPhotoViewImpl$mMockPresenter$2.INSTANCE = new IPublishPhotoViewImpl$mMockPresenter$2();
    }
    public void IPublishPhotoViewImpl$mMockPresenter$2(){
       super(0);
    }
    public final MockFeedPresenter invoke(){
       Object obj = PatchProxy.apply(null, this, IPublishPhotoViewImpl$mMockPresenter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MockFeedPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
