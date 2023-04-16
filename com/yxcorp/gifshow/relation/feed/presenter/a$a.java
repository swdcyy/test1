package com.yxcorp.gifshow.relation.feed.presenter.a$a;
import d6a.a;
import com.yxcorp.gifshow.relation.feed.presenter.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.a;
import qvb.n0;
import com.kwai.framework.model.user.RecoUser;
import com.yxcorp.gifshow.pymk.f;
import gac.b;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import java.util.ArrayList;
import java.util.List;
import f7c.c;

public class a$a extends a	// class@00189f
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       if (this.b.p.getCount() > 0) {
          RecoUser item = this.b.p.getItem(0);
          RecoUser mShowed = item.mShowed;
          if (mShowed == null && item.mType == 2) {
             item.mShowed = true;
             PymkLogSender.reportShowContactCard(this.b.p.l2(), this.b.p.m2());
             return;
          }else if(mShowed == null){
             item.mShowed = true;
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(item);
             this.b.q.Ee(uArrayList);
          }
       }
       return;
    }
}
