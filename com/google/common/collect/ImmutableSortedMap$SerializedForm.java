package com.google.common.collect.ImmutableSortedMap$SerializedForm;
import com.google.common.collect.ImmutableMap$SerializedForm;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableMap;
import java.util.Comparator;
import java.lang.Object;
import com.google.common.collect.ImmutableSortedMap$b;
import com.google.common.collect.ImmutableMap$b;

public class ImmutableSortedMap$SerializedForm extends ImmutableMap$SerializedForm	// class@001802
{
    public final Comparator comparator;
    public static final long serialVersionUID;

    public void ImmutableSortedMap$SerializedForm(ImmutableSortedMap p0){
       super(p0);
       this.comparator = p0.comparator();
    }
    public Object readResolve(){
       return this.createMap(new ImmutableSortedMap$b(this.comparator));
    }
}
