package com.google.common.collect.ImmutableMap$SerializedForm;
import java.io.Serializable;
import com.google.common.collect.ImmutableMap;
import java.lang.Object;
import java.util.Map;
import com.google.common.collect.ImmutableSet;
import qk.t0;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.common.collect.ImmutableMap$b;

public class ImmutableMap$SerializedForm implements Serializable	// class@0017e2
{
    public final Object[] keys;
    public final Object[] values;
    public static final long serialVersionUID;

    public void ImmutableMap$SerializedForm(ImmutableMap p0){
       super();
       Object[] objArray = new Object[p0.size()];
       this.keys = objArray;
       objArray = new Object[p0.size()];
       this.values = objArray;
       t0 ot0 = p0.entrySet().iterator();
       int i = 0;
       while (ot0.hasNext()) {
          Map$Entry uEntry = ot0.next();
          this.keys[i] = uEntry.getKey();
          this.values[i] = uEntry.getValue();
          i = i + 1;
       }
       return;
    }
    public Object createMap(ImmutableMap$b p0){
       int i = 0;
       ImmutableMap$SerializedForm tkeys = this.keys;
       while (i < tkeys.length) {
          p0.c(tkeys[i], this.values[i]);
          i = i + 1;
       }
       return p0.a();
    }
    public Object readResolve(){
       return this.createMap(new ImmutableMap$b(this.keys.length));
    }
}
