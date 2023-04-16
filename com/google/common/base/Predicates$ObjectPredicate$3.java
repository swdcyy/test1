package com.google.common.base.Predicates$ObjectPredicate$3;
import com.google.common.base.Predicates$ObjectPredicate;
import java.lang.String;
import com.google.common.base.Predicates$a;
import java.lang.Object;

public final class Predicates$ObjectPredicate$3 extends Predicates$ObjectPredicate	// class@001728
{

    public void Predicates$ObjectPredicate$3(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean apply(Object p0){
       boolean b = (p0 == null)? true: false;
       return b;
    }
    public String toString(){
       return "Predicates.isNull\(\)";
    }
}
