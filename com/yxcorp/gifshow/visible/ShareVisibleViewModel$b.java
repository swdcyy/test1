package com.yxcorp.gifshow.visible.ShareVisibleViewModel$b;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Enum;
import java.lang.StringBuilder;

public final class ShareVisibleViewModel$b	// class@0016bc
{
    public final PhotoVisibility a;
    public final boolean b;
    public final boolean c;

    public void ShareVisibleViewModel$b(PhotoVisibility p0,boolean p1,boolean p2){
       a.p(p0, "visibility");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean a(){
       return this.b;
    }
    public final PhotoVisibility b(){
       return this.a;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof ShareVisibleViewModel$b && (this.a == p0.a && this.b == p0.b))? true: false;
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ShareVisibleViewModel$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a.hashCode() * 31;
       int i1 = (this.b != null)? 1231: 1237;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShareVisibleViewModel$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PhotoVisibilityInfo\(visibility="+this.a+", onlyIntimateVisible="+this.b+", changeFromClicked="+this.c+"\)";
    }
}
