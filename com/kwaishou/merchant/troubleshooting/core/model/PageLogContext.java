package com.kwaishou.merchant.troubleshooting.core.model.PageLogContext;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;

public final class PageLogContext implements Serializable	// class@001356
{
    public final ConcurrentHashMap b;
    public final List env;
    public final List nodeList;
    public final List originData;

    public void PageLogContext(){
       super();
       List list = Collections.synchronizedList(new ArrayList());
       a.o(list, "synchronizedList\(arrayListOf\(\)\)");
       this.nodeList = list;
       list = Collections.synchronizedList(new ArrayList());
       a.o(list, "synchronizedList\(arrayListOf\(\)\)");
       this.env = list;
       list = Collections.synchronizedList(new ArrayList());
       a.o(list, "synchronizedList\(arrayListOf\(\)\)");
       this.originData = list;
       this.b = new ConcurrentHashMap();
    }
    public final List getEnv(){
       return this.env;
    }
    public final List getNodeList(){
       return this.nodeList;
    }
    public final List getOriginData(){
       return this.originData;
    }
    public final ConcurrentHashMap getOriginDataCountMap(){
       return this.b;
    }
}
