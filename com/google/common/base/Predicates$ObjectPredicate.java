package com.google.common.base.Predicates$ObjectPredicate;
import ok.o;
import java.lang.Enum;
import com.google.common.base.Predicates$ObjectPredicate$1;
import java.lang.String;
import com.google.common.base.Predicates$ObjectPredicate$2;
import com.google.common.base.Predicates$ObjectPredicate$3;
import com.google.common.base.Predicates$ObjectPredicate$4;
import com.google.common.base.Predicates$a;
import java.lang.Class;
import java.lang.Object;

public abstract class Predicates$ObjectPredicate extends Enum implements o	// class@00172a
{
    public static final Predicates$ObjectPredicate[] $VALUES;
    public static final Predicates$ObjectPredicate ALWAYS_FALSE;
    public static final Predicates$ObjectPredicate ALWAYS_TRUE;
    public static final Predicates$ObjectPredicate IS_NULL;
    public static final Predicates$ObjectPredicate NOT_NULL;

    static {
       Predicates$ObjectPredicate$1 objectPredic = new Predicates$ObjectPredicate$1("ALWAYS_TRUE", 0);
       Predicates$ObjectPredicate.ALWAYS_TRUE = objectPredic;
       Predicates$ObjectPredicate$2 objectPredic1 = new Predicates$ObjectPredicate$2("ALWAYS_FALSE", 1);
       Predicates$ObjectPredicate.ALWAYS_FALSE = objectPredic1;
       Predicates$ObjectPredicate$3 objectPredic2 = new Predicates$ObjectPredicate$3("IS_NULL", 2);
       Predicates$ObjectPredicate.IS_NULL = objectPredic2;
       Predicates$ObjectPredicate$4 objectPredic3 = new Predicates$ObjectPredicate$4("NOT_NULL", 3);
       Predicates$ObjectPredicate.NOT_NULL = objectPredic3;
       Predicates$ObjectPredicate[] objectPredic4 = new Predicates$ObjectPredicate[]{objectPredic,objectPredic1,objectPredic2,objectPredic3};
       Predicates$ObjectPredicate.$VALUES = objectPredic4;
    }
    public void Predicates$ObjectPredicate(String p0,int p1){
       super(p0, p1);
    }
    public void Predicates$ObjectPredicate(String p0,int p1,Predicates$a p2){
       super(p0, p1);
    }
    public static Predicates$ObjectPredicate valueOf(String p0){
       return Enum.valueOf(Predicates$ObjectPredicate.class, p0);
    }
    public static Predicates$ObjectPredicate[] values(){
       return Predicates$ObjectPredicate.$VALUES.clone();
    }
    public o withNarrowedType(){
       return this;
    }
}
