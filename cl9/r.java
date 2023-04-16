package cl9.r;
import n3d.a;
import cl9.y;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.String;
import java.io.Serializable;
import ekd.j0;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import cl9.s;
import uid.e$a;
import uid.e;
import ek9.m1;
import q87.c;
import com.yxcorp.gifshow.comment.utils.e;

public final class r implements a	// class@000665
{
    public final y b;

    public void r(y p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       r tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == 1 && (p1 == -1 && p2 != null)) {
          List list = j0.e(p2, "album_data_list");
          int i = 0;
          if (!q.f(list) && (list.get(i) == null || TextUtils.x(list.get(i).path))) {
             Object[] objArray = new Object[i];
             m1.C().w("NasaCommentPageEditorBarPresenter", "commentPictures mediaList is null", objArray);
          }else {
             e.b(list.get(i), new s(tb));
          label_0052 :
             return;
          }
       }
       tb.F.B();
       goto label_0052 ;
    }
}
