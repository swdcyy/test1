package com.kwai.tokenshare.model.TokenInfoModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.tokenshare.model.TokenInfoModel$$Parcelable;
import xwd.a;
import com.kwai.tokenshare.model.TokenInfoModel;

public class TokenInfoModel$$Parcelable$a implements Parcelable$Creator	// class@001934
{

    public void TokenInfoModel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TokenInfoModel$$Parcelable(TokenInfoModel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TokenInfoModel$$Parcelable[] $ParcelableA = new TokenInfoModel$$Parcelable[p0];
       return $ParcelableA;
    }
}
