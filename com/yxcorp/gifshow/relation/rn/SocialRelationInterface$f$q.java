package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$q;
import z1.a;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import android.app.Activity;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface;

public final class SocialRelationInterface$f$q implements a	// class@001977
{
    public final SocialRelationInterface$f a;
    public final GifshowActivity b;

    public void SocialRelationInterface$f$q(SocialRelationInterface$f p0,GifshowActivity p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface$f$q.class, "1")) {
       }else {
          SocialRelationInterface$f$q ta = this.a;
          ta.b.onClickFavorite(ta.c, this.b, p0);
       }
       return;
    }
}
