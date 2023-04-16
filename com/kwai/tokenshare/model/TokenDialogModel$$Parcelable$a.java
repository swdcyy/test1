package com.kwai.tokenshare.model.TokenDialogModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.tokenshare.model.TokenDialogModel$$Parcelable;
import xwd.a;
import com.kwai.tokenshare.model.TokenDialogModel;

public class TokenDialogModel$$Parcelable$a implements Parcelable$Creator	// class@00192a
{

    public void TokenDialogModel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TokenDialogModel$$Parcelable(TokenDialogModel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TokenDialogModel$$Parcelable[] $ParcelableA = new TokenDialogModel$$Parcelable[p0];
       return $ParcelableA;
    }
}
