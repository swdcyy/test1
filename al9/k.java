package al9.k;
import qvb.f;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.n0;
import com.yxcorp.gifshow.model.response.CommentResponse;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import gk9.c;
import java.lang.Integer;
import java.lang.Boolean;
import gk9.b;
import cjd.e;
import erd.o;
import java.util.List;
import la6.b;
import java.util.ArrayList;
import e17.i;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.utils.d;
import la6.a;

public class k extends f	// class@0000f2
{
    public final QPhoto p;
    public final boolean q;
    public String r;
    public int s;

    public void k(QPhoto p0,boolean p1,int p2){
       super();
       this.p = p0;
       this.q = p1;
       this.s = p2;
    }
    public t I1(){
       int i1;
       t ot;
       CommentResponse mCursor;
       k ok = k.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k obj = PatchProxy.apply(null, this, ok, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       String photoId = this.p.getPhotoId();
       obj = PatchProxy.apply(null, this, ok, "3");
       if (obj != patchProxyRe) {
       }else if(this.K()){
          obj = this.r;
       }else if(this.L0() != null){
          mCursor = this.L0().mCursor;
       }else {
          mCursor = null;
       }
       Object obj1 = obj;
       c obj2 = PatchProxy.apply(null, this, ok, "5");
       int i = 0;
       if (obj2 != patchProxyRe) {
          i1 = obj2.intValue();
       }else if(u1.p() != null){
          i1 = u1.p().page;
       }else {
          i1 = null;
       }
       int i2 = i1;
       String transferPara = this.p.getTransferParam();
       k tq = this.q;
       int i3 = this.p.numberOfComments();
       k ts = this.s;
       obj2 = c.class;
       if (PatchProxy.isSupport(obj2)) {
          Object[] objArray = new Object[]{photoId,obj1,Integer.valueOf(i2),transferPara,Boolean.valueOf(tq),Integer.valueOf(i3),Integer.valueOf(ts)};
          ot = PatchProxy.apply(objArray, null, obj2, "5");
          if (ot != patchProxyRe) {
          label_00ac :
             return ot.map(new e());
          }
       }
       ot = c.f().m(photoId, obj1, i2, transferPara, tq, i3, ts);
       goto label_00ac ;
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(CommentResponse p0,List p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "4")) {
          return;
       }
       if (this.K()) {
          p1.clear();
       }
       ArrayList uArrayList = new ArrayList();
       if (p0.getItems() == null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100798);
          return;
       }else {
          uArrayList.addAll(p0.getItems());
          i = p1.size();
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             QComment qComment = iterator.next();
             if (!p1.contains(qComment)) {
                qComment.mRootCommentPosition = i;
                i = i + 1;
                d.q(qComment, p0);
                p1.add(qComment);
             }
          }
          return;
       }
    }
    public void i2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.r = p0;
       this.R1(a.a(p0));
       return;
    }
}
