package cl9.r1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wk9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Iterable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import cl9.r1$a;
import android.view.View;
import android.view.View$OnClickListener;
import crd.b;
import com.yxcorp.gifshow.comment.utils.c;
import cl9.n1;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommentPackage;
import com.kwai.framework.model.user.User;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.android.model.mix.QComment$Label;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import java.lang.Boolean;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import com.kwai.framework.model.user.QCurrentUser;
import cl9.r1$b;
import java.lang.reflect.Type;
import el.a;
import com.yxcorp.gifshow.comment.config.RecommendGodComment;
import ek9.l1;
import mz6.b;
import android.content.Context;
import lnc.a1;
import mz6.a;
import mz6.b$d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import wk9.a;
import lnc.b5;
import cl9.l1;
import android.content.DialogInterface$OnCancelListener;
import cl9.m1;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import java.util.Objects;
import yk9.d;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import nk9.d;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import brd.y;
import com.yxcorp.gifshow.comment.e;
import ek9.t0;
import com.yxcorp.gifshow.comment.CommentParams;

public class r1 extends PresenterV2	// class@000663
{
    public CommentConfig A;
    public final List B;
    public y p;
    public View q;
    public QPhoto r;
    public QComment s;
    public d t;
    public RecyclerFragment u;
    public y v;
    public y w;
    public e x;
    public t0 y;
    public CommentParams z;

    public void r1(){
       super();
       ArrayList uArrayList = PatchProxy.apply(null, null, b.class, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = Lists.c(b.a);
       }
       this.B = uArrayList;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r1.class, "3")) {
          return;
       }
       this.X7(c.a(this.q, new r1$a(this)));
       this.X7(c.b(this.q, new n1(this)));
       return;
    }
    public final ClientContent$ContentPackage P8(QPhoto p0,QComment p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r1 or1 = r1.class;
       ClientContent$ContentPackage obj = PatchProxy.applyTwoRefs(p0, p1, this, or1, "27");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$CommentPackage uCommentPack = new ClientContent$CommentPackage();
       uCommentPack.identity = p1.mId;
       uCommentPack.index = p1.mRootCommentPosition + 1;
       uCommentPack.childCommentCount = p1.mSubCommentCount;
       uCommentPack.hot = p1.mIsHot;
       uCommentPack.authorId = p1.mUser.mId;
       String str = PatchProxy.applyOneRefs(p1, this, or1, "28");
       if (str != patchProxyRe) {
       }else {
          ArrayList uArrayList = new ArrayList();
          if (!q.f(p1.mLabels)) {
             Iterator iterator = p1.mLabels.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().mLabelName);
             }
          }
          if (this.r != null && (p1.getUser() != null && (this.r.getUser() != null && (p1.getUser().getId()).equals(this.r.getUser().getId())))) {
             uArrayList.add("зїеп");
          }
       label_0090 :
          str = TextUtils.join("&", uArrayList);
       }
       uCommentPack.commentUserLabel = TextUtils.k(str);
       obj.commentPackage = uCommentPack;
       obj.photoPackage = w1.f(p0.getEntity());
       return obj;
    }
    public final boolean R8(QComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.A.mPageListConfig.mEnableSubBrowseMode == null && (!this.s.isSub() && TextUtils.n(p0.getPhotoUserId(), QCurrentUser.ME.getId())))? true: false;
       return b;
    }
    public final boolean S8(QComment p0){
       RecommendGodComment obj = PatchProxy.applyOneRefs(p0, this, r1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = l1.f(new r1$b(this).getType());
       boolean b = true;
       if (obj == null || (obj.oneClickRecommendGodComment == null || p0.mType != b)) {
          b = false;
       }
       return b;
    }
    public final void V8(QComment p0,boolean p1,boolean p2){
       ArrayList uArrayList;
       int i;
       String str;
       ClientEvent$ElementPackage uElementPack2;
       Object obj = this;
       Object obj1 = p0;
       boolean b = p1;
       if (PatchProxy.isSupport(r1.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, r1.class, "8")) {
          return;
       }
       b uob = new b(this.getContext());
       if (PatchProxy.isSupport(r1.class)) {
          uArrayList = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, r1.class, "10");
          if (uArrayList != PatchProxyResult.class) {
          label_021c :
             uob.b(uArrayList);
             if (!PatchProxy.applyVoidOneRefs(obj1, obj, r1.class, "13")) {
                ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                uElementPack1.action2 = "LONG_PRESS_COMMENT_PANEL";
                uElementPack1.name = "MESSAGE";
                ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
                uContentPack1.photoPackage = w1.f(obj.r.getEntity());
                ClientContent$CommentPackage uCommentPack = new ClientContent$CommentPackage();
                uCommentPack.identity = TextUtils.I(obj1.mId);
                uCommentPack.childComment = p0.isSub();
                uCommentPack.index = obj1.mRootCommentPosition + true;
                uCommentPack.hot = obj1.mIsHot;
                uCommentPack.authorId = TextUtils.I(obj1.mUser.mId);
                uContentPack1.commentPackage = uCommentPack;
                u1.D0("", this.getActivity().N2(), 4, uElementPack1, uContentPack1, null);
             }
             if (b5.a(this.getActivity())) {
                uob.i();
             }
             uob.k(new l1(obj));
             uob.l(new m1(obj, obj1, b));
             uob.q();
             r1 t = obj.t;
             r1 s = obj.s;
             x ox = this.getActivity().N2();
             Objects.requireNonNull(t);
             if (!PatchProxy.applyVoidTwoRefs(s, ox, t, d.class, "78") && s != null) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "LONG_PRESS_COMMENT";
                ClientContent$ContentPackage uContentPack = t.c(s, s.mReplyToCommentId, true);
                uContentPack.photoPackage = t.i();
                u1.B(new ClickMetaData().setLogPage(ox).setType(4).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(t.a.getFeedLogCtx()));
             }
             SharedPreferences$Editor uEditor = e.a.edit();
             uEditor.putBoolean("HasLongClickComment", true);
             g.a(uEditor);
             RxBus.f.b(new d(true));
             return;
          }
       }
       ArrayList uArrayList1 = new ArrayList();
       if (this.S8(p0)) {
          i = 0x7f103a9e;
          if (obj1.mIsGodComment != null) {
             str = a1.p(R.string.arg_RES_7f103a9d);
          }else if(b){
             str = a1.p(R.string.arg_RES_7f103a9c);
          }else {
             str = a1.p(i);
          }
          a uoa = a.b();
          uoa.h(str);
          uoa.e(i);
          uArrayList1.add(uoa.a());
          if (!PatchProxy.isSupport(r1.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p2), obj, r1.class, "22")) {
             ClientContent$ContentPackage uContentPack2 = obj.P8(obj.r, obj.s);
             uElementPack2 = new ClientEvent$ElementPackage();
             uElementPack2.action2 = "ONE_KEY_SEND_GOD_BUTTON";
             i3 oi3 = i3.f();
             String str2 = (p2)? "TRUE": "FALSE";
             oi3.d("is_exception_function", str2);
             uElementPack2.params = oi3.e();
             u1.D0("", this.getActivity().N2(), 6, uElementPack2, uContentPack2, null);
          }
       }
       if (!TextUtils.x(obj1.mConversation) && obj.A.mEnableConversation != null) {
          uArrayList1.add(new b$d(R.string.arg_RES_7f1036bc));
          if (!PatchProxy.applyVoid(null, obj, r1.class, "24")) {
             uElementPack2 = new ClientEvent$ElementPackage();
             uElementPack2.action2 = "VIEW_DIALOGUE_BUTTON";
             u1.D0("", this.getActivity().N2(), 6, uElementPack2, obj.P8(obj.r, obj.s), null);
          }
       }
       if (!TextUtils.x(obj1.mComment)) {
          uArrayList1.add(new b$d(R.string.arg_RES_7f1007b5));
       }
       if (this.R8(p0)) {
          i = (p0.isTopComment())? 0x7f1004c2: 0x7f104d65;
          uArrayList1.add(new b$d(i));
          int i1 = p0.isTopComment() ^ 0x01;
          r1 r = obj.r;
          r1 s1 = obj.s;
          if (!PatchProxy.isSupport(r1.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(i1), r, s1, this, r1.class, "26")) {
             uElementPack2 = new ClientEvent$ElementPackage();
             String str1 = (i1)? "TOP_COMMENT": "CANCEL_TOP_COMMENT";
             uElementPack2.action2 = str1;
             u1.D0("", this.getActivity().N2(), 6, uElementPack2, obj.P8(r, s1), null);
          }
       }
       if (!q.f(obj.B)) {
          Iterator iterator = obj.B.iterator();
          while (iterator.hasNext()) {
             a uoa1 = iterator.next();
             if (uoa1.b(obj.r, obj1)) {
                uArrayList1.add(new b$d(uoa1.getId()));
             }
          }
       }
       i = 0x7f1009e6;
       if (TextUtils.n(p0.getUser().getId(), QCurrentUser.ME.getId())) {
          uArrayList1.add(b$d.d(i));
       }else {
          int i2 = 0x7f104294;
          if (TextUtils.n(p0.getPhotoUserId(), QCurrentUser.ME.getId())) {
             uArrayList1.add(new b$d(i2));
             uArrayList1.add(b$d.d(i));
             uArrayList1.add(new b$d(R.string.arg_RES_7f100103));
          }else {
             uArrayList1.add(b$d.d(i2));
          }
       }
       uArrayList = uArrayList1;
       goto label_021c ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0873);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r1.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.q8(QComment.class);
       this.t = this.q8(d.class);
       this.u = this.r8("FRAGMENT");
       this.v = this.r8("COMMENT_REPLY_OBSERVER");
       this.w = this.r8("COMMENT_TOP_OBSERVER");
       this.x = this.r8("COMMENT_HELPER");
       this.y = this.r8("COMMENT_GLOBAL_ACTION");
       this.z = this.q8(CommentParams.class);
       this.A = this.q8(CommentConfig.class);
       this.p = this.r8("COMMENT_SHOW_SUB_COMMENT_PANEL");
       return;
    }
}
