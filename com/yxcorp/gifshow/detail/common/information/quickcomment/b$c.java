package com.yxcorp.gifshow.detail.common.information.quickcomment.b$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPhoto;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import uy9.p;
import android.content.Context;
import n3d.a;
import nk9.a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import java.util.List;
import java.util.HashSet;
import org.greenrobot.eventbus.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$h;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;

public class b$c implements BaseEditorFragment$c	// class@001446
{
    public final b a;

    public void b$c(b p0){
       this.a = p0;
       super();
    }
    public void a(BaseEditorFragment$g p0){
       QComment qComment;
       b$c ta1;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       b$c ta = this.a;
       ta.N = p0.e;
       ta.O = p0.f;
       BaseEditorFragment$g c = p0.c;
       ta.P = c;
       ta.S = p0.r;
       if (TextUtils.x(c)) {
          ta = this.a;
          if (ta.N != null || ta.O != null) {
          label_002d :
             if (p0.a == null) {
                ta = this.a;
                qComment = ta.u.newComment(ta.P, null, null, b.a(QCurrentUser.me()));
                b m = this.a.M;
                if (m != null) {
                   qComment.mReplyToCommentId = m.mId;
                   if (m.getUser() != null) {
                      qComment.mReplyToUserId = this.a.M.getUser().mId;
                   }
                }
                ta1 = this.a;
                qComment.mEmotionInfo = ta1.N;
                qComment.mQMedia = ta1.O;
                qComment.mAtFromAtPanelUidSet = p0.r;
                qComment.mIsCopyAt = p0.s;
                ta1.K = true;
                if (!QCurrentUser.me().isLogined()) {
                   LoginParams$a uoa = new LoginParams$a();
                   uoa.d(a1.p(R.string.arg_RES_7f103078));
                   d.a(-1712118428).x00(this.a.t, 0, uoa.a(), new p(this, qComment, p0));
                }else {
                   this.a.o0(qComment, p0);
                }
             }
          }
       }else {
          goto label_002d ;
       }
       if (p0.a != null) {
          ta1 = this.a;
          a uoa1 = new a(ta1.u, ta1.P, ta1.N, ta1.O, null, p0.r, p0.s, ta1.t.hashCode());
          qComment.b(this.a.M);
          a.d().k(qComment);
       }
       return;
    }
    public void c(BaseEditorFragment$h p0){
    }
    public void d(BaseEditorFragment$m p0){
    }
}
