package al9.m;
import qvb.f;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.util.ArrayList;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wh5.c;
import vca.i;
import qvb.n0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.response.CommentResponse;
import gk9.c;
import cjd.e;
import erd.o;
import org.json.JSONObject;
import java.util.List;
import la6.b;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.CommonMeta;
import k2b.k2;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.util.Collection;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import al9.k;
import al9.l;
import qvb.q;
import qvb.a;
import java.util.Iterator;
import com.yxcorp.gifshow.comment.utils.d;
import lnc.a1;
import e17.i;

public class m extends f	// class@0000f4
{
    public boolean A;
    public boolean B;
    public int C;
    public QComment D;
    public int E;
    public Context p;
    public final QPhoto q;
    public final QComment r;
    public k s;
    public boolean t;
    public RequestTiming u;
    public final List v;
    public int w;
    public int x;
    public boolean y;
    public int z;

    public void m(Context p0,QPhoto p1,QComment p2){
       super();
       this.t = false;
       this.u = RequestTiming.DEFAULT;
       this.v = new ArrayList();
       this.E = 1;
       this.q = p1;
       this.r = null;
    }
    public t I1(){
       t ot;
       m r;
       int i;
       String userId;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       Object[] objArray = null;
       String obj1 = PatchProxy.apply(objArray, obj, om, "3");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (!c.c()) {
          return objArray;
       }
       if (!obj.q.isAd() && !i.d(obj.q)) {
          ot = PatchProxy.apply(objArray, obj, om, "5");
          if (ot != patchProxyRe) {
          }else if(this.K()){
             r = obj.r;
             if (r != null && TextUtils.x(r.getRootCommentId())) {
                r = obj.r;
                r.mRootCommentId = r.getId();
             }
             obj1 = obj.q.getPhotoId();
             CommentResponse uCommentResp = (!this.K() && this.L0() != null)? this.L0().mCursor: objArray;
             i = this.h2();
             m t = obj.t;
             String expTag = obj.q.getExpTag();
             String str = this.i2();
             String transferPara = obj.q.getTransferParam();
             m u = obj.u;
             r = obj.r;
             Object[] objArray1 = (r == null)? objArray: r.getRootCommentId();
             r = obj.r;
             if (r != null) {
                objArray = r.mId;
             }
             ot = c.c(obj1, uCommentResp, i, t, expTag, str, transferPara, u, null, objArray1, objArray, obj.q.getTransferParam(), false, obj.q.numberOfComments(), obj.E).map(new e());
          }else {
             obj1 = obj.q.getPhotoId();
             userId = obj.q.getUserId();
             if (!this.K() && this.L0() != null) {
                objArray = this.L0().mCursor;
             }
             ot = c.e(obj1, userId, "desc", objArray, "10", this.h2(), obj.t, obj.q.getExpTag(), this.i2(), obj.q.getTransferParam(), obj.u, obj.q.numberOfComments(), obj.E).map(new e());
          }
          return ot;
       }else {
          ot = PatchProxy.apply(objArray, obj, om, "4");
          if (ot != patchProxyRe) {
          }else if(this.K()){
             r = obj.r;
             if (r != null) {
                if (TextUtils.x(r.getRootCommentId())) {
                   r = obj.r;
                   r.mRootCommentId = r.getId();
                }
                QComment transparentP = obj.r.transparentParam;
                String str1 = (transparentP != null)? transparentP.toString(): objArray;
                obj1 = obj.q.getPhotoId();
                if (!this.K() && this.L0() != null) {
                   objArray = this.L0().mCursor;
                }
                ot = c.c(obj1, objArray, this.h2(), obj.t, obj.q.getExpTag(), this.i2(), obj.q.getTransferParam(), obj.u, null, obj.r.getRootCommentId(), obj.r.mId, str1, false, obj.q.numberOfComments(), obj.E).map(new e());
             }
          }
          obj1 = obj.q.getPhotoId();
          userId = obj.q.getUserId();
          if (!this.K() && this.L0() != null) {
             objArray = this.L0().mCursor;
          }
          ot = c.e(obj1, userId, "desc", objArray, "10", this.h2(), obj.t, obj.q.getExpTag(), this.i2(), obj.q.getTransferParam(), obj.u, obj.q.numberOfComments(), obj.E).map(new e());
          return ot;
       }
    }
    public void M1(Object p0,List p1){
       this.j2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.j2(p0, p1);
    }
    public final int h2(){
       int i;
       ClientEvent$UrlPackage obj = PatchProxy.apply(null, this, m.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = (u1.p() != null)? u1.p().page: 0;
       return obj;
    }
    public final String i2(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, om, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, om, "16");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(this.q.getCommonMeta() != null && TextUtils.n(this.q.getCommonMeta().mSourcePhotoPage, "p")){
          k2 ok2 = u1.j();
          while (true) {
             if (ok2 != null) {
                if (!TextUtils.n(ok2.d, "PROFILE")) {
                   ok2 = ok2.t;
                }
             }else {
                b = false;
             }
          }
          return "PROFILE";
       }
       b = true;
       if (b) {
          goto label_0051 ;
       }else {
          String str = TextUtils.k(b.a(0x4b316083).R0());
          if (TextUtils.n(str, "MY_PROFILE")) {
             return "PROFILE";
          }else if(!TextUtils.x(str)){
             return str;
          }else {
             return "OTHER";
          }
       }
    }
    public void j2(CommentResponse p0,List p1){
       int b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "6")) {
          return;
       }
       if (this.K()) {
          p1.clear();
          this.v.clear();
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       CommentResponse mHotComments = p0.mHotComments;
       if (mHotComments != null && mHotComments.size() > 0) {
          this.A = true;
          uArrayList.addAll(p0.mHotComments);
          p0.mHotComments.get(0).getEntity().mFirstCommentType = 2;
          if (!PatchProxy.applyVoidTwoRefs(p0, uArrayList, this, m.class, "8")) {
             k ok = new k(this.q, this.t, this.E);
             this.s = ok;
             ok.i2(p0.mHotCursor);
             if (this.s.hasMore()) {
                if (!PatchProxy.applyVoid(null, this, m.class, "9")) {
                   this.s.h(new l(this));
                }
                uArrayList.get((p0.mHotComments.size() - true)).getEntity().mIsLastHotComment = true;
             }else {
                uArrayList.get((p0.mHotComments.size() - true)).getEntity().mIsLastHotCommentWhenNoMoreHot = true;
             }
          }
       }
       if (p0.getItems() != null) {
          uArrayList.addAll(p0.getItems());
          if (p0.getItems().size() > 0) {
             this.B = true;
             p0.getItems().get(0).getEntity().mFirstCommentType = 1;
          }
       }
       int i = p1.size();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          QComment qComment = iterator.next();
          if (!p1.contains(qComment)) {
             if (this.r != null && TextUtils.n(qComment.getId(), this.r.getRootCommentId())) {
                qComment.mSubCommentVisible = true;
             }
             qComment.mRootCommentPosition = i;
             i = i + 1;
             d.q(qComment, p0);
             CommentResponse mFoldedComme = p0.mFoldedCommentIds;
             Object obj = PatchProxy.applyTwoRefs(mFoldedComme, qComment, this, m.class, "7");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(this.y != null && (mFoldedComme == null || !mFoldedComme.contains(qComment.getId()))){
                b = false;
             }else {
                b = this.v.size() - 200;
                if (b > 0) {
                   this.v.add(qComment);
                }
                qComment.getEntity().mIsFoldedComment = true;
                b = this.w + true;
                this.w = b;
                if (this.K()) {
                   m tr = this.r;
                   if (tr != null && TextUtils.n(tr.mRootCommentId, qComment.getId())) {
                      i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100f8c));
                   }
                }
                b = true;
             }
             if (b) {
                continue ;
             }else {
                uArrayList1.add(qComment);
             }
          }
          if (qComment.mIsGodComment != null && this.D == null) {
             this.D = qComment;
          }
       }
       p1.addAll(uArrayList1);
       this.C = p0.mGodCommentCount;
       return;
    }
}
