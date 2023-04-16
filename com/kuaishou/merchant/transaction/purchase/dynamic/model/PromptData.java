package com.kuaishou.merchant.transaction.purchase.dynamic.model.PromptData;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PromptData	// class@000912
{
    public String content;
    public String title;

    public void PromptData(){
       super();
       this.title = null;
       this.content = null;
    }
    public final String a(){
       return this.content;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PromptData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PromptData && (a.g(this.title, p0.title) && a.g(this.content, p0.content)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       PromptData obj = PatchProxy.apply(null, this, PromptData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PromptData tcontent = this.content;
       if (tcontent != null) {
          i = tcontent.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PromptData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PromptData\(title="+this.title+", content="+this.content+"\)";
    }
}
