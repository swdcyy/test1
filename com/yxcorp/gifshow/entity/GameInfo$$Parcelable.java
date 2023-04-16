package com.yxcorp.gifshow.entity.GameInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.entity.GameInfo$$Parcelable$a;
import com.yxcorp.gifshow.entity.GameInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class GameInfo$$Parcelable implements Parcelable, d	// class@000d61
{
    public GameInfo gameInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       GameInfo$$Parcelable.CREATOR = new GameInfo$$Parcelable$a();
    }
    public void GameInfo$$Parcelable(GameInfo p0){
       super();
       this.gameInfo$$0 = p0;
    }
    public static GameInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          GameInfo gameInfo = new GameInfo();
          p1.f(p1.g(), gameInfo);
          gameInfo.gameId = p0.readString();
          gameInfo.promptTextColorHex = p0.readString();
          gameInfo.imageUrl = p0.readString();
          gameInfo.actionUri = p0.readString();
          gameInfo.name = p0.readString();
          gameInfo.iconUrl = p0.readString();
          gameInfo.promptBgColorHex = p0.readString();
          gameInfo.prompt = p0.readString();
          gameInfo.roomId = p0.readString();
          gameInfo.desc = p0.readString();
          p1.f(i, gameInfo);
          return gameInfo;
       }
    }
    public static void write(GameInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.gameId);
          p1.writeString(p0.promptTextColorHex);
          p1.writeString(p0.imageUrl);
          p1.writeString(p0.actionUri);
          p1.writeString(p0.name);
          p1.writeString(p0.iconUrl);
          p1.writeString(p0.promptBgColorHex);
          p1.writeString(p0.prompt);
          p1.writeString(p0.roomId);
          p1.writeString(p0.desc);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public GameInfo getParcel(){
       return this.gameInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       GameInfo$$Parcelable.write(this.gameInfo$$0, p0, p1, new a());
    }
}
