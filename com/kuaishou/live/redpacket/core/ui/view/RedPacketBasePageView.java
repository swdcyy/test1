package com.kuaishou.live.redpacket.core.ui.view.RedPacketBasePageView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import android.util.AttributeSet;
import eo3.w;
import java.util.Map;
import android.view.ViewGroup;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import eo3.a;
import nm3.b;
import po3.d;
import io3.a;
import java.lang.StringBuilder;
import java.lang.reflect.Constructor;
import java.lang.Throwable;
import android.util.Log;
import java.util.List;
import android.view.View;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import jo3.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import xh3.l;
import com.kuaishou.live.redpacket.core.ui.view.RedPacketBasePageView$a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;

public abstract class RedPacketBasePageView extends FrameLayout	// class@000ef0
{
    public final String b;
    public a c;
    public RedPacketBasePageView$a d;
    public final List e;

    public void RedPacketBasePageView(Context p0){
       super(p0);
       this.b = this.getClass().getSimpleName();
       this.e = new ArrayList();
    }
    public void RedPacketBasePageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = this.getClass().getSimpleName();
       this.e = new ArrayList();
    }
    public void RedPacketBasePageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = this.getClass().getSimpleName();
       this.e = new ArrayList();
    }
    public RedPacketBaseViewModel b(w p0,Map p1,String p2,ViewGroup p3,Map p4){
       a obj1;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       if (PatchProxy.isSupport(RedPacketBasePageView.class)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,oobject2,oobject3};
          obj1 = PatchProxy.apply(objArray, obj, RedPacketBasePageView.class, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       Object obj2 = p1.get(p2);
       RedPacketBaseViewModel redPacketBas = null;
       if (TextUtils.isEmpty(obj2)) {
          return redPacketBas;
       }else {
          b uob = p0.f().b();
          obj1 = PatchProxy.applyThreeRefs(p0, obj2, p4, null, d.class, "1");
          String str = " areaMap = ";
          if (obj1 != PatchProxyResult.class) {
          }else {
             b uob1 = p0.f().b();
             Class uClass = oobject3.get(obj2);
             String str2 = "RedPacketReflectUtil";
             if (uClass == null) {
                uob1.e(str2, "itemClz == null£¬areaKey = "+obj2+str+oobject3);
                obj1 = null;
             }else {
                Class[] uClassArray = new Class[]{w.class};
                Object[] objArray1 = new Object[]{oobject};
                obj1 = uClass.getConstructor(uClassArray).newInstance(objArray1);
             }
          }
          if (obj1 == null) {
             uob.e(obj.b, "areaItem == null areaKey = "+oobject1+str+p1.toString());
          }else {
             obj.e.add(obj1);
             View view = obj1.createView();
             String str1 = " areaItem name = ";
             if (view == null) {
                uob.e(obj.b, "areaView == null areaKey = "+oobject1+str+p1.toString()+str1+obj1.getClass().getName());
             }else {
                RedPacketBaseViewModel redPacketBas2 = obj1.createVM();
                if (redPacketBas2 == null) {
                   uob.e(obj.b, "viewModel == null areaKey = "+oobject1+str+p1.toString()+str1+obj1.getClass().getName());
                }else {
                   obj1.bind(view, redPacketBas2);
                   if (!PatchProxy.applyVoidTwoRefs(oobject, redPacketBas2, obj, RedPacketBasePageView.class, "2")) {
                      redPacketBas2.u0().observe(p0.k(), new b(obj));
                   }
                   oobject2.addView(view);
                   l.d(oobject2, p0.k(), redPacketBas2.v0(), 1);
                   return redPacketBas2;
                }
             }
          }
          RedPacketBaseViewModel redPacketBas1 = null;
          return redPacketBas1;
       }
    }
    public abstract void c(w p0,Map p1);
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketBasePageView.class, "4")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.d != null && !this.getVisibility()) {
          this.d.onShow();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketBasePageView.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.d != null && this.getVisibility()) {
          this.d.D();
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, RedPacketBasePageView.class, "6")) {
          return;
       }
       if (q.f(this.e)) {
          return;
       }
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().release();
       }
       this.e.clear();
       return;
    }
    public void setVisibilityListener(RedPacketBasePageView$a p0){
       this.d = p0;
    }
}
