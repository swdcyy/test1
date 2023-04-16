package com.google.common.collect.HashBiMap$b;
import qk.b;
import com.google.common.collect.HashBiMap;
import java.lang.Object;
import ok.k;

public final class HashBiMap$b extends b	// class@0017ca
{
    public final HashBiMap b;
    public final Object c;
    public int d;

    public void HashBiMap$b(HashBiMap p0,int p1){
       super();
       this.b = p0;
       this.c = p0.values[p1];
       this.d = p1;
    }
    public final void a(){
       HashBiMap$b td = this.d;
       if (td != -1) {
          HashBiMap$b tb = this.b;
          if (td <= tb.size && k.a(this.c, tb.values[td])) {
          label_0021 :
             return;
          }
       }
       this.d = this.b.findEntryByValue(this.c);
       goto label_0021 ;
    }
    public Object getKey(){
       return this.c;
    }
    public Object getValue(){
       this.a();
       HashBiMap$b td = this.d;
       object oobject = (td == -1)? null: this.b.keys[td];
       return oobject;
    }
    public Object setValue(Object p0){
       this.a();
       HashBiMap$b td = this.d;
       if (td == -1) {
          return this.b.putInverse(this.c, p0, false);
       }
       object oobject = this.b.keys[td];
       if (k.a(oobject, p0)) {
          return p0;
       }
       this.b.replaceKeyInEntry(this.d, p0, false);
       return oobject;
    }
}
