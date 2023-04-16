package com.kuaishou.live.gzone.v2.profile.e$g$b;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e$g;
import java.lang.Object;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import com.kuaishou.live.gzone.v2.profile.e;
import com.kwai.framework.model.user.User;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.live.gzone.v2.profile.j;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class e$g$b implements g	// class@001ce5
{
    public final e$g b;

    public void e$g$b(e$g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$g$b.class, "1")) {
       }else if(p0 != null){
          LiveLogTag lIVE_PROFILE = LiveLogTag.LIVE_PROFILE;
          StringBuilder str = "liveProfileFeed request finished, UserId:"+this.b.b.q.mId+" count";
          int i = (p0.getItems() == null)? 0: p0.getItems().size();
          b.Z(lIVE_PROFILE, str+i);
          Iterator iterator = p0.getItems().iterator();
          while (iterator.hasNext()) {
             BaseFeed uBaseFeed = iterator.next();
             r1.o5(uBaseFeed, 5);
             r1.Y4(uBaseFeed, p0.getLlsid());
          }
          if (p0.getItems() == null || p0.getItems().isEmpty()) {
             if (r1.S2(this.b.b.Z.v1().get(0))) {
                this.b.b.Z.v1().remove(0);
             }
          }else if(r1.S2(this.b.b.Z.v1().get(0))){
             this.b.b.Z.v1().set(0, p0.getItems().get(0));
          }else {
             this.b.b.Z.v1().add(0, p0.getItems().get(0));
          }
          this.b.b.Z.k0();
       }
       return;
    }
}
