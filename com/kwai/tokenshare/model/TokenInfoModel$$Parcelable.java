package com.kwai.tokenshare.model.TokenInfoModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.tokenshare.model.TokenInfoModel$$Parcelable$a;
import com.kwai.tokenshare.model.TokenInfoModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.tokenshare.model.TokenDialogModel;
import com.kwai.tokenshare.model.TokenDialogModel$$Parcelable;

public class TokenInfoModel$$Parcelable implements Parcelable, d	// class@001935
{
    public TokenInfoModel tokenInfoModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TokenInfoModel$$Parcelable.CREATOR = new TokenInfoModel$$Parcelable$a();
    }
    public void TokenInfoModel$$Parcelable(TokenInfoModel p0){
       super();
       this.tokenInfoModel$$0 = p0;
    }
    public static TokenInfoModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          TokenInfoModel tokenInfoMod = new TokenInfoModel();
          p1.f(p1.g(), tokenInfoMod);
          tokenInfoMod.mResult = p0.readInt();
          tokenInfoMod.mDialogModel = TokenDialogModel$$Parcelable.read(p0, p1);
          tokenInfoMod.mShareId = p0.readString();
          tokenInfoMod.mShareObjectId = p0.readString();
          tokenInfoMod.mSharePlatform = p0.readInt();
          tokenInfoMod.mUri = p0.readString();
          p1.f(i, tokenInfoMod);
          return tokenInfoMod;
       }
    }
    public static void write(TokenInfoModel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mResult);
          TokenDialogModel$$Parcelable.write(p0.mDialogModel, p1, p2, p3);
          p1.writeString(p0.mShareId);
          p1.writeString(p0.mShareObjectId);
          p1.writeInt(p0.mSharePlatform);
          p1.writeString(p0.mUri);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TokenInfoModel getParcel(){
       return this.tokenInfoModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TokenInfoModel$$Parcelable.write(this.tokenInfoModel$$0, p0, p1, new a());
    }
}
