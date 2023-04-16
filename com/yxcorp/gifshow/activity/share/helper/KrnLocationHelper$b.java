package com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KrnLocationHelper$b	// class@001389
{
    public final String downLoadUri;
    public final String schemeUri;

    public void KrnLocationHelper$b(){
       a.p("", "schemeUri");
       a.p("", "downLoadUri");
       super();
       this.schemeUri = "";
       this.downLoadUri = "";
    }
    public final String a(){
       return this.schemeUri;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnLocationHelper$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KrnLocationHelper$b && (a.g(this.schemeUri, p0.schemeUri) && a.g(this.downLoadUri, p0.downLoadUri)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       KrnLocationHelper$b obj = PatchProxy.apply(null, this, KrnLocationHelper$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.schemeUri;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KrnLocationHelper$b tdownLoadUri = this.downLoadUri;
       if (tdownLoadUri != null) {
          i = tdownLoadUri.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KrnLocationHelper$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnLocationConfig\(schemeUri="+this.schemeUri+", downLoadUri="+this.downLoadUri+"\)";
    }
}
