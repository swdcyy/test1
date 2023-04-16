package gx9.j;
import pk9.h$a;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import pk9.h;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;

public final class j implements h$a	// class@0024fb
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final QComment a(List p0,RecyclerFragment p1,h p2){
       QComment qComment = (p0.size() > 0 && p0.get(0).getEntity().mIsUserInfo != null)? p0.get(0): null;
       return qComment;
    }
}
