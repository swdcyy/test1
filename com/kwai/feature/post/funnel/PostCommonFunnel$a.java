package com.kwai.feature.post.funnel.PostCommonFunnel$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PostCommonFunnel$a	// class@0014a0
{
    public final String a;

    public void PostCommonFunnel$a(String p0){
       a.p(p0, "name");
       super();
       this.a = p0;
    }
    public final String a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostCommonFunnel$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PostCommonFunnel$a && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       PostCommonFunnel$a obj = PatchProxy.apply(null, this, PostCommonFunnel$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PostCommonFunnel$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Action\(name="+this.a+"\)";
    }
}