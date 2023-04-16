package com.yxcorp.gifshow.recycler.widget.ItemHeader$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.widget.ItemHeader;

public class ItemHeader$a implements Parcelable$Creator	// class@0017b7
{

    public void ItemHeader$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       ItemHeader itemHeader = PatchProxy.applyOneRefs(p0, this, ItemHeader$a.class, "1");
       if (itemHeader != PatchProxyResult.class) {
       }else {
          itemHeader = new ItemHeader(p0);
       }
       return itemHeader;
    }
    public Object[] newArray(int p0){
       ItemHeader[] itemHeaderAr = new ItemHeader[p0];
       return itemHeaderAr;
    }
}
