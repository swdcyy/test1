package com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AuthorShareGuideDialog$a	// class@0015d0
{
    public final int a;
    public final String b;

    public void AuthorShareGuideDialog$a(int p0,String p1){
       a.p(p1, "channel");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AuthorShareGuideDialog$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AuthorShareGuideDialog$a && (this.a == p0.a && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, AuthorShareGuideDialog$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a * 31;
       AuthorShareGuideDialog$a tb = this.b;
       int i1 = (tb != null)? tb.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AuthorShareGuideDialog$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Platform\(res="+this.a+", channel="+this.b+"\)";
    }
}
