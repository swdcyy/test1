package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$r;
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

public final class SocialRelationInterface$f$r implements Runnable	// class@001978
{
    public final SocialRelationInterface$f b;
    public final GifshowActivity c;

    public void SocialRelationInterface$f$r(SocialRelationInterface$f p0,GifshowActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SocialRelationInterface$f$r.class, "1")) {
          return;
       }
       SocialRelationInterface$f$r tb = this.b;
       tb.b.onClickChat(tb.c, this.c);
       return;
    }
}
