package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$d;
import erd.o;
import java.lang.Object;
import j5c.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class ProfileDialogBubbleDispatchPresenter$d implements o	// class@001570
{
    public static final ProfileDialogBubbleDispatchPresenter$d b;

    static {
       ProfileDialogBubbleDispatchPresenter$d.b = new ProfileDialogBubbleDispatchPresenter$d();
    }
    public void ProfileDialogBubbleDispatchPresenter$d(){
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, ProfileDialogBubbleDispatchPresenter$d.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "state");
          integer = Integer.valueOf(p0.a);
       }
       return integer;
    }
}
