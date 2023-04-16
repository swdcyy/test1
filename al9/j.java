package al9.j;
import al9.a;
import qvb.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import java.util.List;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import java.util.ArrayList;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.util.concurrent.CopyOnWriteArrayList;
import io.reactivex.subjects.CompletableSubject;
import java.util.Collection;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.x;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import brd.t;
import java.lang.Boolean;
import wh5.c;
import ek9.m1;
import java.lang.StringBuilder;
import qvb.n0;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import org.json.JSONObject;
import com.yxcorp.gifshow.model.response.CommentResponse;
import gk9.c;
import cjd.e;
import erd.o;
import nx9.c;
import qvb.a;
import al9.c;
import io.reactivex.g;
import t45.d;
import brd.z;
import al9.f;
import java.util.concurrent.TimeUnit;
import al9.g;
import android.os.SystemClock;
import java.lang.Long;
import java.util.Objects;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.completable.m;
import brd.e;
import java.util.concurrent.Callable;
import brd.a0;
import ird.a;
import al9.h;
import brd.w;
import al9.e;
import al9.d;
import erd.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.model.CommentExtraInfo;
import qvb.o;
import java.util.Iterator;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import java.lang.Integer;
import com.kuaishou.android.model.mix.QSubComment;
import la6.b;
import com.google.gson.JsonArray;
import zk.g;
import com.google.gson.JsonElement;
import pk9.g;
import com.kuaishou.android.model.mix.CommonMeta;
import k2b.k2;
import k2b.u1;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import al9.k;
import al9.i;
import qvb.q;
import com.yxcorp.gifshow.comment.utils.d;
import java.util.Map;
import uh5.e;
import hl9.s;
import com.yxcorp.gifshow.model.ForceInsertComments;

public final class j extends f implements a	// class@0000f1
{
    public final List A;
    public final List B;
    public int C;
    public int D;
    public int E;
    public final List F;
    public boolean G;
    public int H;
    public boolean I;
    public QComment J;
    public boolean K;
    public QComment L;
    public int M;
    public QComment N;
    public int O;
    public final List P;
    public boolean Q;
    public final List R;
    public final List S;
    public final List T;
    public String U;
    public CommentExtraInfo U0;
    public ForceInsertComments V;
    public int W;
    public final CompletableSubject X;
    public boolean Y;
    public CommentPageListConfig Z;
    public final List p;
    public final String q;
    public final QPhoto r;
    public final QComment s;
    public RequestTiming t;
    public long u;
    public int v;
    public k w;
    public q x;
    public boolean y;
    public boolean z;
    public static final int V0;

    public void j(QPhoto p0,QComment p1,List p2,CommentPageListConfig p3){
       super();
       this.p = new ArrayList();
       this.q = "CommentPageListImpl";
       this.t = RequestTiming.DEFAULT;
       this.y = false;
       this.A = new ArrayList();
       this.B = new ArrayList();
       this.F = new ArrayList();
       this.P = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       this.R = uArrayList;
       this.S = new ArrayList();
       this.T = new CopyOnWriteArrayList();
       int i = 1;
       this.W = i;
       this.X = CompletableSubject.A();
       this.Y = false;
       this.r = p0;
       this.s = p1;
       if (p2 != null) {
          uArrayList.addAll(p2);
       }
       this.U = this.h2();
       this.Z = p3;
       j oj = j.class;
       if (!PatchProxy.applyVoid(null, this, oj, "1")) {
          j tZ = this.Z;
          CommentPageListConfig mHotCommentT = tZ.mHotCommentType;
          if (mHotCommentT != null) {
             this.v = mHotCommentT;
          }
          if (tZ.mEnableUserInfoInComment != null && !PatchProxy.applyVoid(null, this, oj, "5")) {
             this.I = i;
             if (this.J == null) {
                QComment qComment = x.a(p0.mEntity);
                this.J = qComment;
                qComment.mType = 5;
             }
          }
          j tZ1 = this.Z;
          if (tZ1.mEnableCommentEmotion != null) {
             this.y = i;
          }
          if (tZ1.mEnableFoldComment != null) {
             this.z = i;
          }
          if (tZ1.mEnableSinkComment != null) {
             this.G = i;
          }
          if (tZ1.mEnableFirstPageNoNetOpt != null) {
             this.Q = i;
          }
          if (tZ1.mEnableLimitFirstRequestMinDuration != null) {
             this.u = 450;
          }
          if (tZ1.mEnableSubBrowseMode != null) {
             uArrayList.clear();
             this.U = null;
             this.I = false;
             this.v = 0;
          }
       }
       return;
    }
    public void A0(int p0){
       this.O = p0;
    }
    public int C1(){
       Object obj = PatchProxy.apply(null, this, j.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (a.t().d("enablePageListSchedulerOpt", false)) {
          return 1;
       }
       return false;
    }
    public int D0(){
       return this.O;
    }
    public int G(){
       return this.E;
    }
    public void H(){
       this.G = true;
    }
    public List I(){
       return this.B;
    }
    public t I1(){
       j s;
       QComment transparentP;
       String str;
       String photoId;
       CommentResponse uCommentResp;
       int i1;
       j y;
       String expTag;
       String str1;
       String transferPara;
       j t;
       j u;
       String userId;
       CommentResponse uCommentResp1;
       String str2;
       Object[] objArray4;
       Object[] objArray6;
       Object obj = this;
       j oj = j.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       t obj1 = PatchProxy.apply(objArray, obj, oj, "6");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = PatchProxy.apply(objArray, obj, oj, "11");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): c.c() ^ 0x01;
       if (b) {
          return objArray;
       }else {
          int i = 0;
          Object[] objArray1 = new Object[i];
          m1.C().A("CommentPageListImpl", "onCreateRequest isFirstPage = "+this.K()+"mShouldBlockCommentFirstPage = "+obj.Y+"mCommentFirstRequestBlockSubject hasComplete = "+obj.X.B(), objArray1);
          if (obj.v != null) {
             obj1 = PatchProxy.apply(objArray, obj, oj, "14");
             if (obj1 != patchProxyRe) {
             }else if(this.K()){
                s = obj.s;
                if (s != null && TextUtils.x(s.getRootCommentId())) {
                   s = obj.s;
                   s.mRootCommentId = s.getId();
                }
                s = obj.s;
                if (s != null) {
                   transparentP = s.transparentParam;
                   if (transparentP != null) {
                      str = transparentP.toString();
                   label_00a0 :
                      photoId = obj.r.getPhotoId();
                      uCommentResp = (!this.K() && this.L0() != null)? this.L0().mCursor: objArray;
                      i1 = this.i2();
                      y = obj.y;
                      expTag = obj.r.getExpTag();
                      str1 = this.j2();
                      transferPara = obj.r.getTransferParam();
                      t = obj.t;
                      u = obj.U;
                      s = obj.s;
                      Object[] objArray2 = (s == null)? objArray: s.getRootCommentId();
                      s = obj.s;
                      Object[] objArray3 = (s == null)? objArray: s.getId();
                      obj1 = c.c(photoId, uCommentResp, i1, y, expTag, str1, transferPara, t, u, objArray2, objArray3, str, false, obj.r.numberOfComments(), obj.Z.mCommentPanelType).map(new e());
                   }
                }
                str = objArray;
                goto label_00a0 ;
             }else {
                photoId = obj.r.getPhotoId();
                userId = obj.r.getUserId();
                uCommentResp1 = (!this.K() && this.L0() != null)? this.L0().mCursor: objArray;
                obj1 = c.e(photoId, userId, "desc", uCommentResp1, "10", this.i2(), obj.y, obj.r.getExpTag(), this.j2(), obj.r.getTransferParam(), obj.t, obj.r.numberOfComments(), obj.Z.mCommentPanelType).map(new e());
             }
          }else {
             Object obj2 = PatchProxy.apply(objArray, objArray, c.class, "8");
             b = (obj2 != patchProxyRe)? obj2.booleanValue(): a.t().d("unifyCommentApi", i);
             if (b) {
                obj1 = PatchProxy.apply(objArray, obj, oj, "13");
                if (obj1 != patchProxyRe) {
                }else if(obj.Z.mEnableSubBrowseMode != null){
                   s = obj.s;
                   if (s != null && s.mParent != null) {
                      transparentP = s.transparentParam;
                      str2 = (transparentP != null)? transparentP.toString(): objArray;
                      photoId = obj.r.getPhotoId();
                      uCommentResp = (!this.K() && this.L0() != null)? this.L0().mCursor: objArray;
                      s = obj.s;
                      obj1 = c.b(photoId, uCommentResp, this.i2(), obj.y, obj.r.getExpTag(), this.j2(), obj.r.getTransferParam(), obj.t, s.mParent.mId, s.mId, str2, s.mConversation).map(new e());
                   }
                }
                if (this.K()) {
                   s = obj.s;
                   if (s != null) {
                      if (TextUtils.x(s.getRootCommentId())) {
                         s = obj.s;
                         s.mRootCommentId = s.getId();
                      }
                      transparentP = obj.s.transparentParam;
                      if (transparentP != null) {
                         str = transparentP.toString();
                      label_0223 :
                         photoId = obj.r.getPhotoId();
                         uCommentResp = (!this.K() && this.L0() != null)? this.L0().mCursor: objArray;
                         i1 = this.i2();
                         y = obj.y;
                         expTag = obj.r.getExpTag();
                         str1 = this.j2();
                         transferPara = obj.r.getTransferParam();
                         t = obj.t;
                         u = obj.U;
                         s = obj.s;
                         String str3 = (s != null)? s.getRootCommentId(): objArray;
                         s = obj.s;
                         QComment qComment = (s != null)? s.mId: objArray;
                         obj1 = c.c(photoId, uCommentResp, i1, y, expTag, str1, transferPara, t, u, str3, qComment, str, false, obj.r.numberOfComments(), obj.Z.mCommentPanelType).map(new e());
                      }
                   }
                   Object[] objArray5 = objArray;
                   goto label_0223 ;
                }else {
                   photoId = obj.r.getPhotoId();
                   userId = obj.r.getUserId();
                   uCommentResp1 = (!this.K() && this.L0() != null)? this.L0().mCursor: objArray;
                   obj1 = c.e(photoId, userId, "desc", uCommentResp1, "10", this.i2(), obj.y, obj.r.getExpTag(), this.j2(), obj.r.getTransferParam(), obj.t, obj.r.numberOfComments(), obj.Z.mCommentPanelType).map(new e());
                }
             }else {
                obj1 = PatchProxy.apply(objArray, obj, oj, "12");
                if (obj1 != patchProxyRe) {
                }else if(obj.Z.mEnableSubBrowseMode != null){
                   s = obj.s;
                   if (s != null && s.mParent != null) {
                      transparentP = s.transparentParam;
                      str2 = (transparentP != null)? transparentP.toString(): objArray;
                      photoId = obj.r.getPhotoId();
                      uCommentResp = (!this.K() && this.L0() != null)? this.L0().mCursor: objArray;
                      s = obj.s;
                      obj1 = c.b(photoId, uCommentResp, this.i2(), obj.y, obj.r.getExpTag(), this.j2(), obj.r.getTransferParam(), obj.t, s.mParent.mId, s.mId, str2, s.mConversation).map(new e());
                   }
                }
                if (this.K()) {
                   s = obj.s;
                   if (s != null) {
                      if (TextUtils.x(s.getRootCommentId())) {
                         s = obj.s;
                         s.mRootCommentId = s.getId();
                      }
                      transparentP = obj.s.transparentParam;
                      str = (transparentP != null)? transparentP.toString(): objArray;
                      photoId = obj.r.getPhotoId();
                      uCommentResp = (!this.K() && this.L0() != null)? this.L0().mCursor: objArray;
                      obj1 = c.c(photoId, uCommentResp, this.i2(), obj.y, obj.r.getExpTag(), this.j2(), obj.r.getTransferParam(), obj.t, obj.U, obj.s.getRootCommentId(), obj.s.mId, str, false, obj.r.numberOfComments(), obj.Z.mCommentPanelType).map(new e());
                   }
                }
                photoId = obj.r.getPhotoId();
                userId = obj.r.getUserId();
                uCommentResp1 = (!this.K() && this.L0() != null)? this.L0().mCursor: objArray;
                obj1 = c.e(photoId, userId, "desc", uCommentResp1, "10", this.i2(), obj.y, obj.r.getExpTag(), this.j2(), obj.r.getTransferParam(), obj.t, obj.r.numberOfComments(), obj.Z.mCommentPanelType).map(new e());
             }
          }
          if (obj.Q != null && (this.K() && this.isEmpty())) {
             obj1 = t.create(c.b).subscribeOn(d.c).flatMap(new f(obj1));
          }
       label_045f :
          if (this.K() && this.isEmpty()) {
             if (obj.Y != null && !obj.X.B()) {
                t ot = PatchProxy.apply(objArray, obj, oj, "10");
                if (ot != patchProxyRe) {
                }else {
                   j x = obj.X;
                   Long longx = Long.valueOf(SystemClock.elapsedRealtime());
                   Objects.requireNonNull(x);
                   a.c(longx, "completionValue is null");
                   ot = t.merge(a.i(new m(x, objArray, longx)).d0().map(h.b).observeOn(d.c), t.timer(5000, TimeUnit.MILLISECONDS).map(g.b)).take(1).map(new e(obj));
                }
                return obj1.zipWith(ot, d.a);
             }else {
                oj = obj.u;
                if (oj > 0) {
                   return obj1.zipWith(t.timer(oj, TimeUnit.MILLISECONDS), d.a);
                }
             }
          }
          return obj1;
       }
    }
    public boolean J0(){
       return this.K;
    }
    public void J1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "24")) {
          return;
       }
       super.J1(p0);
       if (this.I != null) {
          this.c();
       }
       m1.C().e("CommentPageListImpl", "onError ", p0);
       return;
    }
    public void L1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "44")) {
          return;
       }
       this.W = 2;
       return;
    }
    public void M1(Object p0,List p1){
       this.k2(p0, p1);
    }
    public CommentExtraInfo N(){
       return this.U0;
    }
    public void N0(boolean p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oj, "3")) {
          return;
       }
       this.c.N0(p0, p1);
       return;
    }
    public void O1(boolean p0){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, j.class, "43")) {
          return;
       }
       this.W = 3;
       return;
    }
    public List R(){
       return this.p;
    }
    public int R0(){
       return (this.C - this.D);
    }
    public int T0(){
       return this.W;
    }
    public int U(){
       return this.H;
    }
    public void V(long p0){
       this.u = p0;
    }
    public void V0(){
       if (PatchProxy.applyVoid(null, this, j.class, "45")) {
          return;
       }
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          QComment qComment = iterator.next();
          int i = 1;
          if (qComment != null) {
             QComment mType = qComment.mType;
             if (mType != i && (mType != 2 && (mType == 10 || mType == 5))) {
             label_0032 :
                if (i) {
                   qComment.getEntity().mIsLoggedAtTailEasterEggShow = false;
                }
             }
          }
          i = 0;
          goto label_0032 ;
       }
       return;
    }
    public void add(int p0,Object p1){
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oj, "22") && p0 >= 0)) {
          if (this.L0() == null) {
             this.T.add(p1);
          }else if(p1.isSub()){
             p1.mParent.attemptCreateSubComment();
             if (p0 <= p1.mParent.mSubComment.mComments.size()) {
                p1.mParent.mSubComment.add(p0, p1);
             }
          }else if(p0 <= this.p.size()){
             this.p.add(p0, p1);
          }
          this.c();
       }
       return;
    }
    public void add(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "21")) {
       }else if(this.L0() == null){
          this.T.add(p0);
       }else if(p0.isSub()){
          p0.mParent.attemptCreateSubComment();
          p0.mParent.mSubComment.add(p0);
       }else {
          this.p.add(p0);
       }
       this.c();
       return;
    }
    public void b0(){
       this.Y = true;
    }
    public boolean b1(){
       return this.G;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, j.class, "20")) {
          return;
       }
       this.d1().clear();
       this.d1().addAll(this.m2(this.p));
       this.c.k(false);
       return;
    }
    public void c0(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "41")) {
          return;
       }
       if (!this.P.isEmpty()) {
          this.P.remove(p0);
       }
       return;
    }
    public void clear(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "25")) {
          return;
       }
       super.clear();
       this.p.clear();
       this.A.clear();
       this.F.clear();
       this.V = objArray;
       this.U0 = objArray;
       this.S1(objArray);
       this.H = 0;
       this.C = 0;
       this.B.clear();
       this.D = 0;
       this.T.clear();
       return;
    }
    public boolean d0(){
       j obj = PatchProxy.apply(null, this, j.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w;
       if (obj != null) {
          return obj.hasMore();
       }
       return false;
    }
    public void d2(b p0,List p1){
       this.k2(p0, p1);
    }
    public void e0(RequestTiming p0){
       this.t = p0;
    }
    public void e1(){
       if (PatchProxy.applyVoid(null, this, j.class, "37")) {
          return;
       }
       j tw = this.w;
       if (tw != null) {
          tw.release();
       }
       return;
    }
    public List getItems(){
       Object obj = PatchProxy.apply(null, this, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getItems();
    }
    public void h1(){
       if (PatchProxy.applyVoid(null, this, j.class, "32")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       if (this.D == null) {
          QComment qComment = new QComment();
          qComment.mType = 9;
          uArrayList.add(qComment);
          this.E = this.getCount();
       }
       j tD = this.D;
       int i = 10;
       if ((this.A.size() - tD) > i) {
          uArrayList.addAll(this.A.subList(tD, (tD + 10)));
          this.D = this.D + i;
       }else {
          j tA = this.A;
          uArrayList.addAll(tA.subList(tD, tA.size()));
          this.D = this.D + (this.A.size() - this.D);
       }
       this.p.addAll(uArrayList);
       this.c();
       return;
    }
    public final String h2(){
       String str;
       Object[] objArray = null;
       JsonArray obj = PatchProxy.apply(objArray, this, j.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonArray();
       Iterator iterator = this.R.iterator();
       while (iterator.hasNext()) {
          str = iterator.next();
          if (str == null || obj.d0(new g(str))) {
             continue ;
          }
          obj.a0(str);
       }
       iterator = this.S.iterator();
       while (iterator.hasNext()) {
          str = iterator.next();
          if (str == null || obj.d0(new g(str))) {
             continue ;
          }
          obj.a0(str);
       }
       if (obj.size()) {
          objArray = obj.toString();
       }
       return objArray;
    }
    public final int i2(){
       Object obj = PatchProxy.apply(null, this, j.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return g.a();
    }
    public void j(boolean p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oj, "2")) {
          return;
       }
       this.c.j(p0, p1);
       return;
    }
    public void j0(){
       if (PatchProxy.applyVoid(null, this, j.class, "7")) {
          return;
       }
       this.b0();
       this.a();
       Object[] objArray = new Object[0];
       m1.C().A("CommentPageListImpl", "refreshWithBlockCommentFirstPage ", objArray);
       return;
    }
    public int j1(){
       return this.C;
    }
    public final String j2(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, oj, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, oj, "17");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(this.r.getCommonMeta() != null && TextUtils.n(this.r.getCommonMeta().mSourcePhotoPage, "p")){
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
    public void k0(){
       if (PatchProxy.applyVoid(null, this, j.class, "39")) {
          return;
       }
       if (!this.P.isEmpty()) {
          Iterator iterator = this.P.iterator();
          while (iterator.hasNext()) {
             this.m0(iterator.next());
          }
       }
       this.P.clear();
       return;
    }
    public void k2(CommentResponse p0,List p1){
       QComment qComment;
       CommentResponse mFoldedComme;
       k obj2;
       int b1;
       Object obj3;
       j s1;
       int i4;
       Object obj4;
       ForceInsertComments uForceInsert = this;
       Object obj = p0;
       Object obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, uForceInsert, j.class, "18")) {
          return;
       }
       if (this.K()) {
          uForceInsert.p.clear();
          uForceInsert.A.clear();
          uForceInsert.F.clear();
          uForceInsert.V = obj.mForceInsertComments;
          uForceInsert.U0 = obj.mCommentExtraInfo;
          uForceInsert.D = 0;
          uForceInsert.H = 0;
          uForceInsert.B.clear();
          uForceInsert.C = 0;
       }
       m1 om1 = m1.C();
       StringBuilder str = "onLoadItemFromResponse isFirstPage =  "+this.K()+"size = ";
       int i = (obj1 != null)? p1.size(): -1;
       Object[] objArray = new Object[0];
       om1.A("CommentPageListImpl", str+i, objArray);
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       CommentResponse mHotComments = obj.mHotComments;
       Object[] objArray1 = null;
       if (mHotComments != null && mHotComments.size() > 0) {
          uArrayList.addAll(obj.mHotComments);
          obj.mHotComments.get(0).getEntity().mFirstCommentType = 2;
          if (!PatchProxy.applyVoidTwoRefs(obj, uArrayList, uForceInsert, j.class, "33")) {
             obj2 = new k(uForceInsert.r, uForceInsert.y, uForceInsert.Z.mCommentPanelType);
             uForceInsert.w = obj2;
             obj2.i2(obj.mHotCursor);
             if (uForceInsert.w.hasMore()) {
                if (!PatchProxy.applyVoid(objArray1, uForceInsert, j.class, "34")) {
                   if (uForceInsert.x == null) {
                      uForceInsert.x = new i(uForceInsert);
                   }
                   uForceInsert.w.h(uForceInsert.x);
                }
                uArrayList.get((obj.mHotComments.size() - 1)).getEntity().mIsLastHotComment = true;
             }else {
                uArrayList.get((obj.mHotComments.size() - 1)).getEntity().mIsLastHotCommentWhenNoMoreHot = true;
             }
          }
       }
       if (p0.getItems() != null && p0.getItems().size() > 0) {
          uArrayList.addAll(p0.getItems());
          p0.getItems().get(0).getEntity().mFirstCommentType = 1;
       }
       if (!TextUtils.x(obj.mFeaturedCommentsTips) && uForceInsert.L == null) {
          qComment = new QComment();
          uForceInsert.L = qComment;
          qComment.mComment = obj.mFeaturedCommentsTips;
          qComment.mType = 11;
          uForceInsert.K = true;
       }
       if (uForceInsert.T.size() > 0 && this.K()) {
          Iterator iterator = uForceInsert.T.iterator();
          while (iterator.hasNext()) {
             QComment qComment1 = iterator.next();
             int i1 = uArrayList.indexOf(qComment1);
             if (i1 >= 0) {
                uArrayList.add(0, uArrayList.remove(i1));
             }else if(qComment1.mIsQuickAtComment != null || qComment1.mIsQuickEmojiComment != null){
                uArrayList.add(0, qComment1);
             }
          }
          uForceInsert.T.clear();
       }
       j s = uForceInsert.s;
       int i2 = (s != null && !TextUtils.n(s.getId(), uForceInsert.s.getRootCommentId()))? 1: 0;
       Iterator iterator1 = uArrayList.iterator();
       int i3 = uForceInsert.p.size();
       while (iterator1.hasNext()) {
          boolean b = iterator1.next();
          if (uForceInsert.Z.mEnableSubBrowseMode == null && (!uForceInsert.p.contains(b) && (!uForceInsert.F.contains(b) && !uForceInsert.A.contains(b)))) {
             if (i2 && TextUtils.n(b.getId(), uForceInsert.s.getRootCommentId())) {
                b.mSubCommentVisible = true;
             }
             b.mRootCommentPosition = i3;
             i3 = i3 + 1;
             d.q(b, obj);
             if (uForceInsert.z != null) {
                mFoldedComme = obj.mFoldedCommentIds;
                obj2 = PatchProxy.applyTwoRefs(mFoldedComme, b, uForceInsert, j.class, "28");
                if (obj2 != PatchProxyResult.class) {
                   b1 = obj2.booleanValue();
                }else if(mFoldedComme != null && mFoldedComme.contains(b.getId())){
                   if (this.K()) {
                      s1 = uForceInsert.s;
                      if (s1 == null || (!TextUtils.n(s1.mRootCommentId, b.getId()) && !TextUtils.n(uForceInsert.s.mId, b.getId()))) {
                      }
                   }else if(uForceInsert.S.contains(b.mId) || uForceInsert.R.contains(b.mId)){
                      b1 = uForceInsert.A.size() - 200;
                      if (b1 > 0) {
                         uForceInsert.A.add(b);
                      }
                      uForceInsert.B.add(b);
                      b.getEntity().mIsFoldedComment = true;
                      b1 = uForceInsert.C + 1;
                      uForceInsert.C = b1;
                      b1 = true;
                   }
                }
             label_0266 :
                b1 = false;
                if (b1) {
                   continue ;
                }
             }
             if (uForceInsert.G != null) {
                mFoldedComme = obj.mSinkCommentIds;
                obj2 = PatchProxy.applyTwoRefs(mFoldedComme, b, uForceInsert, j.class, "29");
                if (obj2 != PatchProxyResult.class) {
                   b1 = obj2.booleanValue();
                }else {
                   s = uForceInsert.s;
                   if (s != null && (s.equals(b) || (TextUtils.n(b.mId, uForceInsert.s.getRootCommentId()) || (mFoldedComme == null || (mFoldedComme.contains(b.getId()) && (uForceInsert.S.contains(b.mId) || uForceInsert.R.contains(b.mId))))))) {
                      b1 = false;
                   }else {
                      b1 = uForceInsert.F.size() - 200;
                      if (b1 > 0) {
                         uForceInsert.F.add(b);
                      }
                      b1 = uForceInsert.H + 1;
                      uForceInsert.H = b1;
                      b.getEntity().mIsSinkedComment = true;
                      b1 = true;
                   }
                }
                if (b1) {
                }
             }
             uArrayList1.add(b);
             obj3 = b;
          }else if(uForceInsert.Z.mEnableSubBrowseMode != null){
             if (!uForceInsert.p.contains(b)) {
                b.mRootCommentPosition = i3;
                b.mSubCommentVisible = true;
                uArrayList1.add(b);
             }
             j p = uForceInsert.p;
             s1 = p;
             j oj = p;
             obj3 = b;
             i4 = i3;
             if (!PatchProxy.applyVoidThreeRefs(s1, b, p0, 0, d.class, "11")) {
                Iterator iterator2 = oj.iterator();
                while (true) {
                   if (iterator2.hasNext()) {
                      obj4 = iterator2.next();
                      if (!obj4.equals(obj3)) {
                         continue ;
                      }
                   }else {
                      obj4 = obj3;
                   }
                   mFoldedComme = obj.mSubCommentMap;
                   QSubComment qSubComment = (mFoldedComme != null)? mFoldedComme.get(obj4.getId()): null;
                   if (qSubComment != null) {
                      qSubComment = qSubComment.mComments;
                      if (qSubComment != null) {
                         obj4.mSubCommentVisible = true;
                         iterator2 = qSubComment.iterator();
                         while (iterator2.hasNext()) {
                            qComment = iterator2.next();
                            qComment.mParent = obj4;
                            qComment.getEntity().mIsHide = false;
                            obj4.attemptCreateSubComment();
                            obj4.mSubComment.add(qComment);
                         }
                      }
                   }
                }
             }
          }else {
             obj3 = b;
             i4 = i3;
          }
          i3 = i4;
          if (obj3.mIsGodComment != null && uForceInsert.N == null) {
             uForceInsert.N = obj3;
          }
          if (obj3.mLiked != null && obj3.mDisliked != null) {
             obj3.mLiked = false;
          }
          obj3 = null;
       }
       if (uForceInsert.G == null || (!this.hasMore() && !PatchProxy.applyVoidOneRefs(uArrayList1, uForceInsert, j.class, "30"))) {
          uArrayList1.addAll(uForceInsert.F);
       }
    label_039d :
       uForceInsert.p.addAll(uArrayList1);
       p1.clear();
       obj1.addAll(uForceInsert.m2(uForceInsert.p));
       uForceInsert.M = obj.mGodCommentCount;
       return;
    }
    public int l(){
       Object obj = PatchProxy.apply(null, this, j.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.size();
    }
    public boolean l2(QComment p0){
       j oj = j.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, oj, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (this.L0() == null) {
          this.T.remove(p0);
          return true;
       }else if(p0.isSub()){
          if (p0.mParent.hasSub()) {
             b = p0.mParent.mSubComment.mComments.remove(p0);
          }
       }else if(p0.getEntity().mFirstCommentType == null || PatchProxy.applyVoidOneRefs(p0, this, oj, "26")){
          int i = this.p.indexOf(p0) + true;
          if (i < this.p.size()) {
             QComment qComment = this.p.get(i);
             if (p0.getEntity().mFirstCommentType == 2) {
                if (qComment.getEntity().mFirstCommentType == null) {
                   qComment.getEntity().mFirstCommentType = 2;
                }
             }else if(p0.getEntity().mFirstCommentType == true){
                qComment.getEntity().mFirstCommentType = 1;
             }
          }
       }
       b = this.p.remove(p0);
       this.c();
       return b;
    }
    public void m0(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "42")) {
          return;
       }
       if (this.P.contains(p0) && this.getItems().indexOf(p0) > -1) {
          this.l2(p0);
       }
       return;
    }
    public void m1(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       this.I = true;
       if (this.J == null) {
          QComment qComment = x.a(this.r.mEntity);
          this.J = qComment;
          qComment.mType = 5;
       }
       return;
    }
    public final List m2(List p0){
       Iterator iterator;
       QComment qComment4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, oj, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       if (this.Z.mEnableSubBrowseMode != null) {
          iterator = p0.iterator();
          while (iterator.hasNext()) {
             QComment qComment = iterator.next();
             if (qComment.mType == null) {
                qComment.mType = 1;
             }
             obj.add(qComment);
             if (qComment.hasSub()) {
                Iterator iterator1 = qComment.mSubComment.mComments.iterator();
                while (iterator1.hasNext()) {
                   QComment qComment1 = iterator1.next();
                   qComment1.getEntity().mIsHide = false;
                   qComment1.mType = 2;
                   obj.add(qComment1);
                }
             }
          }
          return obj;
       }else {
          iterator = p0.iterator();
          while (iterator.hasNext()) {
             QComment qComment2 = iterator.next();
             if (qComment2.mType == 9) {
                this.E = obj.size();
             }
             int b = (e.f() && (this.E != null && obj.size() >= this.E))? true: false;
             if (qComment2.mType == null) {
                b = (b)? 10: 1;
                qComment2.mType = b;
             }
             obj.add(qComment2);
             if (qComment2.hasSub()) {
                Iterator iterator2 = qComment2.mSubComment.mComments.iterator();
                while (iterator2.hasNext()) {
                   QComment qComment3 = iterator2.next();
                   if (qComment3.getEntity().mIsHide == null) {
                      qComment3.mType = 2;
                      obj.add(qComment3);
                   }
                }
             }
             if (s.b(qComment2) || qComment2.showExpandOrCollapse()) {
                if (qComment2.mMoreComment == null) {
                   qComment4 = new QComment();
                   qComment2.mMoreComment = qComment4;
                   qComment4.mType = 3;
                   qComment4.mParent = qComment2;
                }
                obj.add(qComment2.mMoreComment);
             }else if(qComment2.hasSub()){
                d.o(qComment2);
             }
             if (qComment2.getEntity().mIsLastHotComment != null) {
                j obj1 = PatchProxy.apply(null, this, oj, "38");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   obj1 = this.w;
                   b = (obj1 != null)? obj1.hasMore(): false;
                }
                if (b) {
                   if (qComment2.mHotMoreComment == null) {
                      qComment4 = new QComment();
                      qComment2.mHotMoreComment = qComment4;
                      qComment4.mType = 6;
                      qComment4.mParent = qComment2;
                   }
                   obj.add(qComment2.mHotMoreComment);
                }else if(qComment2.mHotCommentDivider == null){
                   qComment4 = new QComment();
                   qComment2.mHotCommentDivider = qComment4;
                   qComment4.mType = 7;
                   qComment4.mParent = qComment2;
                }
                obj.add(qComment2.mHotCommentDivider);
             }
          }
          if (this.I != null) {
             obj.add(false, this.J);
          }
          j tL = this.L;
          if (tL != null) {
             if (this.I != null) {
                obj.add(1, tL);
             }else {
                obj.add(false, tL);
             }
          }
          return obj;
       }
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, j.class, "36")) {
          return;
       }
       j tw = this.w;
       if (tw != null) {
          tw.load();
       }
       return;
    }
    public boolean o0(){
       Object obj = PatchProxy.apply(null, this, j.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.z != null && (!this.A.isEmpty() && this.D < this.A.size()))? true: false;
       return b;
    }
    public void q0(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       this.X.onComplete();
       return;
    }
    public void q1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "4")) {
          return;
       }
       this.S.clear();
       if (p0 != null) {
          this.S.addAll(p0);
       }
       this.U = this.h2();
       return;
    }
    public void r1(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "40")) {
          return;
       }
       if (!this.P.contains(p0)) {
          this.P.add(p0);
       }
       return;
    }
    public boolean remove(Object p0){
       return this.l2(p0);
    }
    public boolean s1(){
       return this.I;
    }
    public QComment t0(){
       return this.N;
    }
    public boolean t1(){
       return this.Y;
    }
    public ForceInsertComments w(){
       return this.V;
    }
    public int w0(){
       return this.M;
    }
    public boolean y(){
       boolean b = (this.D > null)? true: false;
       return b;
    }
}
