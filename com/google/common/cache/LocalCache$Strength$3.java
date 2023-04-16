package com.google.common.cache.LocalCache$Strength$3;
import com.google.common.cache.LocalCache$Strength;
import java.lang.String;
import com.google.common.cache.LocalCache$a;
import com.google.common.base.Equivalence;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.d;
import java.lang.Object;
import com.google.common.cache.LocalCache$s;
import com.google.common.cache.LocalCache$x;
import java.lang.ref.ReferenceQueue;
import com.google.common.cache.LocalCache$b0;

public final class LocalCache$Strength$3 extends LocalCache$Strength	// class@001750
{

    public void LocalCache$Strength$3(String p0,int p1){
       super(p0, p1, null);
    }
    public Equivalence defaultEquivalence(){
       return Equivalence.identity();
    }
    public LocalCache$s referenceValue(LocalCache$Segment p0,d p1,Object p2,int p3){
       LocalCache$x ox = (p3 == 1)? new LocalCache$x(p0.valueReferenceQueue, p2, p1): new LocalCache$b0(p0.valueReferenceQueue, p2, p1, p3);
       return ox;
    }
}
