package com.kuaishou.krn.bridges.kds.bridges.beans.EventParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class EventParams implements Serializable	// class@00081f
{
    public final String listener;
    public final String type;

    public void EventParams(String p0,String p1){
       a.p(p0, "type");
       super();
       this.type = p0;
       this.listener = p1;
    }
    public final String getListener(){
       return this.listener;
    }
    public final String getType(){
       return this.type;
    }
}
