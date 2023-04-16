package com.google.common.reflect.TypeToken$TypeFilter$1;
import com.google.common.reflect.TypeToken$TypeFilter;
import java.lang.String;
import com.google.common.reflect.TypeToken$a;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.lang.Object;

public final class TypeToken$TypeFilter$1 extends TypeToken$TypeFilter	// class@0018f2
{

    public void TypeToken$TypeFilter$1(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean apply(TypeToken p0){
       p0 = p0.runtimeType;
       boolean b = (!p0 instanceof TypeVariable && !p0 instanceof WildcardType)? true: false;
       return b;
    }
    public boolean apply(Object p0){
       return this.apply(p0);
    }
}
