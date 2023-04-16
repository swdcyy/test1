package com.kwai.locallife.live.bullet.a$a$a;
import n3d.a;
import com.kwai.locallife.live.bullet.a$a;
import com.kwai.locallife.live.bullet.LiveLocalLifeBuyingBulletData;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.locallife.live.bullet.a;

public class a$a$a implements a	// class@000eb2
{
    public final LiveLocalLifeBuyingBulletData b;
    public final a$a c;

    public void a$a$a(a$a p0,LiveLocalLifeBuyingBulletData p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(a$a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a$a$a.class, "1")) {
          return;
       }
       if (QCurrentUser.ME.isLogined()) {
          this.c.a.P8(this.b);
       }
       return;
    }
}
