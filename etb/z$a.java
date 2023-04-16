package etb.z$a;
import s2b.a;
import etb.z;
import java.lang.Object;
import java.util.List;
import dtb.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import ctb.a;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxTextOnlyItem;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.f3;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import k2b.e0;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;

public class z$a implements a	// class@002814
{
    public final z a;

    public void z$a(z p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       z q;
       a c;
       int i;
       a uoa1;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, z$a.class, "1")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          a b = uoa.b;
          String str = "NOTIFICATION_CARD";
          if (b instanceof NoticeBoxTextOnlyItem) {
             q = obj.a.q;
             c = uoa.c;
             i = uoa.e + 1;
             if (PatchProxy.isSupport(c.class)) {
                uoa1 = c;
                if (PatchProxy.applyVoidFourRefs(q, b, c, Integer.valueOf(i), null, c.class, "1")) {
                   continue ;
                }
             }else {
                uoa1 = c;
             }
             f3 uof3 = f3.l("3155614", str);
             uof3.b(c.b(b, i));
             uof3.m(c.f(null, uoa1));
             uof3.h(q);
          }else if(b instanceof NoticeBoxVideoCardItem){
             q = obj.a.q;
             uoa1 = uoa.c;
             i = uoa.e + 1;
             if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(q, b, uoa1, Integer.valueOf(i), null, c.class, "3")) {
                continue ;
             }else {
                f3 uof31 = f3.l("3155614", str);
                uof31.b(c.c(b, i));
                uof31.m(c.g(b, null, uoa1));
                uof31.h(q);
             }
          }
       }
       return;
    }
    public boolean b(Object p0){
       boolean b;
       if (p0.f != null) {
          b = false;
       }else {
          p0.f = true;
          b = true;
       }
       return b;
    }
}
