package n21.e;
import n21.e$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collection;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e	// class@003287
{
    public String a;
    public final int b;
    public long c;
    public List d;
    public List e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public static final e$a j;

    static {
       e.j = new e$a(null);
    }
    public void e(String p0,int p1,long p2,List p3,List p4,String p5,String p6,String p7,boolean p8){
       a.p(p0, "pendantId");
       a.p(p3, "imageCDNUrls");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
    }
    public final List a(){
       return this.d;
    }
    public final List b(){
       return this.e;
    }
    public final String c(){
       return this.h;
    }
    public final long d(){
       return this.c;
    }
    public final String e(){
       return this.a;
    }
    public boolean equals(Object p0){
       ArrayList uArrayList1;
       Iterator iterator;
       e uoe = e.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoe, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       ArrayList uArrayList = null;
       Class class = (p0 != null)? p0.getClass(): uArrayList;
       if (a.g(uoe, class) ^ true) {
          return false;
       }else {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.audience.component.pendant.commonpendant.LiveAudienceCommonActivityPendantData");
          if (a.g(this.a, p0.a) ^ true) {
             return false;
          }else if(this.b != p0.b){
             return false;
          }else if(this.c - p0.c){
             return false;
          }else {
             uoe = this.e;
             int i = 10;
             if (uoe != null) {
                uArrayList1 = new ArrayList(u.Y(uoe, i));
                iterator = uoe.iterator();
                while (iterator.hasNext()) {
                   uArrayList1.add(iterator.next().getUrl());
                }
             }else {
                uArrayList1 = uArrayList;
             }
             uoe = p0.e;
             if (uoe != null) {
                uArrayList = new ArrayList(u.Y(uoe, i));
                iterator = uoe.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(iterator.next().getUrl());
                }
             }
             if (a.g(uArrayList1, uArrayList) ^ true) {
                return false;
             }else {
                uoe = this.d;
                uArrayList = new ArrayList(u.Y(uoe, i));
                iterator = uoe.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(iterator.next().getUrl());
                }
                uoe = p0.d;
                uArrayList1 = new ArrayList(u.Y(uoe, i));
                iterator = uoe.iterator();
                while (iterator.hasNext()) {
                   uArrayList1.add(iterator.next().getUrl());
                }
                if (a.g(uArrayList, uArrayList1) ^ true) {
                   return false;
                }else if(a.g(this.f, p0.f) ^ true){
                   return false;
                }else if(a.g(this.g, p0.g) ^ true){
                   return false;
                }else if(a.g(this.h, p0.h) ^ true){
                   return false;
                }else if(this.i != p0.i){
                   return false;
                }else {
                   return true;
                }
             }
          }
       }
    }
    public final int f(){
       return this.b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       e tc = this.c;
       int i = (((((((this.a).hashCode() * 31) + this.b) * 31) + (int)(tc ^ (tc >> 32))) * 31) + this.d.hashCode()) * 31;
       tc = this.e;
       int i1 = 0;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.f;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.g;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.h;
       if (tc != null) {
          i1 = tc.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceCommonActivityPendantData\(pendantId="+this.a+", pendantType="+this.b+", pendantEndShowTimestamp="+this.c+", imageCDNUrls="+this.d+", imageCDNUrlsV2="+this.e+", contentText="+this.f+", clickRouterUrl="+this.g+", logMessage="+this.h+", enableRedDotRemind="+this.i+"\)";
    }
}
