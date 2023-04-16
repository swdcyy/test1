package gx9.k;
import pk9.h$a;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import pk9.h;
import com.kuaishou.android.model.mix.QComment;
import java.util.Iterator;

public final class k implements h$a	// class@0024fc
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public final QComment a(List p0,RecyclerFragment p1,h p2){
       Iterator iterator = p0.iterator();
       QComment qComment = null;
       int i = 0;
       while (iterator.hasNext()) {
          QComment qComment1 = iterator.next();
          QComment mIsGodCommen = qComment1.mIsGodComment;
          if (mIsGodCommen != null && qComment == null) {
             qComment = qComment1;
          }else if(mIsGodCommen != null){
             i = 1;
          }
       }
       if (i) {
          p2.f(false);
       }
       return qComment;
    }
}
