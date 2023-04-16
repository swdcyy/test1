package g9a.a;
import bz6.b;
import lnc.a1;
import android.view.ViewStub;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.String;
import rf5.u;
import java.lang.Object;
import g9a.a$a;
import le5.f;
import jta.c;
import bz6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import uw9.v3;
import uw9.l0;
import java.lang.Boolean;
import brd.y;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.content.Context;
import android.view.ViewGroup;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.u1;

public class a implements b	// class@002410
{
    public final ViewStub a;
    public final SlidePlayViewModel b;
    public final String c;
    public View d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public final c j;
    public static final int k;
    public static final int l;

    static {
       a.k = a1.d(0x7f070ec3);
       a.l = a1.d(0x7f070ee6);
    }
    public void a(ViewStub p0,SlidePlayViewModel p1,String p2,u p3){
       super();
       a$a uoa = new a$a(this);
       this.j = uoa;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       if (p3 != null && f.o()) {
          p3.j(uoa);
       }
       return;
    }
    public void D(){
    }
    public void a(){
       a.b(this);
    }
    public void c(){
       a.a(this);
    }
    public void e(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "4")) {
          return;
       }
       if (this.b.M0() instanceof l0) {
          l0 c2 = this.b.M0().c2;
          if (c2 != null) {
             boolean b = (p0)? true: false;
             c2.onNext(Boolean.valueOf(b));
          }
       }
       if (this.b.s2() != null) {
          InvalidGestureChecker.a(this.b.s2().getContext(), AnswerType.SLIDE_MORE);
       }
       return;
    }
    public View getView(){
       View obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          obj = this.a.inflate();
          this.d = obj;
          this.e = obj.getPaddingRight();
          a td = this.d;
          td.setPadding(td.getPaddingLeft(), this.d.getPaddingTop(), (this.e + this.f), this.d.getPaddingBottom());
          ViewGroup$MarginLayoutParams layoutParams = this.d.getLayoutParams();
          ViewGroup$MarginLayoutParams bottomMargin = layoutParams.bottomMargin;
          this.g = bottomMargin;
          layoutParams.bottomMargin = bottomMargin + this.h;
          if (!TextUtils.x(this.i)) {
             obj = this.d.findViewById(R.id.text);
             if (obj instanceof TextView) {
                obj.setText(this.i);
             }
          }
       }
       return this.d;
    }
    public void onShow(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "GLOBAL_SLIDE_PHOTO_LOADING";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       QPhoto currentPhoto = this.b.getCurrentPhoto();
       if (currentPhoto != null) {
          currentPhoto = currentPhoto.mEntity;
          if (currentPhoto != null) {
             ClientContent$PhotoPackage photoPackage = w1.f(currentPhoto);
             uContentPack.photoPackage = photoPackage;
             if (!PatchProxy.applyVoidOneRefs(photoPackage, this, uoa, "3")) {
                i3 oi3 = i3.f();
                oi3.c("totalCount", Integer.valueOf(this.b.Q()));
                oi3.c("loadMoreOffset", Integer.valueOf(this.b.m0()));
                if (!TextUtils.x(this.c)) {
                   oi3.d("pageSessionId", this.c);
                }
                photoPackage.extraInfo = oi3.toString();
             }
          }
       }
       u1.u0(3, uElementPack, uContentPack);
       return;
    }
}
