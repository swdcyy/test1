package android.support.v4.media.session.a$a$a;
import android.support.v4.media.session.a;
import android.os.IBinder;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import android.support.v4.media.session.a$a;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import android.support.v4.media.MediaMetadataCompat;
import android.os.Bundle;
import android.support.v4.media.session.ParcelableVolumeInfo;

public class a$a$a implements a	// class@000402
{
    public IBinder a;
    public static a b;

    public void a$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public void B1(boolean p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       int i = 1;
       int i1 = (p0)? 1: 0;
       parcel.writeInt(i1);
       if (!this.a.transact(11, parcel, null, i) && a$a.M1() != null) {
          a$a.M1().B1(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void C0(PlaybackStateCompat p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       int i = 1;
       int i1 = 0;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, i1);
       }else {
          parcel.writeInt(i1);
       }
       if (!this.a.transact(3, parcel, null, i) && a$a.M1() != null) {
          a$a.M1().C0(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void E1(boolean p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       int i = 1;
       int i1 = (p0)? 1: 0;
       parcel.writeInt(i1);
       if (!this.a.transact(10, parcel, null, i) && a$a.M1() != null) {
          a$a.M1().E1(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void F1(CharSequence p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       int i = 1;
       int i1 = 0;
       if (p0 != null) {
          parcel.writeInt(i);
          TextUtils.writeToParcel(p0, parcel, i1);
       }else {
          parcel.writeInt(i1);
       }
       if (!this.a.transact(6, parcel, null, i) && a$a.M1() != null) {
          a$a.M1().F1(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void J0(){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       if (!this.a.transact(13, parcel, null, 1) && a$a.M1() != null) {
          a$a.M1().J0();
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void J1(int p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       parcel.writeInt(p0);
       if (!this.a.transact(9, parcel, null, 1) && a$a.M1() != null) {
          a$a.M1().J1(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void K0(List p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       parcel.writeTypedList(p0);
       if (!this.a.transact(5, parcel, null, 1) && a$a.M1() != null) {
          a$a.M1().K0(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void Q0(){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       if (!this.a.transact(2, parcel, null, 1) && a$a.M1() != null) {
          a$a.M1().Q0();
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public IBinder asBinder(){
       return this.a;
    }
    public void n0(MediaMetadataCompat p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       int i = 1;
       int i1 = 0;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, i1);
       }else {
          parcel.writeInt(i1);
       }
       if (!this.a.transact(4, parcel, null, i) && a$a.M1() != null) {
          a$a.M1().n0(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void onEvent(String p0,Bundle p1){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       parcel.writeString(p0);
       int i = 0;
       if (p1 != null) {
          parcel.writeInt(1);
          p1.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(1, parcel, null, 1) && a$a.M1() != null) {
          a$a.M1().onEvent(p0, p1);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void p0(int p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       parcel.writeInt(p0);
       if (!this.a.transact(12, parcel, null, 1) && a$a.M1() != null) {
          a$a.M1().p0(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void r0(ParcelableVolumeInfo p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       int i = 1;
       int i1 = 0;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, i1);
       }else {
          parcel.writeInt(i1);
       }
       if (!this.a.transact(8, parcel, null, i) && a$a.M1() != null) {
          a$a.M1().r0(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void w0(Bundle p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       int i = 1;
       int i1 = 0;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, i1);
       }else {
          parcel.writeInt(i1);
       }
       if (!this.a.transact(7, parcel, null, i) && a$a.M1() != null) {
          a$a.M1().w0(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
}
