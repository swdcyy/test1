package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.f$a;
import com.yxcorp.gifshow.pymk.net.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.f;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.user.RecoUser;

public class f$a extends a	// class@001537
{
    public final f f;

    public void f$a(f p0,boolean p1){
       this.f = p0;
       super(p1);
    }
    public void a(RecommendUserResponseV2 p0,List p1,boolean p2,int p3){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), this, f$a.class, "1")) {
          return;
       }
       if (p2 && !q.f(p1)) {
          int i = 0;
          while (i < p1.size()) {
             if (p1.get(i).mType == 2) {
                p1.get(i).mViewType = 19;
             }else if(p1.get(i).mType == 3){
                p1.get(i).mViewType = 20;
             }
             i = i + 1;
          }
       }
       super.a(p0, p1, p2, p3);
       return;
    }
    public void b(RecoUser p0,boolean p1,int p2){
       p0.mViewType = 15;
    }
}
