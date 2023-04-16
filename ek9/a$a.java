package ek9.a$a;
import java.lang.Object;
import ek9.a;
import nsd.u;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;
import qrd.l1;
import com.yxcorp.gifshow.comment.e$c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import qa6.b;

public final class a$a	// class@002169
{
    public a a;

    public void a$a(){
       super();
       this.a = new a(null);
    }
    public final a a(){
       return this.a;
    }
    public final a$a b(EmotionInfo p0){
       this.a.b = p0;
       return this;
    }
    public final a$a c(boolean p0){
       this.a.k = p0;
       return this;
    }
    public final a$a d(boolean p0){
       this.a.d = p0;
       return this;
    }
    public final a$a e(boolean p0){
       this.a.h = p0;
       return this;
    }
    public final a$a f(boolean p0){
       this.a.j = p0;
       return this;
    }
    public final a$a g(QMedia p0){
       this.a.c = p0;
       return this;
    }
    public final a$a h(QComment p0){
       String id;
       String obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.m = p0;
       obj = null;
       if (p0 != null) {
          User user = p0.getUser();
          if (user != null) {
             id = user.getId();
          label_0022 :
             this.j(id);
             if (p0 != null) {
                obj = p0.getId();
             }
             this.i(obj);
             return this;
          }
       }
       id = obj;
       goto label_0022 ;
    }
    public final a$a i(String p0){
       this.a.f = p0;
       return this;
    }
    public final a$a j(String p0){
       this.a.e = p0;
       return this;
    }
    public final a$a k(QComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.l(p0);
       return this;
    }
    public final a$a l(QComment p0){
       a$a obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (p0 != null) {
          if (obj.j() != null) {
             p0.mReplyComment = this.a.j();
          }
          if (this.a.f() != null) {
             p0.mEmotionInfo = this.a.f();
          }
          if (this.a.i() != null) {
             p0.mQMedia = this.a.i();
          }
          if (this.a.t()) {
             p0.mIsQuickComment = this.a.t();
          }
          if (this.a.s()) {
             p0.mIsQuickAtComment = this.a.s();
          }
          if (this.a.u()) {
             p0.mIsQuickEmojiComment = this.a.u();
          }
          if (this.a.q()) {
             p0.mIsKeepEditorState = this.a.q();
          }
          if (this.a.p()) {
             p0.mIsCopyAt = this.a.p();
          }
          l1 a = l1.a;
       }else {
          p0 = null;
       }
       obj.n = p0;
       return this;
    }
    public final a$a m(boolean p0){
       this.a.q = p0;
       return this;
    }
    public final a$a n(e$c p0){
       this.a.l = p0;
       return this;
    }
    public final a$a o(QPhoto p0,boolean p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          if (p1 && this.a.e() == null) {
             this.l(p0.newComment(this.a.o(), this.a.l(), this.a.k(), b.a(QCurrentUser.me())));
          }else {
             p1.o = p0;
          }
       }
       return this;
    }
    public final a$a p(boolean p0){
       this.a.p = p0;
       return this;
    }
    public final a$a q(String p0){
       this.a.a = p0;
       return this;
    }
}
