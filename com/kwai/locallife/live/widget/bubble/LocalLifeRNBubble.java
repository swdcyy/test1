package com.kwai.locallife.live.widget.bubble.LocalLifeRNBubble;
import l87.a;
import com.kwai.locallife.live.widget.bubble.LocalLifeRNBubble$a;
import nsd.u;
import n87.c;
import lp3.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.locallife.live.widget.bubble.LocalLifeRNBubble$tempPendantItems$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import com.kwai.locallife.live.widget.model.WidgetMountInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.util.Map;
import java.lang.Integer;
import o87.d;
import n87.a;
import android.content.Context;
import n87.e;
import com.kwai.locallife.live.widget.bubble.LocalLifeRNBubble$b;
import o87.d$c;
import com.kwai.locallife.live.widget.bubble.LocalLifeRNBubble$c;
import o87.d$b;
import l87.a$a;
import java.util.ArrayList;
import l87.b;
import l87.b$a;
import java.util.Collection;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.NullPointerException;
import java.lang.Boolean;
import android.view.ViewGroup$MarginLayoutParams;

public final class LocalLifeRNBubble implements a	// class@000ebc
{
    public final p a;
    public final c b;
    public final e c;
    public static final LocalLifeRNBubble$a d;

    static {
       LocalLifeRNBubble.d = new LocalLifeRNBubble$a(null);
    }
    public void LocalLifeRNBubble(c p0,e p1){
       a.p(p0, "mountService");
       a.p(p1, "liveServiceManager");
       super();
       this.b = p0;
       this.c = p1;
       this.a = s.c(LocalLifeRNBubble$tempPendantItems$2.INSTANCE);
    }
    public void a(View p0,WidgetMountInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalLifeRNBubble.class, "3")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "mountInfo");
       return;
    }
    public void b(View p0,WidgetMountInfo p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LocalLifeRNBubble localLifeRNB = LocalLifeRNBubble.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, localLifeRNB, "2")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "mountInfo");
       int i = System.identityHashCode(p0);
       Map map = PatchProxy.apply(null, this, localLifeRNB, "1");
       if (map == patchProxyRe) {
          map = this.a.getValue();
       }
       if (map.containsKey(Integer.valueOf(i))) {
          return;
       }else if(p1.getCheckAllowShowBubble() && !this.b.b()){
          return;
       }else {
          a uoa = PatchProxy.applyTwoRefs(p0, p1, this, localLifeRNB, "4");
          if (uoa != patchProxyRe) {
          }else if(p1.isAnchorYellowCar()){
             Context context = p0.getContext();
             a.o(context, "view.context");
             uoa = new a(context, p0, p1);
          }else {
             uoa = new e(p0, p1, p0.getContext());
          }
          uoa.r(p1.getShowMills());
          uoa.b(LocalLifeRNBubble$b.a);
          uoa.a(LocalLifeRNBubble$c.a);
          this.b.c(uoa);
          return;
       }
    }
    public void c(Map p0,View p1,WidgetMountInfo p2){
       b$a a;
       Context context;
       ViewParent parent;
       boolean b;
       Context obj2;
       Boolean tag;
       Map map = p0;
       Object obj = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LocalLifeRNBubble.class, "5")) {
          return;
       }
       String str = "view";
       a.p(obj, str);
       String str1 = "view.context";
       if (!PatchProxy.applyVoidFourRefs(this, p0, p1, p2, null, a$a.class, "1")) {
          try{
             a.p(obj, str);
             if (map && !p0.isEmpty()) {
                int Object obj1 = map.get("margin");
                if (!obj1 instanceof ArrayList) {
                   obj1 = null;
                }
                a = b.a;
                context = p1.getContext();
                a.o(context, str1);
                int i = a.a(context, map.get("width"));
                int Context context1 = p1.getContext();
                a.o(context1, str1);
                context1 = a.a(context1, map.get("height"));
                int i1 = 1;
                int i2 = 0;
                if (i <= 0 && context1 <= 0) {
                   ViewGroup$LayoutParams layoutParams = (obj1 == null || obj1.isEmpty())? 1: null;
                   if (!layoutParams) {
                   label_0087 :
                      layoutParams = p1.getLayoutParams();
                      if (p1.getParent() instanceof ViewGroup) {
                         parent = p1.getParent();
                         if (parent != null) {
                         }else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                         }
                      }else {
                         parent = null;
                      }
                      ViewGroup$LayoutParams layoutParams1 = (parent != null)? parent.getLayoutParams(): null;
                      try{
                         int i3 = 0x7f0a293c;
                         if (PatchProxy.isSupport(b$a.class)) {
                            b = 0x7f0a293c;
                            obj2 = PatchProxy.applyThreeRefs(parent, Integer.valueOf(i3), "findDyContainer", a, b$a.class, "6");
                            if (obj2 != PatchProxyResult.class) {
                               b = obj2.booleanValue();
                            }else if(parent != null){
                               tag = parent.getTag(b);
                            }else {
                               tag = null;
                            }
                            if (tag instanceof Boolean) {
                               b = tag.booleanValue();
                            }else {
                               b = false;
                            }
                         }else {
                            b = 0x7f0a293c;
                            goto label_00dc ;
                         }
                      }catch(java.lang.Exception e0){
                      }
                      if (i > 0) {
                         if (layoutParams != null) {
                            layoutParams.width = i;
                         }
                         if (b && layoutParams1 != null) {
                            layoutParams1.width = i;
                         }
                      }
                   label_00fc :
                      if (context1 > 0) {
                         if (layoutParams) {
                            layoutParams.height = context1;
                         }
                         if (b && layoutParams1) {
                            layoutParams1.height = context1;
                         }
                      }
                   label_0108 :
                      i = (obj1 == null || obj1.isEmpty())? 1: 0;
                      if (!i && obj1.size() == 4) {
                         b$a a1 = b.a;
                         context1 = p1.getContext();
                         a.o(context1, str1);
                         context1 = a1.a(context1, obj1.get(i2));
                         Context context2 = p1.getContext();
                         a.o(context2, str1);
                         i1 = a1.a(context2, obj1.get(i1));
                         context2 = p1.getContext();
                         a.o(context2, str1);
                         i2 = a1.a(context2, obj1.get(2));
                         obj2 = p1.getContext();
                         a.o(obj2, str1);
                         obj1 = a1.a(obj2, obj1.get(3));
                         if (b) {
                            if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
                               layoutParams1.setMargins(context1, i1, i2, obj1);
                            }
                         }else if(layoutParams instanceof ViewGroup$MarginLayoutParams){
                            layoutParams.setMargins(context1, i1, i2, obj1);
                         }
                      }
                      if (b) {
                         if (parent != null) {
                            parent.requestLayout();
                         }
                      }else {
                         p1.requestLayout();
                      }
                   }
                }else {
                   goto label_0087 ;
                }
             }
          }catch(java.lang.Exception e0){
          }
       }
    label_017d :
       return;
    }
}
