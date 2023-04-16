package al9.i;
import qvb.q;
import al9.j;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import qvb.a;
import java.util.Collection;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import java.util.Iterator;

public class i implements q	// class@0000f0
{
    public final j b;

    public void i(j p0){
       this.b = p0;
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
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oi, "1")) {
          return;
       }
       List items = this.b.w.getItems();
       j p = this.b.p;
       items.removeAll(p);
       oi = this.b;
       Objects.requireNonNull(oi);
       Object obj = PatchProxy.applyOneRefs(p, oi, j.class, "35");
       int b = false;
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = 0;
          while (true) {
             if (i < p.size()) {
                if (p.get(i).getEntity().mIsLastHotComment == null) {
                   i = i + 1;
                }
             }else {
                i = 0;
             }
          }
          items.mIsLastHotComment = true;
          this.b.c();
          return;
       }
       int i1 = items.indexOf(p.get(i));
       p.get(i).getEntity().mIsLastHotComment = b;
       for (int i2 = i1 + 1; i2 < items.size(); i2 = i2 + 1) {
          int i3 = i - i1;
          i3 = i3 + i2;
          p.add(i3, items.get(i2));
       }
       Iterator iterator = p.iterator();
       while (iterator.hasNext()) {
          iterator.next().mRootCommentPosition = b;
          b = b + 1;
       }
    }
}
