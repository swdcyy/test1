package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$mBubbleShowTask$2$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$mBubbleShowTask$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.util.Set;
import z5c.a;
import com.kwai.library.widget.popup.bubble.a;
import java.util.List;

public final class ProfileDialogBubbleDispatchPresenter$mBubbleShowTask$2$a implements Runnable	// class@001572
{
    public final ProfileDialogBubbleDispatchPresenter$mBubbleShowTask$2 b;

    public void ProfileDialogBubbleDispatchPresenter$mBubbleShowTask$2$a(ProfileDialogBubbleDispatchPresenter$mBubbleShowTask$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ProfileDialogBubbleDispatchPresenter$mBubbleShowTask$2$a.class, "1")) {
          return;
       }
       if (this.b.this$0.R8()) {
          ProfileDialogBubbleDispatchPresenter w = this.b.this$0.w;
          if (w == null) {
             a.S("mBubbleTaskList");
          }
          Iterator iterator = w.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa.a()) {
                uoa = uoa.b();
                if (uoa != null) {
                   a.o(uoa, "this");
                   this.b.this$0.x.add(uoa);
                }
             }
          }
       }
       return;
    }
}
