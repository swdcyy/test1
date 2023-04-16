package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$g;
import a17.b$b;
import android.app.Activity;
import java.util.List;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.relation.intimate.helper.i;
import k2b.e0;
import cbc.b;

public final class SocialRelationInterface$g implements b$b	// class@00197e
{
    public final Activity a;
    public final List b;
    public final User c;

    public void SocialRelationInterface$g(Activity p0,List p1,User p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(c p0,View p1,int p2){
       if (PatchProxy.isSupport2(SocialRelationInterface$g.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, SocialRelationInterface$g.class, "1")) {
          return;
       }
       a.p(p0, "sheet");
       if (!p2) {
          i.g(this.c.mId, 2);
          b.g(this.a);
       }
       PatchProxy.onMethodExit(SocialRelationInterface$g.class, "1");
       return;
    }
}
