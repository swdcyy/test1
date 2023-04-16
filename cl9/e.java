package cl9.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.CommentExtraInfo;
import al9.a;
import com.kuaishou.android.model.mix.CommentAuthorPendantInfo;
import ekd.j;
import cl9.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import ok.o;
import uc5.a;
import cl9.b;
import cl9.c;
import cl9.d;
import android.widget.ImageView;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import ekd.m1;

public class e extends PresenterV2	// class@00061b
{
    public QPhoto p;
    public QComment q;
    public a r;
    public boolean s;
    public boolean t;
    public KwaiImageView u;

    public void e(boolean p0){
       super();
       this.s = p0;
    }
    public void E8(){
       boolean b;
       CommentAuthorPendantInfo mRootComment;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       if (this.q.getUser() == null) {
          User user = new User("", "", "", "", null);
       }else {
          User user1 = this.q.getUser();
       }
       this.t = TextUtils.equals(v3.mId, QCurrentUser.me().getId());
       if (this.u != null) {
          e obj = PatchProxy.apply(objArray, this, uoe, "4");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(this.t != null){
             obj = this.r;
             if (obj != null && (obj.N() != null && (this.r.N().mCurrentUserPendantInfo != null && (this.s == null || (!j.h(this.r.N().mCurrentUserPendantInfo.mRootCommentPendantUrls) || (this.s == null && !j.h(this.r.N().mCurrentUserPendantInfo.mSubCommentPendantUrls))))))) {
             label_00ba :
                b = true;
             }
          }
       label_0092 :
          if (this.t == null) {
             obj = this.q;
             if (obj != null) {
                QComment mCommentAuth = obj.mCommentAuthorPendantInfo;
                if (mCommentAuth != null && (this.s == null || (!j.h(mCommentAuth.mRootCommentPendantUrls) || (this.s == null && !j.h(this.q.mCommentAuthorPendantInfo.mSubCommentPendantUrls))))) {
                   goto label_00ba ;
                }
             }
          }
          b = false;
          if (b) {
             e tu = this.u;
             CommentAuthorPendantInfo uCommentAuth = PatchProxy.apply(objArray, this, uoe, "5");
             if (uCommentAuth != patchProxyRe) {
             }else if(this.t != null){
                mRootComment = (this.s != null)? this.r.N().mCurrentUserPendantInfo.mRootCommentPendantUrls: this.r.N().mCurrentUserPendantInfo.mSubCommentPendantUrls;
             }else if(this.s != null){
                mRootComment = this.q.mCommentAuthorPendantInfo.mRootCommentPendantUrls;
             }else {
                mRootComment = this.q.mCommentAuthorPendantInfo.mSubCommentPendantUrls;
             }
             uCommentAuth = mRootComment;
             a.d(tu, uCommentAuth, a.b);
             return;
          }else if(a.a(v3.mPendantType) && this.q.isLocalCreated()){
             a.c(this.u, R.drawable.arg_RES_7f0803cc, b.b);
          }else {
             a.d(this.u, v3.mPendants, c.b);
          }
          if (a.b(this.q, d.b)) {
             this.q.mAvatarPendantShow = true;
          }
          if (PatchProxy.applyVoid(objArray, this, uoe, "6") || (this.u.getVisibility() || (this.q.getUser() != null && a.a(this.q.getUser().mPendantType)))) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHOW_PENDANT";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(this.p.getEntity());
             u1.u0(6, uElementPack, uContentPack);
          }
       }
    label_017b :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a0ac2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(QComment.class);
       this.r = this.r8("DETAIL_PAGE_LIST");
       return;
    }
}
