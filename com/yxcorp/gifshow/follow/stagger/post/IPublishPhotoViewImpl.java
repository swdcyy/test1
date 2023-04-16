package com.yxcorp.gifshow.follow.stagger.post.IPublishPhotoViewImpl;
import o26.a;
import java.lang.Object;
import com.yxcorp.gifshow.follow.stagger.post.IPublishPhotoViewImpl$mMockPresenter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenterV2;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter;
import java.lang.Boolean;
import lnc.s6;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import mv5.b;

public final class IPublishPhotoViewImpl implements a	// class@0011bf
{
    public final p b;

    public void IPublishPhotoViewImpl(){
       super();
       this.b = s.c(IPublishPhotoViewImpl$mMockPresenter$2.INSTANCE);
    }
    public PresenterV2 a(int p0){
       if (PatchProxy.isSupport2(IPublishPhotoViewImpl.class, "4")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, IPublishPhotoViewImpl.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PresenterV2 presenterV2 = null;
       if (this.c()) {
          PatchProxy.onMethodExit(IPublishPhotoViewImpl.class, "4");
          return presenterV2;
       }else if(p0 != 1){
          presenterV2 = new MockFeedPresenterV2();
       }
       PatchProxy.onMethodExit(IPublishPhotoViewImpl.class, "4");
       return presenterV2;
    }
    public PresenterV2 b(){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.applyWithListener(objArray, this, IPublishPhotoViewImpl.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.c()) {
          obj1 = PatchProxy.apply(objArray, this, IPublishPhotoViewImpl.class, "1");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = this.b.getValue();
          }
       }else {
          obj1 = new PresenterV2();
       }
       PatchProxy.onMethodExit(IPublishPhotoViewImpl.class, "3");
       return obj1;
    }
    public final boolean c(){
       b obj = PatchProxy.apply(null, this, IPublishPhotoViewImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (s6.n() && s6.t() == b) {
          obj = d.a(0x3ee97dc2);
          a.o(obj, "PluginManager.get\(FriendTabPlugin::class.java\)");
          if (obj.ZW()) {
          label_0037 :
             return b;
          }
       }
       b = false;
       goto label_0037 ;
    }
}
