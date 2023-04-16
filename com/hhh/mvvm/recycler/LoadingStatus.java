package com.hhh.mvvm.recycler.LoadingStatus;
import android.os.Parcelable;
import com.hhh.mvvm.recycler.LoadingStatus$Status;
import java.lang.Throwable;
import com.hhh.mvvm.recycler.LoadingStatus$a;
import android.os.Parcel;
import java.lang.Object;
import java.io.Serializable;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Enum;

public class LoadingStatus implements Parcelable	// class@000565
{
    public final LoadingStatus$Status b;
    public final Throwable c;
    public static final Parcelable$Creator CREATOR;
    public static final LoadingStatus d;
    public static final LoadingStatus e;
    public static final LoadingStatus f;
    public static final LoadingStatus g;
    public static final LoadingStatus h;
    public static final LoadingStatus i;
    public static final LoadingStatus j;
    public static final LoadingStatus k;

    static {
       LoadingStatus.d = new LoadingStatus(LoadingStatus$Status.RUNNING, null);
       LoadingStatus.e = new LoadingStatus(LoadingStatus$Status.SUCCESS, null);
       LoadingStatus.f = new LoadingStatus(LoadingStatus$Status.EMPTY, null);
       LoadingStatus.g = new LoadingStatus(LoadingStatus$Status.NOMORE, null);
       LoadingStatus.h = new LoadingStatus(LoadingStatus$Status.INSERT, null);
       LoadingStatus.i = new LoadingStatus(LoadingStatus$Status.REMOVE, null);
       LoadingStatus.j = new LoadingStatus(LoadingStatus$Status.UPDATE, null);
       LoadingStatus.k = new LoadingStatus(LoadingStatus$Status.RESTORE, null);
       LoadingStatus.CREATOR = new LoadingStatus$a();
    }
    public void LoadingStatus(Parcel p0){
       super();
       int i = p0.readInt();
       LoadingStatus$Status status = (i == -1)? null: LoadingStatus$Status.values()[i];
       this.b = status;
       this.c = p0.readSerializable();
       return;
    }
    public void LoadingStatus(LoadingStatus$Status p0,Throwable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final String a(Throwable p0){
       String str = (p0 == null)? null: p0.getMessage();
       return str;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof LoadingStatus) {
          return b;
       }
       if (this.b == p0.b && TextUtils.equals(this.a(this.c), this.a(p0.c))) {
          b = true;
       }
       return b;
    }
    public void writeToParcel(Parcel p0,int p1){
       LoadingStatus tb = this.b;
       tb = (tb == null)? -1: tb.ordinal();
       p0.writeInt(tb);
       p0.writeSerializable(this.c);
       return;
    }
}
