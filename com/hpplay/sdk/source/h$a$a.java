package com.hpplay.sdk.source.h$a$a;
import com.hpplay.sdk.source.h;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.util.List;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import com.hpplay.sdk.source.g;
import android.os.IInterface;
import com.hpplay.sdk.source.c;
import com.hpplay.sdk.source.d;
import com.hpplay.sdk.source.a;
import com.hpplay.sdk.source.f;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;
import com.hpplay.sdk.source.e;

public class h$a$a implements h	// class@000673
{
    public IBinder a;

    public void h$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public void addPinCodeToLelinkServiceInfo(String p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       parcel.writeString(p0);
       this.a.transact(28, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void addQRCodeToLelinkServiceInfo(String p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       parcel.writeString(p0);
       this.a.transact(27, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void addVolume(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       this.a.transact(20, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public IBinder asBinder(){
       return this.a;
    }
    public void browse(boolean p0,boolean p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       int i = 1;
       int i1 = (p0)? 1: 0;
       parcel.writeInt(i1);
       if (!p1) {
          i = 0;
       }
       parcel.writeInt(i);
       this.a.transact(8, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public boolean canPlayLocalMedia(LelinkServiceInfo p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       int i = 1;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       this.a.transact(31, parcel, parcel1, 0);
       parcel1.readException();
       if (!parcel1.readInt()) {
          i = false;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
    public boolean canPlayScreen(LelinkServiceInfo p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       int i = 1;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       this.a.transact(30, parcel, parcel1, 0);
       parcel1.readException();
       if (!parcel1.readInt()) {
          i = false;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
    public void connect(LelinkServiceInfo p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       if (p0 != null) {
          parcel.writeInt(1);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       this.a.transact(11, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public boolean disConnect(LelinkServiceInfo p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       int i = 1;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       this.a.transact(12, parcel, parcel1, 0);
       parcel1.readException();
       if (!parcel1.readInt()) {
          i = false;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
    public List getConnectInfos(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       this.a.transact(13, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.createTypedArrayList(LelinkServiceInfo.CREATOR);
    }
    public String getInterfaceDescriptor(){
       return "com.hpplay.sdk.source.SDKInterface";
    }
    public int getOption(int p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       parcel.writeInt(p0);
       this.a.transact(32, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readInt();
    }
    public void initSdkWithUserId(String p0,String p1,String p2,String p3,String p4){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       parcel.writeString(p0);
       parcel.writeString(p1);
       parcel.writeString(p2);
       parcel.writeString(p3);
       parcel.writeString(p4);
       this.a.transact(2, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public int loadLePatch(String p0,String p1,boolean p2){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       parcel.writeString(p0);
       parcel.writeString(p1);
       int i = 1;
       int i1 = (p2)? 1: 0;
       parcel.writeInt(i1);
       this.a.transact(i, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readInt();
    }
    public void pause(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       this.a.transact(19, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void resume(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       this.a.transact(18, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void seekTo(int p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       parcel.writeInt(p0);
       this.a.transact(9, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void setAuthListener(g p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       this.a.transact(26, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void setConnectStatusListener(c p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       this.a.transact(6, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void setDebugMode(boolean p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       int i = (p0)? 1: 0;
       parcel.writeInt(i);
       this.a.transact(3, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void setLelinkPlayListenerListener(d p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       this.a.transact(5, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void setLelinkServiceInfoListener(a p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       this.a.transact(4, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void setOption(int p0,String p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       parcel.writeInt(p0);
       parcel.writeString(p1);
       this.a.transact(24, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void setParceResultListener(f p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       this.a.transact(7, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void setSystemApp(boolean p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       int i = (p0)? 1: 0;
       parcel.writeInt(i);
       this.a.transact(29, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void setVolume(int p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       parcel.writeInt(p0);
       this.a.transact(22, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void startMirrorForPlayerInfo(LelinkPlayerInfo p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       if (p0 != null) {
          parcel.writeInt(1);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       this.a.transact(17, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void startOnlineCheck(e p0,List p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       parcel.writeTypedList(p1);
       this.a.transact(25, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void startPlayMedia(String p0,int p1,boolean p2){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       parcel.writeString(p0);
       parcel.writeInt(p1);
       p1 = (p2)? 1: 0;
       parcel.writeInt(p1);
       this.a.transact(14, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void startPlayMediaForPlayerInfo(LelinkPlayerInfo p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       if (p0 != null) {
          parcel.writeInt(1);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       this.a.transact(15, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void startPlayMediaImmed(LelinkServiceInfo p0,String p1,int p2,boolean p3){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       int i = 1;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       parcel.writeString(p1);
       parcel.writeInt(p2);
       if (!p3) {
          i = 0;
       }
       parcel.writeInt(i);
       this.a.transact(16, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void stopBrowse(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       this.a.transact(10, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void stopPlay(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       this.a.transact(23, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void subVolume(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.SDKInterface");
       this.a.transact(21, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
}
