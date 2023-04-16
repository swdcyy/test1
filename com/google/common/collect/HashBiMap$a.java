package com.google.common.collect.HashBiMap$a;
import qk.b;
import com.google.common.collect.HashBiMap;
import java.lang.Object;
import ok.k;

public final class HashBiMap$a extends b	// class@0017c9
{
    public final Object b;
    public int c;
    public final HashBiMap d;

    public void HashBiMap$a(HashBiMap p0,int p1){
       this.d = p0;
       super();
       this.b = p0.keys[p1];
       this.c = p1;
    }
    public void a(){
       HashBiMap$a tc = this.c;
       if (tc != -1) {
          HashBiMap$a td = this.d;
          if (tc <= td.size && k.a(td.keys[tc], this.b)) {
          label_0021 :
             return;
          }
       }
       this.c = this.d.findEntryByKey(this.b);
       goto label_0021 ;
    }
    public Object getKey(){
       return this.b;
    }
    public Object getValue(){
       this.a();
       HashBiMap$a tc = this.c;
       object oobject = (tc == -1)? null: this.d.values[tc];
       return oobject;
    }
    public Object setValue(Object p0){
       this.a();
       HashBiMap$a tc = this.c;
       if (tc == -1) {
          return this.d.put(this.b, p0);
       }
       object oobject = this.d.values[tc];
       if (k.a(oobject, p0)) {
          return p0;
       }
       this.d.replaceValueInEntry(this.c, p0, false);
       return oobject;
    }
}
