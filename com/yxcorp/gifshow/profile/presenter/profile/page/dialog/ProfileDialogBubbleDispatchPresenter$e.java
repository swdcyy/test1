package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$e;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter;
import java.lang.Object;
import j5c.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import qrd.l1;
import z5c.u;

public final class ProfileDialogBubbleDispatchPresenter$e implements g	// class@001571
{
    public final ProfileDialogBubbleDispatchPresenter b;

    public void ProfileDialogBubbleDispatchPresenter$e(ProfileDialogBubbleDispatchPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileDialogBubbleDispatchPresenter$e.class, "1")) {
       }else {
          p0 = this.b.x.iterator();
          while (p0.hasNext()) {
             a uoa = p0.next();
             if (uoa.K()) {
                u.c(uoa);
             }
          }
       }
       return;
    }
}
