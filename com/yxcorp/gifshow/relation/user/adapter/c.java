package com.yxcorp.gifshow.relation.user.adapter.c;
import com.kwai.library.widget.scrollview.HorizontalSlideView$b;
import com.yxcorp.gifshow.relation.user.adapter.e;
import com.yxcorp.gifshow.relation.user.adapter.e$b;
import java.lang.String;
import java.util.ArrayList;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import y8c.g;
import xac.j;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.relation.util.c;
import qvb.i;
import java.util.Iterator;
import lnc.a1;
import g9c.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fcc.f;
import ecc.w;
import ecc.n0;
import gcc.s;
import nu7.d;
import com.yxcorp.gifshow.relation.user.adapter.c$a;
import gcc.k;
import ml8.c;
import com.kwai.library.widget.scrollview.HorizontalSlideView;

public class c extends e implements HorizontalSlideView$b	// class@0019ec
{
    public HorizontalSlideView A;
    public RecyclerFragment B;
    public final List C;
    public final boolean z;
    public static final int D;

    public void c(e$b p0,String p1){
       super(p0);
       this.C = new ArrayList();
       boolean b = (!TextUtils.x(p1) && (!TextUtils.x(QCurrentUser.me().getId()) && (QCurrentUser.me().getId()).equals(p1)))? true: false;
       this.z = b;
       return;
    }
    public void W0(List p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "4")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "5")) {
          this.C.clear();
          if (!q.f(p0)) {
             g tn = this.n;
             if (tn instanceof j && tn.s0()) {
                this.C.add(c.a());
                this.C.addAll(p0);
             }else {
                ArrayList uArrayList = new ArrayList();
                ArrayList uArrayList1 = new ArrayList();
                g tn1 = this.n;
                if (tn1 instanceof j) {
                   Iterator iterator = tn1.getItems().iterator();
                   while (iterator.hasNext()) {
                      User user = iterator.next();
                      if (user.mNewest != null) {
                         uArrayList.add(user);
                      }else {
                         uArrayList1.add(user);
                      }
                   }
                   if (!q.f(uArrayList)) {
                      User user1 = c.a();
                      user1.mFollowFavoriteTitle = a1.p(0x7f1034d7);
                      this.C.add(user1);
                      this.C.addAll(uArrayList);
                      if (!q.f(uArrayList1)) {
                         user1 = c.a();
                         user1.mFollowFavoriteTitle = a1.p(0x7f100e1f);
                         this.C.add(user1);
                         this.C.addAll(uArrayList1);
                      }
                   }else {
                      this.C.addAll(p0);
                   }
                   c.b(this.C);
                }else {
                   this.C.addAll(p0);
                }
             }
          }
       }
       super.W0(this.C);
       return;
    }
    public int f0(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       User user = this.N0(p0);
       if (user == null) {
          return 1;
       }else {
          int i = 3;
          if ((user.mId).equals("-10000")) {
             return i;
          }else if(c.d(user)){
             return 4;
          }else if((user.mId).equals("-10000")){
             i = 2;
          }
          return i;
       }
    }
    public f h1(ViewGroup p0,int p1){
       w obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 2) {
          p1 = (this.z != null)? 0x7f0d0967: 0x7f0d0964;
          View view = a.i(p0, p1);
          PresenterV2 presenterV2 = new PresenterV2();
          presenterV2.U7(new f());
          obj = new w();
          obj.Z8(false);
          presenterV2.U7(obj);
          presenterV2.U7(new n0());
          presenterV2.U7(new s());
          presenterV2.U7(new d());
          if (this.z != null) {
             presenterV2.U7(new c$a(this, this));
          }
          presenterV2.U7(new k(this));
          return new f(view, presenterV2);
       }else {
          return new f(a.i(p0, 0x7f0d091b), new PresenterV2());
       }
    }
    public void u(HorizontalSlideView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       c tA = this.A;
       if (tA != null && (tA != p0 && tA.b())) {
          this.A.c(true);
       }
    label_001d :
       this.A = p0;
       return;
    }
    public void u1(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c tA = this.A;
       if (tA != null && tA.b()) {
          this.A.c(true);
       }
       this.A = null;
       return;
    }
}
