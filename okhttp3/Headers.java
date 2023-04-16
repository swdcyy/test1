package okhttp3.Headers;
import okhttp3.Headers$Builder;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import okhttp3.internal.Util;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Arrays;
import java.util.Date;
import okhttp3.internal.http.HttpDate;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Locale;
import java.util.ArrayList;

public final class Headers	// class@00207b
{
    public final String[] namesAndValues;

    public void Headers(Headers$Builder p0){
       super();
       p0 = p0.namesAndValues;
       String[] stringArray = new String[p0.size()];
       this.namesAndValues = p0.toArray(stringArray);
    }
    public void Headers(String[] p0){
       super();
       this.namesAndValues = p0;
    }
    public static void checkName(String p0){
       char c;
       Objects.requireNonNull(p0, "name == null");
       if (p0.isEmpty()) {
          throw new IllegalArgumentException("name is empty");
       }
       int i = p0.length();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i2 >= i) {
             return;
          }
          c = p0.charAt(i2);
          if (c > ' ' && c < 127) {
             i2 = i2 + 1;
          }else {
             break ;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(c),Integer.valueOf(i2),p0};
       throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", objArray));
    }
    public static void checkValue(String p0,String p1){
       char c;
       if (p0 == null) {
          throw new NullPointerException("value for name "+p1+" == null");
       }
       int i = p0.length();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i2 >= i) {
             return;
          }
          c = p0.charAt(i2);
          if (c > 31 || (c == 9 && c < 127)) {
             i2 = i2 + 1;
          }else {
             break ;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(c),Integer.valueOf(i2),p1,p0};
       throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", objArray));
    }
    public static String get(String[] p0,String p1){
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
    public static Headers of(Map p0){
       Objects.requireNonNull(p0, "headers == null");
       String[] stringArray = new String[(p0.size() * 2)];
       int i = 0;
       Iterator iterator = p0.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return new Headers(stringArray);
          }
          Map$Entry uEntry = iterator.next();
          if (uEntry.getKey() != null && uEntry.getValue() != null) {
             String str = (uEntry.getKey()).trim();
             String str1 = (uEntry.getValue()).trim();
             Headers.checkName(str);
             Headers.checkValue(str1, str);
             stringArray[i] = str;
             int i1 = i + 1;
             stringArray[i1] = str1;
             i = i + 2;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("Headers cannot be null");
    }
    public static Headers of(String[] p0){
       Objects.requireNonNull(p0, "namesAndValues == null");
       if (p0.length % 2) {
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
             for (; str < p0.length; str = str + 2) {
                object oobject = p0[str];
                int i1 = str + 1;
                Headers.checkName(oobject);
                Headers.checkValue(p0[i1], oobject);
             }
             return new Headers(p0);
          }
       }
       throw new IllegalArgumentException("Headers cannot be null");
    }
    public long byteCount(){
       Headers tnamesAndVal = this.namesAndValues;
       long l = (long)(tnamesAndVal.length * 2);
       int len = tnamesAndVal.length;
       for (int i = 0; i < len; i = i + 1) {
          l = l + (long)(this.namesAndValues[i]).length();
       }
       return l;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof Headers && Arrays.equals(p0.namesAndValues, this.namesAndValues))? true: false;
       return b;
    }
    public String get(String p0){
       return Headers.get(this.namesAndValues, p0);
    }
    public Date getDate(String p0){
       p0 = this.get(p0);
       Date uDate = (p0 != null)? HttpDate.parse(p0): null;
       return uDate;
    }
    public int hashCode(){
       return Arrays.hashCode(this.namesAndValues);
    }
    public String name(int p0){
       return this.namesAndValues[(p0 * 2)];
    }
    public Set names(){
       TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
       int i = this.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          treeSet.add(this.name(i1));
       }
       return Collections.unmodifiableSet(treeSet);
    }
    public Headers$Builder newBuilder(){
       Headers$Builder uBuilder = new Headers$Builder();
       Collections.addAll(uBuilder.namesAndValues, this.namesAndValues);
       return uBuilder;
    }
    public int size(){
       return (this.namesAndValues.length / 2);
    }
    public Map toMultimap(){
       TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
       int i = this.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          String str = (this.name(i1)).toLowerCase(Locale.US);
          List list = treeMap.get(str);
          if (list == null) {
             list = new ArrayList(2);
             treeMap.put(str, list);
          }
          list.add(this.value(i1));
       }
       return treeMap;
    }
    public String toString(){
       StringBuilder str = "";
       int i = this.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          str = str+this.name(i1)+": "+this.value(i1)+"\n";
       }
       return str;
    }
    public String value(int p0){
       return this.namesAndValues[((p0 * 2) + 1)];
    }
    public List values(String p0){
       int i = this.size();
       ArrayList uArrayList = null;
       int i1 = 0;
       while (i1 < i) {
          if (p0.equalsIgnoreCase(this.name(i1))) {
             if (uArrayList == null) {
                uArrayList = new ArrayList(2);
             }
             uArrayList.add(this.value(i1));
          }
          i1 = i1 + 1;
       }
       List list = (uArrayList != null)? Collections.unmodifiableList(uArrayList): Collections.emptyList();
       return list;
    }
}
