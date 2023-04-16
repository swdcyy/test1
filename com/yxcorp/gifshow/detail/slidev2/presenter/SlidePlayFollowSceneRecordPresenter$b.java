package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayFollowSceneRecordPresenter$b;
import erd.o;
import java.lang.Object;
import uic.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class SlidePlayFollowSceneRecordPresenter$b implements o	// class@0018c6
{
    public static final SlidePlayFollowSceneRecordPresenter$b b;

    static {
       SlidePlayFollowSceneRecordPresenter$b.b = new SlidePlayFollowSceneRecordPresenter$b();
    }
    public void SlidePlayFollowSceneRecordPresenter$b(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, SlidePlayFollowSceneRecordPresenter$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          uBoolean = Boolean.valueOf(p0.a());
       }
       return uBoolean;
    }
}
