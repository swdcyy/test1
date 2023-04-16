package com.yxcorp.gifshow.ad.tachikoma.a$h;
import z1.a;
import com.yxcorp.gifshow.ad.tachikoma.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.q;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import x49.p;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import tx4.w;
import sx4.d;
import sx4.a;
import java.lang.Boolean;
import x49.k;
import sx4.d$b;
import java.lang.Exception;

public final class a$h implements a	// class@001809
{
    public final a a;
    public final PhotoAdvertisement$TkTemplateInfo b;
    public final q c;

    public void a$h(a p0,PhotoAdvertisement$TkTemplateInfo p1,q p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
       }else {
          this.a.f.b();
          this.a.j("render \(\)  current templateInfo "+this.a.e);
          if (a.g(this.b, this.a.e) ^ 0x01) {
             this.a.j(" current manager maybe destroy or render other template,");
          }else if(p0 != null){
             this.a.f.m();
             a$h ta = this.a;
             a b = ta.b;
             if (b != null) {
                b.c(ta.d(this.b), "Ad");
             }
             String id = this.b.getId();
             Boolean c = a.c;
             a.o(c, "com.kuaishou.tk.api.expo…NABLE_ANALYZE_PERFORMANCE");
             if (c.booleanValue()) {
                id = "[ad]["+this.b.getId()+"]";
             }
             String str = this.a.f(this.b);
             a b1 = this.a.b;
             if (b1 != null) {
                b1.f(p0, id, str, new k(this));
             }
          }
          if (p0 == null) {
             this.a.h("render\(\) fileContent is null ");
             p0 = this.c;
             if (p0 != null) {
                p0.a(new Exception("empty fileContent"));
             }
             this.a.n(this.b, false, 3001, 3001);
             this.a.f.f();
             this.a.p(this.b.getId()+"JS获取为空", new Exception("\n1.mock数据的cdn是否正确\n2.检查Charles是否拦截了cdn\n3.检查是否强制内置\n4.检查md5是否正确\n5.是否扫码测试了"));
          }
       }
       return;
    }
}
