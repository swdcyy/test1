package j90.a;
import qvb.f;
import java.lang.String;
import y80.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import brd.t;
import qvb.n0;
import java.lang.Throwable;
import y80.e;
import java.util.List;
import java.lang.Boolean;
import la6.b;
import t90.k;
import java.util.Objects;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import java.util.Collection;

public class a extends f	// class@002241
{
    public KSTemplateFeedListResponse p;
    public boolean q;
    public boolean r;
    public final String s;
    public final c t;

    public void a(String p0,c p1){
       a.p(p0, "mGroupId");
       a.p(p1, "mIKSDataManager");
       super();
       this.s = p0;
       this.t = p1;
    }
    public Object F1(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, a.class, "2");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          KSTemplateFeedListResponse kSTemplateFe = this.t.P(this.s);
          if (kSTemplateFe != null && this.r != null) {
             this.r = false;
          }else {
             objArray = kSTemplateFe;
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.v(this.s, this.K());
    }
    public void L1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       a.p(p0, "t");
       this.t.T(this.s, p0, this.K());
       return;
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void O1(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       a tp = this.p;
       if (tp != null) {
          this.t.x(this.s, tp, this.K(), p0, (tp.hasMore() ^ 0x01));
          this.p = null;
          this.q = false;
       }
       return;
    }
    public void a(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       if (!this.K()) {
          Object obj = PatchProxy.apply(objArray, this, uoa, "8");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.g(this.s, "999");
          if (!b) {
             this.t.D(this.s);
          }else {
             this.r = true;
          }
       }
       super.a();
       return;
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(KSTemplateFeedListResponse p0,List p1){
       k a;
       KSTemplateFeedListResponse mTemplateLis;
       ArrayList uArrayList;
       Iterator iterator1;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "3")) {
          return;
       }
       String str = "response";
       a.p(p0, str);
       String str1 = "items";
       a.p(p1, str1);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "7")) {
          uoa = this.s;
          if (uoa.hashCode() == 0xdd19 && uoa.equals("999")) {
             a = k.a;
             boolean b = this.K();
             Objects.requireNonNull(a);
             if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), p0, p1, a, k.class, "7")) {
                a.p(p0, str);
                a.p(p1, str1);
                int i = 10;
                if (b) {
                   a.c(p1, p0.getItems());
                   mTemplateLis = p0.mTemplateList;
                   uArrayList = new ArrayList(u.Y(p1, i));
                   Iterator iterator = p1.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(iterator.next().mTemplateId);
                   }
                   a.a(mTemplateLis, uArrayList);
                   ArrayList uArrayList1 = new ArrayList(u.Y(p1, i));
                   iterator1 = p1.iterator();
                   while (iterator1.hasNext()) {
                      uArrayList1.add(iterator1.next().toKSFeedTemplateDetailInfo());
                   }
                   KSTemplateFeedListResponse mTemplateLis1 = p0.mTemplateList;
                   if (mTemplateLis1 != null) {
                      mTemplateLis1.addAll(0, uArrayList1);
                   }
                }else {
                   mTemplateLis = p0.mTemplateList;
                   uArrayList = new ArrayList(u.Y(p1, i));
                   iterator1 = p1.iterator();
                   while (iterator1.hasNext()) {
                      uArrayList.add(iterator1.next().mTemplateId);
                   }
                   a.a(mTemplateLis, uArrayList);
                }
             }
          }
       }
       super.d2(p0, p1);
       this.p = p0;
       this.q = this.K();
       return;
    }
}
