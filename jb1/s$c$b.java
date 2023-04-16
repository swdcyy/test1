package jb1.s$c$b;
import bb1.d;
import jb1.s$c;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import jb1.s$a;
import java.lang.Enum;
import db1.c;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import jb1.s;
import com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment$b;
import bb1.c;

public class s$c$b implements d	// class@002b1f
{
    public final s$c a;

    public void s$c$b(s$c p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,boolean p1,Throwable p2,LiveAdminPrivilege$PrivilegeType p3){
       UserInfo mExtraInfo;
       if (PatchProxy.isSupport(s$c$b.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, p3, this, s$c$b.class, "5")) {
          return;
       }
       this.a.y.k0();
       int i = s$a.a[p3.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   mExtraInfo = this.a.t.a.mExtraInfo;
                   if (mExtraInfo != null) {
                      mExtraInfo.mControl = p1;
                   }
                }
             }else {
                mExtraInfo = this.a.t.a.mExtraInfo;
                if (mExtraInfo != null) {
                   mExtraInfo.mBlock = p1;
                }
             }
          }else {
             mExtraInfo = this.a.t.a.mExtraInfo;
             if (mExtraInfo != null) {
                mExtraInfo.mKickUser = p1;
             }
          }
       }else {
          mExtraInfo = this.a.t.a.mExtraInfo;
          if (mExtraInfo != null) {
             mExtraInfo.mForbidComment = p1;
          }
       }
       return;
    }
    public void b(boolean p0,Throwable p1){
       s$c$b uoc$b = s$c$b.class;
       if (PatchProxy.isSupport(uoc$b) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc$b, "4")) {
          return;
       }
       if (p0) {
          this.a.y.N.a();
       }else {
          this.a.P8(p1);
       }
       return;
    }
    public void c(boolean p0,Throwable p1){
       s$c$b uoc$b = s$c$b.class;
       if (PatchProxy.isSupport(uoc$b) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc$b, "3")) {
          return;
       }
       if (p0) {
          this.a.y.N.a();
       }else {
          this.a.P8(p1);
       }
       return;
    }
    public void d(boolean p0,Throwable p1){
       s$c$b uoc$b = s$c$b.class;
       if (PatchProxy.isSupport(uoc$b) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc$b, "2")) {
          return;
       }
       if (p0) {
          this.a.y.N.a();
       }else {
          this.a.P8(p1);
       }
       return;
    }
    public void e(String p0,boolean p1,Throwable p2,int p3,boolean p4,long p5){
       c.b(this, p0, p1, p2, p3, p4, p5);
    }
    public void f(boolean p0,Throwable p1){
    }
    public void g(boolean p0,Throwable p1){
       c.a(this, p0, p1);
    }
    public void h(boolean p0,Throwable p1){
       s$c$b uoc$b = s$c$b.class;
       if (PatchProxy.isSupport(uoc$b) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc$b, "1")) {
          return;
       }
       if (p0) {
          this.a.y.N.a();
       }else {
          this.a.P8(p1);
       }
       return;
    }
    public void i(String p0,boolean p1,Throwable p2){
       c.f(this, p0, p1, p2);
    }
}
