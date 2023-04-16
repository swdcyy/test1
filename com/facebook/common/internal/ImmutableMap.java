package com.facebook.common.internal.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.lang.Object;

public class ImmutableMap extends HashMap	// class@001056
{

    public void ImmutableMap(Map p0){
       super(p0);
    }
    public static ImmutableMap copyOf(Map p0){
       return new ImmutableMap(p0);
    }
    public static Map of(){
       return Collections.unmodifiableMap(new HashMap());
    }
    public static Map of(Object p0,Object p1){
       HashMap hashMap = new HashMap(1);
       hashMap.put(p0, p1);
       return Collections.unmodifiableMap(hashMap);
    }
    public static Map of(Object p0,Object p1,Object p2,Object p3){
       HashMap hashMap = new HashMap(2);
       hashMap.put(p0, p1);
       hashMap.put(p2, p3);
       return Collections.unmodifiableMap(hashMap);
    }
    public static Map of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5){
       HashMap hashMap = new HashMap(3);
       hashMap.put(p0, p1);
       hashMap.put(p2, p3);
       hashMap.put(p4, p5);
       return Collections.unmodifiableMap(hashMap);
    }
    public static Map of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7){
       HashMap hashMap = new HashMap(4);
       hashMap.put(p0, p1);
       hashMap.put(p2, p3);
       hashMap.put(p4, p5);
       hashMap.put(p6, p7);
       return Collections.unmodifiableMap(hashMap);
    }
    public static Map of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9){
       HashMap hashMap = new HashMap(5);
       hashMap.put(p0, p1);
       hashMap.put(p2, p3);
       hashMap.put(p4, p5);
       hashMap.put(p6, p7);
       hashMap.put(p8, p9);
       return Collections.unmodifiableMap(hashMap);
    }
    public static Map of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11){
       HashMap hashMap = new HashMap(6);
       hashMap.put(p0, p1);
       hashMap.put(p2, p3);
       hashMap.put(p4, p5);
       hashMap.put(p6, p7);
       hashMap.put(p8, p9);
       hashMap.put(p10, p11);
       return Collections.unmodifiableMap(hashMap);
    }
}
