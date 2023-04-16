package com.google.common.reflect.TypeToken$TypeSet;
import java.io.Serializable;
import qk.v;
import com.google.common.reflect.TypeToken;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import com.google.common.reflect.TypeToken$f;
import java.util.Objects;
import com.google.common.collect.ImmutableList;
import java.lang.Iterable;
import qk.m;
import com.google.common.reflect.TypeToken$TypeFilter;
import ok.o;
import com.google.common.collect.ImmutableSet;

public class TypeToken$TypeSet extends v implements Serializable	// class@0018f5
{
    public ImmutableSet b;
    public final TypeToken this$0;
    public static final long serialVersionUID;

    public void TypeToken$TypeSet(TypeToken p0){
       this.this$0 = p0;
       super();
    }
    public Object delegate(){
       return this.delegate();
    }
    public Collection delegate(){
       return this.delegate();
    }
    public Set delegate(){
       TypeToken$TypeSet tb = this.b;
       if (tb == null) {
          TypeToken$f a = TypeToken$f.a;
          Objects.requireNonNull(a);
          tb = m.s(a.b(ImmutableList.of(this.this$0))).p(TypeToken$TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).D();
          this.b = tb;
       }
       return tb;
    }
    public Set rawTypes(){
       return ImmutableSet.copyOf(TypeToken$f.b.b(this.this$0.getRawTypes()));
    }
}
