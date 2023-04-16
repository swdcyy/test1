package c.t.m.g.do$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import c.t.m.g.do;
import java.lang.String;

public final class do$1 implements Parcelable$Creator	// class@000c4e
{

    public void do$1(){
       super();
    }
    public do a(Parcel p0){
       do uodo = new do();
       uodo.a = p0.readString();
       uodo.b = p0.readString();
       uodo.c = p0.readString();
       uodo.d = p0.readDouble();
       uodo.e = p0.readDouble();
       uodo.f = p0.readDouble();
       uodo.g = p0.readString();
       uodo.h = p0.readString();
       return uodo;
    }
    public do[] a(int p0){
       do[] uodoArray = new do[p0];
       return uodoArray;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.a(p0);
    }
}
