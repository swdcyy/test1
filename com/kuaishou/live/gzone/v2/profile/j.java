package com.kuaishou.live.gzone.v2.profile.j;
import y8c.g;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import lf2.m;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import lf2.a;
import e63.m1;
import ok.o;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.Number;
import android.view.View;
import android.view.ViewGroup;
import y8c.f;
import java.lang.StringBuilder;
import android.view.ViewParent;
import z12.e;
import nl8.p;
import ml8.c;
import o56.a;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import o56.c;
import android.app.Application;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import i2b.a;
import com.kuaishou.live.gzone.v2.profile.j$c;
import java.util.List;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import com.kuaishou.live.gzone.v2.profile.j$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import java.lang.Boolean;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;

public class j extends g	// class@001cf1
{
    public final ArrayList A;
    public boolean B;
    public int C;
    public final Fragment D;
    public final a E;
    public int F;
    public j$b w;
    public final SparseArray x;
    public final SparseArray y;
    public final SparseIntArray z;

    public void j(User p0,LiveProfileParams p1,GifshowActivity p2,Fragment p3,m p4){
       super();
       this.x = new SparseArray();
       this.y = new SparseArray();
       this.z = new SparseIntArray();
       this.A = new ArrayList();
       this.B = false;
       this.C = 0;
       this.F = 0;
       this.D = p3;
       a uoa = new a(p2, p3, p1, p0, p4, new m1(this));
       this.E = v0;
    }
    public Object N0(int p0){
       BaseFeed uBaseFeed;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          uBaseFeed = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "13");
          if (uBaseFeed != PatchProxyResult.class) {
          }else if(this.y1(p0) || this.x1(p0)){
             uBaseFeed = null;
          }else {
             p0 = p0 - this.u1();
             uBaseFeed = this.A.get(p0);
             r1.g5(uBaseFeed, p0);
          }
       }else {
          goto label_0019 ;
       }
       return uBaseFeed;
    }
    public int f0(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.y1(p0)) {
          oj = this.x;
          return oj.get(oj.keyAt(p0)).getTag().intValue();
       }else if(this.x1(p0)){
          oj = this.y;
          return oj.get(oj.keyAt(((p0 - this.x.size()) - this.A.size()))).getTag().intValue();
       }else {
          return 0x15b38;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, j.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.A.size() + this.x.size()) + this.y.size());
    }
    public f h1(ViewGroup p0,int p1){
       String[] obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oj, "11");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       String str = " hasParent:";
       int i = 1;
       if (p1 < 0x15b38) {
          int i1 = this.z.get(p1);
          String[] stringArray = new String[i];
          StringBuilder str1 = "viewType:"+p1+str;
          if (this.x.get(i1).getParent() == null) {
             i = false;
          }
          stringArray[0] = str1+i;
          e.c("LiveProfilePhotoAdapter", "onCreatePresenterHolder", stringArray);
          return new f(this.x.get(i1), new p());
       }else if(p1 >= 0x30d40){
          obj = new String[i];
          StringBuilder str2 = "viewType:"+p1+str;
          if (this.y.get(this.z.get(p1)).getParent() == null) {
             i = false;
          }
          obj[0] = str2+i;
          e.c("LiveProfilePhotoAdapter", "onCreatePresenterHolder", obj);
          View view = PatchProxy.apply(null, this, oj, "12");
          if (view != patchProxyRe) {
          }else {
             view = new View(a.B);
             view.setLayoutParams(new RecyclerView$LayoutParams(-1, n.c(a.a().a(), 100.00f)));
          }
          return new f(view, new p());
       }else {
          return new f(a.k(p0, 0x7f0d0d56, 0), new j$c(this));
       }
    }
    public void r1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "9")) {
          return;
       }
       this.A.addAll(p0);
       return;
    }
    public void s1(int p0,View p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oj, "1")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveProfilePhotoAdapter", "addOrReplaceHeaderView", stringArray);
       p1.setTag(Integer.valueOf(this.C));
       this.x.append(p0, p1);
       this.z.append(this.C, p0);
       this.C = this.C + 1;
       return;
    }
    public void t1(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       this.A.clear();
       return;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "15")) {
          return;
       }
       super.u0(p0);
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (layoutManage instanceof GridLayoutManager) {
          layoutManage.m1(new j$a(this, layoutManage));
       }
       return;
    }
    public int u1(){
       Object obj = PatchProxy.apply(null, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.x.size();
    }
    public List v1(){
       return this.A;
    }
    public boolean w1(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       String str = "AD";
       if (p0.get(str) != null) {
          PhotoAdvertisement photoAdverti = p0.get(str);
          if (photoAdverti.mHideLabel == null) {
             photoAdverti = photoAdverti.mAdGroup;
             if (photoAdverti == PhotoAdvertisement$AdGroup.AD_SOCIAL || photoAdverti == PhotoAdvertisement$AdGroup.AD_SOCIAL_MERCHANT) {
                b = true;
             }
          }
       }
       return b;
    }
    public boolean x1(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 >= (this.x.size() + this.A.size()))? true: false;
       return b;
    }
    public boolean y1(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 < this.x.size())? true: false;
       return b;
    }
}
