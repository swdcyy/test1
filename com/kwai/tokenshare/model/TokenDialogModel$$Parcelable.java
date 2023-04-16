package com.kwai.tokenshare.model.TokenDialogModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.tokenshare.model.TokenDialogModel$$Parcelable$a;
import com.kwai.tokenshare.model.TokenDialogModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.tokenshare.model.TokenDialogModel$ShareTag;
import com.kwai.tokenshare.model.TokenDialogModel$ShareTag$$Parcelable;
import java.io.Serializable;
import com.kwai.tokenshare.model.TokenDialogModel$ShareMerchantShop;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import com.kwai.tokenshare.model.TokenDialogModel$SharePoi;
import com.kwai.tokenshare.model.TokenDialogModel$DialogConfig;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.feed.BaseFeed$$Parcelable;
import com.kwai.tokenshare.model.TokenDialogModel$ShareMerchantItem;

public class TokenDialogModel$$Parcelable implements Parcelable, d	// class@00192b
{
    public TokenDialogModel tokenDialogModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TokenDialogModel$$Parcelable.CREATOR = new TokenDialogModel$$Parcelable$a();
    }
    public void TokenDialogModel$$Parcelable(TokenDialogModel p0){
       super();
       this.tokenDialogModel$$0 = p0;
    }
    public static TokenDialogModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          TokenDialogModel tokenDialogM = new TokenDialogModel();
          p1.f(p1.g(), tokenDialogM);
          tokenDialogM.mShareTag = TokenDialogModel$ShareTag$$Parcelable.read(p0, p1);
          tokenDialogM.mShareMerchantShop = p0.readSerializable();
          tokenDialogM.mExt = p0.readString();
          tokenDialogM.mBizType = p0.readInt();
          tokenDialogM.mType = p0.readInt();
          tokenDialogM.mUser = User$$Parcelable.read(p0, p1);
          tokenDialogM.mSharePoi = p0.readSerializable();
          tokenDialogM.mDialogConfig = p0.readSerializable();
          tokenDialogM.mShareUser = User$$Parcelable.read(p0, p1);
          tokenDialogM.mAction = p0.readString();
          tokenDialogM.mShareUserProfile = p0.readString();
          tokenDialogM.mMessage = p0.readString();
          tokenDialogM.mPhotoUser = User$$Parcelable.read(p0, p1);
          tokenDialogM.mPhoto = BaseFeed$$Parcelable.read(p0, p1);
          tokenDialogM.mShareMerchantItem = p0.readSerializable();
          p1.f(i, tokenDialogM);
          return tokenDialogM;
       }
    }
    public static void write(TokenDialogModel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          TokenDialogModel$ShareTag$$Parcelable.write(p0.mShareTag, p1, p2, p3);
          p1.writeSerializable(p0.mShareMerchantShop);
          p1.writeString(p0.mExt);
          p1.writeInt(p0.mBizType);
          p1.writeInt(p0.mType);
          User$$Parcelable.write(p0.mUser, p1, p2, p3);
          p1.writeSerializable(p0.mSharePoi);
          p1.writeSerializable(p0.mDialogConfig);
          User$$Parcelable.write(p0.mShareUser, p1, p2, p3);
          p1.writeString(p0.mAction);
          p1.writeString(p0.mShareUserProfile);
          p1.writeString(p0.mMessage);
          User$$Parcelable.write(p0.mPhotoUser, p1, p2, p3);
          BaseFeed$$Parcelable.write(p0.mPhoto, p1, p2, p3);
          p1.writeSerializable(p0.mShareMerchantItem);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TokenDialogModel getParcel(){
       return this.tokenDialogModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TokenDialogModel$$Parcelable.write(this.tokenDialogModel$$0, p0, p1, new a());
    }
}
