package androidx.legacy.app.FragmentTabHost;
import android.widget.TabHost$OnTabChangeListener;
import android.widget.TabHost;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.String;
import android.app.FragmentTransaction;
import java.lang.Object;
import androidx.legacy.app.FragmentTabHost$a;
import android.app.FragmentManager;
import android.app.Fragment;
import java.lang.Class;
import android.os.Bundle;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.os.Parcelable;
import androidx.legacy.app.FragmentTabHost$SavedState;
import android.view.View;
import android.view.View$BaseSavedState;

public class FragmentTabHost extends TabHost implements TabHost$OnTabChangeListener	// class@0007b3
{
    public final ArrayList b;
    public FrameLayout c;
    public Context d;
    public FragmentManager e;
    public int f;
    public TabHost$OnTabChangeListener g;
    public FragmentTabHost$a h;
    public boolean i;

    public void FragmentTabHost(Context p0){
       super(p0, null);
       this.b = new ArrayList();
       this.b(p0, null);
    }
    public void FragmentTabHost(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList();
       this.b(p0, p1);
    }
    public final FragmentTransaction a(String p0,FragmentTransaction p1){
       FragmentTabHost$a d;
       FragmentTabHost$a uoa = null;
       int i = 0;
       while (i < this.b.size()) {
          FragmentTabHost$a uoa1 = this.b.get(i);
          if ((uoa1.a).equals(p0)) {
             uoa = uoa1;
          }
          i = i + 1;
       }
       if (uoa == null) {
          throw new IllegalStateException("No tab known for tag "+p0);
       }
       if (this.h != uoa) {
          if (p1 == null) {
             p1 = this.e.beginTransaction();
          }
          FragmentTabHost th = this.h;
          if (th != null) {
             d = th.d;
             if (d != null) {
                p1.detach(d);
             }
          }
          d = uoa.d;
          if (d == null) {
             Fragment uFragment = Fragment.instantiate(this.d, uoa.b.getName(), uoa.c);
             uoa.d = uFragment;
             p1.add(this.f, uFragment, uoa.a);
          }else {
             p1.attach(d);
          }
          this.h = uoa;
       }
       return p1;
    }
    public final void b(Context p0,AttributeSet p1){
       int[] ointArray = new int[]{0x10100f3};
       TypedArray typedArray = p0.obtainStyledAttributes(p1, ointArray, 0, 0);
       this.f = typedArray.getResourceId(0, 0);
       typedArray.recycle();
       super.setOnTabChangedListener(this);
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       String currentTabTa = this.getCurrentTabTag();
       FragmentTabHost uFragmentTab = null;
       int i = 0;
       while (i < this.b.size()) {
          FragmentTabHost$a uoa = this.b.get(i);
          Fragment uFragment = this.e.findFragmentByTag(uoa.a);
          uoa.d = uFragment;
          if (uFragment != null && !uFragment.isDetached()) {
             if ((uoa.a).equals(currentTabTa)) {
                this.h = uoa;
             }else if(uFragmentTab == null){
                uFragmentTab = this.e.beginTransaction();
             }
             uFragmentTab.detach(uoa.d);
          }
          i = i + 1;
       }
       this.i = true;
       FragmentTransaction uFragmentTra = this.a(currentTabTa, uFragmentTab);
       if (uFragmentTra != null) {
          uFragmentTra.commit();
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
          FragmentTransaction uFragmentTra = this.a(p0, null);
          if (uFragmentTra != null) {
             uFragmentTra.commit();
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
