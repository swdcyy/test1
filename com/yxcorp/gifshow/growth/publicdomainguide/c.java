package com.yxcorp.gifshow.growth.publicdomainguide.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gqa.d;
import com.yxcorp.gifshow.growth.publicdomainguide.b;
import com.yxcorp.gifshow.growth.publicdomainguide.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vqa.k;
import java.lang.Boolean;
import pna.k;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import gqa.b;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import wh5.c;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.growth.publicdomainguide.model.PublicDomainGuideSwitchConfig$ExperimentalVariableConfig;
import java.lang.reflect.Type;
import cra.w;
import q87.c;
import com.yxcorp.gifshow.growth.publicdomainguide.model.PublicDomainGuideSwitchConfig;
import java.util.List;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.System;
import java.lang.Math;
import wkd.b;
import yma.a;
import yma.b;
import cjd.e;
import erd.o;
import gqa.c;
import com.yxcorp.gifshow.growth.publicdomainguide.a;
import vma.a;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import com.yxcorp.gifshow.growth.publicdomainguide.model.PublicDomainGuideResponse;
import java.lang.Runnable;
import ekd.k1;
import androidx.recyclerview.widget.RecyclerView$r;

public class c extends PresenterV2	// class@00148c
{
    public int A;
    public boolean B;
    public int C;
    public boolean D;
    public final boolean E;
    public Runnable F;
    public Runnable G;
    public RecyclerView$r H;
    public final String p;
    public final String q;
    public final String r;
    public BaseFragment s;
    public c t;
    public PublicDomainGuideResponse u;
    public long v;
    public int w;
    public PublicDomainGuideSwitchConfig$ExperimentalVariableConfig x;
    public int y;
    public int z;
    public static String I = "guideBar";

    public void c(boolean p0){
       super();
       this.p = "followGuideToFeatureType";
       this.q = "followGuideToFeature";
       this.r = "followGuideToFeatureConfig";
       this.w = -1;
       this.y = 0;
       this.z = 5000;
       this.A = 0;
       this.B = false;
       this.C = 0;
       this.D = false;
       this.F = new d(this);
       this.G = new b(this);
       this.H = new c$a(this);
       this.E = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       if (this.s == null) {
          return;
       }
       this.B = k.b.b("KEY_PDG_CLOSE_FREQUENCY_CONTROL", Boolean.FALSE).booleanValue();
       if (this.s.Vg().a()) {
          this.P8();
       }
       this.X7(this.s.Vg().g().subscribe(new b(this)));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       this.G = null;
       this.F = null;
       this.H = null;
       return;
    }
    public final void P8(){
       boolean b;
       Object[] objArray1;
       PublicDomainGuideSwitchConfig$ExperimentalVariableConfig value;
       Object[] objArray2;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       RecyclerView$LayoutManager obj = PatchProxy.apply(objArray, this, uoc, "4");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          int i = 0;
          if (!QCurrentUser.me().isLogined() || c.b()) {
             objArray1 = new Object[i];
             w.C().s(c.I, "未登录或青少年模式", objArray1);
          }else {
             String str = "未拉取到关注页switch开关数据";
             if (this.E != null) {
                value = a.t().getValue("followGuideToFeatureConfig", PublicDomainGuideSwitchConfig$ExperimentalVariableConfig.class, objArray);
                this.x = value;
                if (value == null) {
                   objArray2 = new Object[i];
                   w.C().s(c.I, str, objArray2);
                }
             }else {
                int i1 = -1;
                this.w = a.t().a("followGuideToFeatureType", i1);
                PublicDomainGuideSwitchConfig value1 = a.t().getValue("followGuideToFeature", PublicDomainGuideSwitchConfig.class, objArray);
                c tw = this.w;
                if (tw != i1 && value1 != null) {
                   PublicDomainGuideSwitchConfig mConfigList = value1.mConfigList;
                   if (mConfigList != null) {
                      String str1 = 1;
                      if (tw < str1 || tw > mConfigList.size()) {
                         objArray2 = new Object[i];
                         w.C().s(c.I, "未命中实验或实验数据不匹配type:"+this.w+", configs size:"+value1.mConfigList.size(), objArray2);
                      }else {
                         value = value1.mConfigList.get((this.w - str1));
                         this.x = value;
                         if (value == null) {
                            objArray2 = new Object[i];
                            w.C().s(c.I, str, objArray2);
                         }
                      }
                   }
                }
                objArray1 = new Object[i];
                w.C().s(c.I, "未拉取到switch开关数据", objArray1);
             }
             b = this.R8();
          }
          b = false;
       }
       if (!b) {
          return;
       }else {
          uoc = this.x;
          if (uoc != null) {
             PublicDomainGuideSwitchConfig$ExperimentalVariableConfig stayDuration = uoc.stayDuration;
             if (stayDuration > null) {
                this.y = stayDuration * 1000;
             }
             this.A = uoc.showCount;
             this.z = uoc.showDuration * 1000;
          }
          uoc = this.w;
          if (uoc != 3 && (uoc == 4 || this.E != null)) {
             uoc = this.s;
             if (uoc instanceof RecyclerFragment) {
                obj = uoc.h0().getLayoutManager();
                if (obj instanceof LinearLayoutManager) {
                   this.C = obj.c();
                }
             }
          }
          if (Math.abs((System.currentTimeMillis() - this.v)) - 0x6ddd00 > 0) {
             this.u = objArray;
          }
          if (this.u != null) {
             this.S8();
             return;
          }else {
             this.X7(b.a(-1257347683).b().j().map(new e()).subscribe(new c(this), a.b));
             return;
          }
       }
    }
    public final boolean R8(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.B != null) {
          return b;
       }
       int i = DateUtils.r(a.a.getLong("publicDomainGuideShownTs", 0), System.currentTimeMillis());
       if (i < b) {
          objArray = new Object[0];
          w.C().s(c.I, "展示间隔时间不足一天，intervalDays:"+i, objArray);
          return 0;
       }else {
          c tx = this.x;
          if (a.g() >= tx.unClickCount) {
             if (i < tx.unShowDays) {
                objArray = new Object[0];
                w.C().s(c.I, "连续未点击次数:"+a.g()+"intervalDays:"+i, objArray);
                return 0;
             }else {
                a.v(0);
             }
          }
          return b;
       }
    }
    public final void S8(){
       Object[] objArray;
       c ty;
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       int i = 0;
       if (!this.s.Vg().a()) {
          objArray = new Object[i];
          w.C().s(c.I, "isActive:"+this.s.Vg().a(), objArray);
          return;
       }else if(this.u.hitCard == null && this.E == null){
          objArray = new Object[i];
          w.C().s(c.I, "未命中引导卡片或页面不可见, hitCard:false", objArray);
          return;
       }else if(this.E != null){
          ty = this.y;
          if (ty > null) {
             k1.r(this.G, (long)ty);
          }
          if (this.A > null) {
             this.s.h0().addOnScrollListener(this.H);
          }
       }else {
          ty = this.w;
          if (ty == 1 || ty == 2) {
             k1.r(this.G, (long)this.y);
          }else if(ty == 3 || ty == 4){
             ty = this.s;
             if (ty instanceof RecyclerFragment) {
                ty.h0().addOnScrollListener(this.H);
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.s = this.t8("FRAGMENT");
       return;
    }
}
