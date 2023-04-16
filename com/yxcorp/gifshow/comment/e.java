package com.yxcorp.gifshow.comment.e;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import android.app.Activity;
import ek9.a;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.model.mix.QComment;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.comment.e$c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.StringBuilder;
import ek9.w0;
import com.yxcorp.gifshow.comment.e$a;
import android.content.Context;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.util.HashMap;
import java.util.Iterator;
import xk9.j;
import java.util.Map;
import com.kuaishou.weapon.i.WeaponHI;
import fg6.a;
import com.google.gson.Gson;
import kotlin.text.StringsKt__StringsKt;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import k2b.u1;
import gk9.a;
import java.lang.Boolean;
import brd.t;
import gk9.c;
import gk9.b;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import com.kwai.framework.logger.a;
import brd.x;
import cjd.e;
import erd.o;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import erd.g;
import com.yxcorp.gifshow.comment.e$b;
import ek9.a1;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import ek9.v0;
import ek9.u0;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import com.kwai.framework.model.user.User;
import java.lang.System;
import lnc.c0;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tkd.b;
import tkd.d;
import wu5.a;
import java.lang.Iterable;
import android.text.TextUtils;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.event.CommentsEvent;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import java.util.Set;
import ek9.m1;
import java.util.ConcurrentModificationException;
import q87.c;
import java.lang.Throwable;
import android.util.Log;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommentPackage;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import zca.d;
import com.yxcorp.gifshow.comment.e$g;
import com.kuaishou.gifshow.kuaishan.ui.preview.a;
import crd.c;
import com.yxcorp.gifshow.comment.e$d;
import ek9.y0;
import com.yxcorp.gifshow.comment.e$f;
import ek9.z0;
import ek9.b1;

public final class e	// class@0010bc
{
    public e$f a;
    public Set b;
    public ArrayList c;
    public List d;
    public a e;

    public void e(){
       super();
       this.b = new HashSet();
       this.c = new ArrayList();
       this.d = new ArrayList();
    }
    public b a(Activity p0,a p1,String p2,String p3,List p4,QComment p5){
       w0 obj1;
       String str2;
       EmotionInfo uEmotionInfo;
       String str8;
       c obj3;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       int i = 5;
       int i1 = 4;
       int i2 = 2;
       int i3 = 0;
       int i4 = 6;
       boolean i5 = 1;
       int i6 = 3;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[i4];
          objArray[i3] = oobject;
          objArray[i5] = p1;
          objArray[i2] = p2;
          objArray[i6] = p3;
          objArray[i1] = oobject1;
          objArray[i] = p5;
          obj1 = PatchProxy.apply(objArray, obj, uoe, "11");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       int i7 = (!q.f(p4) && p5 != null)? p5: this.e(p0, p1);
       QPhoto qPhoto = p1.h();
       e$c uoc = p1.g();
       String str = (oobject instanceof GifshowActivity)? oobject.getUrl()+"#addcomment": null;
       obj1 = v1;
       w0 ow0 = v1;
       Object[] objArray1 = null;
       e uoe1 = this;
       QPhoto qPhoto1 = qPhoto;
       QComment qComment = i7;
       i1 = 3;
       i2 = 1;
       int i8 = 6;
       obj1 = new w0(uoe1, i7, qPhoto1, p0, uoc, p1);
       e$a uoa = i4;
       e$a uoa1 = i4;
       uoa = new e$a(uoe1, p0, p0, qPhoto1, qComment, uoc);
       QComment qComment1 = qComment;
       QComment mEmotionInfo = qComment1.mEmotionInfo;
       String str1 = "";
       if (mEmotionInfo != null) {
          str2 = String.valueOf(mEmotionInfo.mBizType);
          uEmotionInfo = mEmotionInfo.mId;
       }else {
          uEmotionInfo = str1;
          str2 = objArray1;
       }
       HashMap hashMap = PatchProxy.apply(objArray1, obj, uoe, "14");
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = new HashMap();
          uoe1 = obj.d;
          if (uoe1 != null && !uoe1.isEmpty()) {
             Iterator iterator = obj.d.iterator();
             while (iterator.hasNext()) {
                Map map = iterator.next().a();
                if (map != null) {
                   hashMap.putAll(map);
                }
             }
          }
       }
       Object obj2 = hashMap;
       if (qComment1.getComment() != null) {
          WeaponHI.setP(i1, p1.r(), (qComment1.getComment()).length());
       }
       String str3 = (oobject1 == null)? str1: a.a.q(oobject1);
       String str4 = StringsKt__StringsKt.t5(qComment1.getComment(), new char[i1]{32,160,10});
       qComment1.mComment = str4;
       qComment1.mComment = str4.replaceAll("\(?m\)^\\s*$\(\\n|\\r\\n|\\r\)", str1);
       QPhoto qPhoto2 = qPhoto1;
       String str5 = (qPhoto2 != null)? qPhoto2.getFeedLogCtxString(): objArray1;
       h$b uob = h$b.e(i2, "COMMENT_SEND_RESULT");
       String str6 = str1;
       uob.k(this.g(qComment1, p2, true, qComment1.getComment(), p3));
       uob.h(obj.f(qComment1, qPhoto2));
       uob.l(qPhoto2.getFeedLogCtx());
       u1.p0(str6, objArray1, uob);
       str4 = qComment1.getPhotoId();
       String photoUserId = qComment1.getPhotoUserId();
       String comment = qComment1.getComment();
       String replyToUserI = qComment1.getReplyToUserId();
       QComment mReplyToComm = qComment1.mReplyToCommentId;
       i5 = p1.r();
       String str7 = p1.n();
       boolean b = p1.t();
       String serverExpTag = qPhoto2.getServerExpTag();
       String expTag = qPhoto2.getExpTag();
       boolean b1 = p1.p();
       a uoa2 = a.class;
       int i9 = 14;
       int i10 = 13;
       int i11 = 12;
       i = 17;
       if (PatchProxy.isSupport(uoa2)) {
          str8 = str6;
          Object[] objArray2 = new Object[i];
          objArray2[i3] = str;
          objArray2[i2] = str4;
          objArray2[2] = photoUserId;
          objArray2[3] = comment;
          objArray2[4] = replyToUserI;
          objArray2[5] = mReplyToComm;
          objArray2[i8] = Boolean.valueOf(i5);
          objArray2[7] = uEmotionInfo;
          objArray2[8] = str7;
          objArray2[9] = str2;
          objArray2[10] = Boolean.valueOf(b);
          objArray2[11] = serverExpTag;
          objArray2[i11] = expTag;
          objArray2[i10] = obj2;
          objArray2[i9] = str3;
          objArray2[15] = Boolean.valueOf(b1);
          objArray2[16] = str5;
          obj3 = PatchProxy.apply(objArray2, null, uoa2, "3");
          if (obj3 != patchProxyRe) {
          }else if(replyToUserI == null){
             replyToUserI = str8;
          }
          if (mReplyToComm == null) {
             mReplyToComm = str8;
          }
          str1 = (i5)? "1": "0";
          obj3 = c.class;
          if (PatchProxy.isSupport(obj3)) {
             objArray1 = new Object[i];
             objArray1[0] = str4;
             objArray1[1] = photoUserId;
             objArray1[2] = str;
             objArray1[3] = comment;
             objArray1[4] = replyToUserI;
             objArray1[5] = mReplyToComm;
             objArray1[i8] = str1;
             objArray1[7] = uEmotionInfo;
             objArray1[8] = str7;
             objArray1[9] = str2;
             objArray1[10] = Boolean.valueOf(b);
             objArray1[11] = serverExpTag;
             objArray1[i11] = expTag;
             objArray1[i10] = obj2;
             objArray1[i9] = str3;
             objArray1[15] = Boolean.valueOf(b1);
             objArray1[16] = str5;
             obj3 = PatchProxy.apply(objArray1, null, obj3, "19");
             if (obj3 != patchProxyRe) {
             }
          }
          obj3 = c.f().c(str4, photoUserId, str, comment, replyToUserI, mReplyToComm, str1, uEmotionInfo, str7, str2, b, expTag, str3, serverExpTag, b.a(0xe0ff4fb).d(), obj2, b1, str5);
       }else {
          str8 = str6;
          goto label_01ea ;
       }
       a uoa3 = new a("COMMENT_SEND_RESULT", this.g(qComment1, p2, true, qComment1.getComment(), p3), obj.f(qComment1, qPhoto2), 0, qPhoto2.getFeedLogCtx());
       return obj3.compose(patchProxyRe).map(new e()).subscribeOn(b.c()).observeOn(a.c()).subscribe(ow0, uoa1);
    }
    public void b(e$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       k1.o(new a1(this, p0));
       return;
    }
    public b c(Activity p0,a p1,String p2,String p3){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       QComment obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, e.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.e(p0, p1);
       QPhoto qPhoto = p1.h();
       e$c uoc = p1.g();
       if (obj != null) {
          obj.mComment = (StringsKt__StringsKt.t5(obj.getComment(), new char[3]{32,160,10})).replaceAll("\(?m\)^\\s*$\(\\n|\\r\\n|\\r\)", "");
       }
       int i = 1;
       c uoc1 = c.class;
       if (PatchProxy.isSupport(uoc1)) {
          ot = PatchProxy.applyOneRefs(Integer.valueOf(i), null, uoc1, "24");
          if (ot != patchProxyRe) {
          label_005e :
             e uoe = this;
             v0 ov0 = new v0(uoe, obj, p0, p1, p2, p3, qPhoto, uoc);
             u0 ou0 = new u0(uoe, p0, qPhoto, obj, uoc);
             return ot.map(new e()).subscribeOn(b.c()).observeOn(a.c()).subscribe(v13, v8);
          }
       }
       ot = c.f().j(i);
       goto label_005e ;
    }
    public void d(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       this.d.add(p0);
       return;
    }
    public final QComment e(Activity p0,a p1){
       Matcher obj1;
       Object[] objArray;
       String str;
       String str1;
       e uoe = e.class;
       QComment obj = PatchProxy.applyTwoRefs(p0, p1, this, uoe, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.e();
       QComment qComment = null;
       if (obj == null) {
          return qComment;
       }
       QPhoto qPhoto = p1.h();
       e$c uoc = p1.g();
       obj.setStatus(1);
       obj.getEntity().mIsNewAddComment = true;
       obj.getEntity().mShowChildCount = 3;
       QComment mReplyCommen = obj.mReplyComment;
       if (mReplyCommen != null) {
          obj.mParent = (mReplyCommen.isSub())? obj.mReplyComment.mParent: obj.mReplyComment;
          mReplyCommen = obj.mReplyComment.mUser;
          if (mReplyCommen != null) {
             obj.mReplyToUserName = mReplyCommen.mName;
          }
          obj.mCreated = System.currentTimeMillis();
       }
       String comment = obj.getComment();
       if (!PatchProxy.applyVoidOneRefs(comment, this, uoe, "13")) {
          obj1 = c0.a.matcher(comment);
          ArrayList uArrayList = new ArrayList();
          while (obj1.find()) {
             uArrayList.add(obj1.group(2));
          }
          if (!uArrayList.isEmpty()) {
             d.a(0x6de3c81e).z30(TextUtils.join(",", uArrayList));
          }
       }
       this.e = qComment;
       a uoa = a.d();
       CommentsEvent uCommentsEve = new CommentsEvent(p0.hashCode(), qPhoto, obj, CommentsEvent$Operation.SEND);
       try{
          uoa.k(uCommentsEve);
          Iterator iterator = this.b.iterator();
          QComment qComment1 = qComment;
          try{
             while (iterator.hasNext()) {
                e$b uob = iterator.next();
                try{
                   uob.N1(qPhoto, obj);
                   e$b uob1 = uob;
                }catch(java.util.ConcurrentModificationException e8){
                   Object obj2 = uob;
                }
             }
          }catch(java.util.ConcurrentModificationException e8){
          }
       }catch(java.util.ConcurrentModificationException e8){
          obj1 = qComment;
       }
       if (uoc != null) {
          uoc.c();
       }
       return obj;
    }
    public final ClientContent$ContentPackage f(QComment p0,QPhoto p1){
       ClientContent$ContentPackage obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.photoPackage = w1.f(p1.getEntity());
       ClientContent$CommentPackage uCommentPack = new ClientContent$CommentPackage();
       QComment mId = p0.mId;
       if (mId == null) {
          mId = "";
       }
       uCommentPack.identity = mId;
       uCommentPack.childComment = p0.isSub();
       uCommentPack.index = p0.mRootCommentPosition + 1;
       uCommentPack.hot = p0.mIsHot;
       uCommentPack.authorId = p0.mUser.mId;
       if (!TextUtils.x(p0.getGifEmotionId())) {
          uCommentPack.emotionId = p0.getGifEmotionId();
       }
       mId = p0.mEmotionInfo;
       if (mId != null) {
          uCommentPack.emotionBizType = String.valueOf(mId.mBizType);
       }
       String str = (p0.isTopComment())? "÷√∂•": "≤ª÷√∂•";
       uCommentPack.commentUserLabel = str;
       obj.commentPackage = uCommentPack;
       return obj;
    }
    public final ClientEvent$ElementPackage g(QComment p0,String p1,boolean p2,String p3,String p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4};
          p0 = PatchProxy.apply(objArray, this, uoe, "16");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = (p2)? "COMMENT_SEND_RESULT": "COMMENT_DELETE_RESULT";
       uElementPack.action2 = str;
       i3 oi3 = i3.f();
       oi3.d("watch_id", p1);
       if (p2) {
          oi3.d("comment_text", p3);
          oi3.d("gear_infor", TextUtils.k(p4));
       }
       uElementPack.params = oi3.e();
       return uElementPack;
    }
    public void h(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       d a = p0.a;
       a.setNumberOfComments((a.numberOfComments() + 1));
       e$g og = new e$g();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().P1(p0.a, p0.b, og);
       }
       return;
    }
    public b i(Activity p0,a p1){
       String str1;
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       e$d obj = PatchProxy.applyTwoRefs(p0, p1, this, uoe, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p1 == null) {
          return c.d(a.b);
       }
       obj = new e$d(this, p1.g());
       if (!p1.v()) {
          return c.d(new y0(obj));
       }
       e ta = this.a;
       if (ta != null) {
          ta.a(p1);
          return c.d(new z0(obj));
       }else {
          this.c.add(p1.e());
          HashMap hashMap = PatchProxy.apply(null, this, uoe, "15");
          if (hashMap != patchProxyRe) {
          }else {
             hashMap = new HashMap();
             e td = this.d;
             if (td != null && !td.isEmpty()) {
                Iterator iterator = this.d.iterator();
                while (iterator.hasNext()) {
                   Map map = iterator.next().b();
                   if (map != null) {
                      hashMap.putAll(map);
                   }
                }
             }
          }
          String str = "";
          if (!hashMap.isEmpty()) {
             str1 = hashMap.get("currentTranscodeType");
             str2 = hashMap.get("playerSessionId");
          }else {
             str2 = str;
             str1 = str2;
          }
          if (p1.e() != null && p1.e().mQMedia != null) {
             return this.c(p0, p1, str2, str1);
          }else {
             return this.a(p0, p1, str2, str1, null, null);
          }
       }
    }
    public void j(e$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       k1.o(new b1(this, p0));
       return;
    }
    public void k(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       this.d.remove(p0);
       return;
    }
    public void l(e$f p0){
       this.a = p0;
    }
    public void m(Activity p0,QPhoto p1,QComment p2,e$c p3,Throwable p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoe, "12")) {
             return;
          }
       }
       p2.setStatus(2);
       if (p3 != null) {
          p3.a(p2, p4);
       }
       if (!p2.isSub()) {
          a.d().k(new CommentsEvent(p0.hashCode(), p1, p2, CommentsEvent$Operation.ADD_FAIL));
       }else {
          a.d().k(new CommentsEvent(p0.hashCode(), p1, p2, CommentsEvent$Operation.ADD_SUB_FAIL));
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().c6(p1, p2, p4);
       }
       return;
    }
}
