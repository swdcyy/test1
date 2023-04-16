package androidx.recyclerview.widget.v$a;
import a2.a;
import androidx.recyclerview.widget.v;
import java.util.WeakHashMap;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.lang.Object;
import java.util.Map;
import b2.e;
import b2.d;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.os.Bundle;
import a2.i0;

public class v$a extends a	// class@000937
{
    public final v d;
    public Map e;

    public void v$a(v p0){
       super();
       this.e = new WeakHashMap();
       this.d = p0;
    }
    public boolean a(View p0,AccessibilityEvent p1){
       a uoa = this.e.get(p0);
       if (uoa != null) {
          return uoa.a(p0, p1);
       }
       return super.a(p0, p1);
    }
    public e b(View p0){
       a uoa = this.e.get(p0);
       if (uoa != null) {
          return uoa.b(p0);
       }
       return super.b(p0);
    }
    public void f(View p0,d p1){
       if (!this.d.m() && this.d.d.getLayoutManager() != null) {
          this.d.d.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(p0, p1);
          a uoa = this.e.get(p0);
          if (uoa != null) {
             uoa.f(p0, p1);
          }else {
             super.f(p0, p1);
          }
       }else {
          super.f(p0, p1);
       }
       return;
    }
    public boolean g(ViewGroup p0,View p1,AccessibilityEvent p2){
       a uoa = this.e.get(p0);
       if (uoa != null) {
          return uoa.g(p0, p1, p2);
       }
       return super.g(p0, p1, p2);
    }
    public boolean h(View p0,int p1,Bundle p2){
       if (this.d.m() || this.d.d.getLayoutManager() == null) {
          return super.h(p0, p1, p2);
       }
       a uoa = this.e.get(p0);
       if (uoa != null) {
          if (uoa.h(p0, p1, p2)) {
             return true;
          }
       }else if(super.h(p0, p1, p2)){
          return true;
       }
       return this.d.d.getLayoutManager().performAccessibilityActionForItem(p0, p1, p2);
    }
    public void j(View p0,int p1){
       a uoa = this.e.get(p0);
       if (uoa != null) {
          uoa.j(p0, p1);
       }else {
          super.j(p0, p1);
       }
       return;
    }
    public void k(View p0,AccessibilityEvent p1){
       a uoa = this.e.get(p0);
       if (uoa != null) {
          uoa.k(p0, p1);
       }else {
          super.k(p0, p1);
       }
       return;
    }
    public a l(View p0){
       return this.e.remove(p0);
    }
    public void m(View p0){
       a uoa = i0.m(p0);
       if (uoa != null && uoa != this) {
          this.e.put(p0, uoa);
       }
       return;
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       a uoa = this.e.get(p0);
       if (uoa != null) {
          uoa.onInitializeAccessibilityEvent(p0, p1);
       }else {
          super.onInitializeAccessibilityEvent(p0, p1);
       }
       return;
    }
    public void onPopulateAccessibilityEvent(View p0,AccessibilityEvent p1){
       a uoa = this.e.get(p0);
       if (uoa != null) {
          uoa.onPopulateAccessibilityEvent(p0, p1);
       }else {
          super.onPopulateAccessibilityEvent(p0, p1);
       }
       return;
    }
}
