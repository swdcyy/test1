package com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class GrowthInvitePageFragment$b implements Runnable	// class@0013c7
{
    public final GrowthInvitePageFragment b;

    public void GrowthInvitePageFragment$b(GrowthInvitePageFragment p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthInvitePageFragment$b.class, "1")) {
          return;
       }
       PhotoDetailParam photoDetailP = this.b.rh();
       if (photoDetailP != null) {
          photoDetailP = photoDetailP.mPhoto;
          if (photoDetailP != null) {
             this.b.y.F1(photoDetailP, "GrowthInvitePageFragment");
          }
       }
       return;
    }
}
