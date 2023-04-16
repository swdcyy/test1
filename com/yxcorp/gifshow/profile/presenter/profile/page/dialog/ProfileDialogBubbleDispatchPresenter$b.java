package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$b;
import erd.o;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import a3c.a;

public final class ProfileDialogBubbleDispatchPresenter$b implements o	// class@00156e
{
    public static final ProfileDialogBubbleDispatchPresenter$b b;

    static {
       ProfileDialogBubbleDispatchPresenter$b.b = new ProfileDialogBubbleDispatchPresenter$b();
    }
    public void ProfileDialogBubbleDispatchPresenter$b(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, ProfileDialogBubbleDispatchPresenter$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uBoolean = Boolean.valueOf(a.a(p0, "MAIN_KEY"));
       }
       return uBoolean;
    }
}
