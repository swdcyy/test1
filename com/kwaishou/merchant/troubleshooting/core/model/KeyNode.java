package com.kwaishou.merchant.troubleshooting.core.model.KeyNode;
import com.kwaishou.merchant.troubleshooting.core.model.Node;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwaishou.merchant.troubleshooting.core.model.State;
import java.lang.StringBuilder;
import java.util.UUID;

public final class KeyNode extends Node	// class@00134f
{
    public String belong;
    public String name;
    public State state;

    public void KeyNode(String p0,String p1){
       a.p(p0, "name");
       a.p(p1, "belong");
       super();
       this.name = p0;
       this.belong = p1;
       this.state = State.NONE;
       this.setId(this.name+'_'+UUID.randomUUID());
    }
    public final String getBelong(){
       return this.belong;
    }
    public final String getName(){
       return this.name;
    }
    public final State getState(){
       return this.state;
    }
    public final void setBelong(String p0){
       a.p(p0, "<set-?>");
       this.belong = p0;
    }
    public final void setName(String p0){
       a.p(p0, "<set-?>");
       this.name = p0;
    }
    public final void setState(State p0){
       a.p(p0, "<set-?>");
       this.state = p0;
    }
}
