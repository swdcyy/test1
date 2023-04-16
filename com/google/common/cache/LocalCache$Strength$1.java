package com.google.common.cache.LocalCache$Strength$1;
import com.google.common.cache.LocalCache$Strength;
import java.lang.String;
import com.google.common.cache.LocalCache$a;
import com.google.common.base.Equivalence;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.d;
import java.lang.Object;
import com.google.common.cache.LocalCache$s;
import com.google.common.cache.LocalCache$p;
import com.google.common.cache.LocalCache$a0;

public final class LocalCache$Strength$1 extends LocalCache$Strength	// class@00174e
{

    public void LocalCache$Strength$1(String p0,int p1){
       super(p0, p1, null);
    }
    public Equivalence defaultEquivalence(){
       return Equivalence.equals();
    }
    public LocalCache$s referenceValue(LocalCache$Segment p0,d p1,Object p2,int p3){
       LocalCache$p op = (p3 == 1)? new LocalCache$p(p2): new LocalCache$a0(p2, p3);
       return op;
    }
}
