package com.yxcorp.gifshow.recycler.widget.ItemFooter$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.widget.ItemFooter;

public class ItemFooter$a implements Parcelable$Creator	// class@0017b5
{

    public void ItemFooter$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       ItemFooter itemFooter = PatchProxy.applyOneRefs(p0, this, ItemFooter$a.class, "1");
       if (itemFooter != PatchProxyResult.class) {
       }else {
          itemFooter = new ItemFooter(p0);
       }
       return itemFooter;
    }
    public Object[] newArray(int p0){
       ItemFooter[] itemFooterAr = new ItemFooter[p0];
       return itemFooterAr;
    }
}
