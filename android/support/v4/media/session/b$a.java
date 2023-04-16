package android.support.v4.media.session.b$a;
import android.support.v4.media.session.b;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import android.support.v4.media.session.b$a$a;
import android.os.Parcel;
import android.support.v4.media.RatingCompat;
import java.lang.Object;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.app.PendingIntent;
import android.support.v4.media.session.a;
import android.support.v4.media.session.a$a;
import android.view.KeyEvent;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;

public abstract class b$a extends Binder implements b	// class@000406
{

    public void b$a(){
       super();
       this.attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }
    public static b L1(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("android.support.v4.media.session.IMediaSession");
       if (iInterface != null && iInterface instanceof b) {
          return iInterface;
       }
       return new b$a$a(p0);
    }
    public static b M1(){
       return b$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       String str;
       Uri uri;
       Bundle extras;
       MediaSessionCompat$ResultReceiverWrapper resultReceiv1;
       if (p0 != 0x5f4e5446) {
          int i = 0;
          MediaSessionCompat$ResultReceiverWrapper resultReceiv = null;
          switch (p0){
              case 1:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                str = p1.readString();
                Bundle uBundle = (p1.readInt())? Bundle.CREATOR.createFromParcel(p1): resultReceiv;
                if (p1.readInt()) {
                   resultReceiv = MediaSessionCompat$ResultReceiverWrapper.CREATOR.createFromParcel(p1);
                }
                this.T0(str, uBundle, resultReceiv);
                p2.writeNoException();
                return true;
                break;
              case 2:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (p1.readInt()) {
                   resultReceiv = KeyEvent.CREATOR.createFromParcel(p1);
                }
                p2.writeNoException();
                p2.writeInt(this.l0(resultReceiv));
                return true;
                break;
              case 3:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.Y0(a$a.L1(p1.readStrongBinder()));
                p2.writeNoException();
                return true;
              case 4:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.c1(a$a.L1(p1.readStrongBinder()));
                p2.writeNoException();
                return true;
              case 5:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                p2.writeNoException();
                p2.writeInt(this.a0());
                return true;
              case 6:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                p2.writeNoException();
                p2.writeString(this.getPackageName());
                return true;
              case 7:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                p2.writeNoException();
                p2.writeString(this.getTag());
                return true;
              case 8:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                PendingIntent pendingInten = this.H0();
                p2.writeNoException();
                if (pendingInten != null) {
                   p2.writeInt(true);
                   pendingInten.writeToParcel(p2, true);
                }else {
                   p2.writeInt(i);
                }
                return true;
                break;
              case 9:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                p2.writeNoException();
                p2.writeLong(this.getFlags());
                return true;
              case 10:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                ParcelableVolumeInfo parcelableVo = this.g0();
                p2.writeNoException();
                if (parcelableVo != null) {
                   p2.writeInt(true);
                   parcelableVo.writeToParcel(p2, true);
                }else {
                   p2.writeInt(i);
                }
                return true;
                break;
              case 11:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.G1(p1.readInt(), p1.readInt(), p1.readString());
                p2.writeNoException();
                return true;
              case 12:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.u0(p1.readInt(), p1.readInt(), p1.readString());
                p2.writeNoException();
                return true;
              case 13:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.play();
                p2.writeNoException();
                return true;
              case 14:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                str = p1.readString();
                if (p1.readInt()) {
                   resultReceiv = Bundle.CREATOR.createFromParcel(p1);
                }
                this.N(str, resultReceiv);
                p2.writeNoException();
                return true;
                break;
              case 15:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                str = p1.readString();
                if (p1.readInt()) {
                   resultReceiv = Bundle.CREATOR.createFromParcel(p1);
                }
                this.k1(str, resultReceiv);
                p2.writeNoException();
                return true;
                break;
              case 16:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                uri = (p1.readInt())? Uri.CREATOR.createFromParcel(p1): resultReceiv;
                if (p1.readInt()) {
                   resultReceiv = Bundle.CREATOR.createFromParcel(p1);
                }
                this.n1(uri, resultReceiv);
                p2.writeNoException();
                return true;
                break;
              case 17:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.q0(p1.readLong());
                p2.writeNoException();
                return true;
              case 18:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.pause();
                p2.writeNoException();
                return true;
              case 19:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.stop();
                p2.writeNoException();
                return true;
              case 20:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.next();
                p2.writeNoException();
                return true;
              case 21:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.previous();
                p2.writeNoException();
                return true;
              case 22:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.x1();
                p2.writeNoException();
                return true;
              case 23:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.l();
                p2.writeNoException();
                return true;
              case 24:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.seekTo(p1.readLong());
                p2.writeNoException();
                return true;
              case 25:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (p1.readInt()) {
                   resultReceiv = RatingCompat.CREATOR.createFromParcel(p1);
                }
                this.t0(resultReceiv);
                p2.writeNoException();
                return true;
                break;
              case 26:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                str = p1.readString();
                if (p1.readInt()) {
                   resultReceiv = Bundle.CREATOR.createFromParcel(p1);
                }
                this.E0(str, resultReceiv);
                p2.writeNoException();
                return true;
                break;
              case 27:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                MediaMetadataCompat metadata = this.getMetadata();
                p2.writeNoException();
                if (metadata != null) {
                   p2.writeInt(true);
                   metadata.writeToParcel(p2, true);
                }else {
                   p2.writeInt(i);
                }
                return true;
                break;
              case 28:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                PlaybackStateCompat playbackStat = this.g();
                p2.writeNoException();
                if (playbackStat != null) {
                   p2.writeInt(true);
                   playbackStat.writeToParcel(p2, true);
                }else {
                   p2.writeInt(i);
                }
                return true;
                break;
              case 29:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                p2.writeNoException();
                p2.writeTypedList(this.G());
                return true;
              case 30:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                CharSequence uCharSequenc = this.m();
                p2.writeNoException();
                if (uCharSequenc != null) {
                   p2.writeInt(true);
                   TextUtils.writeToParcel(uCharSequenc, p2, true);
                }else {
                   p2.writeInt(i);
                }
                return true;
                break;
              case 31:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                extras = this.getExtras();
                p2.writeNoException();
                if (extras != null) {
                   p2.writeInt(true);
                   extras.writeToParcel(p2, true);
                }else {
                   p2.writeInt(i);
                }
                return true;
                break;
              case 32:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                p2.writeNoException();
                p2.writeInt(this.p());
                return true;
              case '!':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.e();
                p2.writeNoException();
                return true;
              case '"':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                str = p1.readString();
                if (p1.readInt()) {
                   resultReceiv = Bundle.CREATOR.createFromParcel(p1);
                }
                this.L(str, resultReceiv);
                p2.writeNoException();
                return true;
                break;
              case '#':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                str = p1.readString();
                if (p1.readInt()) {
                   resultReceiv = Bundle.CREATOR.createFromParcel(p1);
                }
                this.u1(str, resultReceiv);
                p2.writeNoException();
                return true;
                break;
              case '$':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                uri = (p1.readInt())? Uri.CREATOR.createFromParcel(p1): resultReceiv;
                if (p1.readInt()) {
                   resultReceiv = Bundle.CREATOR.createFromParcel(p1);
                }
                this.J(uri, resultReceiv);
                p2.writeNoException();
                return true;
                break;
              case '%':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                p2.writeNoException();
                p2.writeInt(this.w());
                return true;
              case '&':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                p2.writeNoException();
                p2.writeInt(this.F0());
                return true;
              case 39:
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.I(p1.readInt());
                p2.writeNoException();
                return true;
              case '(':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (p1.readInt()) {
                   i = true;
                }
                this.V0(i);
                p2.writeNoException();
                return true;
                break;
              case ')':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (p1.readInt()) {
                   resultReceiv = MediaDescriptionCompat.CREATOR.createFromParcel(p1);
                }
                this.E(resultReceiv);
                p2.writeNoException();
                return true;
                break;
              case '*':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (p1.readInt()) {
                   resultReceiv = MediaDescriptionCompat.CREATOR.createFromParcel(p1);
                }
                this.m0(resultReceiv, p1.readInt());
                p2.writeNoException();
                return true;
                break;
              case '+':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (p1.readInt()) {
                   resultReceiv = MediaDescriptionCompat.CREATOR.createFromParcel(p1);
                }
                this.D(resultReceiv);
                p2.writeNoException();
                return true;
                break;
              case ',':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.T(p1.readInt());
                p2.writeNoException();
                return true;
              case '-':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                p2.writeNoException();
                p2.writeInt(this.j());
                return true;
              case '.':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (p1.readInt()) {
                   i = true;
                }
                this.n(i);
                p2.writeNoException();
                return true;
                break;
              case '/':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                p2.writeNoException();
                p2.writeInt(this.r());
                return true;
              case '0':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.s(p1.readInt());
                p2.writeNoException();
                return true;
              case '1':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                this.y0(p1.readFloat());
                p2.writeNoException();
                return true;
              case '2':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                extras = this.z();
                p2.writeNoException();
                if (extras != null) {
                   p2.writeInt(true);
                   extras.writeToParcel(p2, true);
                }else {
                   p2.writeInt(i);
                }
                return true;
                break;
              case '3':
                p1.enforceInterface("android.support.v4.media.session.IMediaSession");
                RatingCompat ratingCompat = (p1.readInt())? RatingCompat.CREATOR.createFromParcel(p1): resultReceiv;
                if (p1.readInt()) {
                   resultReceiv = Bundle.CREATOR.createFromParcel(p1);
                }
                this.P0(ratingCompat, resultReceiv);
                p2.writeNoException();
                return true;
                break;
              default:
                return super.onTransact(p0, p1, p2, p3);
          }
       }else {
          p2.writeString("android.support.v4.media.session.IMediaSession");
          return true;
       }
    }
}
