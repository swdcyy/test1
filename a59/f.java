package a59.f;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import mxb.u;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import msd.l;
import a59.j;
import a59.k;
import msd.r;
import java.lang.Integer;
import java.util.Map;
import msd.a;
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import nsd.u;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f	// class@000045
{
    public final Activity a;
    public QPhoto b;
    public PhotoAdvertisement$TkTemplateInfo c;
    public final u d;
    public PhotoAdvertisement$TkTemplateData e;
    public final PhotoDetailParam f;
    public final c g;
    public final l h;
    public final l i;
    public final j j;
    public final k k;
    public final l l;
    public final r m;
    public final Integer n;
    public final Map o;
    public final a p;
    public final c q;
    public final b r;
    public final PublishSubject s;

    public void f(Activity p0,QPhoto p1,PhotoAdvertisement$TkTemplateInfo p2,u p3,PhotoAdvertisement$TkTemplateData p4,PhotoDetailParam p5,c p6,l p7,l p8,j p9,k p10,l p11,r p12,Integer p13,Map p14,a p15,c p16,b p17,PublishSubject p18,int p19,u p20){
       int i = this;
       int i1 = p19;
       u ou = (i1 & 0x08)? null: p3;
       PhotoAdvertisement$TkTemplateData tkTemplateDa = (i1 & 0x10)? null: p4;
       PhotoDetailParam photoDetailP = (i1 & 0x20)? null: p5;
       c uoc = (i1 & 0x40)? null: p6;
       l ol = (i1 & 0x0080)? null: p7;
       l ol1 = (i1 & 0x0100)? null: p8;
       j oj = (i1 & 0x0200)? null: p9;
       k ok = (i1 & 0x0400)? null: p10;
       l ol2 = (i1 & 0x0800)? null: p11;
       r or = (i1 & 0x1000)? null: p12;
       Integer integer = (i1 & 0x2000)? null: p13;
       HashMap hashMap = (i1 & 0x4000)? new HashMap(): null;
       a uoa = (0x8000 & i1)? null: p15;
       c uoc1 = (i1 & 0x10000)? null: p16;
       int i2 = (i1 & 0x20000)? 0: p17;
       int i3 = (i1 & 0x40000)? 0: p18;
       a.p(hashMap, "eventHandlerMap");
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = ou;
       i.e = tkTemplateDa;
       i.f = photoDetailP;
       i.g = uoc;
       i.h = ol;
       i.i = ol1;
       i.j = oj;
       i.k = ok;
       i.l = ol2;
       i.m = or;
       i.n = integer;
       i.o = hashMap;
       i.p = uoa;
       i.q = uoc1;
       i.r = i2;
       i.s = i3;
       return;
    }
    public final u a(){
       return this.d;
    }
    public final Activity b(){
       return this.a;
    }
    public final c c(){
       return this.q;
    }
    public final Map d(){
       return this.o;
    }
    public final QPhoto e(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (a.g(this.h, p0.h) && (a.g(this.i, p0.i) && (a.g(this.j, p0.j) && (a.g(this.k, p0.k) && (a.g(this.l, p0.l) && (a.g(this.m, p0.m) && (a.g(this.n, p0.n) && (a.g(this.o, p0.o) && (a.g(this.p, p0.p) && (a.g(this.q, p0.q) && (a.g(this.r, p0.r) && a.g(this.s, p0.s))))))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final PhotoDetailParam f(){
       return this.f;
    }
    public final j g(){
       return this.j;
    }
    public final b h(){
       return this.r;
    }
    public int hashCode(){
       f obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       f tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.f;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.g;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.h;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.i;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.j;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.k;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.l;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.m;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.n;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.o;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.p;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.q;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.r;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.s;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final k i(){
       return this.k;
    }
    public final PhotoAdvertisement$TkTemplateInfo j(){
       return this.c;
    }
    public final PhotoAdvertisement$TkTemplateData k(){
       return this.e;
    }
    public final void l(PhotoAdvertisement$TkTemplateInfo p0){
       this.c = p0;
    }
    public final void m(PhotoAdvertisement$TkTemplateData p0){
       this.e = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TKBridgeContext\(activity="+this.a+", photo="+this.b+", templateInfo="+this.c+", actionBarClickProcessor="+this.d+", tkTemplateData="+this.e+", photoDetailParam="+this.f+", stateLogger="+this.g+", convertIntercept="+this.h+", pageStatusCallback="+this.i+", playEndSubContext="+this.j+", popImageSubContext="+this.k+", closeCallBack="+this.l+", toggleStateCallback="+this.m+", bottomNavHeight="+this.n+", eventHandlerMap="+this.o+", bizParamCallback="+this.p+", animatorX="+this.q+", player="+this.r+", halfH5PagePublish="+this.s+"\)";
    }
}
