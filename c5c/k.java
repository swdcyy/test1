package c5c.k;
import dd.b;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.e;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import w2c.a;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;

public class k extends b	// class@00052a
{
    public final ProfileDialogInfo a;
    public final a b;
    public final e c;

    public void k(e p0,ProfileDialogInfo p1,a p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onRequestFailure(ImageRequest p0,String p1,Throwable p2,boolean p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, k.class, "2")) {
          return;
       }
       this.c.S8(this.a, this.b);
       return;
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, k.class, "1")) {
          return;
       }
       this.c.S8(this.a, this.b);
       return;
    }
}
