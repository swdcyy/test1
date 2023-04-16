package android.support.v4.media.session.b$a$a;
import android.support.v4.media.session.b;
import android.os.IBinder;
import java.lang.Object;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Parcel;
import java.lang.String;
import android.support.v4.media.session.b$a;
import android.os.Bundle;
import java.util.List;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import android.app.PendingIntent;
import android.net.Uri;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.a;
import android.os.IInterface;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.MediaMetadataCompat;
import android.view.KeyEvent;
import java.lang.CharSequence;
import android.text.TextUtils;

public class b$a$a implements b	// class@000405
{
    public IBinder a;
    public static b b;

    public void b$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public void D(MediaDescriptionCompat p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 0;
       if (p0 != null) {
          parcel.writeInt(1);
          p0.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(43, parcel, parcel1, i) && b$a.M1() != null) {
          b$a.M1().D(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void E(MediaDescriptionCompat p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 0;
       if (p0 != null) {
          parcel.writeInt(1);
          p0.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(41, parcel, parcel1, i) && b$a.M1() != null) {
          b$a.M1().E(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void E0(String p0,Bundle p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeString(p0);
       int i = 0;
       if (p1 != null) {
          parcel.writeInt(1);
          p1.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(26, parcel, parcel1, i) && b$a.M1() != null) {
          b$a.M1().E0(p0, p1);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public boolean F0(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 0;
       if (!this.a.transact(38, parcel, parcel1, i) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().F0();
       }else {
          parcel1.readException();
          if (parcel1.readInt()) {
             i = true;
          }
          parcel1.recycle();
          parcel.recycle();
          return i;
       }
    }
    public List G(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(29, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().G();
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
       }
    }
    public void G1(int p0,int p1,String p2){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeInt(p0);
       parcel.writeInt(p1);
       parcel.writeString(p2);
       if (!this.a.transact(11, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().G1(p0, p1, p2);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public PendingIntent H0(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(8, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().H0();
       }else {
          parcel1.readException();
          PendingIntent pendingInten = (parcel1.readInt())? PendingIntent.CREATOR.createFromParcel(parcel1): null;
          parcel1.recycle();
          parcel.recycle();
          return pendingInten;
       }
    }
    public void I(int p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeInt(p0);
       if (!this.a.transact(39, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().I(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void J(Uri p0,Bundle p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 1;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       if (p1 != null) {
          parcel.writeInt(i);
          p1.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       if (!this.a.transact(36, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().J(p0, p1);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void L(String p0,Bundle p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeString(p0);
       int i = 0;
       if (p1 != null) {
          parcel.writeInt(1);
          p1.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(34, parcel, parcel1, i) && b$a.M1() != null) {
          b$a.M1().L(p0, p1);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void N(String p0,Bundle p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeString(p0);
       int i = 0;
       if (p1 != null) {
          parcel.writeInt(1);
          p1.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(14, parcel, parcel1, i) && b$a.M1() != null) {
          b$a.M1().N(p0, p1);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void P0(RatingCompat p0,Bundle p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 1;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       if (p1 != null) {
          parcel.writeInt(i);
          p1.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       if (!this.a.transact(51, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().P0(p0, p1);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void T(int p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeInt(p0);
       if (!this.a.transact(44, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().T(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void T0(String p0,Bundle p1,MediaSessionCompat$ResultReceiverWrapper p2){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeString(p0);
       int i = 1;
       if (p1 != null) {
          parcel.writeInt(i);
          p1.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       if (p2 != null) {
          parcel.writeInt(i);
          p2.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       if (!this.a.transact(i, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().T0(p0, p1, p2);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void V0(boolean p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 0;
       int i1 = (p0)? 1: 0;
       parcel.writeInt(i1);
       if (!this.a.transact(40, parcel, parcel1, i) && b$a.M1() != null) {
          b$a.M1().V0(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void Y0(a p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       if (!this.a.transact(3, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().Y0(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public boolean a0(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 0;
       if (!this.a.transact(5, parcel, parcel1, i) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().a0();
       }else {
          parcel1.readException();
          if (parcel1.readInt()) {
             i = true;
          }
          parcel1.recycle();
          parcel.recycle();
          return i;
       }
    }
    public IBinder asBinder(){
       return this.a;
    }
    public void c1(a p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       if (!this.a.transact(4, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().c1(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void e(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(33, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().e();
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public PlaybackStateCompat g(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(28, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().g();
       }else {
          parcel1.readException();
          PlaybackStateCompat playbackStat = (parcel1.readInt())? PlaybackStateCompat.CREATOR.createFromParcel(parcel1): null;
          parcel1.recycle();
          parcel.recycle();
          return playbackStat;
       }
    }
    public ParcelableVolumeInfo g0(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(10, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().g0();
       }else {
          parcel1.readException();
          ParcelableVolumeInfo parcelableVo = (parcel1.readInt())? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel1): null;
          parcel1.recycle();
          parcel.recycle();
          return parcelableVo;
       }
    }
    public Bundle getExtras(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(31, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().getExtras();
       }else {
          parcel1.readException();
          Bundle uBundle = (parcel1.readInt())? Bundle.CREATOR.createFromParcel(parcel1): null;
          parcel1.recycle();
          parcel.recycle();
          return uBundle;
       }
    }
    public long getFlags(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(9, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().getFlags();
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readLong();
       }
    }
    public MediaMetadataCompat getMetadata(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(27, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().getMetadata();
       }else {
          parcel1.readException();
          MediaMetadataCompat mediaMetadat = (parcel1.readInt())? MediaMetadataCompat.CREATOR.createFromParcel(parcel1): null;
          parcel1.recycle();
          parcel.recycle();
          return mediaMetadat;
       }
    }
    public String getPackageName(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(6, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().getPackageName();
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readString();
       }
    }
    public String getTag(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(7, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().getTag();
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readString();
       }
    }
    public boolean j(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 0;
       if (!this.a.transact(45, parcel, parcel1, i) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().j();
       }else {
          parcel1.readException();
          if (parcel1.readInt()) {
             i = true;
          }
          parcel1.recycle();
          parcel.recycle();
          return i;
       }
    }
    public void k1(String p0,Bundle p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeString(p0);
       int i = 0;
       if (p1 != null) {
          parcel.writeInt(1);
          p1.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(15, parcel, parcel1, i) && b$a.M1() != null) {
          b$a.M1().k1(p0, p1);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void l(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(23, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().l();
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public boolean l0(KeyEvent p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 1;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       if (!this.a.transact(2, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().l0(p0);
       }else {
          parcel1.readException();
          if (!parcel1.readInt()) {
             i = false;
          }
          parcel1.recycle();
          parcel.recycle();
          return i;
       }
    }
    public CharSequence m(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(30, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().m();
       }else {
          parcel1.readException();
          CharSequence uCharSequenc = (parcel1.readInt())? TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel1): null;
          parcel1.recycle();
          parcel.recycle();
          return uCharSequenc;
       }
    }
    public void m0(MediaDescriptionCompat p0,int p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 0;
       if (p0 != null) {
          parcel.writeInt(1);
          p0.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       parcel.writeInt(p1);
       if (!this.a.transact(42, parcel, parcel1, i) && b$a.M1() != null) {
          b$a.M1().m0(p0, p1);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void n(boolean p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 0;
       int i1 = (p0)? 1: 0;
       parcel.writeInt(i1);
       if (!this.a.transact(46, parcel, parcel1, i) && b$a.M1() != null) {
          b$a.M1().n(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void n1(Uri p0,Bundle p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 1;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       if (p1 != null) {
          parcel.writeInt(i);
          p1.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       if (!this.a.transact(16, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().n1(p0, p1);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void next(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(20, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().next();
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public int p(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(32, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().p();
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readInt();
       }
    }
    public void pause(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(18, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().pause();
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void play(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(13, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().play();
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void previous(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(21, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().previous();
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void q0(long p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeLong(p0);
       if (!this.a.transact(17, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().q0(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public int r(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(47, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().r();
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readInt();
       }
    }
    public void s(int p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeInt(p0);
       if (!this.a.transact(48, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().s(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void seekTo(long p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeLong(p0);
       if (!this.a.transact(24, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().seekTo(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void stop(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(19, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().stop();
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void t0(RatingCompat p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       int i = 0;
       if (p0 != null) {
          parcel.writeInt(1);
          p0.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(25, parcel, parcel1, i) && b$a.M1() != null) {
          b$a.M1().t0(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void u0(int p0,int p1,String p2){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeInt(p0);
       parcel.writeInt(p1);
       parcel.writeString(p2);
       if (!this.a.transact(12, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().u0(p0, p1, p2);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void u1(String p0,Bundle p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeString(p0);
       int i = 0;
       if (p1 != null) {
          parcel.writeInt(1);
          p1.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(35, parcel, parcel1, i) && b$a.M1() != null) {
          b$a.M1().u1(p0, p1);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public int w(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(37, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().w();
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readInt();
       }
    }
    public void x1(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(22, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().x1();
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public void y0(float p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       parcel.writeFloat(p0);
       if (!this.a.transact(49, parcel, parcel1, 0) && b$a.M1() != null) {
          b$a.M1().y0(p0);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public Bundle z(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(50, parcel, parcel1, 0) && b$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return b$a.M1().z();
       }else {
          parcel1.readException();
          Bundle uBundle = (parcel1.readInt())? Bundle.CREATOR.createFromParcel(parcel1): null;
          parcel1.recycle();
          parcel.recycle();
          return uBundle;
       }
    }
}
