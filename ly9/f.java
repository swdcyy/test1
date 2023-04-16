package ly9.f;
import com.yxcorp.gifshow.detail.common.information.marquee.model.c;
import ly9.m;
import gr7.h;
import xq7.e;
import ly9.g;
import java.lang.Object;
import ly9.a;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import ly9.c;
import ly9.b;
import ly9.d;
import ly9.f$a;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import qvb.n0;
import com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import qvb.a;
import mvb.c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeConfig;
import java.util.Collection;
import ekd.q;

public class f	// class@002eb9
{
    public final QPhoto a;
    public g b;
    public c c;
    public m d;
    public final h e;
    public final e f;
    public final e g;
    public int h;
    public final g i;
    public final List j;
    public final g k;
    public final g l;
    public final g m;
    public final e$b n;

    public void f(c p0,m p1,h p2,e p3,g p4){
       super();
       this.h = 0;
       this.i = new a(this);
       this.j = Lists.b();
       this.k = new c(this);
       this.l = new b(this);
       this.m = new d(this);
       this.n = new f$a(this);
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.a = p4.b;
       this.g = p4.e;
       this.b = p4;
    }
    public final void a(MarqueeResponse$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "11")) {
          return;
       }
       ArrayList uArrayList = Lists.b();
       uArrayList.add(p0);
       f tc = this.c;
       tc.l0(e.c(tc.d1(), uArrayList));
       return;
    }
    public void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "9")) {
          return;
       }
       if (p0 != null) {
          c a = p0.a;
          if (a != null) {
             if (!TextUtils.n(a.getPhotoId(), this.a.getPhotoId())) {
                return;
             }else {
                MarqueeResponse$a uoa = e.b(QCurrentUser.me(), this.b.a.simpleEnabled);
                if (p0.a.isLiked()) {
                   if (!this.c.getItems().contains(uoa)) {
                      this.c.add(this.h, uoa);
                   }
                   if (!q.f(this.j)) {
                      this.j.remove(uoa);
                   }
                }else {
                   this.j.add(uoa);
                }
             }
          }
       }
       return;
    }
}
