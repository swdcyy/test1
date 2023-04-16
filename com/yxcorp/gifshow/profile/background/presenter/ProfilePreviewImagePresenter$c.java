package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$c;
import erd.o;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.io.File;
import qkd.c;
import android.app.Application;
import o56.a;
import android.content.Context;
import jxb.a;

public final class ProfilePreviewImagePresenter$c implements o	// class@001263
{
    public final ProfilePreviewImagePresenter b;

    public void ProfilePreviewImagePresenter$c(ProfilePreviewImagePresenter p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, ProfilePreviewImagePresenter$c.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          File uFile = new File(this.b.R8(p0));
          uBoolean = Boolean.valueOf(c.c(new File(p0), uFile));
          if (uBoolean.booleanValue()) {
             a.f(a.b(), uFile);
          }
       }
       return uBoolean;
    }
}
