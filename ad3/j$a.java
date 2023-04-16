package ad3.j$a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import ad3.j;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import z1.a;
import java.lang.Object;
import va1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.View;
import ha1.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.lite.sidebar.e;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ad3.i;
import android.view.View$OnClickListener;
import com.google.gson.JsonObject;
import i93.j;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarItemChangeReason;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;

public class j$a implements LiveLiteBottomBarService$a	// class@000090
{
    public View a;
    public View b;
    public KwaiImageView c;
    public CDNUrl[] d;
    public String e;
    public a f;
    public final j g;

    public void j$a(j p0,CDNUrl[] p1,String p2,a p3){
       this.g = p0;
       super();
       this.f = a.a();
       this.d = p1;
       this.e = p2;
       this.f = p3;
       if (PatchProxy.applyVoid(null, this, j$a.class, "2")) {
       }else {
          View view = b.b(p0.D2(), R.layout.arg_RES_7f0d0983);
          this.a = view;
          this.b = view.findViewById(0x7f0a17e6);
          this.c = this.a.findViewById(0x7f0a17e7);
          p0 = p0.m;
          if (p0 != null) {
             this.e(p0.j());
          }
          j$a td = this.d;
          if (td != null) {
             this.c.a0(td, null);
          }
          this.a.setOnClickListener(new i(this));
       }
       return;
    }
    public View a(Context p0){
       return this.a;
    }
    public JsonObject b(){
       return j.a(this);
    }
    public boolean c(){
       return j.e(this);
    }
    public JsonObject d(){
       return j.b(this);
    }
    public void e(boolean p0){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       uoa = this.b;
       if (uoa != null) {
          int i = (p0)? 0x7f08131c: 0x7f08131d;
          uoa.setBackground(a1.f(i));
       }
       return;
    }
    public void f(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       this.f.accept(p0);
       return;
    }
    public void g(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       j.c(this, p0);
    }
    public LiveLiteBottomBarService$BottomBarType getType(){
       return LiveLiteBottomBarService$BottomBarType.RECRUIT;
    }
    public boolean i(){
       return j.f(this);
    }
}
