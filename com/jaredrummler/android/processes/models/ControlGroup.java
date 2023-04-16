package com.jaredrummler.android.processes.models.ControlGroup;
import android.os.Parcelable;
import com.jaredrummler.android.processes.models.ControlGroup$a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class ControlGroup implements Parcelable	// class@0006df
{
    public final int b;
    public final String c;
    public final String d;
    public static final Parcelable$Creator CREATOR;

    static {
       ControlGroup.CREATOR = new ControlGroup$a();
    }
    public void ControlGroup(Parcel p0){
       super();
       this.b = p0.readInt();
       this.c = p0.readString();
       this.d = p0.readString();
    }
    public void ControlGroup(String p0){
       super();
       String[] stringArray = p0.split(":");
       this.b = Integer.parseInt(stringArray[0]);
       this.c = stringArray[1];
       this.d = stringArray[2];
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       Object[] objArray = new Object[]{Integer.valueOf(this.b),this.c,this.d};
       return String.format("%d:%s:%s", objArray);
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       p0.writeString(this.c);
       p0.writeString(this.d);
    }
}
