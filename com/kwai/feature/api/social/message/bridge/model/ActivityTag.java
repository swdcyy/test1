package com.kwai.feature.api.social.message.bridge.model.ActivityTag;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ActivityTag	// class@00111c
{
    public final int style;
    public final String text;
    public final int type;

    public void ActivityTag(String p0,int p1,int p2){
       a.p(p0, "text");
       super();
       this.text = p0;
       this.type = p1;
       this.style = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivityTag.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ActivityTag && (a.g(this.text, p0.text) && (this.type == p0.type && this.style == p0.style)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ActivityTag obj = PatchProxy.apply(null, this, ActivityTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.text;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((((i * 31) + this.type) * 31) + this.style);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ActivityTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ActivityTag\(text="+this.text+", type="+this.type+", style="+this.style+"\)";
    }
}
