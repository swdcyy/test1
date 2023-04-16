package com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;

public final class ShareHintTextPresenter$f implements g	// class@0013ac
{
    public static final ShareHintTextPresenter$f b;

    static {
       ShareHintTextPresenter$f.b = new ShareHintTextPresenter$f();
    }
    public void ShareHintTextPresenter$f(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareHintTextPresenter$f.class, "1")) {
       }else {
          a.p(p0, "throwable");
          PostUtils.D("ShareHintTextPresenter", "mEditStatus", p0);
       }
       return;
    }
}
