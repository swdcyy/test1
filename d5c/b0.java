package d5c.b0;
import ok.o;
import java.lang.Object;
import com.kwai.framework.model.user.ProfileTabModel;

public final class b0 implements o	// class@0020e7
{
    public final int b;

    public void b0(int p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       boolean b = (p0.getTabId() == this.b)? true: false;
       return b;
    }
}
