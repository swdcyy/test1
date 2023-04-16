package hk9.h;
import erd.g;
import com.yxcorp.gifshow.comment.common.CommonCommentsFragment;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import xk9.h;
import ik9.c;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;

public final class h implements g	// class@0026a4
{
    public final CommonCommentsFragment b;

    public void h(CommonCommentsFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       tb.S.f().onLifecycleEvent(p0, tb);
    }
}
