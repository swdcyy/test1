package i61.c;
import ok.o;
import java.lang.Object;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse$LiveBottomBarLayoutChildrenItem;

public final class c implements o	// class@002836
{
    public final int b;

    public void c(int p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       c tb = this.b;
       boolean b = (p0 != null && p0.mBottomBarItemId == tb)? true: false;
       return b;
    }
}
