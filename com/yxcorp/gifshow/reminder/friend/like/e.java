package com.yxcorp.gifshow.reminder.friend.like.e;
import qvb.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.reminder.friend.like.e$a;
import qvb.q;
import qvb.a;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.yxcorp.gifshow.reminder.friend.data.FriendLikeUserResponse;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User;
import wkd.b;
import ddc.a;
import com.yxcorp.gifshow.reminder.friend.like.d;
import erd.o;
import com.yxcorp.gifshow.reminder.friend.like.c;
import erd.g;
import java.util.List;
import la6.b;
import java.util.Iterator;

public class e extends f	// class@001ac1
{
    public QPhoto p;
    public User q;
    public String r;
    public String s;

    public void e(QPhoto p0){
       super();
       this.p = p0;
       this.h(new e$a(this));
    }
    public t I1(){
       String userId;
       String str;
       Object[] objArray = null;
       FriendLikeUserResponse obj = PatchProxy.apply(objArray, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L0();
       if (!TextUtils.n(QCurrentUser.ME.getId(), this.p.getUserId())) {
          userId = this.p.getUserId();
       }else {
          e tq1 = this.q;
          if (tq1 != null) {
             userId = tq1.getId();
          }else {
             str = objArray;
          label_003a :
             Object obj1 = b.a(0x611ee2f7);
             if (!this.K() && obj != null) {
                objArray = obj.getCursor();
             }
             Object[] objArray1 = objArray;
             String photoId = this.p.getPhotoId();
             e ts = this.s;
             e tq = this.q;
             String id = (tq != null)? tq.getId(): this.r;
             return obj1.e(objArray1, photoId, ts, str, id).map(d.b).doOnNext(new c(this));
          }
       }
       str = userId;
       goto label_003a ;
    }
    public void M1(Object p0,List p1){
       this.i2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.i2(p0, p1);
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       int i = 0;
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          int i1 = i + 1;
          iterator.next().mPosition = i;
          i = i1;
       }
       return;
    }
    public boolean i(){
       return false;
    }
    public void i2(FriendLikeUserResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       this.h2();
       return;
    }
}
