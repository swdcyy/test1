package com.yxcorp.gifshow.detail.common.information.marquee.model.c;
import qvb.f;
import ly9.g;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeConfig;
import com.kwai.framework.model.user.UserStatus;
import com.yxcorp.gifshow.entity.QPhoto;
import psb.c;
import psb.a;
import com.yxcorp.gifshow.detail.common.information.marquee.model.b;
import erd.o;
import java.util.List;
import la6.b;
import com.yxcorp.gifshow.detail.common.information.marquee.model.a;
import java.util.Collection;
import ekd.q$b;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse$a;

public class c extends f	// class@00142f
{
    public final g p;
    public static final int q;

    public void c(g p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       MarqueeResponse obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L0();
       c tp = this.p;
       if (tp.a == MarqueeConfig.STATUS_DETAIL) {
          UserStatus mId = (tp.b.getUserStatus() != null)? this.p.b.getUserStatus().mId: "";
          c uoc = a.a();
          MarqueeConfig url = this.p.a.url;
          if (!this.K() && obj != null) {
             objArray = obj.getCursor();
          }
          return uoc.y(url, objArray, mId, 20).map(b.b);
       }else {
          tp = a.a();
          MarqueeConfig url1 = this.p.a.url;
          if (!this.K() && obj != null) {
             objArray = obj.getCursor();
          }
          return tp.s(url1, objArray, this.p.b.getPhotoId(), this.p.f).map(b.b);
       }
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(MarqueeResponse p0,List p1){
       g a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       if (this.K()) {
          p1.clear();
       }
       q.c(p0.mItems, a.a);
       if (!q.f(p0.mItems)) {
          Iterator iterator = p0.mItems.iterator();
          while (iterator.hasNext()) {
             MarqueeResponse$a uoa = iterator.next();
             a = this.p.a;
             if (a.simpleEnabled != null && uoa != null) {
                MarqueeResponse$a mMarqueeType1 = uoa.mMarqueeType;
                if (mMarqueeType1 == 1) {
                   uoa.mMarqueeType = 6;
                }else if(mMarqueeType1 == 2){
                   uoa.mMarqueeType = 7;
                }
             }
             if (a != MarqueeConfig.STATUS_DETAIL || !uoa) {
                continue ;
             }else {
                MarqueeResponse$a mMarqueeType = uoa.mMarqueeType;
                if (mMarqueeType == 2 || mMarqueeType == 7) {
                   uoa.mMarqueeType = 4;
                }
             }
          }
          p1.addAll(p0.mItems);
       }
       return;
    }
    public boolean i(){
       return false;
    }
}
