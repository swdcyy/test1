package com.kuaishou.live.core.basic.bulletin.CommentAreaOptABContext;
import z41.f;
import com.kuaishou.live.core.basic.bulletin.CommentAreaOptABContext$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import p02.r;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.abtest.f;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import z41.g;
import z41.h;
import z41.e;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class CommentAreaOptABContext implements f	// class@00081e
{
    public boolean a;
    public boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    public final boolean g;
    public static final CommentAreaOptABContext$a h;

    static {
       CommentAreaOptABContext.h = new CommentAreaOptABContext$a(null);
    }
    public void CommentAreaOptABContext(){
       super();
       this.a = true;
       this.b = true;
       CommentAreaOptABContext$a h = CommentAreaOptABContext.h;
       this.c = h.a("enableCommentAbDebugKeyboardShowingCommentHeight", "enableCommentAreaOpt_keyboardHeight");
       this.d = h.a("enableCommentAbDebugBottomButtleJackUp", "enableCommentAreaOpt_jackUp");
       this.e = h.a("enableCommentAbDebugGiftSlotPosition", "enableCommentAreaOpt_giftPosition");
       this.f = true;
       r a = r.a;
       Objects.requireNonNull(a);
       Object obj = PatchProxy.apply(null, a, r.class, "2");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): f.a("enableSmallAndHideGiftBooth");
       this.g = b;
       return;
    }
    public static final CommentAreaOptABContext a(Fragment p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CommentAreaOptABContext$a obj = PatchProxy.applyOneRefs(p0, null, CommentAreaOptABContext.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = CommentAreaOptABContext.h;
       Objects.requireNonNull(obj);
       f uof = PatchProxy.applyOneRefs(p0, obj, CommentAreaOptABContext$a.class, "1");
       if (uof != patchProxyRe) {
       }else {
          a.p(p0, "fragment");
          uof = h.a(p0).b(CommentAreaOptABContext.class);
       }
       return uof;
    }
    public void b(){
       e.a(this);
    }
    public final boolean c(){
       return this.a;
    }
    public final boolean d(){
       return this.f;
    }
    public final boolean e(){
       return this.b;
    }
    public final boolean f(){
       return this.e;
    }
    public final void g(boolean p0){
       CommentAreaOptABContext uCommentArea = CommentAreaOptABContext.class;
       if (PatchProxy.isSupport(uCommentArea) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCommentArea, "1")) {
          return;
       }
       boolean b = true;
       boolean b1 = (r.a() && !p0)? true: false;
       this.a = b1;
       this.f = r.a();
       b1 = CommentAreaOptABContext.h.a("enableCommentAbDebugBigGiftSlow", "enableCommentAreaOpt_bigGift");
       if (this.a == null || b1) {
          b = false;
       }
       this.b = b;
       b.Z(LiveLogTag.COMMENT, "CommentAreaOpt enableCommentOptNewFramework="+this.a+' '+"isGzoneOrMultiTab="+p0+' '+"enableGiftSlotSmallSize="+this.b+' '+"enableKeyboardShowCommentHeight="+this.c+' '+"enableBottomBubbleJackUp="+this.d+' '+"enableRevertGiftSlotPosition="+this.e);
       return;
    }
}
