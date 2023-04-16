package com.kuaishou.android.model.feed.MusicRadioFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.MusicRadioFeed$$Parcelable$a;
import com.kuaishou.android.model.feed.MusicRadioFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.Music$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class MusicRadioFeed$$Parcelable implements Parcelable, d	// class@000b24
{
    public MusicRadioFeed musicRadioFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MusicRadioFeed$$Parcelable.CREATOR = new MusicRadioFeed$$Parcelable$a();
    }
    public void MusicRadioFeed$$Parcelable(MusicRadioFeed p0){
       super();
       this.musicRadioFeed$$0 = p0;
    }
    public static MusicRadioFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          MusicRadioFeed musicRadioFe = new MusicRadioFeed();
          p1.f(p1.g(), musicRadioFe);
          musicRadioFe.mRaveView = Music$$Parcelable.read(p0, p1);
          musicRadioFe.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, musicRadioFe, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, musicRadioFe, "dataMap", new c().d(p0));
          p1.f(i, musicRadioFe);
          return musicRadioFe;
       }
    }
    public static void write(MusicRadioFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          Music$$Parcelable.write(p0.mRaveView, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MusicRadioFeed getParcel(){
       return this.musicRadioFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MusicRadioFeed$$Parcelable.write(this.musicRadioFeed$$0, p0, p1, new a());
    }
}
