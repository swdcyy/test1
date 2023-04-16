package com.meizu.cloud.pushsdk.c.c.c;
import com.meizu.cloud.pushsdk.c.c.c$a;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.c$1;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;

public final class c	// class@0014cb
{
    public final String[] a;

    public void c(c$a p0){
       String[] stringArray = new String[c$a.a(p0).size()];
       this.a = c$a.a(p0).toArray(stringArray);
    }
    public void c(c$a p0,c$1 p1){
       super(p0);
    }
    public void c(String[] p0){
       this.a = p0;
    }
    public static c a(String[] p0){
       if (p0 == null || (p0.length % 2)) {
          throw new IllegalArgumentException("Expected alternating header names and values");
       }
       p0 = p0.clone();
       String str = null;
       int i = 0;
       while (true) {
          if (i < p0.length) {
             if (p0[i] != null) {
                p0[i] = (p0[i]).trim();
                i = i + 1;
             }else {
                break ;
             }
          }else {
             i = 0;
             while (true) {
                if (i >= p0.length) {
                   return new c(p0);
                }
                object oobject = p0[i];
                int i1 = i + 1;
                object oobject1 = p0[i1];
                if (!oobject.length() || (oobject.indexOf(str) != -1 || oobject1.indexOf(str) != -1)) {
                   throw new IllegalArgumentException("Unexpected header: "+oobject+": "+oobject1);
                }
                i = i + 2;
             }
          }
       }
       throw new IllegalArgumentException("Headers cannot be null");
    }
    public static String a(String[] p0,String p1){
       int i = p0.length - 2;
       while (true) {
          if (i < 0) {
             return null;
          }
          if (p1.equalsIgnoreCase(p0[i])) {
             break ;
          }else {
             i = i - 2;
          }
       }
       return p0[(i + 1)];
    }
    public int a(){
       return (this.a.length / 2);
    }
    public String a(int p0){
       return this.a[(p0 * 2)];
    }
    public String a(String p0){
       return c.a(this.a, p0);
    }
    public String b(int p0){
       return this.a[((p0 * 2) + 1)];
    }
    public Set b(){
       TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
       int i = this.a();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          treeSet.add(this.a(i1));
       }
       return Collections.unmodifiableSet(treeSet);
    }
    public c$a c(){
       c$a uoa = new c$a();
       Collections.addAll(c$a.a(uoa), this.a);
       return uoa;
    }
    public String toString(){
       StringBuilder str = "";
       int i = this.a();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          str = str+this.a(i1)+": "+this.b(i1)+"\n";
       }
       return str;
    }
}
