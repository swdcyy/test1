package com.google.common.base.Predicates;
import ok.o;
import com.google.common.base.Predicates$ObjectPredicate;
import com.google.common.base.Predicates$AndPredicate;
import java.lang.Object;
import ok.n;
import java.util.List;
import java.util.Arrays;
import com.google.common.base.Predicates$a;
import ok.h;
import com.google.common.base.Predicates$CompositionPredicate;
import com.google.common.base.Predicates$IsEqualToPredicate;
import java.util.Collection;
import com.google.common.base.Predicates$InPredicate;
import com.google.common.base.Predicates$NotPredicate;

public final class Predicates	// class@00172c
{

    public static o a(){
       return Predicates$ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }
    public static o b(o p0,o p1){
       n.j(p0);
       n.j(p1);
       o[] ooArray = new o[]{p0,p1};
       return new Predicates$AndPredicate(Arrays.asList(ooArray), null);
    }
    public static o c(o p0,h p1){
       return new Predicates$CompositionPredicate(p0, p1, null);
    }
    public static o d(Object p0){
       return new Predicates$IsEqualToPredicate(p0, null);
    }
    public static o e(Collection p0){
       return new Predicates$InPredicate(p0, null);
    }
    public static o f(){
       return Predicates$ObjectPredicate.IS_NULL.withNarrowedType();
    }
    public static o g(o p0){
       return new Predicates$NotPredicate(p0);
    }
    public static o h(){
       return Predicates$ObjectPredicate.NOT_NULL.withNarrowedType();
    }
}
