package androidx.fragment.app.FragmentTabHost;
import android.widget.TabHost$OnTabChangeListener;
import android.widget.TabHost;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.String;
import androidx.fragment.app.e;
import androidx.fragment.app.FragmentTabHost$a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.b;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Bundle;
import java.lang.Object;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.os.Parcelable;
import androidx.fragment.app.FragmentTabHost$SavedState;
import android.view.View;
import android.view.View$BaseSavedState;
import java.lang.IllegalStateException;

public class FragmentTabHost extends TabHost implements TabHost$OnTabChangeListener	// class@00079a
{
    public final ArrayList b;
    public FrameLayout c;
    public Context d;
    public c e;
    public int f;
    public TabHost$OnTabChangeListener g;
    public FragmentTabHost$a h;
    public boolean i;

    public void FragmentTabHost(Context p0){
       super(p0, null);
       this.b = new ArrayList();
       this.c(p0, null);
    }
    public void FragmentTabHost(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList();
       this.c(p0, p1);
    }
    public final e a(String p0,e p1){
       FragmentTabHost$a d;
       FragmentTabHost$a uoa = this.b(p0);
       if (this.h != uoa) {
          if (p1 == null) {
             p1 = this.e.beginTransaction();
          }
          FragmentTabHost th = this.h;
          if (th != null) {
             d = th.d;
             if (d != null) {
                p1.p(d);
             }
          }
          if (uoa != null) {
             d = uoa.d;
             if (d == null) {
                Fragment uFragment = this.e.getFragmentFactory().a(this.d.getClassLoader(), uoa.b.getName());
                uoa.d = uFragment;
                uFragment.setArguments(uoa.c);
                p1.g(this.f, uoa.d, uoa.a);
             }else {
                p1.k(d);
             }
          }
          this.h = uoa;
       }
       return p1;
    }
    public final FragmentTabHost$a b(String p0){
       FragmentTabHost$a uoa;
       int i = this.b.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          uoa = this.b.get(i1);
          if ((uoa.a).equals(p0)) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return uoa;
    }
    public final void c(Context p0,AttributeSet p1){
       int[] ointArray = new int[]{0x10100f3};
       TypedArray typedArray = p0.obtainStyledAttributes(p1, ointArray, 0, 0);
       this.f = typedArray.getResourceId(0, 0);
       typedArray.recycle();
       super.setOnTabChangedListener(this);
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       String currentTabTa = this.getCurrentTabTag();
       int i = this.b.size();
       FragmentTabHost uFragmentTab = null;
       int i1 = 0;
       while (i1 < i) {
          FragmentTabHost$a uoa = this.b.get(i1);
          Fragment uFragment = this.e.findFragmentByTag(uoa.a);
          uoa.d = uFragment;
          if (uFragment != null && !uFragment.isDetached()) {
             if ((uoa.a).equals(currentTabTa)) {
                this.h = uoa;
             }else if(uFragmentTab == null){
                uFragmentTab = this.e.beginTransaction();
             }
             uFragmentTab.p(uoa.d);
          }
          i1 = i1 + 1;
       }
       this.i = true;
       e uoe = this.a(currentTabTa, uFragmentTab);
       if (uoe != null) {
          uoe.l();
          this.e.executePendingTransactions();
       }
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.i = false;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof FragmentTabHost$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.getSuperState());
          this.setCurrentTabByTag(p0.b);
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       FragmentTabHost$SavedState savedState = new FragmentTabHost$SavedState(super.onSaveInstanceState());
       savedState.b = this.getCurrentTabTag();
       return savedState;
    }
    public void onTabChanged(String p0){
       if (this.i != null) {
          e uoe = this.a(p0, null);
          if (uoe != null) {
             uoe.l();
          }
       }
       FragmentTabHost tg = this.g;
       if (tg != null) {
          tg.onTabChanged(p0);
       }
       return;
    }
    public void setOnTabChangedListener(TabHost$OnTabChangeListener p0){
       this.g = p0;
    }
    public void setup(){
       throw new IllegalStateException("Must call setup\(\) that takes a Context and FragmentManager");
    }
}
