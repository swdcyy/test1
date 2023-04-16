package al9.l;
import qvb.q;
import al9.m;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import qvb.a;
import qvb.n0;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import java.util.Iterator;
import qvb.o;

public class l implements q	// class@0000f3
{
    public final m b;

    public void l(m p0){
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
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ol, "1")) {
          return;
       }
       List items = this.b.s.getItems();
       List list = this.b.d1();
       ol = this.b;
       Objects.requireNonNull(ol);
       Object obj = PatchProxy.applyOneRefs(list, ol, m.class, "10");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = 0;
          while (true) {
             if (i < list.size()) {
                if (list.get(i).getEntity().mIsLastHotComment == null) {
                   i = i + 1;
                }
             }else {
                i = 0;
             }
          }
       }
       int i1 = items.indexOf(list.get(i));
       list.get(i).getEntity().mIsLastHotComment = false;
       for (int i2 = i1 + 1; i2 < items.size(); i2 = i2 + 1) {
          int i3 = i - i1;
          i3 = i3 + i2;
          list.add(i3, items.get(i2));
       }
       i2 = list.size();
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          iterator.next().mRootCommentPosition = i2;
          i2 = i2 + 1;
       }
       items.mIsLastHotComment = true;
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidTwoRefs(Boolean.FALSE, Boolean.FALSE, tb, m.class, "1")) {
          tb.c.j(false, false);
       }
       return;
    }
}
