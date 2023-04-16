package com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.ImmutableMap;
import java.lang.Object;
import qk.g;
import ok.n;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import qk.w;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.common.collect.RegularImmutableMap$EntrySet;
import com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList;
import com.google.common.collect.RegularImmutableMap$KeySet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableCollection;

public final class RegularImmutableMap extends ImmutableMap	// class@000516
{
    public final Object[] alternatingKeysAndValues;
    public final int[] f;
    public final int g;
    public static final ImmutableMap EMPTY;
    public static final long serialVersionUID;

    static {
       Object[] objArray = new Object[0];
       RegularImmutableMap.EMPTY = new RegularImmutableMap(null, objArray, 0);
    }
    public void RegularImmutableMap(int[] p0,Object[] p1,int p2){
       super();
       this.f = p0;
       this.alternatingKeysAndValues = p1;
       this.g = p2;
    }
    public static RegularImmutableMap create(int p0,Object[] p1){
       if (!p0) {
          return RegularImmutableMap.EMPTY;
       }
       int i = 0;
       int i1 = 1;
       if (p0 == i1) {
          g.a(p1[i], p1[i1]);
          return new RegularImmutableMap(null, p1, i1);
       }else {
          n.l(p0, (p1.length >> 1));
          return new RegularImmutableMap(RegularImmutableMap.createHashTable(p1, p0, ImmutableSet.chooseTableSize(p0), i), p1, p0);
       }
    }
    public static int[] createHashTable(Object[] p0,int p1,int p2,int p3){
       object oobject;
       object oobject1;
       int i5;
       if (p1 == 1) {
          g.a(p0[p3], p0[(p3 ^ 0x01)]);
          return null;
       }else {
          int i = p2 - 1;
          int[] ointArray = new int[p2];
          Arrays.fill(ointArray, -1);
          int i1 = 0;
          while (true) {
             if (i1 < p1) {
                int i2 = i1 * 2;
                int i3 = i2 + p3;
                oobject = p0[i3];
                int i4 = p3 ^ 0x01;
                i2 = i2 + i4;
                oobject1 = p0[i2];
                g.a(oobject, oobject1);
                i4 = w.b(oobject.hashCode());
                while (true) {
                   i4 = i4 & i;
                   i5 = ointArray[i4];
                   if (i5 == -1) {
                      ointArray[i4] = i3;
                      i1 = i1 + 1;
                   }else if(!p0[i5].equals(oobject)){
                      i4 = i4 + 1;
                   }else {
                   }
                }
                return ointArray;
             }else {
                goto label_0077 ;
             }
          }
          throw new IllegalArgumentException("Multiple entries with same key: "+oobject+"="+oobject1+" and "+p0[i5]+"="+p0[(i5 ^ 0x01)]);
       }
    }
    public static Object get(int[] p0,Object[] p1,int p2,int p3,Object p4){
       int i;
       object oobject = null;
       if (p4 == null) {
          return oobject;
       }
       if (p2 == 1) {
          if (p1[p3].equals(p4)) {
             oobject = p1[(p3 ^ 0x01)];
          }
          return oobject;
       }else if(p0 == null){
          return oobject;
       }else {
          p2 = p0.length - 1;
          p3 = w.b(p4.hashCode());
          while (true) {
             p3 = p3 & p2;
             i = p0[p3];
             if (i == -1) {
                return oobject;
             }
             if (p1[i].equals(p4)) {
                break ;
             }else {
                p3++;
             }
          }
          return p1[(i ^ 0x01)];
       }
    }
    public ImmutableSet createEntrySet(){
       return new RegularImmutableMap$EntrySet(this, this.alternatingKeysAndValues, 0, this.g);
    }
    public ImmutableSet createKeySet(){
       return new RegularImmutableMap$KeySet(this, new RegularImmutableMap$KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.g));
    }
    public ImmutableCollection createValues(){
       return new RegularImmutableMap$KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.g);
    }
    public Object get(Object p0){
       return RegularImmutableMap.get(this.f, this.alternatingKeysAndValues, this.g, 0, p0);
    }
    public boolean isPartialView(){
       return false;
    }
    public int size(){
       return this.g;
    }
}
