package com.yxcorp.gifshow.model.response.EditTimedVisibleText;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class EditTimedVisibleText	// class@001f35
{
    public String bubble1;
    public String bubble2;
    public String button;

    public void EditTimedVisibleText(){
       super();
       this.button = null;
       this.bubble1 = null;
       this.bubble2 = null;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditTimedVisibleText.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof EditTimedVisibleText && (a.g(this.button, p0.button) && (a.g(this.bubble1, p0.bubble1) && a.g(this.bubble2, p0.bubble2))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       EditTimedVisibleText obj = PatchProxy.apply(null, this, EditTimedVisibleText.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.button;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       EditTimedVisibleText tbubble1 = this.bubble1;
       int i2 = (tbubble1 != null)? tbubble1.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbubble1 = this.bubble2;
       if (tbubble1 != null) {
          i = tbubble1.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditTimedVisibleText.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EditTimedVisibleText\(button="+this.button+", bubble1="+this.bubble1+", bubble2="+this.bubble2+"\)";
    }
}
