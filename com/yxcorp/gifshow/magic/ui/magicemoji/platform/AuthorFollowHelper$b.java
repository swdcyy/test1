package com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper$b;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;

public final class AuthorFollowHelper$b implements AuthorFollowHelper$a	// class@001be1
{
    public final AuthorFollowHelper a;
    public final String b;

    public void AuthorFollowHelper$b(AuthorFollowHelper p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AuthorFollowHelper$b.class, "1")) {
          return;
       }
       this.a.g(this.b);
       this.a.l.remove(this);
       return;
    }
}
