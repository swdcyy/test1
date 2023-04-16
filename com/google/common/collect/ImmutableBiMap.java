package com.google.common.collect.ImmutableBiMap;
import qk.f;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableBiMap$a;
import java.lang.String;
import qk.g;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.RegularImmutableBiMap;
import java.lang.Object;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import java.lang.AssertionError;
import java.lang.UnsupportedOperationException;
import com.google.common.collect.ImmutableBiMap$SerializedForm;

public abstract class ImmutableBiMap extends ImmutableMap implements f	// class@0017d6
{

    public void ImmutableBiMap(){
       super();
    }
    public static ImmutableBiMap$a builder(){
       return new ImmutableBiMap$a();
    }
    public static ImmutableBiMap$a builderWithExpectedSize(int p0){
       g.b(p0, "expectedSize");
       return new ImmutableBiMap$a(p0);
    }
    public static ImmutableBiMap copyOf(Iterable p0){
       int i = (p0 instanceof Collection)? p0.size(): 4;
       ImmutableBiMap$a uoa = new ImmutableBiMap$a(i);
       uoa.j(p0);
       return uoa.h();
    }
    public static ImmutableBiMap copyOf(Map p0){
       if (p0 instanceof ImmutableBiMap) {
          ImmutableMap immutableMap = p0;
          if (!immutableMap.isPartialView()) {
             return immutableMap;
          }
       }
       return ImmutableBiMap.copyOf(p0.entrySet());
    }
    public static ImmutableBiMap of(){
       return RegularImmutableBiMap.EMPTY;
    }
    public static ImmutableBiMap of(Object p0,Object p1){
       g.a(p0, p1);
       Object[] objArray = new Object[]{p0,p1};
       return new RegularImmutableBiMap(objArray, 1);
    }
    public static ImmutableBiMap of(Object p0,Object p1,Object p2,Object p3){
       g.a(p0, p1);
       g.a(p2, p3);
       Object[] objArray = new Object[]{p0,p1,p2,p3};
       return new RegularImmutableBiMap(objArray, 2);
    }
    public static ImmutableBiMap of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5){
       g.a(p0, p1);
       g.a(p2, p3);
       g.a(p4, p5);
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
       return new RegularImmutableBiMap(objArray, 3);
    }
    public static ImmutableBiMap of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7){
       g.a(p0, p1);
       g.a(p2, p3);
       g.a(p4, p5);
       g.a(p6, p7);
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
       return new RegularImmutableBiMap(objArray, 4);
    }
    public static ImmutableBiMap of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9){
       g.a(p0, p1);
       g.a(p2, p3);
       g.a(p4, p5);
       g.a(p6, p7);
       g.a(p8, p9);
       Object[] objArray = new Object[10];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       return new RegularImmutableBiMap(objArray, 5);
    }
    public ImmutableCollection createValues(){
       return this.createValues();
    }
    public final ImmutableSet createValues(){
       throw new AssertionError("should never be called");
    }
    public Object forcePut(Object p0,Object p1){
       throw new UnsupportedOperationException();
    }
    public abstract ImmutableBiMap inverse();
    public f inverse(){
       return this.inverse();
    }
    public ImmutableCollection values(){
       return this.values();
    }
    public ImmutableSet values(){
       return this.inverse().keySet();
    }
    public Collection values(){
       return this.values();
    }
    public Set values(){
       return this.values();
    }
    public Object writeReplace(){
       return new ImmutableBiMap$SerializedForm(this);
    }
}
