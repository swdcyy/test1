package cl9.m1;
import android.content.DialogInterface$OnClickListener;
import cl9.r1;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import yk9.d;
import brd.y;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Boolean;
import wnc.a;
import e17.i;
import com.kwai.framework.model.user.QCurrentUser;
import gk9.c;
import brd.t;
import gk9.b;
import brd.z;
import io.reactivex.android.schedulers.a;
import cl9.p1;
import sfc.a;
import android.content.Context;
import erd.g;
import crd.b;
import fya.f;
import android.text.ClipboardManager;
import hl9.b;
import java.lang.CharSequence;
import ek9.t0;
import ek9.m1;
import java.lang.Throwable;
import q87.c;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.ref.WeakReference;
import cl9.s1;
import cl9.t1;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.comment.e;
import gk9.a;
import java.lang.StringBuilder;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import com.kwai.framework.logger.a;
import brd.x;
import cjd.e;
import erd.o;
import lrd.b;
import ek9.x0;
import com.yxcorp.gifshow.comment.e$e;
import com.yxcorp.gifshow.comment.b;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kwai.component.misc.report.ReportInfo;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.kwai.component.misc.report.ReportActivity;
import rfc.a;
import cl9.q1;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import wk9.a;
import nk9.g;

public final class m1 implements DialogInterface$OnClickListener	// class@000648
{
    public final r1 b;
    public final QComment c;
    public final boolean d;

    public void m1(r1 p0,QComment p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(DialogInterface p0,int p1){
       String photoId;
       String str;
       b uob;
       t1 ot11;
       String obj;
       a obj1;
       r1 t;
       x ox1;
       m1 om1 = this;
       int i = p1;
       m1 b = om1.b;
       m1 c = om1.c;
       m1 d = om1.d;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       r1 or1 = r1.class;
       Object[] objArray = null;
       if (i == 0x7f1036bc) {
          b.p.onNext(b.s);
          if (!PatchProxy.applyVoid(objArray, b, or1, "23")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "VIEW_DIALOGUE_BUTTON";
             u1.M("", b.getActivity().N2(), 6, uElementPack, b.P8(b.r, b.s), null);
          }
       }else if(i == 0x7f103a9e){
          if (!PatchProxy.applyVoid(objArray, b, or1, "25")) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "ONE_KEY_SEND_GOD_BUTTON";
             u1.M("", b.getActivity().N2(), 6, uElementPack1, b.P8(b.r, b.s), null);
          }
          if (!PatchProxy.isSupport(or1) || !PatchProxy.applyVoidTwoRefs(c, Boolean.valueOf(d), b, or1, "12")) {
             if (!a.a()) {
                i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
             }else {
                QComment mId = c.mId;
                String id = QCurrentUser.me().getId();
                photoId = b.r.getPhotoId();
                t ot = PatchProxy.applyThreeRefs(mId, id, photoId, null, c.class, "22");
                if (ot != patchProxyRe) {
                }else {
                   ot = c.f().q(mId, id, photoId);
                }
                b.X7(ot.observeOn(a.c()).subscribe(new p1(c, d), new a(b.getActivity())));
             }
          }
       }else {
          boolean b1 = false;
          if (i == 0x7f1007b5) {
             if (!PatchProxy.isSupport(or1) || (!PatchProxy.applyVoidTwoRefs(c, Boolean.FALSE, b, or1, "14") && c != null)) {
                str = f.a(c.getComment(), b.s);
                if (!PatchProxy.isSupport(or1) || !PatchProxy.applyVoidThreeRefs(str, c, Boolean.FALSE, b, r1.class, "15")) {
                   b.getActivity().getSystemService("clipboard").setText(b.a(str));
                   i.a(R.style.arg_RES_7f110669, 0x7f100831);
                   b.y.c(b.r, c);
                   b.t.D(c, b1, b.getActivity().N2());
                }
             }
          }else {
             String str1 = "20";
             Object[] objArray1 = 2;
             int i1 = 1;
             if (i == 0x7f1009e6) {
                if (!PatchProxy.applyVoidOneRefs(c, b, or1, "18") && (c == null || (b.getActivity() instanceof GifshowActivity && b.u.getFragmentManager() != null))) {
                   GifshowActivity activity = b.getActivity();
                   if (c.getStatus() == objArray1) {
                      b.u.q().remove(c);
                   }else {
                      String url = activity.getUrl();
                      or1 = b.t;
                      x ox = b.getActivity().N2();
                      Objects.requireNonNull(or1);
                      if (!PatchProxy.applyVoidTwoRefs(c, ox, or1, uod, "17") && or1.a != null) {
                         u1.B(new ClickMetaData().setLogPage(ox).setType(i1).setElementPackage(or1.f(c, i1, "delete_photo_comment", 302)).setContentPackage(or1.c(c, objArray, b1)).setFeedLogCtx(or1.a.getFeedLogCtx()));
                      }
                      ProgressFragment progressFrag = new ProgressFragment();
                      progressFrag.Ih(R.string.arg_RES_7f103667);
                      progressFrag.setCancelable(b1);
                      progressFrag.show(b.u.getFragmentManager(), "runner");
                      b.X7(new s1(b, new WeakReference(progressFrag)));
                      r1 x = b.x;
                      r1 r = b.r;
                      t1 ot1 = new t1(b, progressFrag);
                      CommentParams mLogWatchId = b.z.mLogWatchId;
                      Objects.requireNonNull(x);
                      e uoe = e.class;
                      int i2 = 6;
                      int i3 = 5;
                      int i4 = 4;
                      if (PatchProxy.isSupport(uoe)) {
                         objArray1 = new Object[i2];
                         objArray1[b1] = activity;
                         objArray1[i1] = r;
                         objArray1[2] = c;
                         objArray1[3] = url;
                         objArray1[i4] = ot1;
                         objArray1[i3] = mLogWatchId;
                         uob = PatchProxy.apply(objArray1, x, uoe, "7");
                         if (uob != patchProxyRe) {
                         label_034b :
                            b.X7(uob);
                         }
                      }
                      photoId = c.getId();
                      String photoId1 = c.getPhotoId();
                      String photoUserId = c.getPhotoUserId();
                      String serverExpTag = r.getServerExpTag();
                      String expTag = r.getExpTag();
                      a uoa = a.class;
                      if (PatchProxy.isSupport(uoa)) {
                         Object[] objArray2 = new Object[i2];
                         objArray2[0] = photoId;
                         objArray2[1] = photoId1;
                         objArray2[2] = photoUserId;
                         objArray2[3] = url;
                         objArray2[i4] = serverExpTag;
                         objArray2[i3] = expTag;
                         ot11 = ot1;
                         obj = PatchProxy.apply(objArray2, null, uoa, "5");
                         if (obj != patchProxyRe) {
                         }else {
                         label_02a0 :
                            obj = url+"#deletecomment";
                            c uoc = c.class;
                            if (PatchProxy.isSupport(uoc)) {
                               objArray = new Object[]{photoId,photoId1,photoUserId,obj,serverExpTag,expTag};
                               obj1 = PatchProxy.apply(objArray, null, uoc, str1);
                               if (obj1 != patchProxyRe) {
                                  obj = obj1;
                               }
                            }
                            obj = c.f().o(photoId, photoId1, photoUserId, obj, expTag, serverExpTag, b.a(0xe0ff4fb).d());
                         }
                      }else {
                         ot11 = ot1;
                         goto label_02a0 ;
                      }
                      t1 ot12 = ot11;
                      a uoa1 = new a("COMMENT_DELETE_RESULT", x.g(c, mLogWatchId, false, c.getComment(), null), x.f(c, r), null, r.getFeedLogCtx());
                      r1 or11 = x;
                      x0 ox0 = new x0(or11, c, r, ot12, activity);
                      b uob1 = new b(or11, activity, ot12, c, r);
                      uob = obj.compose(uoa).map(new e()).subscribeOn(b.c()).observeOn(a.c()).subscribe(uoa, photoId1);
                      goto label_034b ;
                   }
                }
             }else {
                int i5 = -1712118428;
                if (i == 0x7f104294) {
                   if (!PatchProxy.applyVoidOneRefs(c, b, or1, str1) && (c != null && b.getActivity() instanceof GifshowActivity)) {
                      Activity uActivity = b.getActivity();
                      if (!QCurrentUser.ME.isLogined()) {
                         d.a(i5).ne(uActivity, b.r.getFullSource(), "comment_inform", 9, "", b.r.mEntity, null, null, null).h();
                      }else {
                         ReportInfo reportInfo = new ReportInfo();
                         reportInfo.mRefer = uActivity.getUrl();
                         reportInfo.mPreRefer = uActivity.U2();
                         reportInfo.mSourceType = "comment";
                         reportInfo.mCommentId = c.getId();
                         reportInfo.mPhotoId = c.getPhotoId();
                         ReportActivity.P3(uActivity, WebEntryUrls.k, reportInfo);
                         t = b.t;
                         ox1 = b.getActivity().N2();
                         Objects.requireNonNull(t);
                         if (!PatchProxy.applyVoidTwoRefs(c, ox1, t, uod, str1) && t.a != null) {
                            ClientEvent$ElementPackage uElementPack2 = t.f(c, 1, "¾Ù±¨ÆÀÂÛ", 303);
                            t.a(uElementPack2);
                            u1.B(new ClickMetaData().setLogPage(ox1).setType(1).setElementPackage(uElementPack2).setContentPackage(t.c(c, c.mReplyToCommentId, false)).setFeedLogCtx(t.a.getFeedLogCtx()));
                         }
                      }
                   }
                }else if(i == 0x7f100103){
                   if (!PatchProxy.applyVoidOneRefs(c, b, or1, "21") && c != null) {
                      if (!QCurrentUser.ME.isLogined()) {
                         i.a(R.style.arg_RES_7f11066a, 0x7f103074);
                         d.a(i5).ne(b.getActivity(), b.r.getFullSource(), "comment_add_blacklist", 0, "", b.r.mEntity, null, null, null).h();
                      }else if(c.getUser() != null){
                         t = b.t;
                         ox1 = b.getActivity().N2();
                         Objects.requireNonNull(t);
                         if (!PatchProxy.applyVoidTwoRefs(c, ox1, t, uod, "22") && t.a != null) {
                            u1.B(new ClickMetaData().setLogPage(ox1).setType(1).setElementPackage(t.f(c, 1, "pull_to_blacklist_comment", 1424)).setContentPackage(t.c(c, null, false)).setFeedLogCtx(t.a.getFeedLogCtx()));
                         }
                         i = 3;
                         Object[] objArray3 = new Object[i];
                         objArray3[0] = c.getId();
                         objArray3[1] = c.getUser().getId();
                         objArray3[2] = "{user_id}";
                         str = String.format("c_%s_%s_at_%s", objArray3);
                         String str2 = (b.getActivity() instanceof GifshowActivity)? b.getActivity().getUrl()+"#"+str: null;
                         b.a(0x4a533fa).a(QCurrentUser.ME.getId(), c.getUser().getId(), str2, null).map(new e()).subscribe(new q1(b, c), new a(b.getActivity()));
                      }
                   }
                }else if(i == 0x7f104d65 || i == 0x7f1004c2){
                   if (!PatchProxy.applyVoidOneRefs(c, b, or1, "16")) {
                      b.w.onNext(new g(c, (c.isTopComment() ^ 1)));
                   }
                }else if(!q.f(b.B)){
                   Iterator iterator = b.B.iterator();
                   while (iterator.hasNext()) {
                      obj1 = iterator.next();
                      if (obj1.b(b.r, c) && i == obj1.getId()) {
                         obj1.a(b.r, c, "long_press_popup");
                         break ;
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
