package androidx.fragment.app.BackStackState;
import android.os.Parcelable;
import androidx.fragment.app.BackStackState$a;
import android.os.Parcel;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import android.text.TextUtils;
import android.os.Parcelable$Creator;
import java.lang.CharSequence;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import androidx.fragment.app.e$a;
import androidx.fragment.app.Fragment;
import java.lang.Enum;
import java.lang.IllegalStateException;
import androidx.fragment.app.FragmentManagerImpl;
import java.util.HashMap;
import androidx.lifecycle.Lifecycle$State;
import java.util.List;

public final class BackStackState implements Parcelable	// class@000771
{
    public final int[] b;
    public final ArrayList c;
    public final int[] d;
    public final int[] e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public final int j;
    public final CharSequence k;
    public final int l;
    public final CharSequence m;
    public final ArrayList n;
    public final ArrayList o;
    public final boolean p;
    public static final Parcelable$Creator CREATOR;

    static {
       BackStackState.CREATOR = new BackStackState$a();
    }
    public void BackStackState(Parcel p0){
       super();
       this.b = p0.createIntArray();
       this.c = p0.createStringArrayList();
       this.d = p0.createIntArray();
       this.e = p0.createIntArray();
       this.f = p0.readInt();
       this.g = p0.readInt();
       this.h = p0.readString();
       this.i = p0.readInt();
       this.j = p0.readInt();
       this.k = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       this.l = p0.readInt();
       this.m = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       this.n = p0.createStringArrayList();
       this.o = p0.createStringArrayList();
       boolean b = (p0.readInt())? true: false;
       this.p = b;
       return;
    }
    public void BackStackState(a p0){
       super();
       int i = p0.a.size();
       int[] ointArray = new int[(i * 5)];
       this.b = ointArray;
       if (p0.h == null) {
          throw new IllegalStateException("Not on back stack");
       }
       this.c = new ArrayList(i);
       ointArray = new int[i];
       this.d = ointArray;
       ointArray = new int[i];
       this.e = ointArray;
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          e$a uoa = p0.a.get(i1);
          int i3 = i2 + 1;
          this.b[i2] = uoa.a;
          BackStackState tc = this.c;
          e$a b = uoa.b;
          Fragment mWho = (b != null)? b.mWho: null;
          tc.add(mWho);
          tc = this.b;
          int i4 = i3 + 1;
          tc[i3] = uoa.c;
          i3 = i4 + 1;
          tc[i4] = uoa.d;
          i4 = i3 + 1;
          tc[i3] = uoa.e;
          i3 = i4 + 1;
          tc[i4] = uoa.f;
          this.d[i1] = uoa.g.ordinal();
          this.e[i1] = uoa.h.ordinal();
          i1 = i1 + 1;
          i2 = i3;
       }
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.j;
       this.i = p0.u;
       this.j = p0.k;
       this.k = p0.l;
       this.l = p0.m;
       this.m = p0.n;
       this.n = p0.o;
       this.o = p0.p;
       this.p = p0.q;
       return;
    }
    public a a(FragmentManagerImpl p0){
       a uoa = new a(p0);
       int i = 0;
       int i1 = 0;
       BackStackState tb = this.b;
       while (i < tb.length) {
          e$a uoa1 = new e$a();
          int i2 = i + 1;
          uoa1.a = tb[i];
          if (FragmentManagerImpl.DEBUG) {
             uoa.toString();
             i = this.b[i2];
          }
          String str = this.c.get(i1);
          uoa1.b = (str != null)? p0.mActive.get(str): null;
          uoa1.g = Lifecycle$State.values()[this.d[i1]];
          uoa1.h = Lifecycle$State.values()[this.e[i1]];
          BackStackState tb1 = this.b;
          int i3 = i2 + 1;
          i2 = tb1[i2];
          uoa1.c = i2;
          int i4 = i3 + 1;
          i3 = tb1[i3];
          uoa1.d = i3;
          int i5 = i4 + 1;
          i4 = tb1[i4];
          uoa1.e = i4;
          int i6 = i5 + 1;
          i = tb1[i5];
          uoa1.f = i;
          uoa.b = i2;
          uoa.c = i3;
          uoa.d = i4;
          uoa.e = i;
          uoa.i(uoa1);
          i1 = i1 + 1;
          i = i6;
       }
       uoa.f = this.f;
       uoa.g = this.g;
       uoa.j = this.h;
       uoa.u = this.i;
       uoa.h = true;
       uoa.k = this.j;
       uoa.l = this.k;
       uoa.m = this.l;
       uoa.n = this.m;
       uoa.o = this.n;
       uoa.p = this.o;
       uoa.q = this.p;
       uoa.F(true);
       return uoa;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeIntArray(this.b);
       p0.writeStringList(this.c);
       p0.writeIntArray(this.d);
       p0.writeIntArray(this.e);
       p0.writeInt(this.f);
       p0.writeInt(this.g);
       p0.writeString(this.h);
       p0.writeInt(this.i);
       p0.writeInt(this.j);
       TextUtils.writeToParcel(this.k, p0, 0);
       p0.writeInt(this.l);
       TextUtils.writeToParcel(this.m, p0, 0);
       p0.writeStringList(this.n);
       p0.writeStringList(this.o);
       p0.writeInt(this.p);
    }
}
