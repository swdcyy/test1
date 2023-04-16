package com.facebook.yoga.android.VirtualYogaLayout;
import android.view.ViewGroup;
import android.content.Context;
import java.util.LinkedList;
import java.util.HashMap;
import lg.g;
import lg.h;
import android.util.AttributeSet;
import com.facebook.yoga.android.YogaLayout$LayoutParams;
import android.view.View;
import com.facebook.yoga.android.YogaLayout;
import java.lang.Object;
import java.util.List;
import java.util.Map;
import android.view.ViewGroup$LayoutParams;
import com.facebook.yoga.android.YogaLayout$a;
import lg.e;
import java.util.Iterator;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;

public class VirtualYogaLayout extends ViewGroup	// class@001463
{
    public final List b;
    public final Map c;
    public final g d;

    public void VirtualYogaLayout(Context p0){
       super(p0);
       this.b = new LinkedList();
       this.c = new HashMap();
       this.d = h.a();
    }
    public void VirtualYogaLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VirtualYogaLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new LinkedList();
       this.c = new HashMap();
       g og = h.a();
       this.d = og;
       YogaLayout.b(new YogaLayout$LayoutParams(p0, p1), og, this);
    }
    public void a(View p0,g p1){
       this.b.add(p0);
       this.c.put(p0, p1);
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (p0 instanceof VirtualYogaLayout) {
          p0.b(this);
          VirtualYogaLayout td = this.d;
          td.a(p0.getYogaNode(), td.l());
          return;
       }else {
          g og = h.a();
          YogaLayout.b(new YogaLayout$LayoutParams(p2), og, p0);
          og.h0(p0);
          og.D0(new YogaLayout$a());
          VirtualYogaLayout td1 = this.d;
          td1.a(og, td1.l());
          this.a(p0, og);
          return;
       }
    }
    public void b(ViewGroup p0){
       Iterator iterator;
       View view;
       if (p0 instanceof VirtualYogaLayout) {
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             view = iterator.next();
             p0.a(view, this.c.get(view));
          }
       }else if(p0 instanceof YogaLayout){
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             view = iterator.next();
             p0.a(view, this.c.get(view));
          }
       }else {
          throw new RuntimeException("VirtualYogaLayout cannot transfer children to ViewGroup of type "+p0.getClass().getCanonicalName()+".  Must either be a VirtualYogaLayout or a YogaLayout.");
       }
       this.b.clear();
       return;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof YogaLayout$LayoutParams;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return new YogaLayout$LayoutParams(-1, -1);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return new YogaLayout$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return new YogaLayout$LayoutParams(p0);
    }
    public g getYogaNode(){
       return this.d;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
