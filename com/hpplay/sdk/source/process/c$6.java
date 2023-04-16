package com.hpplay.sdk.source.process.c$6;
import com.hpplay.sdk.source.d$a;
import com.hpplay.sdk.source.process.c;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;

public class c$6 extends d$a	// class@00069c
{
    public final c k;

    public void c$6(c p0){
       this.k = p0;
       super();
    }
    public void onCompletion(){
       if (c.h(this.k) != null) {
          c.h(this.k).onCompletion();
       }
       return;
    }
    public void onError(int p0,int p1){
       if (c.h(this.k) != null) {
          c.h(this.k).onError(p0, p1);
       }
       return;
    }
    public void onInfo(int p0,int p1){
       if (c.h(this.k) != null) {
          c.h(this.k).onInfo(p0, p1);
       }
       return;
    }
    public void onLoading(){
       if (c.h(this.k) != null) {
          c.h(this.k).onLoading();
       }
       return;
    }
    public void onPause(){
       if (c.h(this.k) != null) {
          c.h(this.k).onPause();
       }
       return;
    }
    public void onPositionUpdate(long p0,long p1){
       if (c.h(this.k) != null) {
          c.h(this.k).onPositionUpdate(p0, p1);
       }
       return;
    }
    public void onSeekComplete(int p0){
       if (c.h(this.k) != null) {
          c.h(this.k).onSeekComplete(p0);
       }
       return;
    }
    public void onStart(){
       if (c.h(this.k) != null) {
          c.h(this.k).onStart();
       }
       return;
    }
    public void onStop(){
       if (c.h(this.k) != null) {
          c.h(this.k).onStop();
       }
       return;
    }
    public void onVolumeChanged(float p0){
       if (c.h(this.k) != null) {
          c.h(this.k).onVolumeChanged(p0);
       }
       return;
    }
}
