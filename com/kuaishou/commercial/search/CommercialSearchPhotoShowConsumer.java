package com.kuaishou.commercial.search.CommercialSearchPhotoShowConsumer;
import com.yxcorp.gifshow.util.i;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import y8c.q;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.kuaishou.commercial.search.CommercialSearchPhotoShowConsumer$1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import yx.j0;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import lyb.h;
import android.view.View;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.Boolean;
import da6.c;
import tw.e;
import l66.c;
import lnc.x0;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.activity.ComponentActivity;

public class CommercialSearchPhotoShowConsumer extends i	// class@001544
{
    public boolean k;
    public boolean l;
    public final DefaultLifecycleObserver m;

    public void CommercialSearchPhotoShowConsumer(RecyclerView p0,g p1,q p2){
       super(p0, p1, p2);
       this.k = a.t().d("adCommodityTypeReport", true);
       boolean b = false;
       this.l = b;
       CommercialSearchPhotoShowConsumer$1 u1 = new CommercialSearchPhotoShowConsumer$1(this);
       this.m = u1;
       if (PatchProxy.applyVoid(null, this, CommercialSearchPhotoShowConsumer.class, "1")) {
       }else {
          Lifecycle lifecycle = this.e();
          if (lifecycle == null) {
             Object[] objArray = new Object[b];
             j0.c("CommercialSearchPhotoShowConsumer", "removeActivityResumeCheck error: lifecycle is null", objArray);
          }else {
             lifecycle.addObserver(u1);
          }
       }
       return;
    }
    public QPhoto a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommercialSearchPhotoShowConsumer.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof h) {
          return p0.getCurrentPhoto();
       }
       return null;
    }
    public void b(QPhoto p0,View p1){
       Object[] objArray;
       boolean b;
       CommercialSearchPhotoShowConsumer uCommercialS = CommercialSearchPhotoShowConsumer.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uCommercialS, "6")) {
          return;
       }
       String str = "CommercialSearchPhotoShowConsumer";
       if (p0 == null || p0.mEntity == null) {
          objArray = new Object[0];
          j0.c(str, "logPhoto photo is error", objArray);
          return;
       }else {
          PhotoAdvertisement photoAdverti = k.B(p0);
          if (photoAdverti != null) {
             if (photoAdverti.mIsFromSearchAd == null) {
                String obj = PatchProxy.applyOneRefs(photoAdverti, this, uCommercialS, "5");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(this.k != null){
                   obj = "search_is_type_ad_commodity";
                   if (photoAdverti.getExtra(obj) != null && photoAdverti.getExtra(obj).booleanValue()) {
                      b = true;
                   }
                }
                b = false;
                if (b) {
                label_004e :
                   if (e.c(p0)) {
                      objArray = new Object[0];
                      j0.f(str, "search brand not need logPhoto", objArray);
                      return;
                   }else if(this.l == null){
                      objArray = new Object[0];
                      j0.f(str, "logPhoto photo when activity not resumed", objArray);
                      return;
                   }else {
                      c.a().b(new x0(p0.mEntity, p1));
                   }
                }
             }else {
                goto label_004e ;
             }
          }
          return;
       }
    }
    public void c(){
       CommercialSearchPhotoShowConsumer uCommercialS = CommercialSearchPhotoShowConsumer.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uCommercialS, "4")) {
          return;
       }
       super.c();
       if (!PatchProxy.applyVoid(objArray, this, uCommercialS, "3")) {
          Lifecycle lifecycle = this.e();
          if (lifecycle == null) {
             Object[] objArray1 = new Object[0];
             j0.c("CommercialSearchPhotoShowConsumer", "removeActivityResumeCheck error: lifecycle is null", objArray1);
          }else {
             lifecycle.removeObserver(this.m);
          }
       }
       return;
    }
    public final Lifecycle e(){
       Object[] objArray;
       i obj = PatchProxy.apply(null, this, CommercialSearchPhotoShowConsumer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (!obj instanceof BaseFragment) {
          objArray = new Object[0];
          j0.c("CommercialSearchPhotoShowConsumer", "getActivityLifecycle error: fragment type error", objArray);
          return null;
       }else {
          FragmentActivity activity = obj.getActivity();
          if (activity != null) {
             return activity.getLifecycle();
          }
          objArray = new Object[0];
          j0.c("CommercialSearchPhotoShowConsumer", "getActivityLifecycle error: activity is null", objArray);
          return null;
       }
    }
}
