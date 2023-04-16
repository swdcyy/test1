package com.google.common.collect.RegularImmutableBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.lang.Object;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableMap$EntrySet;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList;
import com.google.common.collect.RegularImmutableMap$KeySet;
import com.google.common.collect.ImmutableList;
import qk.f;

public final class RegularImmutableBiMap extends ImmutableBiMap	// class@00186e
{
    public final Object[] alternatingKeysAndValues;
    public final int[] f;
    public final int g;
    public final int h;
    public final RegularImmutableBiMap i;
    public static final RegularImmutableBiMap EMPTY;

    static {
       RegularImmutableBiMap.EMPTY = new RegularImmutableBiMap();
    }
    public void RegularImmutableBiMap(){
       super();
       this.f = null;
       Object[] objArray = new Object[0];
       this.alternatingKeysAndValues = objArray;
       this.g = 0;
       this.h = 0;
       this.i = this;
    }
    public void RegularImmutableBiMap(int[] p0,Object[] p1,int p2,RegularImmutableBiMap p3){
       super();
       this.f = p0;
       this.alternatingKeysAndValues = p1;
       this.g = 1;
       this.h = p2;
       this.i = p3;
    }
    public void RegularImmutableBiMap(Object[] p0,int p1){
       super();
       this.alternatingKeysAndValues = p0;
       this.h = p1;
       int i = 0;
       this.g = i;
       int i1 = (p1 >= 2)? ImmutableSet.chooseTableSize(p1): 0;
       this.f = RegularImmutableMap.createHashTable(p0, p1, i1, i);
       this.i = new RegularImmutableBiMap(RegularImmutableMap.createHashTable(p0, p1, i1, 1), p0, p1, this);
       return;
    }
    public ImmutableSet createEntrySet(){
       return new RegularImmutableMap$EntrySet(this, this.alternatingKeysAndValues, this.g, this.h);
    }
    public ImmutableSet createKeySet(){
       return new RegularImmutableMap$KeySet(this, new RegularImmutableMap$KeysOrValuesAsList(this.alternatingKeysAndValues, this.g, this.h));
    }
    public Object get(Object p0){
       return RegularImmutableMap.get(this.f, this.alternatingKeysAndValues, this.h, this.g, p0);
    }
    public ImmutableBiMap inverse(){
       return this.i;
    }
    public f inverse(){
       return this.inverse();
    }
    public boolean isPartialView(){
       return false;
    }
    public int size(){
       return this.h;
    }
}
