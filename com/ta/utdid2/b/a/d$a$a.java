package com.ta.utdid2.b.a.d$a$a;
import com.ta.utdid2.b.a.b$a;
import com.ta.utdid2.b.a.d$a;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import com.ta.utdid2.b.a.d;
import java.util.WeakHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import com.ta.utdid2.b.a.b$b;
import com.ta.utdid2.b.a.b;

public final class d$a$a implements b$a	// class@000ccd
{
    public final d$a a;
    public final Map b;
    public boolean k;

    public void d$a$a(d$a p0){
       this.a = p0;
       super();
       this.b = new HashMap();
       this.k = false;
    }
    public b$a a(String p0){
       _monitor_enter(this);
       this.b.put(p0, this);
       _monitor_exit(this);
       return this;
    }
    public b$a a(String p0,float p1){
       _monitor_enter(this);
       this.b.put(p0, Float.valueOf(p1));
       _monitor_exit(this);
       return this;
    }
    public b$a a(String p0,int p1){
       _monitor_enter(this);
       this.b.put(p0, Integer.valueOf(p1));
       _monitor_exit(this);
       return this;
    }
    public b$a a(String p0,long p1){
       _monitor_enter(this);
       this.b.put(p0, Long.valueOf(p1));
       _monitor_exit(this);
       return this;
    }
    public b$a a(String p0,String p1){
       _monitor_enter(this);
       this.b.put(p0, p1);
       _monitor_exit(this);
       return this;
    }
    public b$a a(String p0,boolean p1){
       _monitor_enter(this);
       this.b.put(p0, Boolean.valueOf(p1));
       _monitor_exit(this);
       return this;
    }
    public b$a b(){
       _monitor_enter(this);
       this.k = true;
       _monitor_exit(this);
       return this;
    }
    public boolean commit(){
       HashSet hashSet;
       b$b value;
       Object obj = d.a();
       _monitor_enter(obj);
       boolean b = false;
       boolean b1 = true;
       String str = (d$a.a(this.a).size() > 0)? 1: null;
       ArrayList uArrayList = null;
       if (str) {
          uArrayList = new ArrayList();
          hashSet = new HashSet(d$a.a(this.a).keySet());
       }else {
          hashSet = uArrayList;
       }
       _monitor_enter(this);
       if (this.k != null) {
          d$a.a(this.a).clear();
          this.k = b;
       }
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          value = uEntry.getValue();
          if (value == this) {
             d$a.a(this.a).remove(key);
          }else {
             d$a.a(this.a).put(key, value);
          }
          if (str) {
             uArrayList.add(key);
          }
       }
       this.b.clear();
       _monitor_exit(this);
       b = d$a.a(this.a);
       if (b) {
          this.a.a(b1);
       }
       _monitor_exit(obj);
       if (str) {
          int i = uArrayList.size() - b1;
          while (i >= 0) {
             str = uArrayList.get(i);
             Iterator iterator1 = hashSet.iterator();
             while (iterator1.hasNext()) {
                value = iterator1.next();
                if (value != null) {
                   value.a(this.a, str);
                }
             }
             i = i - 1;
          }
       }
       return b;
    }
}
