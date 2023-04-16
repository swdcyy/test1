package com.yxcorp.gifshow.location.b;
import y8c.g;
import com.kuaishou.android.model.mix.Location;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import nl8.p;
import ml8.c;
import com.yxcorp.gifshow.location.b$b;
import com.yxcorp.gifshow.location.b$a;
import j2b.q;
import com.yxcorp.gifshow.location.c;

public class b extends g	// class@001ae2
{
    public final boolean A;
    public boolean B;
    public final int w;
    public final int x;
    public final int y;
    public final Location z;

    public void b(Location p0,boolean p1){
       super();
       this.w = 1;
       this.x = 2;
       this.y = 3;
       this.z = p0;
       this.A = p1;
    }
    public Object N0(int p0){
       return this.r1(p0);
    }
    public int f0(int p0){
       Location obj;
       b tz;
       Location mTitle;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.B != null) {
          return 1;
       }else {
          obj = this.r1(p0);
          if (this.A != null) {
             if (!p0) {
                return 2;
             }else {
                tz = this.z;
                if (tz != null && p0 == 1) {
                   if (obj != null && !obj.mId) {
                      mTitle = obj.mTitle;
                      if (mTitle == null || !mTitle.equals(tz.mTitle)) {
                      label_0068 :
                         return 1;
                      }
                   }
                   return 3;
                }else {
                   goto label_0068 ;
                }
             }
          }else {
             tz = this.z;
             if (tz != null && !p0) {
                if (obj != null && !obj.mId) {
                   mTitle = obj.mTitle;
                   if (mTitle == null || !mTitle.equals(tz.mTitle)) {
                   }
                }
                return 3;
             }else {
                goto label_0068 ;
             }
          }
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.A == null || this.B != null) {
          return super.getItemCount();
       }
       return (super.getItemCount() + 1);
    }
    public f h1(ViewGroup p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                return new f(a.i(p0, 0x7f0d092b), new p());
             }else {
                return new f(a.i(p0, 0x7f0d092b), new b$b(this));
             }
          }else {
             return new f(a.i(p0, 0x7f0d092c), new b$a());
          }
       }else {
          p op = new p();
          op.o(new q(this));
          op.o(new c(this));
          return new f(a.i(p0, 0x7f0d092b), op);
       }
    }
    public Location r1(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.A == null || this.B != null) {
          return super.N0(p0);
       }else if(!p0){
          return null;
       }else {
          p0--;
          return super.N0(p0);
       }
    }
    public void s1(boolean p0){
       this.B = p0;
    }
}
