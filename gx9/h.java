package gx9.h;
import pk9.h$a;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import pk9.h;
import com.kuaishou.android.model.mix.QComment;
import java.util.Iterator;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvb.i;
import al9.a;
import com.yxcorp.gifshow.model.ForceInsertComments;
import e17.i;

public final class h implements h$a	// class@0024f9
{
    public final List a;

    public void h(List p0){
       this.a = p0;
    }
    public final QComment a(List p0,RecyclerFragment p1,h p2){
       Iterator iterator = this.a.iterator();
       int i = 0;
       QComment qComment = null;
       while (iterator.hasNext()) {
          String str = iterator.next();
          Iterator iterator1 = p0.iterator();
          int i1 = 0;
          while (iterator1.hasNext()) {
             QComment qComment1 = iterator1.next();
             if (TextUtils.n(qComment1.mId, str)) {
                i1 = qComment1;
             }
          }
          if (i1 == null) {
             i = 1;
          }else if(qComment == null){
             qComment = i1;
          }
       }
       a uoa = p1.q();
       if (i && (uoa.w() != null && uoa.w().mErrorToast != null)) {
          i.d(R.style.arg_RES_7f11066a, uoa.w().mErrorToast);
          p2.g = true;
       }
       return qComment;
    }
}
