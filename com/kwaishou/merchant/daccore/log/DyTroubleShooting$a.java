package com.kwaishou.merchant.daccore.log.DyTroubleShooting$a;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class DyTroubleShooting$a	// class@00131d
{
    public Map a;
    public ConcurrentHashMap b;

    public void DyTroubleShooting$a(){
       super();
       this.a = Collections.synchronizedMap(new LinkedHashMap());
       this.b = new ConcurrentHashMap();
    }
    public final ConcurrentHashMap a(){
       return this.b;
    }
}
