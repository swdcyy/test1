package jb1.s;
import y8c.g;
import jb1.v;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import db1.c;
import lnc.a1;
import g9c.a;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.framework.model.user.UserInfo;
import jb1.r;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Number;
import com.kwai.framework.model.user.UserExtraInfo;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import jb1.s$c;
import ml8.c;
import jb1.s$b;
import jb1.s$d;

public class s extends g	// class@002b22
{
    public final LiveApiParams$AssistantType A;
    public final String B;
    public final String C;
    public m D;
    public int E;
    public int F;
    public int G;
    public final Activity H;
    public final a I;
    public int J;
    public int K;
    public String L;
    public List M;
    public final LiveUserListFragment$b N;
    public final List O;
    public final int w;
    public final int x;
    public final int y;
    public final String z;
    public static final int P;

    public void s(v p0){
       super();
       this.w = 1;
       this.x = 2;
       this.y = 3;
       this.z = p0.a;
       this.A = ((QCurrentUser.me().getId()).equals(p0.b))? LiveApiParams$AssistantType.PUSHER: LiveApiParams$AssistantType.SUPER_ADMIN;
       this.B = p0.c;
       this.C = p0.d;
       this.D = p0.e;
       this.H = p0.f;
       this.I = p0.g;
       this.N = p0.h;
       this.O = p0.i;
       return;
    }
    public Object N0(int p0){
       c uoc;
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          uoc = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, os, "4");
          if (uoc != PatchProxyResult.class) {
          }else if(this.f0(p0) == 2){
             if (!p0 && this.F > null) {
                uoc = new c();
                uoc.b = a1.p(0x7f101d1b);
                uoc.c = this.F;
                uoc.d = this.J;
             }else {
                uoc = new c();
                uoc.b = a1.p(0x7f101d1a);
                uoc.c = this.E;
                uoc.d = this.K;
             }
          }else {
             int i = 1;
             if (p0 >= (this.F + i)) {
                i = this.G;
             }
             uoc = super.N0((p0 - i));
          }
       }else {
          goto label_0019 ;
       }
       return uoc;
    }
    public void W0(List p0){
       Iterator iterator;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "5")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       if (!q.f(this.M)) {
          iterator = this.M.iterator();
          while (iterator.hasNext()) {
             UserInfo userInfo = iterator.next();
             if (userInfo.mExtraInfo == null) {
                continue ;
             }
             c uoc = new c();
             uoc.a = userInfo;
             uArrayList.add(uoc);
          }
          Collections.sort(uArrayList, r.b);
       }
       super.W0(uArrayList);
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, s.class, "6");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          i1 = obj.intValue();
       }else {
          iterator = this.Q0().iterator();
          int i2 = 0;
          while (iterator.hasNext()) {
             UserInfo mExtraInfo = iterator.next().a.mExtraInfo;
             if (mExtraInfo == null) {
                continue ;
             }else if(mExtraInfo.mAssistantType == 1){
                i2 = i2 + 1;
             }else {
                break ;
             }
          }
          i1 = i2;
       }
       this.F = i1;
       this.E = super.getItemCount() - this.F;
       objArray = PatchProxy.apply(objArray, this, s.class, "7");
       if (objArray != PatchProxyResult.class) {
          i = objArray.intValue();
       }else if(this.Q0().isEmpty()){
          i = (this.F > null && this.E > null)? 2: 1;
       }
       this.G = i;
       return;
    }
    public int f0(int p0){
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, os, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0) {
          os = this.F;
          if (os <= null || (this.E <= null || p0 != (os + 1))) {
             if (p0 == (super.getItemCount() + this.G)) {
                return 3;
             }else {
                return 1;
             }
          }
       }
       return 2;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!super.getItemCount()) {
          return 0;
       }
       return ((super.getItemCount() + this.G) + 1);
    }
    public f h1(ViewGroup p0,int p1){
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, os, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 1) {
          return new f(a.i(p0, 0x7f0d0922), new s$c(this));
       }else if(p1 == 2){
          return new f(a.i(p0, 0x7f0d0923), new s$b(this));
       }else {
          return new f(a.i(p0, 0x7f0d09c9), new s$d(this));
       }
    }
}
