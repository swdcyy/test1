package f4b.a;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import f4b.b;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import androidx.collection.LruCache;

public final class a implements o	// class@002894
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       return b.a.put(p0.mId, p0);
    }
}
