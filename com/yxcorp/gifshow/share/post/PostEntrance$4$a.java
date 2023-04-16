package com.yxcorp.gifshow.share.post.PostEntrance$4$a;
import n3d.a;
import com.yxcorp.gifshow.share.post.PostEntrance$4;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.Bundle;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;

public class PostEntrance$4$a implements a	// class@001c2d
{
    public final GifshowActivity b;
    public final QPhoto c;
    public final Bundle d;
    public final PostEntrance$4 e;

    public void PostEntrance$4$a(PostEntrance$4 p0,GifshowActivity p1,QPhoto p2,Bundle p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(PostEntrance$4$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PostEntrance$4$a.class, "1")) {
          return;
       }
       if (QCurrentUser.ME.isLogined()) {
          this.e.go(this.b, this.c, this.d);
       }
       return;
    }
}
