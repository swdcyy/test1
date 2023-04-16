package com.google.common.reflect.Types$JavaVersion;
import java.lang.Enum;
import com.google.common.reflect.Types$JavaVersion$1;
import java.lang.String;
import com.google.common.reflect.Types$JavaVersion$2;
import com.google.common.reflect.Types$JavaVersion$3;
import com.google.common.reflect.Types$JavaVersion$4;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.lang.Class;
import com.google.common.reflect.Types$JavaVersion$a;
import java.lang.reflect.Type;
import wk.b;
import java.lang.Object;
import java.lang.CharSequence;
import com.google.common.reflect.Types$JavaVersion$b;
import com.google.common.reflect.Types$a;
import com.google.common.reflect.Types;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$a;

public abstract class Types$JavaVersion extends Enum	// class@00190b
{
    public static final Types$JavaVersion[] $VALUES;
    public static final Types$JavaVersion CURRENT;
    public static final Types$JavaVersion JAVA6;
    public static final Types$JavaVersion JAVA7;
    public static final Types$JavaVersion JAVA8;
    public static final Types$JavaVersion JAVA9;

    static {
       Types$JavaVersion$1 javaVersion$ = new Types$JavaVersion$1("JAVA6", 0);
       Types$JavaVersion.JAVA6 = javaVersion$;
       Types$JavaVersion$2 javaVersion$1 = new Types$JavaVersion$2("JAVA7", 1);
       Types$JavaVersion.JAVA7 = javaVersion$1;
       Types$JavaVersion$3 javaVersion$2 = new Types$JavaVersion$3("JAVA8", 2);
       Types$JavaVersion.JAVA8 = javaVersion$2;
       Types$JavaVersion$4 javaVersion$3 = new Types$JavaVersion$4("JAVA9", 3);
       Types$JavaVersion.JAVA9 = javaVersion$3;
       Types$JavaVersion[] javaVersionA = new Types$JavaVersion[]{javaVersion$,javaVersion$1,javaVersion$2,javaVersion$3};
       Types$JavaVersion.$VALUES = javaVersionA;
       if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
          Types$JavaVersion.CURRENT = ((new Types$JavaVersion$a().capture().toString()).contains("java.util.Map.java.util.Map"))? javaVersion$2: javaVersion$3;
       }else if(new Types$JavaVersion$b().capture() instanceof Class){
          Types$JavaVersion.CURRENT = javaVersion$1;
       }else {
          Types$JavaVersion.CURRENT = javaVersion$;
       }
    }
    public void Types$JavaVersion(String p0,int p1){
       super(p0, p1);
    }
    public void Types$JavaVersion(String p0,int p1,Types$a p2){
       super(p0, p1);
    }
    public static Types$JavaVersion valueOf(String p0){
       return Enum.valueOf(Types$JavaVersion.class, p0);
    }
    public static Types$JavaVersion[] values(){
       return Types$JavaVersion.$VALUES.clone();
    }
    public boolean jdkTypeDuplicatesOwnerName(){
       return true;
    }
    public abstract Type newArrayType(Type p0);
    public String typeName(Type p0){
       return Types.k(p0);
    }
    public final ImmutableList usedInGenericType(Type[] p0){
       ImmutableList$a uoa = ImmutableList.builder();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uoa.h(this.usedInGenericType(p0[i]));
       }
       return uoa.i();
    }
    public abstract Type usedInGenericType(Type p0);
}
