package ca5.a;
import java.lang.String;
import lnc.c2;
import z95.a;
import ba5.a;
import java.lang.Object;
import ca5.e;
import ca5.c;
import ca5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ba5.c;
import java.util.Map;
import mda.d$a;
import java.util.List;
import java.lang.Boolean;
import ca5.d;
import aa5.b;
import java.util.HashSet;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import aa5.a;
import aa5.c;
import aa5.d;
import com.kwai.component.feedsmonitor.model.DuplicateFeedInfo;

public class a	// class@000433
{
    public final d a;
    public final d b;
    public final d c;
    public final c d;
    public final String e;
    public final c2 f;

    public void a(String p0,boolean p1,c2 p2,a p3){
       super();
       this.a = new e();
       this.b = new c();
       this.c = new b();
       this.e = p0;
       c uoc = PatchProxy.applyTwoRefs(p0, p3, null, a.class, "2");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = a.b.get(p0);
          if (uoc == null) {
             if (p3 == null) {
                p3 = new a();
             }else {
                Object[] objArray = new Object[0];
                c uoc1 = p3.a(objArray);
             }
             uoc = p3;
          }
       }
       this.d = uoc;
       if (p1 && !PatchProxy.applyVoidTwoRefs(p0, uoc, null, a.class, "3")) {
          a.b.put(p0, uoc);
       }
       this.f = p2;
       return;
    }
    public void a(List p0,List p1,List p2,List p3,boolean p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
             return;
          }
       }
       this.b.b(p0, p3);
       this.a.b(p1, p3);
       if (p4) {
          this.c.b(p2, p3);
       }
       return;
    }
    public void b(List p0,String p1,String p2,b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "4")) {
          return;
       }
       HashSet hashSet = new HashSet();
       int i = TextUtils.x(p2) ^ 0x01;
       int i1 = p0.size();
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       super();
       int i2 = 0;
       while (i2 < i1) {
          BaseFeed uBaseFeed = p0.get(i2);
          String str = r1.t1(uBaseFeed);
          if (!TextUtils.x(str)) {
             a tf = this.f;
             if (tf == null || tf.accept(uBaseFeed)) {
                if (hashSet.contains(str)) {
                   uArrayList.add(c.b(uBaseFeed, i2, p1, p2, p3));
                }else {
                   hashSet.add(str);
                }
                if (this.d.b(uBaseFeed)) {
                   a uoa = c.b(uBaseFeed, i2, p1, p2, p3);
                   this.add(uoa);
                   if (i) {
                      uArrayList1.add(uoa);
                   }
                }
             }
          }
          i2 = i2 + 1;
       }
       this.a(uArrayList, this, uArrayList1, p0, i);
       return;
    }
    public d c(String p0){
       d uod;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       DuplicateFeedInfo uDuplicateFe = this.a.a();
       DuplicateFeedInfo uDuplicateFe1 = this.b.a();
       DuplicateFeedInfo uDuplicateFe2 = this.c.a();
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{obj,uDuplicateFe,uDuplicateFe1,uDuplicateFe2,p0};
          uod = PatchProxy.apply(objArray, null, uoc, "4");
          if (uod != PatchProxyResult.class) {
          label_0058 :
             return uod;
          }
       }
       uod = new d();
       uod.mPage = obj;
       uod.mTotalInfo = uDuplicateFe;
       uod.mDuplicateInfo = uDuplicateFe1;
       uod.mDegradeInfo = uDuplicateFe2;
       uod.mExpParams = p0;
       goto label_0058 ;
    }
}
