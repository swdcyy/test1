package com.yxcorp.gifshow.profile.preview.template.ProfileTemplateCardItemPresenter$mIsDarkMode$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zf6.k;

public final class ProfileTemplateCardItemPresenter$mIsDarkMode$2 extends Lambda implements a	// class@00159c
{
    public static final ProfileTemplateCardItemPresenter$mIsDarkMode$2 INSTANCE;

    static {
       ProfileTemplateCardItemPresenter$mIsDarkMode$2.INSTANCE = new ProfileTemplateCardItemPresenter$mIsDarkMode$2();
    }
    public void ProfileTemplateCardItemPresenter$mIsDarkMode$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, ProfileTemplateCardItemPresenter$mIsDarkMode$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k.d();
    }
}
