package kotlinx.android.extensions.CacheImplementation;
import java.lang.Enum;
import java.lang.String;
import kotlinx.android.extensions.CacheImplementation$a;
import nsd.u;
import java.lang.Class;
import java.lang.Object;

public final class CacheImplementation extends Enum	// class@001910
{
    public static final CacheImplementation[] $VALUES;
    public static final CacheImplementation$a Companion;
    public static final CacheImplementation DEFAULT;
    public static final CacheImplementation HASH_MAP;
    public static final CacheImplementation NO_CACHE;
    public static final CacheImplementation SPARSE_ARRAY;

    public static final CacheImplementation[] $values(){
       CacheImplementation[] uCacheImplem = new CacheImplementation[]{CacheImplementation.SPARSE_ARRAY,CacheImplementation.HASH_MAP,CacheImplementation.NO_CACHE};
       return uCacheImplem;
    }
    static {
       CacheImplementation.SPARSE_ARRAY = new CacheImplementation("SPARSE_ARRAY", 0);
       CacheImplementation uCacheImplem = new CacheImplementation("HASH_MAP", 1);
       CacheImplementation.HASH_MAP = uCacheImplem;
       CacheImplementation.NO_CACHE = new CacheImplementation("NO_CACHE", 2);
       CacheImplementation.$VALUES = CacheImplementation.$values();
       CacheImplementation.Companion = new CacheImplementation$a(null);
       CacheImplementation.DEFAULT = uCacheImplem;
    }
    public void CacheImplementation(String p0,int p1){
       super(p0, p1);
    }
    public static CacheImplementation valueOf(String p0){
       return Enum.valueOf(CacheImplementation.class, p0);
    }
    public static CacheImplementation[] values(){
       return CacheImplementation.$VALUES.clone();
    }
}
