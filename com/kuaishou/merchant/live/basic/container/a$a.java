package com.kuaishou.merchant.live.basic.container.a$a;
import ks3.e;
import com.kuaishou.merchant.live.basic.container.a;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Bundle;
import com.kuaishou.merchant.live.basic.LiveBasicLogBiz;
import p74.a;
import o74.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.live.basic.container.LiveMerchantAnchorContainerFragment;
import androidx.fragment.app.c;
import java.util.Objects;
import com.kuaishou.merchant.live.basic.container.LiveMerchantAnchorContainerFragment$b;
import java.util.List;
import hka.a;
import com.kuaishou.merchant.live.basic.container.LiveMerchantAnchorContainerFragment$a;
import java.lang.IllegalArgumentException;

public class a$a implements e	// class@001889
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public Fragment a(){
       return this.a.q;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.q.isAdded() && !this.a.q.isDetached())? true: false;
       return b;
    }
    public void c(String p0,Bundle p1,String p2,boolean p3,boolean p4){
       a$a uoa = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       a$a uoa1 = a$a.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "3")) {
             return;
          }
       }
       if (!uoa.a.q.isAdded()) {
          a.t(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragmentServicePresenter", "showAsChildFragment: fail to show fragment, livePushFragment is not added", "kwaiLink", p0);
          return;
       }else if(TextUtils.isEmpty(p0)){
          a.s(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragmentServicePresenter", "showAsChildFragment: fail to show fragment, kwaiLink is null");
          return;
       }else {
          LiveMerchantAnchorContainerFragment liveMerchant = uoa.a.P8();
          c fragmentMana = uoa.a.q.getFragmentManager();
          Objects.requireNonNull(liveMerchant);
          if (PatchProxy.isSupport(LiveMerchantAnchorContainerFragment.class)) {
             Object[] objArray1 = new Object[]{fragmentMana,oobject,oobject1,oobject2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
             if (!PatchProxy.applyVoid(objArray1, liveMerchant, LiveMerchantAnchorContainerFragment.class, "6")) {
             label_0091 :
                if (liveMerchant.isAdded() && liveMerchant.isVisible()) {
                   a.s(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragment ", "ContainerFragment isVisible, showSelf childFragment directly");
                   liveMerchant.eh(p0, p1, p2, p3, p4);
                }else {
                   a.s(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragment ", "create ContainerFragment first");
                   _monitor_enter(liveMerchant);
                   liveMerchant.j.add(new LiveMerchantAnchorContainerFragment$b(p0, p1, oobject2));
                   _monitor_exit(liveMerchant);
                   liveMerchant.fh(fragmentMana);
                }
             }
          }else {
             goto label_0091 ;
          }
          return;
       }
    }
    public void d(Fragment p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       if (!this.a.q.isAdded()) {
          a.t(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragmentServicePresenter", "showAsChildFragment: fail to show fragment, livePushFragment is not added", "fragmentTag", p1);
          return;
       }else {
          LiveMerchantAnchorContainerFragment liveMerchant = this.a.P8();
          c fragmentMana = this.a.q.getFragmentManager();
          Objects.requireNonNull(liveMerchant);
          if (!PatchProxy.applyVoidThreeRefs(fragmentMana, p0, p1, liveMerchant, LiveMerchantAnchorContainerFragment.class, "5")) {
             if (p0 instanceof a) {
                if (liveMerchant.isAdded() && liveMerchant.isVisible()) {
                   a.s(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragment ", "ContainerFragment isVisible, showSelf childFragment directly");
                   liveMerchant.dh(p0, p1);
                }else {
                   a.s(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragment ", "create ContainerFragment first");
                   _monitor_enter(liveMerchant);
                   liveMerchant.j.add(new LiveMerchantAnchorContainerFragment$b(p0, p1, null));
                   _monitor_exit(liveMerchant);
                   liveMerchant.fh(fragmentMana);
                }
             }else {
                throw new IllegalArgumentException("only receive fragment implement BackPressable!");
             }
          }
          return;
       }
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       a p = this.a.p;
       if (p == null) {
          a.s(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragmentServicePresenter", "closeContainerFragment: mMerchantContainerFragment is null");
          return;
       }else {
          p.ch("LiveMerchantAnchorContainerFragmentServicePresenter");
          return;
       }
    }
}
