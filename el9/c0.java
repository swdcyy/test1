package el9.c0;
import erd.g;
import com.yxcorp.gifshow.comment.presenter.global.g;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.comment.CommentConfig;
import java.util.List;
import com.yxcorp.gifshow.comment.log.a;
import yk9.d;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommentShowPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommentPackage;
import com.kuaishou.android.model.mix.QComment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MessagePackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;
import java.util.Iterator;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;

public final class c0 implements g	// class@0021dd
{
    public final g b;

    public void c0(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g t;
       int b1;
       String str;
       c0 b = this.b;
       int i = p0;
       Objects.requireNonNull(b);
       g og = 1;
       if (i == FragmentEvent.PAUSE) {
          b.D = false;
          b.R8();
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, b, g.class, "6") && (b.y != null && (b.t != null && b.s != null))) {
             Activity activity = b.getActivity();
             if (b.r.mLogCommentShowOnDestroy != null && (activity != null && activity.isFinishing())) {
                b.s.C(b.t.a(), activity);
             }else {
                g s = b.s;
                List list = b.t.a();
                g p = b.p;
                Objects.requireNonNull(s);
                if (!PatchProxy.applyVoidTwoRefs(list, p, s, d.class, "5")) {
                   if (s.g >= 0) {
                      i3 oi3 = i3.f();
                      oi3.c("comment_loading_time", Long.valueOf(s.g));
                      str = oi3.e();
                   }else {
                      str = objArray;
                   }
                   p0 = str;
                   t = p;
                   if (PatchProxy.applyVoidThreeRefs(list, str, p, s, d.class, "6") || (s.a != null && !q.f(list))) {
                      ClientContent$PhotoPackage photoPackage = s.i();
                      ClientContent$CommentShowPackage uCommentShow = new ClientContent$CommentShowPackage();
                      StringBuilder str1 = "";
                      if (!q.f(list)) {
                         ClientContent$CommentPackage[] uCommentPack = new ClientContent$CommentPackage[list.size()];
                         uCommentShow.commentPackage = uCommentPack;
                         int i1 = 0;
                         while (i1 < list.size()) {
                            QComment qComment1 = list.get(i1);
                            if (!TextUtils.x(qComment1.getId())) {
                               uCommentShow.commentPackage[i1] = s.d(qComment1, qComment1.mReplyToCommentId, og, og);
                               if (qComment1.mPraiseCommentId) {
                                  object oobject = uCommentShow.commentPackage[i1];
                                  int i2 = (qComment1.mIsPraiseCommentEdited != null)? 2: 1;
                                  oobject.editStatus = i2;
                               }
                               if (!qComment1.isSub()) {
                                  String str2 = "_";
                                  if (qComment1.mIsFriendComment != null) {
                                     str1 = str1+"2"+str2;
                                  }else if(qComment1.mIsNearbyAuthor != null){
                                     str1 = str1+"1"+str2;
                                  }
                               }
                            }
                         label_011a :
                            i1 = i1 + 1;
                            og = true;
                            QComment qComment2 = null;
                         }
                      }
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.photoPackage = photoPackage;
                      uContentPack.commentShowPackage = uCommentShow;
                      if (str1.length() > 0) {
                         str1.deleteCharAt((str1.length() - 1));
                         ClientContent$MessagePackage messagePacka = new ClientContent$MessagePackage();
                         messagePacka.identity = str1;
                         uContentPack.messagePackage = messagePacka;
                      }
                      b1 = 15;
                      ClientEvent$ElementPackage uElementPack = s.e(b1, "photo_comment_show", 300);
                      if (!TextUtils.x(p0)) {
                         uElementPack.params = p0;
                      }
                      u1.B0(new ShowMetaData().setLogPage(t).setType(b1).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(s.a.getFeedLogCtx()));
                   }
                }
             }
             t = b.t;
             Objects.requireNonNull(t);
             if (!PatchProxy.applyVoid(null, t, a.class, "1")) {
                Iterator iterator = t.g.iterator();
                while (iterator.hasNext()) {
                   QComment qComment = iterator.next();
                   if (t.d(qComment)) {
                      continue ;
                   }else if(qComment.getEntity() != null && qComment.getEntity().mShown != null){
                      qComment.getEntity().mShown = false;
                   }else {
                      b1 = false;
                   }
                   qComment.mLastVisibleTimeStamp = 0;
                   qComment.mShowedTimeMs = 0;
                }
                t.f = t.b();
                t.g.clear();
             }
          }
       label_01c9 :
          b.t.g();
       }else if(i == FragmentEvent.RESUME){
          b.D = true;
          b.R8();
       }
       return;
    }
}
