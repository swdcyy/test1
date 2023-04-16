package ab7.b;
import erd.o;
import ab7.c;
import com.kwai.middleware.resourcemanager.cache.adt.UnionResponse;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.adt.DetailResponse;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;

public final class b implements o	// class@000091
{
    public final c b;
    public final UnionResponse c;

    public void b(c p0,UnionResponse p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       return this.b.b.g(this.c, p0);
    }
}
