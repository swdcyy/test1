package com.yxcorp.gifshow.model.ContactTargetItem$Tag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.ContactTargetItem$Tag$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.ContactTargetItem$Tag;

public class ContactTargetItem$Tag$$Parcelable$a implements Parcelable$Creator	// class@001dfb
{

    public void ContactTargetItem$Tag$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ContactTargetItem$Tag$$Parcelable(ContactTargetItem$Tag$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ContactTargetItem$Tag$$Parcelable[] tag$$Parcela = new ContactTargetItem$Tag$$Parcelable[p0];
       return tag$$Parcela;
    }
}
