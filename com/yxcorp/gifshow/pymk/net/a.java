package com.yxcorp.gifshow.pymk.net.a;
import i7c.f;
import ok.x;
import java.lang.Object;
import i7c.g;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.user.RecoUser;

public class a implements f	// class@0016cf
{
    public final boolean a;
    public final x b;
    public final x c;
    public final x d;
    public int e;

    public void a(){
       super(false, null);
    }
    public void a(boolean p0){
       super(p0, null);
    }
    public void a(boolean p0,x p1){
       super(p0, null, false, null);
    }
    public void a(boolean p0,x p1,x p2,x p3){
       super();
       this.e = 10;
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
    }
    public void a(boolean p0,x p1,boolean p2,x p3){
       super(p0, p1, new g(p2), p3);
    }
    public void a(RecommendUserResponseV2 p0,List p1,boolean p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), this, a.class, "2")) {
          return;
       }
       if (this.a != null) {
          this.c(p2, p1);
       }else if(PatchProxy.isSupport(a.class) && (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p2), p1, this, a.class, "3") && p2)){
          a td = this.d;
          if (td != null && (td.get().booleanValue() && !q.f(p1))) {
             RecoUser recoUser = new RecoUser();
             recoUser.mShowed = true;
             recoUser.mViewType = 12;
             p1.add(0, recoUser);
          }
       }
    label_0061 :
       this.c(p2, p1);
       return;
    }
    public void b(RecoUser p0,boolean p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       if (p1) {
          if (this.a != null) {
             this.e = 15;
          }else {
             a tb = this.b;
             this.e = (tb != null && tb.get().booleanValue())? 14: 13;
          }
       }
       p0.mViewType = this.e;
       return;
    }
    public void c(boolean p0,List p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "4")) {
          return;
       }
       if (p0) {
          a tc = this.c;
          if (tc != null && tc.get().booleanValue()) {
             RecoUser recoUser = new RecoUser();
             recoUser.mShowed = true;
             recoUser.mViewType = 11;
             p1.add(0, recoUser);
          }
       }
       return;
    }
}
