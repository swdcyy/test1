package gf1.f;
import g81.c;
import ft5.b;
import i81.g;
import java.lang.Object;
import gf1.f$a;
import ft5.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import gt5.a;
import android.view.ViewGroup;
import lnc.a1;
import java.lang.Integer;
import com.kwai.feature.api.live.service.show.comments.LiveCommentsBiz;
import java.lang.Enum;
import com.kuaishou.live.comments.view.a;

public class f	// class@0024bf
{
    public boolean a;
    public boolean b;
    public int c;
    public final boolean d;
    public g e;
    public final c f;
    public final b g;
    public final d h;

    public void f(c p0,b p1,g p2,boolean p3){
       super();
       f$a uoa = new f$a(this);
       this.h = uoa;
       this.f = p0;
       this.g = p1;
       this.d = p3;
       this.e = p2;
       if (p1 != null) {
          p1.Le(uoa);
       }
       return;
    }
    public void a(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "1")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       if (this.d != null && this.e.i7() != null) {
          this.e.i7().l((p0 ^ 0x01));
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       this.c = this.f.f8(LayoutParamsType.BOTTOM_MARGIN);
       ViewGroup viewGroup = this.f.Zd();
       if (viewGroup != null) {
          int i = viewGroup.getMeasuredHeight() + a1.d(0x7f070835);
          f tc = this.c;
          if (tc > i) {
             this.c((tc - i));
          }else {
             this.c = 0;
          }
       }
       return;
    }
    public final void c(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "7")) {
          return;
       }
       this.f.K0(LayoutParamsType.BOTTOM_MARGIN, LiveCommentsBiz.KEY_BOARD.ordinal(), p0);
       return;
    }
}
