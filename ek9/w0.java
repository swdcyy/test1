package ek9.w0;
import erd.g;
import com.yxcorp.gifshow.comment.e;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.yxcorp.gifshow.comment.e$c;
import ek9.a;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.AddCommentResponse;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.comment.utils.VideoCommentEggUtils;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.event.CommentsEvent;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import wkd.b;
import l66.a;
import dda.e;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import com.yxcorp.gifshow.action.c;
import tkd.b;
import tkd.d;
import jyb.a;
import java.lang.System;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import tg5.b;
import com.yxcorp.gifshow.model.CommentSendVideoEggEntry;
import java.util.List;
import com.kwai.component.stargateegg.model.StargateEggConfig;
import xg5.e;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.FeedSwitchesInfo;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.comment.utils.f;
import io7.a;
import com.yxcorp.gifshow.comment.utils.VideoCommentEggUtils$VideoCommentEggModel;
import java.util.Iterator;
import com.yxcorp.gifshow.comment.utils.VideoCommentEggUtils$b;
import ek9.m1;
import java.lang.Throwable;
import q87.c;
import java.util.Set;
import com.yxcorp.gifshow.comment.e$b;
import e17.i;
import nx9.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d4d.a;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import d4d.a$a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import oca.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public final class w0 implements g	// class@0021a9
{
    public final e b;
    public final QComment c;
    public final QPhoto d;
    public final Activity e;
    public final e$c f;
    public final a g;

    public void w0(e p0,QComment p1,QPhoto p2,Activity p3,e$c p4,a p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void accept(Object p0){
       boolean b;
       w0 tb = this.b;
       w0 tc = this.c;
       w0 td = this.d;
       w0 te = this.e;
       w0 tf = this.f;
       w0 tg = this.g;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VideoCommentEggUtils videoComment = VideoCommentEggUtils.class;
       tc.mId = p0.mId;
       tc.mComment = p0.mContent;
       AddCommentResponse mCreated = p0.mCreated;
       if (mCreated > 0) {
          tc.mCreated = mCreated;
       }
       tc.attachmentList = p0.attachmentList;
       int i = 0;
       tc.setStatus(i);
       td.setNumberOfComments((td.numberOfComments() + 1));
       a uoa = a.d();
       int i1 = te.hashCode();
       CommentsEvent$Operation aDD = (tc.mReplyComment == null)? CommentsEvent$Operation.ADD: CommentsEvent$Operation.ADD_SUB;
       uoa.k(new CommentsEvent(i1, td, tc, aDD));
       b.a(0x6d2a4fdd).b(new e(td.mEntity));
       c.a(4, td.mEntity);
       d.a(-1079301847).pK(te, System.currentTimeMillis(), 2);
       e$g og = new e$g();
       p0 = p0.mEggEntry;
       Object obj = PatchProxy.applyOneRefs(p0, null, videoComment, "6");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(p0 == null){
          b = false;
       }else {
          b = b.a(0x43b3dc69).e(StargateEggConfig.buildConfig(p0.mResList, p0.mActivityId), null, VideoCommentEggUtils.e);
       }
       if (!b) {
          b = PatchProxy.applyTwoRefs(td, tc, null, videoComment, "4");
          if (b != patchProxyRe) {
             i = b.booleanValue();
          }else if(tc.mComment == null || (td.getPhotoMeta() != null && (td.getPhotoMeta().mFeedSwitches != null && td.getPhotoMeta().mFeedSwitches.mDisable61ActivityAnimation != null))){
             if (!VideoCommentEggUtils.b) {
                if (!PatchProxy.applyVoid(null, null, videoComment, "3") && !VideoCommentEggUtils.b) {
                   a.t().p("commentSendVideoEggs", f.b);
                   VideoCommentEggUtils.b = true;
                }
                VideoCommentEggUtils.b();
             }else if(VideoCommentEggUtils.a == null){
                VideoCommentEggUtils.b();
             }
             b = VideoCommentEggUtils.a;
             if (b != null) {
                b = b.sceneTypeMather;
                if (b != null && b.size() > 0) {
                   b = VideoCommentEggUtils.a.sceneTypeMather.iterator();
                   while (b.hasNext()) {
                      VideoCommentEggUtils$b uob = b.next();
                      if (VideoCommentEggUtils.a(uob, tc.mComment) && b.a(0x43b3dc69).d(uob.sceneType, VideoCommentEggUtils.e)) {
                         i = true;
                         break ;
                      }
                   }
                }
             }
          }
       label_0154 :
          if (!i) {
          label_0159 :
             if (tf != null) {
                tf.b(tc, og);
             }
             b = tb.b.iterator();
             while (b.hasNext()) {
                b.next().P1(td, tc, og);
             }
             if (tg.m() && !og.b()) {
                i.a(R.style.arg_RES_7f11066a, 0x7f100107);
             }
             if (c.a() && !TextUtils.x(tc.mComment)) {
                b = tc.mComment;
                a uoa1 = a.class;
                if (!PatchProxy.applyVoidOneRefs(b, null, uoa1, "15")) {
                   a.p(b, "comment");
                   a g = a.g;
                   b = g.e(b);
                   if (!PatchProxy.applyVoidOneRefs(b, g, uoa1, "3") && b.size() > 0) {
                      a.c.clear();
                      Iterator iterator = b.iterator();
                      while (iterator.hasNext()) {
                         a$a uoa2 = iterator.next();
                         if (!a.c.contains(uoa2)) {
                            a.c.add(uoa2);
                         }
                      }
                      iterator = a.c.iterator();
                      String str = "";
                      while (iterator.hasNext()) {
                         str = str+" "+iterator.next().a()+" "+' ';
                      }
                      Log.g(a.a, "totalAtUserList: "+str);
                      SharedPreferences$Editor uEditor = a.a.edit();
                      uEditor.putString(b.d("user")+"last_editor_at_user_list", str);
                      g.a(uEditor);
                      a.c(System.currentTimeMillis());
                   }
                   Log.g(a.a, "onSendCommentFinish: ...@ list size: "+b.size());
                }
             }
             return;
          }
       }
       og.a();
       goto label_0159 ;
    }
}
