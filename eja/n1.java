package eja.n1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.autoplay.state.f;
import vga.b;
import dha.l;
import eha.c;
import eha.d;
import eha.e;
import eha.f;
import dha.g;
import dha.a;
import eha.b;
import dha.c;
import dha.d;
import rja.c;

public class n1 extends PresenterV2	// class@0026e1
{
    public c A;
    public l p;
    public c q;
    public d r;
    public e s;
    public f t;
    public g u;
    public a v;
    public b w;
    public c x;
    public d y;
    public f z;

    public void n1(){
       super();
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, n1.class, "2")) {
          return;
       }
       this.z.a();
       b[] uobArray = new b[11];
       int i = 0;
       uobArray[i] = this.p;
       uobArray[1] = this.q;
       uobArray[2] = this.r;
       uobArray[3] = this.s;
       uobArray[4] = this.t;
       uobArray[5] = this.u;
       uobArray[6] = this.v;
       uobArray[7] = this.w;
       uobArray[8] = this.x;
       uobArray[9] = this.y;
       uobArray[10] = this.A;
       for (; i < 11; i = i + 1) {
          uobArray[i].a();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n1.class, "1")) {
          return;
       }
       this.p = this.r8("FOLLOW_FEEDS_STATE_USER_LOGIN");
       this.q = this.r8("HOME_FOLLOW_PHOTO_COLLECTED_STATE");
       this.r = this.r8("HOME_FOLLOW_PHOTO_COMMENTED_STATE");
       this.s = this.r8("HOME_FOLLOW_PHOTO_LIKED_STATE");
       this.t = this.r8("HOME_FOLLOW_PHOTO_PLAY_END_STATE");
       this.u = this.r8("HOME_FOLLOW_PHOTO_CLICKED");
       this.v = this.r8("HOME_FOLLOW_FROM_DETAIL_BACK_STATE");
       this.w = this.r8("HOME_FOLLOW_ENTER_PROFILE_STATE");
       this.x = this.r8("FOLLOW_FEEDS_STATE_PULLED");
       this.y = this.r8("FOLLOW_FEEDS_STATE_REFRESH");
       this.z = this.r8("HOST_PLAY_STATE_MENU_SLIDE");
       this.A = this.r8("FOLLOW_FILTER_STATE");
       return;
    }
}
