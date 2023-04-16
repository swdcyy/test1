package bp6.b1;
import com.kwai.chat.sdk.utils.Supplier;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import ca7.t;

public final class b1 implements Supplier	// class@000503
{
    public final Context a;

    public void b1(Context p0){
       this.a = p0;
    }
    public final Object get(){
       return t.e(this.a);
    }
}
