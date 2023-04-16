package cl9.t2;
import pk9.h$a;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import pk9.h;
import java.util.Iterator;

public final class t2 implements h$a	// class@00066c
{
    public final QComment a;

    public void t2(QComment p0){
       this.a = p0;
    }
    public final QComment a(List p0,RecyclerFragment p1,h p2){
       QComment qComment;
       t2 ta = this.a;
       Iterator iterator = p0.iterator();
       do {
          if (iterator.hasNext()) {
          }else {
             qComment = null;
             break ;
          }
          qComment = iterator.next();
       } while (ta.equals(qComment));
       return qComment;
    }
}
