package androidx.fragment.app.FragmentPagerAdapter;
import h3.a;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.StringBuilder;
import android.view.ViewGroup;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.Lifecycle$State;
import android.view.View;
import android.os.Parcelable;
import java.lang.ClassLoader;
import java.lang.IllegalStateException;

public abstract class FragmentPagerAdapter extends a	// class@000794
{
    public final c d;
    public final int e;
    public Fragment f;
    public e mCurTransaction;
    public static final int g;

    public void FragmentPagerAdapter(c p0){
       super(p0, 0);
    }
    public void FragmentPagerAdapter(c p0,int p1){
       super();
       this.mCurTransaction = null;
       this.f = null;
       this.d = p0;
       this.e = p1;
    }
    public static String B(int p0,long p1){
       return "android:switcher:"+p0+":"+p1;
    }
    public long A(int p0){
       return (long)p0;
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (this.mCurTransaction == null) {
          this.mCurTransaction = this.d.beginTransaction();
       }
       this.mCurTransaction.p(p2);
       if (p2 == this.f) {
          this.f = null;
       }
       return;
    }
    public void i(ViewGroup p0){
       FragmentPagerAdapter tmCurTransac = this.mCurTransaction;
       if (tmCurTransac != null) {
          tmCurTransac.o();
          this.mCurTransaction = null;
       }
       return;
    }
    public Object o(ViewGroup p0,int p1){
       if (this.mCurTransaction == null) {
          this.mCurTransaction = this.d.beginTransaction();
       }
       long l = this.A(p1);
       Fragment uFragment = this.d.findFragmentByTag(FragmentPagerAdapter.B(p0.getId(), l));
       if (uFragment != null) {
          this.mCurTransaction.k(uFragment);
       }else {
          uFragment = this.z(p1);
          this.mCurTransaction.g(p0.getId(), uFragment, FragmentPagerAdapter.B(p0.getId(), l));
       }
       if (uFragment != this.f) {
          boolean b = false;
          uFragment.setMenuVisibility(b);
          if (this.e == 1) {
             this.mCurTransaction.A(uFragment, Lifecycle$State.STARTED);
          }else {
             uFragment.setUserVisibleHint(b);
          }
       }
       return uFragment;
    }
    public boolean p(View p0,Object p1){
       boolean b = (p1.getView() == p0)? true: false;
       return b;
    }
    public void s(Parcelable p0,ClassLoader p1){
    }
    public Parcelable u(){
       return null;
    }
    public void v(ViewGroup p0,int p1,Object p2){
       FragmentPagerAdapter tf = this.f;
       if (p2 != tf) {
          boolean b = true;
          if (tf != null) {
             boolean b1 = false;
             tf.setMenuVisibility(b1);
             if (this.e == b) {
                if (this.mCurTransaction == null) {
                   this.mCurTransaction = this.d.beginTransaction();
                }
                this.mCurTransaction.A(this.f, Lifecycle$State.STARTED);
             }else {
                this.f.setUserVisibleHint(b1);
             }
          }
          p2.setMenuVisibility(b);
          if (this.e == b) {
             if (this.mCurTransaction == null) {
                this.mCurTransaction = this.d.beginTransaction();
             }
             this.mCurTransaction.A(p2, Lifecycle$State.RESUMED);
          }else {
             p2.setUserVisibleHint(b);
          }
          this.f = p2;
       }
       return;
    }
    public void x(ViewGroup p0){
       if (p0.getId() != -1) {
          return;
       }
       throw new IllegalStateException("ViewPager with adapter "+this+" requires a view id");
    }
    public abstract Fragment z(int p0);
}
