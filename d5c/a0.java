package d5c.a0;
import ok.o;
import java.lang.Object;
import com.kwai.framework.model.user.ProfileTabModel;

public final class a0 implements o	// class@0020e5
{
    public final int b;

    public void a0(int p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       boolean b = (p0.getTabId() == this.b)? true: false;
       return b;
    }
}
