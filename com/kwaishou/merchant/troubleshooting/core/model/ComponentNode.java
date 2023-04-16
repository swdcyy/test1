package com.kwaishou.merchant.troubleshooting.core.model.ComponentNode;
import com.kwaishou.merchant.troubleshooting.core.model.Node;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class ComponentNode extends Node	// class@00134e
{
    public String componentCode;
    public String componentId;

    public void ComponentNode(String p0,String p1){
       a.p(p0, "componentId");
       a.p(p1, "componentCode");
       super();
       this.componentId = p0;
       this.componentCode = p1;
       this.setId(p0);
       this.setTag(this.componentCode);
    }
    public final String getComponentCode(){
       return this.componentCode;
    }
    public final String getComponentId(){
       return this.componentId;
    }
    public final void setComponentCode(String p0){
       a.p(p0, "<set-?>");
       this.componentCode = p0;
    }
    public final void setComponentId(String p0){
       a.p(p0, "<set-?>");
       this.componentId = p0;
    }
}
