package bc9.f0;
import bc9.c0;
import bc9.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bc9.f0$b;
import bc9.f0$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.slipmode.ui.AssistantItemFrameLayout;
import com.yxcorp.gifshow.camera.record.assistant.a;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import cc9.i;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ec9.f1;
import cc9.k;
import y8c.d;
import sa6.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import dc9.c;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import ec9.j;
import cc9.a;
import sa6.b;
import com.kwai.framework.mvs.BaseViewModel;
import cc9.b;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import com.kwai.gifshow.post.api.core.model.PosterActivityTabInfo;
import java.util.List;
import nsd.u;

public final class f0 extends c0	// class@0003ea
{
    public final f0$a A;
    public q w;
    public r x;
    public boolean y;
    public final f0$b z;

    public void f0(k p0){
       a.p(p0, "adapter");
       super(p0);
       this.z = new f0$b(this);
       this.A = new f0$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f0.class, "1")) {
          return;
       }
       super.E8();
       this.R8().setWhiteCircleVisible(false);
       this.x = objArray;
       this.P8().r1().q().c(this.z);
       this.P8().r1().f().c(this.A);
       this.S8().setPlaceHolderImage(R.drawable.arg_RES_7f080e07);
       this.P8().r1().r().w0(new k(52, this.W8().get()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "2")) {
          return;
       }
       this.P8().r1().q().d(this.z);
       this.P8().r1().f().d(this.A);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "3")) {
          return;
       }
       if (this.y == null) {
          this.Y8();
       }
       return;
    }
    public final void Y8(){
       String str3;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f0.class, "4")) {
          return;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          c uoc = this.P8().r1().h();
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          Activity uActivity = activity;
          Objects.requireNonNull(uoc);
          if (!PatchProxy.applyVoidOneRefs(uActivity, uoc, c.class, "19")) {
             a.p(uActivity, "page");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CHANGE_BUTTON";
             u1.M("", uActivity, 1, uElementPack, null, null);
          }
       }
       j oj = this.P8().r1().g();
       String str = this.P8().r1().b();
       String str1 = "";
       String str2 = (str != null)? str: str1;
       AssistantResponse uAssistantRe = this.P8().r1().g().p0().b();
       if (uAssistantRe != null) {
          str = uAssistantRe.getNextCursor();
          if (str != null) {
             str3 = str;
          label_0092 :
             Object[] objArray1 = 1;
             PosterActivityTabInfo posterActivi = this.P8().r1().o();
             if (posterActivi != null) {
                objArray = posterActivi.mSources;
             }
             posterActivi = this.P8().r1().o();
             PosterActivityTabInfo posterActivi1 = (posterActivi != null)? posterActivi.mOrderBySources: false;
             a uoa = new a(str2, str3, objArray1, objArray, posterActivi1, false, 32, null);
             oj.w0(v11);
             return;
          }
       }
       str3 = str1;
       goto label_0092 ;
    }
}
