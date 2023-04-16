package com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$a;
import k93.l;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister;
import java.lang.Object;
import java.lang.String;
import s93.s$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ip3.a;
import s93.s;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import s93.x;
import com.yxcorp.utility.TextUtils;
import s93.w;
import nsd.u;
import k93.c;
import k93.c$a;
import java.lang.Boolean;
import wa1.c;
import com.kuaishou.live.lite.comment.LiveLiteCommentEditorService$EditorPanel;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import xp5.i;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import com.kuaishou.live.lite.comment.LiveLiteCommentEditorService;
import java.lang.CharSequence;
import j93.b;

public final class LiteCommentBottomBarItemRegister$a implements l	// class@001ebe
{
    public final LiteCommentBottomBarItemRegister a;

    public void LiteCommentBottomBarItemRegister$a(LiteCommentBottomBarItemRegister p0){
       this.a = p0;
       super();
    }
    public void a(String p0,s$a p1){
       LiteCommentBottomBarItemRegister$a a;
       Object obj = this;
       LiteCommentBottomBarItemRegister obj1 = p0;
       c$a obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, LiteCommentBottomBarItemRegister$a.class, "3")) {
          return;
       }
       a.p(obj1, "text");
       s os = obj.a.o.get();
       if (os != null) {
          a = obj.a;
          Objects.requireNonNull(a);
          x ox = PatchProxy.applyOneRefs(obj1, a, LiteCommentBottomBarItemRegister.class, "7");
          if (ox != PatchProxyResult.class) {
          }else {
             String str1 = TextUtils.k(p0);
             a.o(str1, "TextUtils.emptyIfNull\(text\)");
             String str2 = TextUtils.k("");
             a.o(str2, "TextUtils.emptyIfNull\(\"\"\)");
             x ox1 = new x(1, 1, str1, str2, false, false, new w("OUT_EMOJI", "BOTTOM_BUTTON", false, false, null, null, 60, null));
          }
          os.a(ox, obj2);
       }
       obj1 = obj.a.c;
       Objects.requireNonNull(obj1);
       if (!PatchProxy.applyVoid(null, obj1, c.class, "4")) {
          obj2 = c.g;
          String str = obj1.b();
          Objects.requireNonNull(obj2);
          if (!PatchProxy.applyVoidOneRefs(str, obj2, c$a.class, "2")) {
             c.f.c(str, Boolean.TRUE);
          }
          obj1.c();
       }
       return;
    }
    public void b(LiveLiteCommentEditorService$EditorPanel p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteCommentBottomBarItemRegister$a.class, "1")) {
          return;
       }
       a.p(p0, "panel");
       LiteCommentBottomBarItemRegister$a ta = this.a;
       Objects.requireNonNull(ta);
       QCurrentUser obj = PatchProxy.apply(null, ta, LiteCommentBottomBarItemRegister.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = QCurrentUser.me();
          a.o(obj, "QCurrentUser.me\(\)");
          if (!obj.isLogined()) {
             y.a(ta.g, ta.j.getUrl(), "live_comment", 38, a1.p(R.string.arg_RES_7f103076), ta.i.j0(), null, null, null);
             b = true;
          }else {
             b = false;
          }
       }
       if (b) {
          return;
       }else {
          LiveLiteCommentEditorService liveLiteComm = this.a.n.get();
          if (liveLiteComm != null) {
             liveLiteComm.gm(null, p0, "BOTTOM_BUTTON");
          }
          return;
       }
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteCommentBottomBarItemRegister$a.class, "2")) {
          return;
       }
       a.p(p0, "lottieAnimUrl");
       this.a.l.F0(p0);
       return;
    }
}
