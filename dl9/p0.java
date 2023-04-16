package dl9.p0;
import android.view.View$OnClickListener;
import dl9.x0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.comment.utils.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.android.model.mix.QSubComment;
import java.util.List;
import la6.a;
import java.lang.Integer;
import java.lang.Boolean;
import brd.t;
import com.yxcorp.gifshow.entity.QPhoto;
import gk9.c;
import gk9.b;
import cjd.e;
import erd.o;
import hl9.z;
import dl9.r0;
import dl9.w0;
import erd.g;
import crd.b;

public final class p0 implements View$OnClickListener	// class@001f91
{
    public final x0 b;

    public void p0(x0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       int i1;
       int i3;
       x0 a;
       x0 obj2;
       t ot;
       t ot1;
       p0 b = this.b;
       Objects.requireNonNull(b);
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x0 ox0 = x0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, ox0, "5")) {
       }else {
          Object obj = PatchProxy.apply(objArray, b, ox0, "6");
          int i = 3;
          if (obj != patchProxyRe) {
             i1 = obj.intValue();
          }else {
             i1 = d.f(b.u.mParent.mSubComment);
             i1 = (i1 >= i)? 10: i1 - 3;
          }
          QComment mParent = b.u.mParent;
          x0 obj1 = PatchProxy.applyOneRefs(mParent, objArray, uod, "7");
          int i2 = 0;
          if (obj1 != patchProxyRe) {
             i3 = obj1.intValue();
          }else if(mParent != null){
             mParent = mParent.mSubComment;
             if (mParent != null) {
                QSubComment mComments = mParent.mComments;
                if (mComments != null) {
                   i3 = mComments.size();
                }
             }
          }
          i3 = 0;
          i3 = i3 - d.f(b.u.mParent.mSubComment);
          if (!a.a(b.u.mParent.mSubComment.mCursor) && i3 < i1) {
             b.R8(b.u, i2);
          }else if(i3 < 0){
             b.R8(b.u, i2);
          }else if(i1 <= i3){
             b.R8(b.u, i1);
          }else {
             i1 = i1 - i3;
             b.F = i1;
             obj1 = b.u;
             if (!PatchProxy.isSupport(ox0) || !PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(i1), b, ox0, "11")) {
                b.W8();
                ox0 = b.v;
                a = b.A;
                if (PatchProxy.isSupport(uod)) {
                   obj2 = PatchProxy.applyFourRefs(ox0, obj1, Boolean.valueOf(a), Integer.valueOf(i1), null, d.class, "25");
                   if (obj2 != patchProxyRe) {
                      ot = obj2;
                      obj2 = obj1;
                   label_0148 :
                      ot.subscribe(new r0(b, obj2, i1), new w0(b));
                   }
                }
                String photoId = ox0.getPhotoId();
                String userId = ox0.getUserId();
                String str = "desc";
                QComment mParent1 = obj1.mParent;
                QSubComment mCursor = mParent1.mSubComment.mCursor;
                String id = mParent1.getId();
                String transferPara = ox0.getTransferParam();
                c uoc = c.class;
                if (PatchProxy.isSupport(uoc)) {
                   objArray = new Object[]{photoId,userId,str,mCursor,id,Boolean.valueOf(a),transferPara,Integer.valueOf(i1)};
                   ot1 = PatchProxy.apply(objArray, null, uoc, "16");
                   if (ot1 != patchProxyRe) {
                      obj2 = obj1;
                   label_0136 :
                      ot = ot1.map(new e()).map(new z(obj2));
                      goto label_0148 ;
                   }
                }
                obj2 = obj1;
                ot1 = c.f().r(photoId, userId, str, mCursor, id, a, transferPara, i1);
                goto label_0136 ;
             }
          }
       }
       return;
    }
}
