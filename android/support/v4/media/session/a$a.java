package android.support.v4.media.session.a$a;
import android.support.v4.media.session.a;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import android.support.v4.media.session.a$a$a;
import android.os.Parcel;
import android.support.v4.media.session.MediaControllerCompat$a$c;
import android.support.v4.media.session.ParcelableVolumeInfo;
import java.lang.Object;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.CharSequence;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import java.util.ArrayList;
import java.util.List;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

public abstract class a$a extends Binder implements a	// class@000403
{

    public void a$a(){
       super();
       this.attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }
    public static a L1(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
       if (iInterface != null && iInterface instanceof a) {
          return iInterface;
       }
       return new a$a$a(p0);
    }
    public static a M1(){
       return a$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 0x5f4e5446) {
          Bundle uBundle = null;
          switch (p0){
              case 1:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String str = p1.readString();
                if (p1.readInt()) {
                   uBundle = Bundle.CREATOR.createFromParcel(p1);
                }
                this.onEvent(str, uBundle);
                return true;
                break;
              case 2:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                this.Q0();
                return true;
              case 3:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (p1.readInt()) {
                   uBundle = PlaybackStateCompat.CREATOR.createFromParcel(p1);
                }
                this.C0(uBundle);
                return true;
                break;
              case 4:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (p1.readInt()) {
                   uBundle = MediaMetadataCompat.CREATOR.createFromParcel(p1);
                }
                this.n0(uBundle);
                return true;
                break;
              case 5:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                this.K0(p1.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
              case 6:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (p1.readInt()) {
                   uBundle = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p1);
                }
                this.F1(uBundle);
                return true;
                break;
              case 7:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (p1.readInt()) {
                   uBundle = Bundle.CREATOR.createFromParcel(p1);
                }
                this.w0(uBundle);
                return true;
                break;
              case 8:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (p1.readInt()) {
                   uBundle = ParcelableVolumeInfo.CREATOR.createFromParcel(p1);
                }
                this.r0(uBundle);
                return true;
                break;
              case 9:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                this.J1(p1.readInt());
                return true;
              case 10:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                p1.readInt();
                return true;
              case 11:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean b = (p1.readInt())? true: false;
                this.B1(b);
                return true;
                break;
              case 12:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                this.p0(p1.readInt());
                return true;
              case 13:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                this.J0();
                return true;
              default:
                return super.onTransact(p0, p1, p2, p3);
          }
       }else {
          p2.writeString("android.support.v4.media.session.IMediaControllerCallback");
          return true;
       }
    }
}
