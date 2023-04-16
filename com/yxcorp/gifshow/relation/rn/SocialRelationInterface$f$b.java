package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$b;
import android.content.DialogInterface$OnCancelListener;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f;
import java.util.ArrayList;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import hcc.j0;
import com.facebook.react.bridge.Promise;

public final class SocialRelationInterface$f$b implements DialogInterface$OnCancelListener	// class@001968
{
    public final SocialRelationInterface$f b;
    public final ArrayList c;

    public void SocialRelationInterface$f$b(SocialRelationInterface$f p0,ArrayList p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SocialRelationInterface$f$b.class, "1")) {
          return;
       }
       j0.n(this.b.c, "cancel");
       this.b.f.resolve("cancel");
       PatchProxy.onMethodExit(SocialRelationInterface$f$b.class, "1");
       return;
    }
}
