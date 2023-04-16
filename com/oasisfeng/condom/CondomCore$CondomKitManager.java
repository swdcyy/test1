package com.oasisfeng.condom.CondomCore$CondomKitManager;
import com.oasisfeng.condom.CondomKit$CondomKitRegistry;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;
import java.util.Set;
import com.oasisfeng.condom.CondomKit$SystemServiceSupplier;
import java.util.Map;

public class CondomCore$CondomKitManager implements CondomKit$CondomKitRegistry	// class@000a75
{
    public final Map a;
    public final Set b;

    public void CondomCore$CondomKitManager(){
       super();
       this.a = new HashMap();
       this.b = new HashSet();
    }
    public void a(String p0){
       this.b.add(p0);
    }
    public void b(String p0,CondomKit$SystemServiceSupplier p1){
       this.a.put(p0, p1);
    }
}
