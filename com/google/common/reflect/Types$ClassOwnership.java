package com.google.common.reflect.Types$ClassOwnership;
import java.lang.Enum;
import com.google.common.reflect.Types$ClassOwnership$1;
import java.lang.String;
import com.google.common.reflect.Types$ClassOwnership$2;
import com.google.common.reflect.Types$a;
import com.google.common.reflect.Types$ClassOwnership$b;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.reflect.ParameterizedType;
import com.google.common.reflect.Types$ClassOwnership$a;
import java.lang.AssertionError;
import java.lang.Object;

public abstract class Types$ClassOwnership extends Enum	// class@001903
{
    public static final Types$ClassOwnership[] $VALUES;
    public static final Types$ClassOwnership JVM_BEHAVIOR;
    public static final Types$ClassOwnership LOCAL_CLASS_HAS_NO_OWNER;
    public static final Types$ClassOwnership OWNED_BY_ENCLOSING_CLASS;

    static {
       Types$ClassOwnership$1 uClassOwners = new Types$ClassOwnership$1("OWNED_BY_ENCLOSING_CLASS", 0);
       Types$ClassOwnership.OWNED_BY_ENCLOSING_CLASS = uClassOwners;
       Types$ClassOwnership$2 uClassOwners1 = new Types$ClassOwnership$2("LOCAL_CLASS_HAS_NO_OWNER", 1);
       Types$ClassOwnership.LOCAL_CLASS_HAS_NO_OWNER = uClassOwners1;
       Types$ClassOwnership[] uClassOwners2 = new Types$ClassOwnership[]{uClassOwners,uClassOwners1};
       Types$ClassOwnership.$VALUES = uClassOwners2;
       Types$ClassOwnership.JVM_BEHAVIOR = Types$ClassOwnership.detectJvmBehavior();
    }
    public void Types$ClassOwnership(String p0,int p1){
       super(p0, p1);
    }
    public void Types$ClassOwnership(String p0,int p1,Types$a p2){
       super(p0, p1);
    }
    public static Types$ClassOwnership detectJvmBehavior(){
       object oobject;
       ParameterizedType genericSuper = Types$ClassOwnership$b.class.getGenericSuperclass();
       Types$ClassOwnership[] uClassOwners = Types$ClassOwnership.values();
       int len = uClassOwners.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             throw new AssertionError();
          }
          oobject = uClassOwners[i];
          if (oobject.getOwnerType(Types$ClassOwnership$a.class) == genericSuper.getOwnerType()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static Types$ClassOwnership valueOf(String p0){
       return Enum.valueOf(Types$ClassOwnership.class, p0);
    }
    public static Types$ClassOwnership[] values(){
       return Types$ClassOwnership.$VALUES.clone();
    }
    public abstract Class getOwnerType(Class p0);
}
