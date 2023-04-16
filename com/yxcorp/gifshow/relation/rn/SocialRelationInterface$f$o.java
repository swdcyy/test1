package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$o;
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

public final class SocialRelationInterface$f$o implements Runnable	// class@001975
{
    public final SocialRelationInterface$f b;
    public final GifshowActivity c;

    public void SocialRelationInterface$f$o(SocialRelationInterface$f p0,GifshowActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SocialRelationInterface$f$o.class, "1")) {
          return;
       }
       SocialRelationInterface$f$o tb = this.b;
       tb.b.onClickRemark(tb.c, this.c);
       return;
    }
}
