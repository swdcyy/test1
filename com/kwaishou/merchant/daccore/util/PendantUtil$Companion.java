package com.kwaishou.merchant.daccore.util.PendantUtil$Companion;
import java.lang.Object;
import nsd.u;
import android.view.View;
import java.lang.String;
import java.lang.StringBuilder;
import n08.a;
import java.util.Map;
import kotlin.Pair;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import qrd.r0;
import uu.e;
import com.kuaishou.bowl.data.center.data.model.ResourceItem;
import b08.a;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import com.kuaishou.bowl.data.center.data.model.BaseInfo;
import trd.t0;
import f08.b;
import f08.b$a;
import java.lang.Boolean;
import java.lang.Throwable;
import com.kwaishou.merchant.daccore.util.PendantUtil$Companion$getPendantIdFromView$1;
import java.util.LinkedList;
import java.lang.CharSequence;
import zsd.u;
import android.view.ViewGroup;
import android.content.Context;
import java.lang.Number;
import com.yxcorp.utility.n;
import com.kuaishou.merchant.bowl.krn.MerchantKrnContainerView;
import com.kuaishou.render.engine.tk.view.TKWrapView;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;

public final class PendantUtil$Companion	// class@001346
{

    public void PendantUtil$Companion(){
       super();
    }
    public void PendantUtil$Companion(u p0){
       super();
    }
    public static String e(PendantUtil$Companion p0,View p1,long p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return p0.d(p1, p2, p3);
    }
    public final String a(String p0,long p1,String p2){
       return p0+'_'+p1+'_'+p2;
    }
    public final Map b(a p0,String p1){
       String str1;
       BaseInfo resourceCode;
       Pair[] pairArray = new Pair[6];
       String str = "";
       if (p0 != null) {
          MaterialDataItem materialData = p0.c();
          if (materialData != null) {
             materialData = materialData.pendantCode;
             if (materialData != null) {
             label_0013 :
                pairArray[0] = r0.a("pendantCode", materialData);
                int i = 1;
                if (p0 != null) {
                   e uoe = p0.b();
                   if (uoe != null) {
                      uoe = uoe.a;
                      if (uoe != null) {
                         str1 = a.a(uoe);
                         if (str1 != null) {
                         label_0031 :
                            pairArray[i] = r0.a("area", str1);
                            i = 2;
                            MaterialDataItem materialData1 = null;
                            PendantMountInfo pendantMount = (p0 != null)? p0.e(): materialData1;
                            pairArray[i] = r0.a("mountInfo", pendantMount);
                            i = 3;
                            if (p0 != null) {
                               MaterialDataItem materialData2 = p0.c();
                               if (materialData2 != null) {
                                  materialData1 = materialData2.renderInfo;
                               }
                            }
                            pairArray[i] = r0.a("renderInfo", materialData1);
                            if (p0 != null) {
                               e uoe1 = p0.b();
                               if (uoe1 != null) {
                                  uoe1 = uoe1.a;
                                  if (uoe1 != null) {
                                     ResourceItem baseInfo = uoe1.baseInfo;
                                     if (baseInfo != null) {
                                        resourceCode = baseInfo.resourceCode;
                                        if (resourceCode != null) {
                                           str = resourceCode;
                                        }
                                     }
                                  }
                               }
                            }
                            pairArray[4] = r0.a("resourceCode", str);
                            pairArray[5] = r0.a("tsComponentId", p1);
                            return t0.W(pairArray);
                         }
                      }
                   }
                }
                str1 = str;
                goto label_0031 ;
             }
          }
       }
       String str2 = str;
       goto label_0013 ;
    }
    public final boolean c(View p0,int p1,String p2){
       try{
          Map tag = (p0 != null)? p0.getTag(p1): null;
          b$a.e(b.a, p2+" tag:"+tag, null, 2, null);
          if (tag instanceof Boolean) {
             return tag.booleanValue();
          }else {
             return false;
          }
       }catch(java.lang.Exception e8){
          Throwable throwable = e8;
          b$a.b(b.a, p2+" error", throwable, null, 4, null);
          return false;
       }
    }
    public final String d(View p0,long p1,boolean p2){
       String str;
       if (p0 == null) {
          return null;
       }
       try{
          PendantUtil$Companion$getPendantIdFromView$1 uCompanion$g = new PendantUtil$Companion$getPendantIdFromView$1(p1);
          if (p2) {
             return uCompanion$g.invoke(p0);
          }
          LinkedList linkedList = new LinkedList();
          linkedList.offer(p0);
          while (true) {
             if (linkedList.isEmpty()) {
                return null;
             }
             p0 = linkedList.poll();
             str = uCompanion$g.invoke(p0);
             int i = 0;
             View view = (str == null || u.S1(str))? 1: null;
             if (!view) {
                break ;
             }else if(p0 instanceof ViewGroup && p0.getChildCount() > 0){
                int childCount = p0.getChildCount();
                if (childCount >= 0) {
                   linkedList.offer(p0.getChildAt(i));
                   while (i != childCount) {
                      i = i + 1;
                   }
                }
             }
          }
          b$a.e(b.a, p1+" getPendantIdFromView:"+str, null, 2, null);
          return str;
       }catch(java.lang.Exception e8){
          b$a.b(b.a, p1+" getPendantIdFromView error", e8, null, 4, null);
          return v0;
       }
    }
    public final int f(Context p0,Object p1){
       int i = 0;
       try{
          if (!p1 instanceof Number) {
             p1 = null;
          label_0006 :
             int i1 = (p1 != null)? p1.intValue(): 0;
             float f = (float)i1;
             if (f - (float)i > 0) {
                i = n.c(p0, f);
             }
          }else {
             goto label_0006 ;
          }
       }catch(java.lang.Exception e8){
          b$a.b(b.a, "getPxFromData error", e8, null, 4, null);
       }
       return i;
    }
    public final void g(View p0,PendantMountInfo p1){
       int b;
       try{
          StringBuilder str = null;
          if (p1.getUnClipChildren() || p1.isAllChildUnClipChildren()) {
             b = true;
          label_0011 :
             if (p0 == null || !b) {
                b$a.e(b.a, p1.getMaterialId()+" not setComponentClipChildren isUnClipChildren:"+b, null, 2, null);
                return;
             }else if(p0 instanceof ViewGroup && p0.getChildCount() > 0){
                p0.setClipChildren(str);
                p0.setClipToPadding(str);
                if (!p1.isAllChildUnClipChildren() && p0 instanceof MerchantKrnContainerView) {
                   return;
                }else if(!p1.isAllChildUnClipChildren() && p0 instanceof TKWrapView){
                   return;
                }else {
                   b = p0.getChildCount();
                   if (b >= 0) {
                      this.g(p0.getChildAt(str), p1);
                      while (str != b) {
                         str = str + 1;
                      }
                   }
                }
             }
          }else {
             b = false;
             goto label_0011 ;
          }
       }catch(java.lang.Exception e7){
          b$a.b(b.a, p1.getMaterialId()+" setClipChildren error", e7, null, 4, null);
       }
       return;
    }
    public final View h(View p0,float p1,float p2){
       float f = (float)0;
       int i = -2;
       int i1 = (p1 - f > 0)? n.c(p0.getContext(), p1): -2;
       if (p2 - f > 0) {
          i = n.c(p0.getContext(), p2);
       }
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setTag(R.id.dynamic_pendant_container_tag, Boolean.TRUE);
       p0.setLayoutParams(new FrameLayout$LayoutParams(i1, i));
       uFrameLayout.addView(p0);
       return uFrameLayout;
    }
    public final View i(View p0,PendantMountInfo p1){
       return this.h(p0, (float)p1.getWidth(), (float)p1.getHeight());
    }
}
