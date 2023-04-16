package com.google.common.collect.ImmutableBiMap$SerializedForm;
import com.google.common.collect.ImmutableMap$SerializedForm;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import java.lang.Object;
import com.google.common.collect.ImmutableBiMap$a;
import com.google.common.collect.ImmutableMap$b;

public class ImmutableBiMap$SerializedForm extends ImmutableMap$SerializedForm	// class@0017d4
{
    public static final long serialVersionUID;

    public void ImmutableBiMap$SerializedForm(ImmutableBiMap p0){
       super(p0);
    }
    public Object readResolve(){
       return this.createMap(new ImmutableBiMap$a());
    }
}
