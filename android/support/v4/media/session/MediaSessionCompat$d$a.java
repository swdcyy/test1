package android.support.v4.media.session.MediaSessionCompat$d$a;
import android.support.v4.media.session.b$a;
import android.support.v4.media.session.MediaSessionCompat$d;
import android.support.v4.media.MediaDescriptionCompat;
import java.lang.AssertionError;
import java.lang.String;
import android.os.Bundle;
import java.util.List;
import android.app.PendingIntent;
import android.net.Uri;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.a;
import r2.c;
import android.os.Binder;
import android.os.IInterface;
import java.lang.Object;
import android.os.RemoteCallbackList;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.view.KeyEvent;
import java.lang.CharSequence;

public class MediaSessionCompat$d$a extends b$a	// class@0003f5
{
    public final MediaSessionCompat$d a;

    public void MediaSessionCompat$d$a(MediaSessionCompat$d p0){
       this.a = p0;
       super();
    }
    public void D(MediaDescriptionCompat p0){
       throw new AssertionError();
    }
    public void E(MediaDescriptionCompat p0){
       throw new AssertionError();
    }
    public void E0(String p0,Bundle p1){
       throw new AssertionError();
    }
    public boolean F0(){
       return false;
    }
    public List G(){
       return null;
    }
    public void G1(int p0,int p1,String p2){
       throw new AssertionError();
    }
    public PendingIntent H0(){
       throw new AssertionError();
    }
    public void I(int p0){
       throw new AssertionError();
    }
    public void J(Uri p0,Bundle p1){
       throw new AssertionError();
    }
    public void L(String p0,Bundle p1){
       throw new AssertionError();
    }
    public void N(String p0,Bundle p1){
       throw new AssertionError();
    }
    public void P0(RatingCompat p0,Bundle p1){
       throw new AssertionError();
    }
    public void T(int p0){
       throw new AssertionError();
    }
    public void T0(String p0,Bundle p1,MediaSessionCompat$ResultReceiverWrapper p2){
       throw new AssertionError();
    }
    public void V0(boolean p0){
    }
    public void Y0(a p0){
       if (this.a.e == null) {
          this.a.f.register(p0, new c("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
       }
       return;
    }
    public boolean a0(){
       throw new AssertionError();
    }
    public void c1(a p0){
       this.a.f.unregister(p0);
    }
    public void e(){
       throw new AssertionError();
    }
    public PlaybackStateCompat g(){
       MediaSessionCompat$d$a ta = this.a;
       return MediaSessionCompat.d(ta.g, ta.i);
    }
    public ParcelableVolumeInfo g0(){
       throw new AssertionError();
    }
    public Bundle getExtras(){
       throw new AssertionError();
    }
    public long getFlags(){
       throw new AssertionError();
    }
    public MediaMetadataCompat getMetadata(){
       throw new AssertionError();
    }
    public String getPackageName(){
       throw new AssertionError();
    }
    public String getTag(){
       throw new AssertionError();
    }
    public boolean j(){
       return this.a.k;
    }
    public void k1(String p0,Bundle p1){
       throw new AssertionError();
    }
    public void l(){
       throw new AssertionError();
    }
    public boolean l0(KeyEvent p0){
       throw new AssertionError();
    }
    public CharSequence m(){
       throw new AssertionError();
    }
    public void m0(MediaDescriptionCompat p0,int p1){
       throw new AssertionError();
    }
    public void n(boolean p0){
       throw new AssertionError();
    }
    public void n1(Uri p0,Bundle p1){
       throw new AssertionError();
    }
    public void next(){
       throw new AssertionError();
    }
    public int p(){
       return this.a.j;
    }
    public void pause(){
       throw new AssertionError();
    }
    public void play(){
       throw new AssertionError();
    }
    public void previous(){
       throw new AssertionError();
    }
    public void q0(long p0){
       throw new AssertionError();
    }
    public int r(){
       return this.a.m;
    }
    public void s(int p0){
       throw new AssertionError();
    }
    public void seekTo(long p0){
       throw new AssertionError();
    }
    public void stop(){
       throw new AssertionError();
    }
    public void t0(RatingCompat p0){
       throw new AssertionError();
    }
    public void u0(int p0,int p1,String p2){
       throw new AssertionError();
    }
    public void u1(String p0,Bundle p1){
       throw new AssertionError();
    }
    public int w(){
       return this.a.l;
    }
    public void x1(){
       throw new AssertionError();
    }
    public void y0(float p0){
       throw new AssertionError();
    }
    public Bundle z(){
       Bundle uBundle = (this.a.d == null)? null: new Bundle(this.a.d);
       return uBundle;
    }
}
