package com.yxcorp.dynamicfeature.post.PostApplication$a$a;
import rg.a;
import com.yxcorp.dynamicfeature.post.PostApplication$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;

public class PostApplication$a$a extends a	// class@0011c8
{
    public final PostApplication$a a;

    public void PostApplication$a$a(PostApplication$a p0){
       this.a = p0;
       super();
    }
    public String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostApplication$a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return System.mapLibraryName(p0);
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostApplication$a$a.class, "2")) {
          return;
       }
       System.load(p0);
       return;
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostApplication$a$a.class, "1")) {
          return;
       }
       System.loadLibrary(p0);
       return;
    }
}
