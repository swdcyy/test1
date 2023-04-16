package lz9.b0$e;
import qvb.q;
import lz9.b0;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.i;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.StringBuilder;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.u1;
import android.util.Log;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import uy6.h;
import uy6.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.model.response.CommentResponse;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import o2a.a;
import al9.a;
import com.kuaishou.android.model.mix.QComment;

public class b0$e implements q	// class@002ecf
{
    public final b0 b;

    public void b0$e(b0 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
    }
    public void Z1(boolean p0,boolean p1){
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       String str = "CommentFinishLoadingPhotoBizIdNull";
       b0$e uoe = b0$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoe, "1")) {
          return;
       }
       if (this.b.u.L0() != null) {
          int i = 5;
          try{
             if (this.b.t.getPhotoMeta() == null || this.b.t.getPhotoMeta().getBizId() == null) {
                u1.R(str, "class : "+this.b.t.getEntity().getClass().getName()+"\nexpTag : "+this.b.t.getExpTag()+"\nbizType : "+this.b.I.getBizType()+"\nurl : "+this.b.A.getUrl()+"\npage : "+this.b.A.getPage()+"\ncaption : "+this.b.t.getCaption()+"\nusername : "+this.b.t.getUserName(), i);
             }
          }catch(java.lang.Exception e1){
             String stackTraceSt = Log.getStackTraceString(e1);
             if (!TextUtils.x(stackTraceSt)) {
                u1.R(str, stackTraceSt, i);
             }
          }
          b0$e tb = this.b;
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoid(null, tb, b0.class, "22") || (tb.F == null && h.a.r == null)) {
             tb.F = true;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_COMMENT_NUM";
             i3 oi3 = i3.f();
             oi3.c("icon_comment_num", Integer.valueOf(tb.t.numberOfComments()));
             oi3.c("panel_comment_num", Integer.valueOf(tb.u.L0().mCommentCount));
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tb.t.mEntity);
             u1.C0("", tb.A, 3, uElementPack, uContentPack);
          }
       label_013c :
          tb = this.b;
          tb.t0(tb.u.L0().mCommentCount);
       }
       if (!p0) {
          return;
       }else {
          b0$e tb1 = this.b;
          b0 b = tb1.B;
          b0 u = tb1.u;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(u, b, a.class, "1") && u != null) {
             b.a = u.w0();
             b.b = u.t0();
          }
          return;
       }
    }
}
