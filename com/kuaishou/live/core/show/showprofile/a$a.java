package com.kuaishou.live.core.show.showprofile.a$a;
import wj2.r0;
import com.kuaishou.live.core.show.showprofile.a;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import tx1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import wj2.m0;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import tx1.b;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.gzone.v2.profile.LiveGzoneProfileParams;
import java.util.Iterator;
import java.util.List;
import ne2.b;

public class a$a implements r0	// class@001018
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,d p4,int p5){
       Object obj = this;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "8")) {
             return;
          }
       }
       obj.a.V8(p0, p1, p2, null, p4, p5, false, false, null, null, null, null);
       return;
    }
    public void b(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4,Bundle p5){
       Object obj = this;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "9")) {
             return;
          }
       }
       obj.a.V8(p0, p1, p2, null, null, p4, false, false, null, null, null, p5);
       return;
    }
    public void c(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,d p4,int p5,LiveFollowExtParams p6){
       Object obj = this;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),p4,Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "7")) {
             return;
          }
       }
       obj.a.V8(p0, p1, p2, null, p4, p5, false, false, null, p6, null, null);
       return;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(this.a.s) ^ 0x01);
    }
    public void e(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4,LiveFollowExtParams p5){
       Object obj = this;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "5")) {
             return;
          }
       }
       obj.a.V8(p0, p1, p2, null, null, p4, false, false, null, p5, null, null);
       return;
    }
    public void f(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4,boolean p5,m0 p6){
       Object obj = this;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),Boolean.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "2")) {
             return;
          }
       }
       obj.a.V8(p0, p1, p2, null, null, p4, false, p5, p6, null, null, null);
       return;
    }
    public void g(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4,LiveFollowExtParams p5,b p6){
       Object obj = this;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),p5,p6};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "6")) {
             return;
          }
       }
       obj.a.V8(p0, p1, p2, null, null, p4, false, false, null, p5, p6, null);
       return;
    }
    public LiveGzoneProfileParams h(UserProfile p0,LiveStreamClickType p1,int p2,String p3,boolean p4,int p5){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Boolean.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, uoa, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.P8(p0, p1, p2, p3, p5, false, null, null);
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "10")) {
          return;
       }
       if (!q.f(this.a.s)) {
          Iterator iterator = this.a.s.iterator();
          while (iterator.hasNext()) {
             iterator.next().dismissAllowingStateLoss();
          }
       }
       return;
    }
    public void j(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,d p4,int p5,boolean p6){
       Object obj = this;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),p4,Integer.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "3")) {
             return;
          }
       }
       obj.a.V8(p0, p1, p2, null, p4, p5, p6, false, null, null, null, null);
       return;
    }
    public void k(UserProfile p0,LiveStreamClickType p1,int p2,String p3,boolean p4,int p5,b p6){
       Object obj = this;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Boolean.valueOf(p4),Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "4")) {
             return;
          }
       }
       obj.a.V8(p0, p1, p2, p3, null, p5, false, false, null, null, p6, null);
       return;
    }
    public void w0(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4){
       Object obj = this;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "1")) {
             return;
          }
       }
       obj.a.V8(p0, p1, p2, null, null, p4, false, false, null, null, null, null);
       return;
    }
}
