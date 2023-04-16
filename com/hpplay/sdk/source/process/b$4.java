package com.hpplay.sdk.source.process.b$4;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import com.hpplay.sdk.source.process.b;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.hpplay.sdk.source.a.a;

public class b$4 implements ILelinkPlayerListener	// class@000693
{
    public final b a;

    public void b$4(b p0){
       this.a = p0;
       super();
    }
    public void onCompletion(){
       a.f("LelinkSdkManager", "onCompletion "+b.g(this.a));
       if (b.h(this.a) != null) {
          b.h(this.a).onCompletion();
       }
       return;
    }
    public void onError(int p0,int p1){
       b.a(this.a, 0);
       if (b.h(this.a) != null) {
          b.h(this.a).onError(p0, p1);
       }
       a.f("LelinkSdkManager", "onError "+b.g(this.a));
       return;
    }
    public void onInfo(int p0,int p1){
       a.f("LelinkSdkManager", "onInfo");
       if (b.h(this.a) != null) {
          b.h(this.a).onInfo(p0, p1);
       }
       return;
    }
    public void onLoading(){
       int i = 2;
       if (b.f(this.a) == 102) {
          b.a(this.a, i);
       }else if(b.f(this.a) == 101){
          b.a(this.a, 3);
       }else if(b.f(this.a) == 103){
          b.a(this.a, 4);
       }else if(b.f(this.a) == i){
          b.a(this.a, 1);
       }
       a.f("LelinkSdkManager", "onLoading  "+b.g(this.a));
       if (b.h(this.a) != null) {
          b.h(this.a).onLoading();
       }
       return;
    }
    public void onPause(){
       if (b.f(this.a) == 102) {
          b.a(this.a, 9);
       }else if(b.f(this.a) == 101){
          b.a(this.a, 10);
       }
       a.f("LelinkSdkManager", "onPause  "+b.g(this.a));
       if (b.h(this.a) != null) {
          b.h(this.a).onPause();
       }
       return;
    }
    public void onPositionUpdate(long p0,long p1){
       a.f("LelinkSdkManager", "onPositionUpdate "+p0+"  "+p1);
       if (b.h(this.a) != null) {
          b.h(this.a).onPositionUpdate(p0, p1);
       }
       return;
    }
    public void onSeekComplete(int p0){
       a.f("LelinkSdkManager", "onSeekComplete");
       if (b.h(this.a) != null) {
          b.h(this.a).onSeekComplete(p0);
       }
       return;
    }
    public void onStart(){
       if (b.f(this.a) == 102) {
          b.a(this.a, 6);
       }else if(b.f(this.a) == 101){
          b.a(this.a, 7);
       }else if(b.f(this.a) == 103){
          b.a(this.a, 8);
       }else if(b.f(this.a) == 2){
          b.a(this.a, 5);
       }
       a.f("LelinkSdkManager", "onStart "+b.g(this.a));
       if (b.h(this.a) != null) {
          b.h(this.a).onStart();
       }
       return;
    }
    public void onStop(){
       a.f("LelinkSdkManager", "onStop ");
       b.a(this.a, 0);
       if (b.h(this.a) != null) {
          b.h(this.a).onStop();
       }
       return;
    }
    public void onVolumeChanged(float p0){
       if (b.h(this.a) != null) {
          b.h(this.a).onVolumeChanged(p0);
       }
       return;
    }
}
