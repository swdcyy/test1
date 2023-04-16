package com.google.common.collect.DenseImmutableTable$ImmutableArrayMap$a;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.DenseImmutableTable$ImmutableArrayMap;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.Maps;

public class DenseImmutableTable$ImmutableArrayMap$a extends AbstractIterator	// class@0017bf
{
    public int d;
    public final int e;
    public final DenseImmutableTable$ImmutableArrayMap f;

    public void DenseImmutableTable$ImmutableArrayMap$a(DenseImmutableTable$ImmutableArrayMap p0){
       this.f = p0;
       super();
       this.d = -1;
       this.e = p0.keyToIndex().size();
    }
    public Object a(){
       Map$Entry value;
       while (true) {
          int i = this.d + 1;
          this.d = i;
          if (i < this.e) {
             value = this.f.getValue(i);
             if (value != null) {
                value = Maps.k(this.f.getKey(this.d), value);
                break ;
             }
          }else {
             this.b();
             value = null;
             break ;
          }
       }
       return value;
    }
}
