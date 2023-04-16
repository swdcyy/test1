package com.google.common.cache.LocalCache$Strength;
import java.lang.Enum;
import com.google.common.cache.LocalCache$Strength$1;
import java.lang.String;
import com.google.common.cache.LocalCache$Strength$2;
import com.google.common.cache.LocalCache$Strength$3;
import com.google.common.cache.LocalCache$a;
import java.lang.Class;
import java.lang.Object;
import com.google.common.base.Equivalence;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache$s;

public abstract class LocalCache$Strength extends Enum	// class@001751
{
    public static final LocalCache$Strength[] $VALUES;
    public static final LocalCache$Strength SOFT;
    public static final LocalCache$Strength STRONG;
    public static final LocalCache$Strength WEAK;

    static {
       LocalCache$Strength$1 strength$1 = new LocalCache$Strength$1("STRONG", 0);
       LocalCache$Strength.STRONG = strength$1;
       LocalCache$Strength$2 strength$2 = new LocalCache$Strength$2("SOFT", 1);
       LocalCache$Strength.SOFT = strength$2;
       LocalCache$Strength$3 strength$3 = new LocalCache$Strength$3("WEAK", 2);
       LocalCache$Strength.WEAK = strength$3;
       LocalCache$Strength[] strengthArra = new LocalCache$Strength[]{strength$1,strength$2,strength$3};
       LocalCache$Strength.$VALUES = strengthArra;
    }
    public void LocalCache$Strength(String p0,int p1){
       super(p0, p1);
    }
    public void LocalCache$Strength(String p0,int p1,LocalCache$a p2){
       super(p0, p1);
    }
    public static LocalCache$Strength valueOf(String p0){
       return Enum.valueOf(LocalCache$Strength.class, p0);
    }
    public static LocalCache$Strength[] values(){
       return LocalCache$Strength.$VALUES.clone();
    }
    public abstract Equivalence defaultEquivalence();
    public abstract LocalCache$s referenceValue(LocalCache$Segment p0,d p1,Object p2,int p3);
}
