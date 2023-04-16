package hk9.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.common.CommonCommentsFragment;
import java.lang.Object;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;

public final class i implements Runnable	// class@0026a5
{
    public final CommonCommentsFragment b;

    public void i(CommonCommentsFragment p0){
       this.b = p0;
    }
    public final void run(){
       this.b.ih();
    }
}
