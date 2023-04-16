package com.google.protobuf.MapFieldLite;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$EnumLite;
import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public final class MapFieldLite extends LinkedHashMap	// class@000474
{
    public boolean isMutable;
    public static final MapFieldLite EMPTY_MAP_FIELD;

    static {
       MapFieldLite mapFieldLite = new MapFieldLite();
       MapFieldLite.EMPTY_MAP_FIELD = mapFieldLite;
       mapFieldLite.makeImmutable();
    }
    public void MapFieldLite(){
       super();
       this.isMutable = true;
    }
    public void MapFieldLite(Map p0){
       super(p0);
       this.isMutable = true;
    }
    public static int calculateHashCodeForMap(Map p0){
       Iterator iterator = p0.entrySet().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          int i1 = MapFieldLite.calculateHashCodeForObject(uEntry.getValue()) ^ MapFieldLite.calculateHashCodeForObject(uEntry.getKey());
          i = i + i1;
       }
       return i;
    }
    public static int calculateHashCodeForObject(Object p0){
       if (p0 instanceof byte[]) {
          return Internal.hashCode(p0);
       }
       if (!p0 instanceof Internal$EnumLite) {
          return p0.hashCode();
       }
       throw new UnsupportedOperationException();
    }
    public static void checkForNullKeysAndValues(Map p0){
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Internal.checkNotNull(obj);
          Internal.checkNotNull(p0.get(obj));
       }
       return;
    }
    public static Object copy(Object p0){
       if (p0 instanceof byte[]) {
          p0 = Arrays.copyOf(p0, p0.length);
       }
       return p0;
    }
    public static Map copy(Map p0){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          linkedHashMa.put(key, MapFieldLite.copy(uEntry.getValue()));
       }
       return linkedHashMa;
    }
    public static MapFieldLite emptyMapField(){
       return MapFieldLite.EMPTY_MAP_FIELD;
    }
    public static boolean equals(Object p0,Object p1){
       if (p0 instanceof byte[] && p1 instanceof byte[]) {
          return Arrays.equals(p0, p1);
       }
       return p0.equals(p1);
    }
    public static boolean equals(Map p0,Map p1){
       if (p0 == p1) {
          return true;
       }
       if (p0.size() != p1.size()) {
          return false;
       }
       Iterator iterator = p0.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          Map$Entry uEntry = iterator.next();
          if (!p1.containsKey(uEntry.getKey())) {
             break ;
          }else if(!MapFieldLite.equals(uEntry.getValue(), p1.get(uEntry.getKey()))){
             return false;
          }
       }
       return false;
    }
    public void clear(){
       this.ensureMutable();
       super.clear();
    }
    public final void ensureMutable(){
       if (this.isMutable()) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public Set entrySet(){
       Set set = (this.isEmpty())? Collections.emptySet(): super.entrySet();
       return set;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof Map && MapFieldLite.equals(this, p0))? true: false;
       return b;
    }
    public int hashCode(){
       return MapFieldLite.calculateHashCodeForMap(this);
    }
    public boolean isMutable(){
       return this.isMutable;
    }
    public void makeImmutable(){
       this.isMutable = false;
    }
    public void mergeFrom(MapFieldLite p0){
       this.ensureMutable();
       if (!p0.isEmpty()) {
          this.putAll(p0);
       }
       return;
    }
    public MapFieldLite mutableCopy(){
       MapFieldLite mapFieldLite = (this.isEmpty())? new MapFieldLite(): new MapFieldLite(this);
       return mapFieldLite;
    }
    public Object put(Object p0,Object p1){
       this.ensureMutable();
       Internal.checkNotNull(p0);
       Internal.checkNotNull(p1);
       return super.put(p0, p1);
    }
    public Object put(Map$Entry p0){
       return this.put(p0.getKey(), p0.getValue());
    }
    public void putAll(Map p0){
       this.ensureMutable();
       MapFieldLite.checkForNullKeysAndValues(p0);
       super.putAll(p0);
    }
    public Object remove(Object p0){
       this.ensureMutable();
       return super.remove(p0);
    }
}
