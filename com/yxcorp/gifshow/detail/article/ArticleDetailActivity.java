package com.yxcorp.gifshow.detail.article.ArticleDetailActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.detail.article.a;
import android.view.View;
import l1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.Intent;
import o56.c;
import android.app.Application;
import com.yxcorp.utility.repo.a;
import ekd.j0;
import nf6.e;
import android.app.Activity;
import e3a.a;
import android.os.Bundle;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.util.Locale;
import java.lang.Integer;
import zf6.l;
import ekd.i;
import ww9.b;
import com.yxcorp.gifshow.detail.article.model.ArticleFeed;
import com.kwai.component.feedstaggercard.model.ArticleModel;
import android.net.Uri;
import ekd.w0;
import com.yxcorp.gifshow.webview.e;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.detail.article.ArticleWebviewFragment;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import com.yxcorp.gifshow.comment.CommentConfig;
import m9a.d;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.comment.CommentTipsConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.utils.d;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import nx9.c;
import bx9.i$c;
import com.yxcorp.gifshow.comment.e;
import ek9.t0;
import bx9.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zw9.w0;
import zw9.b;
import zw9.h0;
import zw9.k0;
import zw9.y;
import zw9.k;
import hk9.a;
import kk9.a;
import ok9.c;
import zw9.p0;
import zw9.t0;
import zw9.l0;
import zw9.e0;
import zw9.t;
import zw9.c0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.yxcorp.gifshow.log.q;
import hka.a;

public class ArticleDetailActivity extends GifshowActivity	// class@001343
{
    public QPhoto A;
    public int B;
    public String C;
    public String D;
    public QComment E;
    public int F;
    public final a G;
    public b y;
    public PresenterV2 z;
    public static final int H;

    public void ArticleDetailActivity(){
       super();
       this.G = a.b;
    }
    public static a u3(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ArticleDetailActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (int)((((float)p0.getWidth() * 0x3f800000) / (float)n.y(a.B)) * (float)a1.e(50.00f));
       return a.b(p0, 0, (- i), p0.getWidth(), (p0.getHeight() + i));
    }
    public static void v3(Context p0,QPhoto p1,Intent p2,View p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, ArticleDetailActivity.class, "2")) {
          return;
       }
       Intent intent = new Intent(p0, ArticleDetailActivity.class);
       intent.putExtra("repo_photo_id", a.b(a.a().a()).c(p1));
       if (p2 != null) {
          intent.putExtra("commentId", j0.f(p2, "commentId"));
          String str = "rootCommentId";
          intent.putExtra(str, j0.f(p2, str));
       }
       e.b(intent);
       if (p3 == null) {
          p0.startActivity(intent);
          return;
       }else {
          a.b(p0).r3(intent, -1, ArticleDetailActivity.u3(p3).d(), p3);
          return;
       }
    }
    public int M(){
       return 4;
    }
    public int getPage(){
       return 7;
    }
    public String getPageParams(){
       Object[] obj = PatchProxy.apply(null, this, ArticleDetailActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{String.valueOf(this.F)};
       return String.format("is_article=true&depth=%s", obj);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ArticleDetailActivity.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArticleDetailActivity uArticleDeta = ArticleDetailActivity.class;
       Object[] objArray = null;
       ArticleDetailActivity obj = PatchProxy.apply(objArray, this, uArticleDeta, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.A;
       if (obj != null) {
          str = PatchProxy.applyOneRefs(obj, objArray, uArticleDeta, "15");
          if (str != patchProxyRe) {
          }else {
             Object[] objArray1 = new Object[]{obj.getUserId(),obj.getPhotoId(),Integer.valueOf(obj.getType()),obj.getExpTag()};
             str = String.format(Locale.US, "ks://article/%s/%s/%d/%s", objArray1);
          }
       }else {
          str = "ks://article";
       }
       return str;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArticleDetailActivity uArticleDeta = ArticleDetailActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uArticleDeta, "5")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uArticleDeta, "7")) {
          this.C = j0.f(this.getIntent(), "commentId");
          this.D = j0.f(this.getIntent(), "rootCommentId");
          i = j0.b(this.getIntent(), "repo_photo_id", 0);
          if (this.A == null) {
             this.A = a.b(this.getApplication()).a(i, this);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uArticleDeta, "8")) {
          this.F = j0.b(this.getIntent(), "articlePageDepth", 0) + 1;
       }
       if (this.A == null) {
          this.finish();
          return;
       }else {
          i.h(this, 0, l.r());
          this.setContentView(R.layout.arg_RES_7f0d0025);
          if (!PatchProxy.applyVoid(objArray, this, uArticleDeta, "9")) {
             b uob = new b();
             this.y = uob;
             uob.b = this.A;
             uob.h = Integer.valueOf(this.F);
             ArticleDetailActivity uArticleDeta1 = (w0.f(this.A.mEntity.mArticleModel.mArticleH5LinkUrl) == null)? null: 1;
             this.y.f = (uArticleDeta1)? new KwaiYodaWebViewFragment(): new ArticleWebviewFragment();
             uArticleDeta1 = this.y;
             CommentsFragment uCommentsFra = PatchProxy.apply(objArray, this, uArticleDeta, "10");
             if (uCommentsFra != patchProxyRe) {
             }else {
                CommentConfig uCommentConf = d.c(this.A, objArray);
                CommentParams uCommentPara = new CommentParams();
                uCommentConf.mLocationAfterAddComment = false;
                uCommentConf.mIsSupportWhiteComment = false;
                uCommentConf.mTipsConfig.mEnableFirstLoading = false;
                if (!TextUtils.x(this.C)) {
                   QComment qComment = new QComment();
                   this.E = qComment;
                   qComment.mId = this.C;
                   qComment.mRootCommentId = this.D;
                   uCommentPara.mComment = qComment;
                }
                uCommentPara.mQPhoto = this.A;
                CommentConfig mEditorConfi = uCommentConf.mEditorConfig;
                mEditorConfi.mAtFriendMaxLimit = d.a;
                mEditorConfi.mAtFriendMaxLimitToastResId = 0x7f100240;
                uCommentConf.mEnableNewLikeDislikeUi = c.b();
                ArticleDetailActivity ty = this.y;
                ty.e = uCommentPara;
                ty.d = uCommentConf;
                uCommentsFra = i.a(ty.i, ty.j, uCommentPara, uCommentConf, new i$c());
             }
             uArticleDeta1.c = uCommentsFra;
          }
          String str = "11";
          PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, uArticleDeta, str);
          if (presenterV2 != patchProxyRe) {
          }else {
             View view = this.findViewById(R.id.article_info_detail);
             PresenterV2 presenterV21 = new PresenterV2();
             presenterV21.U7(new w0());
             String str1 = "12";
             PresenterV2 presenterV22 = PatchProxy.applyWithListener(objArray, this, uArticleDeta, str1);
             if (presenterV22 != patchProxyRe) {
             }else {
                presenterV22 = new PresenterV2();
                presenterV22.U7(new b());
                presenterV22.U7(new h0());
                presenterV22.U7(new k0());
                presenterV22.U7(new y());
                PatchProxy.onMethodExit(uArticleDeta, str1);
             }
             presenterV21.U7(presenterV22);
             presenterV21.U7(new k());
             presenterV21.U7(c.b(this.y.c, new a()));
             presenterV21.U7(new p0());
             presenterV21.U7(new t0());
             presenterV21.U7(new l0());
             presenterV21.U7(new e0());
             presenterV21.U7(new t());
             presenterV21.U7(new c0());
             presenterV21.f(view);
             PatchProxy.onMethodExit(uArticleDeta, str);
             presenterV2 = presenterV21;
          }
          this.z = presenterV2;
          Object[] objArray1 = new Object[]{this.y,this};
          presenterV2.i(objArray1);
          if (!PatchProxy.applyVoid(objArray, this, uArticleDeta, "6")) {
             ClientEvent$ExpTagTrans uExpTagTrans = new ClientEvent$ExpTagTrans();
             uExpTagTrans.serverExpTag = TextUtils.I(this.A.getServerExpTag());
             uExpTagTrans.clientExpTag = String.valueOf(1);
             q.m().k(this.A, uExpTagTrans, objArray, objArray);
          }
          if (TextUtils.x(this.C)) {
             this.F2(this.G);
          }
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ArticleDetailActivity.class, "13")) {
          return;
       }
       super.onDestroy();
       ArticleDetailActivity tz = this.z;
       if (tz != null) {
          tz.unbind();
          this.z.destroy();
          this.z = null;
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0){
    }
}
