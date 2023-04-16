package com.hpplay.sdk.source.process.LelinkSdkService$5;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import com.hpplay.sdk.source.process.LelinkSdkService;
import java.lang.Object;
import com.hpplay.sdk.source.d;
import java.lang.String;
import com.hpplay.sdk.source.a.a;
import java.lang.Throwable;
import java.lang.StringBuilder;

public class LelinkSdkService$5 implements ILelinkPlayerListener	// class@000688
{
    public final LelinkSdkService a;

    public void LelinkSdkService$5(LelinkSdkService p0){
       this.a = p0;
       super();
    }
    public void onCompletion(){
       if (LelinkSdkService.e(this.a) != null) {
          try{
             a.f("LelinkSdkService", "onCompletion");
             LelinkSdkService.e(this.a).onCompletion();
          }catch(android.os.RemoteException e1){
             a.b("LelinkSdkService", e1);
          }
       }
    }
    public void onError(int p0,int p1){
       if (LelinkSdkService.e(this.a) != null) {
          try{
             a.f("LelinkSdkService", "onError "+p0+"  "+p1);
             LelinkSdkService.e(this.a).onError(p0, p1);
          }catch(android.os.RemoteException e4){
             a.b("LelinkSdkService", e4);
          }
       }
    }
    public void onInfo(int p0,int p1){
       if (LelinkSdkService.e(this.a) != null) {
          try{
             a.f("LelinkSdkService", "onInfo");
             LelinkSdkService.e(this.a).onInfo(p0, p1);
          }catch(android.os.RemoteException e3){
             a.b("LelinkSdkService", e3);
          }
       }
    }
    public void onLoading(){
       if (LelinkSdkService.e(this.a) != null) {
          try{
             a.f("LelinkSdkService", "onLoading");
             LelinkSdkService.e(this.a).onLoading();
          }catch(android.os.RemoteException e1){
             a.b("LelinkSdkService", e1);
          }
       }
    }
    public void onPause(){
       if (LelinkSdkService.e(this.a) != null) {
          try{
             a.f("LelinkSdkService", "onPause");
             LelinkSdkService.e(this.a).onPause();
          }catch(android.os.RemoteException e1){
             a.b("LelinkSdkService", e1);
          }
       }
    }
    public void onPositionUpdate(long p0,long p1){
       if (LelinkSdkService.e(this.a) != null) {
          try{
             LelinkSdkService.e(this.a).onPositionUpdate(p0, p1);
          }catch(android.os.RemoteException e2){
             a.b("LelinkSdkService", e2);
          }
       }
    }
    public void onSeekComplete(int p0){
       if (LelinkSdkService.e(this.a) != null) {
          try{
             a.f("LelinkSdkService", "onSeekComplete");
             LelinkSdkService.e(this.a).onSeekComplete(p0);
          }catch(android.os.RemoteException e3){
             a.b("LelinkSdkService", e3);
          }
       }
    }
    public void onStart(){
       if (LelinkSdkService.e(this.a) != null) {
          try{
             a.f("LelinkSdkService", "onStart");
             LelinkSdkService.e(this.a).onStart();
          }catch(android.os.RemoteException e1){
             a.b("LelinkSdkService", e1);
          }
       }
    }
    public void onStop(){
       if (LelinkSdkService.e(this.a) != null) {
          try{
             a.f("LelinkSdkService", "onStop");
             LelinkSdkService.e(this.a).onStop();
          }catch(android.os.RemoteException e1){
             a.b("LelinkSdkService", e1);
          }
       }
    }
    public void onVolumeChanged(float p0){
       if (LelinkSdkService.e(this.a) != null) {
          try{
             LelinkSdkService.e(this.a).onVolumeChanged(p0);
          }catch(android.os.RemoteException e2){
             a.b("LelinkSdkService", e2);
          }
       }
    }
}
