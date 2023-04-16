package com.kwai.feature.api.social.kwaitoken.model.TokenModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.kwaitoken.model.TokenModel$$Parcelable$a;
import com.kwai.feature.api.social.kwaitoken.model.TokenModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TokenModel$$Parcelable implements Parcelable, d	// class@00110b
{
    public TokenModel tokenModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TokenModel$$Parcelable.CREATOR = new TokenModel$$Parcelable$a();
    }
    public void TokenModel$$Parcelable(TokenModel p0){
       super();
       this.tokenModel$$0 = p0;
    }
    public static TokenModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          TokenModel tokenModel = new TokenModel();
          p1.f(p1.g(), tokenModel);
          tokenModel.mKey = p0.readString();
          tokenModel.mResult = p0.readInt();
          tokenModel.mShareMessage = p0.readString();
          tokenModel.mDownloadMessage = p0.readString();
          p1.f(i, tokenModel);
          return tokenModel;
       }
    }
    public static void write(TokenModel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mKey);
          p1.writeInt(p0.mResult);
          p1.writeString(p0.mShareMessage);
          p1.writeString(p0.mDownloadMessage);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TokenModel getParcel(){
       return this.tokenModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TokenModel$$Parcelable.write(this.tokenModel$$0, p0, p1, new a());
    }
}
