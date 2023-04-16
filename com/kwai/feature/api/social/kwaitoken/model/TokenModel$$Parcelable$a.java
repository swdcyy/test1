package com.kwai.feature.api.social.kwaitoken.model.TokenModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.kwaitoken.model.TokenModel$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.kwaitoken.model.TokenModel;

public class TokenModel$$Parcelable$a implements Parcelable$Creator	// class@00110a
{

    public void TokenModel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TokenModel$$Parcelable(TokenModel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TokenModel$$Parcelable[] $ParcelableA = new TokenModel$$Parcelable[p0];
       return $ParcelableA;
    }
}
