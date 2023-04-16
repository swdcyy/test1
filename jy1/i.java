package jy1.i;
import jy1.b;
import java.lang.String;
import jy1.b$c;
import java.lang.Object;
import java.lang.StringBuilder;
import jy1.i$a;
import java.lang.reflect.Type;
import d61.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.HashMap;
import jy1.h;
import java.util.Map;
import ok.x;
import d61.r;
import java.util.List;
import java.lang.System;
import java.lang.Long;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import jy1.g;
import java.lang.Iterable;
import ok.o;
import qk.y;
import qk.m;
import jy1.f;
import com.kwai.framework.model.user.QCurrentUser;

public class i implements b	// class@002c3c
{
    public final l0 c;
    public final b$c d;
    public final int e;
    public final long f;
    public final String g;

    public void i(String p0,int p1,long p2,b$c p3){
       super();
       this.c = l0.g("live.frequencyConfig."+p0, i$a.class);
       this.f = p2;
       this.e = p1;
       this.d = p3;
       this.g = p0;
    }
    public void a(String p0){
       int i;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, str)) {
          return;
       }
       i$a uoa = this.c.b(null);
       if (uoa == null) {
          uoa = new i$a();
       }
       p0 = this.c(p0);
       Object obj = PatchProxy.applyOneRefs(p0, uoa, i$a.class, str);
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(uoa.mShownTimes == null){
          uoa.mShownTimes = new HashMap();
       }
       List list = r.b(uoa.mShownTimes, p0, h.b);
       list.add(Long.valueOf(System.currentTimeMillis()));
       i = list.size();
       this.c.i(uoa);
       b.e0(LiveLogTag.LIVE_ENHANCE_MESSAGE, "incShowTimes", "biz", this.g, "shownTimes", Integer.valueOf(i), "maxShowTimes", Integer.valueOf(this.e));
       return;
    }
    public boolean b(String p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       i$a obj = PatchProxy.applyOneRefs(p0, this, i.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.e <= null) {
          return b;
       }
       obj = this.c.b(null);
       if (obj == null) {
          return true;
       }
       p0 = this.c(p0);
       i tf = this.f;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj1 = PatchProxy.applyTwoRefs(p0, Long.valueOf(tf), obj, uoa, "1");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
          label_0047 :
             i$a mShownTimes = obj.mShownTimes;
             if (mShownTimes != null) {
                List list = mShownTimes.get(p0);
                if (list != null) {
                   long l = System.currentTimeMillis();
                   if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(tf), obj, uoa, str)) {
                      obj = obj.mShownTimes;
                      if (obj != null) {
                         List list1 = obj.get(p0);
                         if (!q.f(list1)) {
                            y.q(list1, new g(System.currentTimeMillis(), tf));
                         }
                      }
                   }
                   i = m.s(list).p(new f(l, tf)).size();
                }
             }
             i = 0;
          }
       }else {
          goto label_0047 ;
       }
       if (i < this.e) {
          b = true;
       }
       return b;
    }
    public final String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.a(QCurrentUser.me().getId(), p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFrequencyStrategy{, mMaxShowTimes="+this.e+", mAppearColdTimeSpanMs="+this.f+", mBiz=\'"+this.g+'''+'}';
    }
}
