package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$i;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import android.app.Activity;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface;

public final class SocialRelationInterface$f$i implements Runnable	// class@00196f
{
    public final SocialRelationInterface$f b;
    public final GifshowActivity c;

    public void SocialRelationInterface$f$i(SocialRelationInterface$f p0,GifshowActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SocialRelationInterface$f$i.class, "1")) {
          return;
       }
       SocialRelationInterface$f$i tb = this.b;
       tb.b.onClickRemoveFollower(tb.c, this.c);
       return;
    }
}
