package com.google.common.cache.LocalCache$Strength$2;
import com.google.common.cache.LocalCache$Strength;
import java.lang.String;
import com.google.common.cache.LocalCache$a;
import com.google.common.base.Equivalence;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.d;
import java.lang.Object;
import com.google.common.cache.LocalCache$s;
import com.google.common.cache.LocalCache$l;
import java.lang.ref.ReferenceQueue;
import com.google.common.cache.LocalCache$z;

public final class LocalCache$Strength$2 extends LocalCache$Strength	// class@00174f
{

    public void LocalCache$Strength$2(String p0,int p1){
       super(p0, p1, null);
    }
    public Equivalence defaultEquivalence(){
       return Equivalence.identity();
    }
    public LocalCache$s referenceValue(LocalCache$Segment p0,d p1,Object p2,int p3){
       LocalCache$l ol = (p3 == 1)? new LocalCache$l(p0.valueReferenceQueue, p2, p1): new LocalCache$z(p0.valueReferenceQueue, p2, p1, p3);
       return ol;
    }
}
