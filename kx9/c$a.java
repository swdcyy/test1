package kx9.c$a;
import com.yxcorp.gifshow.comment.e$b;
import kx9.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import ek9.c1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.survey.ActionSurveyType;
import java.util.List;
import com.yxcorp.gifshow.detail.helper.a;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Throwable;

public class c$a implements e$b	// class@002d17
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       c1.e(this, p0, p1);
    }
    public void N1(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "1")) {
          return;
       }
       c$a tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       tb = PatchProxy.apply(objArray, tb, c.class, "1");
       if (tb != PatchProxyResult.class) {
          objArray = tb;
       }else {
          List list = a.a(ActionSurveyType.COMMENT);
          if (!q.f(list)) {
             objArray = list.get(0);
          }
       }
       a.b(this.b.q, ActionSurveyType.COMMENT, objArray);
       return;
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       c1.c(this, p0, p1, p2);
    }
    public void c6(QPhoto p0,QComment p1,Throwable p2){
       c1.a(this, p0, p1, p2);
    }
    public void n7(QPhoto p0,QComment p1,Throwable p2){
       c1.f(this, p0, p1, p2);
    }
    public void t1(QPhoto p0,QComment p1,Throwable p2){
       c1.d(this, p0, p1, p2);
    }
}
