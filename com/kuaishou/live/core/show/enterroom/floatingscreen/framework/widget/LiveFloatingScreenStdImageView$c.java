package com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView$c;
import java.lang.Runnable;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenImageItem;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class LiveFloatingScreenStdImageView$c implements Runnable	// class@000b15
{
    public final LiveFloatingScreenStdImageView b;
    public final LiveFloatingScreenImageItem c;

    public void LiveFloatingScreenStdImageView$c(LiveFloatingScreenStdImageView p0,LiveFloatingScreenImageItem p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenStdImageView$c.class, "1")) {
          return;
       }
       CDNUrl[] backupPicUrl = this.c.getBackupPicUrl();
       LiveFloatingScreenStdImageView$c uoc = null;
       if (backupPicUrl != null) {
          int i = (!backupPicUrl.length)? 1: 0;
          if (!i) {
          label_001f :
             if (!uoc) {
                this.b.U(backupPicUrl);
             }
             return;
          }
       }
       uoc = 1;
       goto label_001f ;
    }
}
