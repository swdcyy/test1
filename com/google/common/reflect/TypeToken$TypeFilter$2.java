package com.google.common.reflect.TypeToken$TypeFilter$2;
import com.google.common.reflect.TypeToken$TypeFilter;
import java.lang.String;
import com.google.common.reflect.TypeToken$a;
import com.google.common.reflect.TypeToken;
import java.lang.Class;
import java.lang.Object;

public final class TypeToken$TypeFilter$2 extends TypeToken$TypeFilter	// class@0018f3
{

    public void TypeToken$TypeFilter$2(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean apply(TypeToken p0){
       return p0.getRawType().isInterface();
    }
    public boolean apply(Object p0){
       return this.apply(p0);
    }
}
