package com.yxcorp.dynamicfeature.post.PostApplication$a;
import rg.c$c;
import com.yxcorp.dynamicfeature.post.PostApplication;
import java.util.Collection;
import java.lang.Object;
import rg.d$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.dynamicfeature.post.PostApplication$a$a;
import java.lang.Boolean;

public class PostApplication$a implements c$c	// class@0011c9
{
    public final Collection a;
    public final PostApplication b;

    public void PostApplication$a(PostApplication p0,Collection p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public d$b a(){
       Object obj = PatchProxy.apply(null, this, PostApplication$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PostApplication$a$a(this);
    }
    public boolean enable(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostApplication$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.contains(p0);
    }
}
