package com.google.common.collect.CompactHashMap$g;
import qk.b;
import com.google.common.collect.CompactHashMap;
import java.lang.Object;
import ok.k;

public final class CompactHashMap$g extends b	// class@0017af
{
    public final Object b;
    public int c;
    public final CompactHashMap d;

    public void CompactHashMap$g(CompactHashMap p0,int p1){
       this.d = p0;
       super();
       this.b = p0.keys[p1];
       this.c = p1;
    }
    public final void a(){
       CompactHashMap$g tc = this.c;
       if (tc != -1 && (tc >= this.d.size() || !k.a(this.b, this.d.keys[this.c]))) {
          this.c = this.d.indexOf(this.b);
       }
       return;
    }
    public Object getKey(){
       return this.b;
    }
    public Object getValue(){
       this.a();
       CompactHashMap$g tc = this.c;
       object oobject = (tc == -1)? null: this.d.values[tc];
       return oobject;
    }
    public Object setValue(Object p0){
       this.a();
       CompactHashMap$g tc = this.c;
       if (tc == -1) {
          this.d.put(this.b, p0);
          return null;
       }else {
          CompactHashMap values = this.d.values;
          object oobject = values[tc];
          values[tc] = p0;
          return oobject;
       }
    }
}
