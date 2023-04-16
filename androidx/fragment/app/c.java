package androidx.fragment.app.c;
import androidx.fragment.app.b;
import java.lang.Object;
import androidx.fragment.app.FragmentManagerImpl;
import androidx.fragment.app.c$c;
import androidx.fragment.app.e;
import java.lang.String;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c$a;
import android.os.Bundle;
import java.util.List;
import androidx.fragment.app.c$b;
import androidx.fragment.app.Fragment$SavedState;

public abstract class c	// class@0007a6
{
    public b mFragmentFactory;
    public static final b DEFAULT_FACTORY;

    static {
       c.DEFAULT_FACTORY = new b();
    }
    public void c(){
       super();
       this.mFragmentFactory = null;
    }
    public static void enableDebugLogging(boolean p0){
       FragmentManagerImpl.DEBUG = p0;
    }
    public abstract void addOnBackStackChangedListener(c$c p0);
    public abstract e beginTransaction();
    public abstract void dump(String p0,FileDescriptor p1,PrintWriter p2,String[] p3);
    public abstract boolean executePendingTransactions();
    public abstract Fragment findFragmentById(int p0);
    public abstract Fragment findFragmentByTag(String p0);
    public abstract c$a getBackStackEntryAt(int p0);
    public abstract int getBackStackEntryCount();
    public abstract Fragment getFragment(Bundle p0,String p1);
    public b getFragmentFactory(){
       if (this.mFragmentFactory == null) {
          this.mFragmentFactory = c.DEFAULT_FACTORY;
       }
       return this.mFragmentFactory;
    }
    public abstract List getFragments();
    public abstract Fragment getPrimaryNavigationFragment();
    public abstract boolean isDestroyed();
    public abstract boolean isStateSaved();
    public e openTransaction(){
       return this.beginTransaction();
    }
    public abstract void popBackStack();
    public abstract void popBackStack(int p0,int p1);
    public abstract void popBackStack(String p0,int p1);
    public abstract boolean popBackStackImmediate();
    public abstract boolean popBackStackImmediate(int p0,int p1);
    public abstract boolean popBackStackImmediate(String p0,int p1);
    public abstract void putFragment(Bundle p0,String p1,Fragment p2);
    public abstract void registerFragmentLifecycleCallbacks(c$b p0,boolean p1);
    public abstract void removeOnBackStackChangedListener(c$c p0);
    public abstract Fragment$SavedState saveFragmentInstanceState(Fragment p0);
    public void setFragmentFactory(b p0){
       this.mFragmentFactory = p0;
    }
    public abstract void unregisterFragmentLifecycleCallbacks(c$b p0);
}
