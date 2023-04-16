package androidx.fragment.app.FragmentState;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState$a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.Enum;
import java.lang.ClassLoader;
import androidx.fragment.app.b;
import androidx.lifecycle.Lifecycle$State;
import androidx.fragment.app.FragmentManagerImpl;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class FragmentState implements Parcelable	// class@000796
{
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Bundle k;
    public final boolean l;
    public final int m;
    public Bundle n;
    public Fragment o;
    public static final Parcelable$Creator CREATOR;

    static {
       FragmentState.CREATOR = new FragmentState$a();
    }
    public void FragmentState(Parcel p0){
       super();
       this.b = p0.readString();
       this.c = p0.readString();
       boolean b = true;
       boolean b1 = (p0.readInt())? true: false;
       this.d = b1;
       this.e = p0.readInt();
       this.f = p0.readInt();
       this.g = p0.readString();
       b1 = (p0.readInt())? true: false;
       this.h = b1;
       b1 = (p0.readInt())? true: false;
       this.i = b1;
       b1 = (p0.readInt())? true: false;
       this.j = b1;
       this.k = p0.readBundle();
       if (!p0.readInt()) {
          b = false;
       }
       this.l = b;
       this.n = p0.readBundle();
       this.m = p0.readInt();
       return;
    }
    public void FragmentState(Fragment p0){
       super();
       this.b = p0.getClass().getName();
       this.c = p0.mWho;
       this.d = p0.mFromLayout;
       this.e = p0.mFragmentId;
       this.f = p0.mContainerId;
       this.g = p0.mTag;
       this.h = p0.mRetainInstance;
       this.i = p0.mRemoving;
       this.j = p0.mDetached;
       this.k = p0.mArguments;
       this.l = p0.mHidden;
       this.m = p0.mMaxState.ordinal();
    }
    public Fragment a(ClassLoader p0,b p1){
       if (this.o == null) {
          FragmentState tk = this.k;
          if (tk != null) {
             tk.setClassLoader(p0);
          }
          Fragment uFragment = p1.a(p0, this.b);
          this.o = uFragment;
          uFragment.setArguments(this.k);
          FragmentState tn = this.n;
          if (tn != null) {
             tn.setClassLoader(p0);
             p0.mSavedFragmentState = this.n;
          }else {
             p0.mSavedFragmentState = new Bundle();
          }
          FragmentState to = this.o;
          to.mWho = this.c;
          to.mFromLayout = this.d;
          to.mRestored = true;
          to.mFragmentId = this.e;
          to.mContainerId = this.f;
          to.mTag = this.g;
          to.mRetainInstance = this.h;
          to.mRemoving = this.i;
          to.mDetached = this.j;
          to.mHidden = this.l;
          to.mMaxState = Lifecycle$State.values()[this.m];
          if (FragmentManagerImpl.DEBUG) {
             StringBuilder str = "Instantiated fragment "+this.o;
          }
       }
       return this.o;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       StringBuilder str = new StringBuilder(128)+"FragmentState{"+this.b+" \("+this.c+"\)}:";
       if (this.d != null) {
          str = str+" fromLayout";
       }
       if (this.f != null) {
          str = str+" id=0x"+Integer.toHexString(this.f);
       }
       FragmentState tg = this.g;
       if (tg != null && !tg.isEmpty()) {
          str = str+" tag="+this.g;
       }
       if (this.h != null) {
          str = str+" retainInstance";
       }
       if (this.i != null) {
          str = str+" removing";
       }
       if (this.j != null) {
          str = str+" detached";
       }
       if (this.l != null) {
          str = str+" hidden";
       }
       return str;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeInt(this.d);
       p0.writeInt(this.e);
       p0.writeInt(this.f);
       p0.writeString(this.g);
       p0.writeInt(this.h);
       p0.writeInt(this.i);
       p0.writeInt(this.j);
       p0.writeBundle(this.k);
       p0.writeInt(this.l);
       p0.writeBundle(this.n);
       p0.writeInt(this.m);
    }
}
