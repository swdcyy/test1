package com.google.common.reflect.TypeToken$TypeFilter;
import ok.o;
import java.lang.Enum;
import com.google.common.reflect.TypeToken$TypeFilter$1;
import java.lang.String;
import com.google.common.reflect.TypeToken$TypeFilter$2;
import com.google.common.reflect.TypeToken$a;
import java.lang.Class;
import java.lang.Object;

public abstract class TypeToken$TypeFilter extends Enum implements o	// class@0018f4
{
    public static final TypeToken$TypeFilter[] $VALUES;
    public static final TypeToken$TypeFilter IGNORE_TYPE_VARIABLE_OR_WILDCARD;
    public static final TypeToken$TypeFilter INTERFACE_ONLY;

    static {
       TypeToken$TypeFilter$1 typeFilter$1 = new TypeToken$TypeFilter$1("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);
       TypeToken$TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD = typeFilter$1;
       TypeToken$TypeFilter$2 typeFilter$2 = new TypeToken$TypeFilter$2("INTERFACE_ONLY", 1);
       TypeToken$TypeFilter.INTERFACE_ONLY = typeFilter$2;
       TypeToken$TypeFilter[] typeFilterAr = new TypeToken$TypeFilter[]{typeFilter$1,typeFilter$2};
       TypeToken$TypeFilter.$VALUES = typeFilterAr;
    }
    public void TypeToken$TypeFilter(String p0,int p1){
       super(p0, p1);
    }
    public void TypeToken$TypeFilter(String p0,int p1,TypeToken$a p2){
       super(p0, p1);
    }
    public static TypeToken$TypeFilter valueOf(String p0){
       return Enum.valueOf(TypeToken$TypeFilter.class, p0);
    }
    public static TypeToken$TypeFilter[] values(){
       return TypeToken$TypeFilter.$VALUES.clone();
    }
}
