package el9.v;
import qvb.q;
import com.yxcorp.gifshow.comment.presenter.global.f;
import al9.a;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import qvb.i;
import java.util.Iterator;
import com.kuaishou.android.model.mix.QSubComment;
import java.util.Objects;

public class v implements q	// class@002203
{
    public final a b;
    public final QComment c;
    public final f d;

    public void v(f p0,a p1,QComment p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ov, "1")) {
          return;
       }
       p.b(this, p0, p1);
       Iterator iterator = this.b.getItems().iterator();
       while (iterator.hasNext()) {
          QComment qComment = iterator.next();
          if ((this.c.mId).equals(qComment.mId)) {
             qComment.sync(this.c);
          }
          QComment mSubComment = this.c.mSubComment;
          if (mSubComment != null) {
             Iterator iterator1 = mSubComment.mComments.iterator();
             while (iterator1.hasNext()) {
                QComment qComment1 = iterator1.next();
                if (Objects.equals(qComment.mId, qComment1.mId)) {
                   qComment.sync(qComment1);
                }else {
                   continue ;
                }
             }
          }
       }
       return;
    }
}
