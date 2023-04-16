package com.yxcorp.gifshow.recycler.widget.ItemFooter;
import android.os.Parcelable;
import com.yxcorp.gifshow.recycler.widget.ItemFooter$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class ItemFooter implements Parcelable	// class@0017b6
{
    public int b;
    public String c;
    public static final Parcelable$Creator CREATOR;

    static {
       ItemFooter.CREATOR = new ItemFooter$a();
    }
    public void ItemFooter(){
       super();
    }
    public void ItemFooter(Parcel p0){
       super();
       this.b = p0.readInt();
       this.c = p0.readString();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(ItemFooter.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ItemFooter.class, "1")) {
          return;
       }
       p0.writeInt(this.b);
       p0.writeString(this.c);
       return;
    }
}
