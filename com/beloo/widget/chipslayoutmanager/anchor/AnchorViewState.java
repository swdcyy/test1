package com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import android.os.Parcelable;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState$a;
import java.lang.Object;
import java.lang.Integer;
import android.graphics.Rect;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;
import java.util.Locale;

public class AnchorViewState implements Parcelable	// class@000f09
{
    public Integer b;
    public Rect c;
    public static final Parcelable$Creator CREATOR;

    static {
       AnchorViewState.CREATOR = new AnchorViewState$a();
    }
    public void AnchorViewState(){
       super();
       this.b = Integer.valueOf(0);
    }
    public void AnchorViewState(int p0,Rect p1){
       super();
       this.b = Integer.valueOf(0);
       this.b = Integer.valueOf(p0);
       this.c = p1;
    }
    public void AnchorViewState(Parcel p0){
       super();
       this.b = Integer.valueOf(0);
       int i = p0.readInt();
       Integer integer = (i == -1)? null: Integer.valueOf(i);
       this.b = integer;
       this.c = p0.readParcelable(AnchorViewState.class.getClassLoader());
       return;
    }
    public static AnchorViewState b(){
       return new AnchorViewState();
    }
    public Rect a(){
       return this.c;
    }
    public Integer c(){
       return this.b;
    }
    public boolean d(){
       boolean b = (this.c == null)? true: false;
       return b;
    }
    public int describeContents(){
       return 0;
    }
    public boolean e(){
       boolean b = (this.c().intValue() == -1)? true: false;
       return b;
    }
    public void f(Integer p0){
       this.b = p0;
    }
    public String toString(){
       Object[] objArray = new Object[]{this.b,String.valueOf(this.c)};
       return String.format(Locale.getDefault(), "AnchorState. Position = %d, Rect = %s", objArray);
    }
    public void writeToParcel(Parcel p0,int p1){
       AnchorViewState tb = this.b;
       tb = (tb == null)? -1: tb.intValue();
       p0.writeInt(tb);
       p0.writeParcelable(this.c, 0);
       return;
    }
}
