package hy0.f;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$LiveCommentStyle;
import java.lang.Boolean;

public final class f implements o	// class@0027a6
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       p0 = p0.mLiveCommentStyle;
       p0 = (p0 != null)? Boolean.valueOf(p0.mEnableMyCommentSuffix): Boolean.FALSE;
       return p0;
    }
}
