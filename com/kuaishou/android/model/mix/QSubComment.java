package com.kuaishou.android.model.mix.QSubComment;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import java.lang.Number;

public class QSubComment implements Serializable	// class@000dd5
{
    public List mComments;
    public String mCursor;
    public static final long serialVersionUID = 0x35bf370600102549;

    public void QSubComment(){
       super();
    }
    public void add(int p0,QComment p1){
       if (PatchProxy.isSupport(QSubComment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, QSubComment.class, "6")) {
          return;
       }
       QSubComment tmComments = this.mComments;
       if (tmComments == null) {
          return;
       }
       if (!tmComments.contains(p1)) {
          this.mComments.add(p0, p1);
       }
       return;
    }
    public void add(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QSubComment.class, "5")) {
          return;
       }
       QSubComment tmComments = this.mComments;
       if (tmComments == null) {
          return;
       }
       if (!tmComments.contains(p0)) {
          this.mComments.add(p0);
       }
       return;
    }
    public void addAll(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QSubComment.class, "7")) {
          return;
       }
       if (this.mComments == null) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          QComment qComment = iterator.next();
          if (!this.mComments.contains(qComment)) {
             this.mComments.add(qComment);
          }
       }
       return;
    }
    public QComment getFirstBean(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, QSubComment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.mComments)) {
          objArray = this.mComments.get(0);
       }
       return objArray;
    }
    public QComment getLastBean(){
       Object[] objArray = null;
       QSubComment obj = PatchProxy.apply(objArray, this, QSubComment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.mComments)) {
          obj = this.mComments;
          objArray = obj.get((obj.size() - 1));
       }
       return objArray;
    }
    public QComment getLastShowBean(){
       Object[] objArray = null;
       QSubComment obj = PatchProxy.apply(objArray, this, QSubComment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mComments;
       if (obj == null) {
          return objArray;
       }
       int i = obj.size() - 1;
       while (true) {
          if (i < 0) {
             return objArray;
          }
          if (this.mComments.get(i).getEntity().mIsHide == null) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return this.mComments.get(i);
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, QSubComment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (q.f(this.mComments))? 0: this.mComments.size();
       return i;
    }
}
