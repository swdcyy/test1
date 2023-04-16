package com.google.android.flexbox.FlexboxLayoutManager$SavedState;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayoutManager$SavedState$a;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.flexbox.FlexboxLayoutManager$a;
import java.lang.String;
import java.lang.StringBuilder;

public class FlexboxLayoutManager$SavedState implements Parcelable	// class@001602
{
    public int b;
    public int c;
    public static final Parcelable$Creator CREATOR;

    static {
       FlexboxLayoutManager$SavedState.CREATOR = new FlexboxLayoutManager$SavedState$a();
    }
    public void FlexboxLayoutManager$SavedState(){
       super();
    }
    public void FlexboxLayoutManager$SavedState(Parcel p0){
       super();
       this.b = p0.readInt();
       this.c = p0.readInt();
    }
    public void FlexboxLayoutManager$SavedState(Parcel p0,FlexboxLayoutManager$a p1){
       super(p0);
    }
    public void FlexboxLayoutManager$SavedState(FlexboxLayoutManager$SavedState p0){
       super();
       this.b = p0.b;
       this.c = p0.c;
    }
    public void FlexboxLayoutManager$SavedState(FlexboxLayoutManager$SavedState p0,FlexboxLayoutManager$a p1){
       super(p0);
    }
    public boolean a(int p0){
       FlexboxLayoutManager$SavedState tb = this.b;
       boolean b = (tb >= null && tb < p0)? true: false;
       return b;
    }
    public void b(){
       this.b = -1;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       return "SavedState{mAnchorPosition="+this.b+", mAnchorOffset="+this.c+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       p0.writeInt(this.c);
    }
}
