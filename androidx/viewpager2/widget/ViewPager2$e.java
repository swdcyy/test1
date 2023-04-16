package androidx.viewpager2.widget.ViewPager2$e;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.Object;
import androidx.viewpager2.widget.ViewPager2$a;
import androidx.viewpager2.widget.ViewPager2$i;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2$f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.String;
import java.lang.IllegalStateException;
import androidx.viewpager2.widget.a;
import androidx.recyclerview.widget.RecyclerView;
import android.view.accessibility.AccessibilityNodeInfo;
import b2.d;
import java.lang.CharSequence;
import android.view.accessibility.AccessibilityEvent;

public abstract class ViewPager2$e	// class@000a32
{
    public final ViewPager2 a;

    public void ViewPager2$e(ViewPager2 p0){
       this.a = p0;
       super();
    }
    public void ViewPager2$e(ViewPager2 p0,ViewPager2$a p1){
       super(p0);
    }
    public boolean a(){
       return this instanceof ViewPager2$i;
    }
    public boolean b(int p0){
       return false;
    }
    public boolean c(int p0,Bundle p1){
       return false;
    }
    public boolean d(){
       return this instanceof ViewPager2$f;
    }
    public void e(RecyclerView$Adapter p0){
    }
    public void f(RecyclerView$Adapter p0){
    }
    public String g(){
       throw new IllegalStateException("Not implemented.");
    }
    public void h(a p0,RecyclerView p1){
    }
    public void i(AccessibilityNodeInfo p0){
    }
    public void j(d p0){
    }
    public boolean k(int p0){
       throw new IllegalStateException("Not implemented.");
    }
    public boolean l(int p0,Bundle p1){
       throw new IllegalStateException("Not implemented.");
    }
    public void m(){
    }
    public CharSequence n(){
       throw new IllegalStateException("Not implemented.");
    }
    public void o(){
    }
    public void onRvInitializeAccessibilityEvent(AccessibilityEvent p0){
    }
    public void p(){
    }
    public void q(){
    }
    public void r(){
    }
}
