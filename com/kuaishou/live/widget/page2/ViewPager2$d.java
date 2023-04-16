package com.kuaishou.live.widget.page2.ViewPager2$d;
import com.kuaishou.live.widget.page2.ViewPager2;
import java.lang.Object;
import com.kuaishou.live.widget.page2.ViewPager2$a;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import com.kuaishou.live.widget.page2.a;
import androidx.recyclerview.widget.RecyclerView;
import android.view.accessibility.AccessibilityNodeInfo;
import b2.d;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.view.accessibility.AccessibilityEvent;

public abstract class ViewPager2$d	// class@00102f
{
    public final ViewPager2 a;

    public void ViewPager2$d(ViewPager2 p0){
       this.a = p0;
       super();
    }
    public void ViewPager2$d(ViewPager2 p0,ViewPager2$a p1){
       super(p0);
    }
    public boolean a(int p0){
       return false;
    }
    public boolean b(int p0,Bundle p1){
       return false;
    }
    public void c(RecyclerView$Adapter p0){
    }
    public void d(RecyclerView$Adapter p0){
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, ViewPager2$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new IllegalStateException("Not implemented.");
    }
    public void f(a p0,RecyclerView p1){
    }
    public void g(AccessibilityNodeInfo p0){
    }
    public void h(d p0){
    }
    public boolean i(int p0){
       ViewPager2$d uod = ViewPager2$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       throw new IllegalStateException("Not implemented.");
    }
    public boolean j(int p0,Bundle p1){
       if (PatchProxy.isSupport(ViewPager2$d.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ViewPager2$d.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       throw new IllegalStateException("Not implemented.");
    }
    public void k(){
    }
    public CharSequence l(){
       Object obj = PatchProxy.apply(null, this, ViewPager2$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new IllegalStateException("Not implemented.");
    }
    public void m(){
    }
    public void n(){
    }
    public void o(){
    }
    public void onRvInitializeAccessibilityEvent(AccessibilityEvent p0){
    }
    public void p(){
    }
}
