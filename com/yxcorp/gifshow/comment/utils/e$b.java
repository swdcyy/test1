package com.yxcorp.gifshow.comment.utils.e$b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.yxcorp.gifshow.comment.utils.e;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import rnc.i;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import hl9.h0;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$h;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;

public class e$b implements BaseEditorFragment$c	// class@00110f
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void a(BaseEditorFragment$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "3")) {
          return;
       }
       e g = this.a.g;
       if (g != null) {
          g.a(p0);
       }
       this.a.A(i.j(p0.c));
       this.a.t(p0.e);
       this.a.y(p0.f);
       e$b ta = this.a;
       ta.v = p0;
       g = ta.g;
       if (g != null) {
          g.a(p0);
       }
       if (!QCurrentUser.ME.isLogined() && p0.a == null) {
          d.a(-1712118428).ne(this.a.c(), this.a.b.getFullSource(), "photo_comment", 8, a.B.getString(R.string.arg_RES_7f103076), this.a.b.mEntity, null, null, new h0(this, p0)).h();
          return;
       }else if(TextUtils.x(p0.c) && (p0.e != null || (p0.f != null && p0.a == null))){
          this.a.a(p0);
       }else if(p0.a != null){
          this.a.l(p0);
       }
       return;
    }
    public void c(BaseEditorFragment$h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       e g = this.a.g;
       if (g != null) {
          g.c(p0);
       }
       return;
    }
    public void d(BaseEditorFragment$m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "2")) {
          return;
       }
       e g = this.a.g;
       if (g != null) {
          g.d(p0);
       }
       return;
    }
}
