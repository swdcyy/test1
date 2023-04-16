package com.yxcorp.gifshow.comment.presenter.global.d;
import erd.g;
import com.yxcorp.gifshow.comment.presenter.global.f;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.util.Objects;
import com.kwai.component.tabs.panel.a;
import pk9.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.Window;
import il9.b;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import com.yxcorp.gifshow.comment.CommentTipsConfig;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.entity.QPhoto;
import al9.a;
import al9.b;
import el9.v;
import qvb.q;
import qvb.j;
import com.yxcorp.gifshow.activity.GifshowActivity;
import el9.w;
import gl9.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import android.content.Context;
import lnc.a1;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import hk9.c;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.comment.e$b;
import gl9.c;
import hk9.d;
import com.kwai.component.tabs.panel.TabsPanelConfig$b;
import com.kwai.component.tabs.panel.TabsPanelConfig;
import com.kwai.component.tabs.panel.TabsPanelConfig$Style;
import com.kwai.component.tabs.panel.h;
import java.util.List;
import java.util.Collections;
import yg5.d0;
import android.os.SystemClock;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import gl9.b;
import hka.a;
import gl9.d;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import gl9.a;
import com.kwai.component.tabs.panel.a$a;

public final class d implements g	// class@0010f3
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a uoa1;
       d b = this.b;
       QComment qComment = p0;
       Objects.requireNonNull(b);
       if (qComment.isSub()) {
          f q = b.q;
          boolean b1 = false;
          if (q != null) {
             q.j(b1);
             b.q.b();
          }
          b.y.c();
          b.d(b.getActivity().getWindow());
          CommentPageListConfig uCommentPage = b.s.mPageListConfig.copy();
          boolean b2 = true;
          uCommentPage.mEnableLimitFirstRequestMinDuration = b2;
          uCommentPage.mEnableSubBrowseMode = b2;
          b.s.mTipsConfig.mForceTipsCenter = b2;
          a uoa = b.a(b.r.mQPhoto, qComment, uCommentPage);
          uoa.h(new v(b, uoa, qComment.mParent));
          CommentParams mQPhoto = b.r.mQPhoto;
          GifshowActivity activity = b.getActivity();
          f r = b.r;
          f s = b.s;
          f t = b.t;
          f u = b.u;
          w ow = new w(b);
          boolean b3 = (b.z == qComment)? true: false;
          String str = "1";
          if (PatchProxy.isSupport2(e.class, str)) {
             Object[] objArray = new Object[10];
             objArray[b1] = qComment;
             objArray[1] = mQPhoto;
             objArray[2] = activity;
             objArray[3] = r;
             objArray[4] = s;
             objArray[5] = t;
             objArray[6] = Integer.valueOf(u);
             objArray[7] = uoa;
             objArray[8] = ow;
             objArray[9] = Boolean.valueOf(b3);
             uoa1 = PatchProxy.apply(objArray, null, e.class, str);
             if (uoa1 != PatchProxyResult.class) {
             label_0217 :
                b.q = uoa1;
                uoa1.e(true, 0);
             }
          }
          ViewGroup viewGroup = n.f(activity);
          FrameLayout uFrameLayout = viewGroup.findViewById(R.id.comment_sub_panel_wrapper);
          if (uFrameLayout != null) {
             viewGroup.removeView(uFrameLayout);
          }
          uFrameLayout = new FrameLayout(t.getView().getContext());
          String str1 = str;
          FrameLayout View uFrameLayout1 = new FrameLayout(t.getView().getContext());
          uFrameLayout1.setId(R.id.comment_sub_panel_container);
          uFrameLayout.addView(uFrameLayout1, -1, -1);
          uFrameLayout1 = new View(t.getView().getContext());
          uFrameLayout1.setBackgroundResource(R.color.arg_RES_7f06203c);
          uFrameLayout1.setId(R.id.comment_sub_panel_editor_background);
          uFrameLayout1.setVisibility(8);
          uFrameLayout.addView(uFrameLayout1, -1, -1);
          viewGroup.addView(uFrameLayout, -1, -1);
          uFrameLayout.bringToFront();
          CommentParams e uFrameLayout11 = r.copy();
          CommentConfig uCommentConf = s.copy();
          uFrameLayout11.mComment = qComment;
          uCommentConf.mDisableAnchorComment = true;
          uCommentConf.mPageListConfig.mEnableLimitFirstRequestMinDuration = true;
          uCommentConf.mEnableConversation = false;
          uCommentConf.mEnableFixScrollError = true;
          CommentConfig mTipsConfig = uCommentConf.mTipsConfig;
          mTipsConfig.mDisableEmptyCommentGuide = true;
          mTipsConfig.mEmptyTextResId = 0x7f100779;
          mTipsConfig.mEmptySubTextResId = 0x7f10077a;
          mTipsConfig.mEmptyViewTranslationY = (float)(- a1.e(20.50f));
          uCommentConf.mTipsConfig.mEmptyRes = 0x7f0805bf;
          if (uCommentConf.mThemeStyle == null && e.a(t.getView().getContext())) {
             uCommentConf.mThemeStyle = e.a(t.getView().getContext());
          }
          uCommentConf.mEditorConfig.mFloatEditorTheme = u;
          uCommentConf.mPageListConfig.mEnableSubBrowseMode = true;
          c uoc = new c(mQPhoto, uFrameLayout11, uCommentConf, 0);
          uoc.e(uoa);
          uFrameLayout11 = new e();
          uFrameLayout11.b(ow);
          uoc.d(uFrameLayout11);
          uoc.b(new c());
          uoc.o = a1.p(0x7f100778);
          TabsPanelConfig$b a uFrameLayout111 = new TabsPanelConfig$b();
          uFrameLayout111.h(true);
          uFrameLayout111.e(true);
          uFrameLayout111.a.p = uCommentConf.mThemeStyle;
          uFrameLayout111.c((uCommentConf.mIsSupportWhiteComment ^ true));
          uFrameLayout111.i(TabsPanelConfig$Style.STYLE1);
          uFrameLayout111.a.o = a1.a(0x7f060757);
          uFrameLayout111.k(Collections.singletonList(uoc.a()));
          uFrameLayout111.d(true);
          uFrameLayout111.j(true);
          uFrameLayout111 = d0.a(uFrameLayout111.a());
          uFrameLayout111.h(activity.getSupportFragmentManager(), R.id.comment_sub_panel_container);
          b uob = new b(uFrameLayout111);
          activity.F2(uob);
          b uob1 = uob;
          d uod = new d(activity, uob1, uFrameLayout111, viewGroup, uFrameLayout, t, SystemClock.elapsedRealtime(), qComment, b3);
          uFrameLayout111.i(new a(uFrameLayout111));
          uFrameLayout111.k(Collections.singletonList(v16));
          PatchProxy.onMethodExit(e.class, str1);
          uoa1 = uFrameLayout111;
          goto label_0217 ;
       }
       return;
    }
}
