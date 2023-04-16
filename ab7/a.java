package ab7.a;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import java.lang.Enum;

public final class a	// class@000090
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CachePolicy.values().length];
       a.a = ointArray;
       ointArray[CachePolicy.CACHE_ONLY.ordinal()] = 1;
       ointArray[CachePolicy.NETWORK_ONLY.ordinal()] = 2;
       ointArray[CachePolicy.CACHE_ELSE_NETWORK.ordinal()] = 3;
       ointArray[CachePolicy.CACHE_THEN_NETWORK.ordinal()] = 4;
       ointArray[CachePolicy.NETWORK_ELSE_CACHE.ordinal()] = 5;
    }
}
