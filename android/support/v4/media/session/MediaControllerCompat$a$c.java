package android.support.v4.media.session.MediaControllerCompat$a$c;
import android.support.v4.media.session.a$a;
import android.support.v4.media.session.MediaControllerCompat$a;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Boolean;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.CharSequence;
import java.lang.Integer;
import java.util.List;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.String;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.MediaControllerCompat$c;

public class MediaControllerCompat$a$c extends a$a	// class@0003e3
{
    public final WeakReference a;

    public void MediaControllerCompat$a$c(MediaControllerCompat$a p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void B1(boolean p0){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          uoa.a(11, Boolean.valueOf(p0), null);
       }
       return;
    }
    public void C0(PlaybackStateCompat p0){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          uoa.a(2, p0, null);
       }
       return;
    }
    public void E1(boolean p0){
    }
    public void F1(CharSequence p0){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          uoa.a(6, p0, null);
       }
       return;
    }
    public void J0(){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          uoa.a(13, null, null);
       }
       return;
    }
    public void J1(int p0){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          uoa.a(9, Integer.valueOf(p0), null);
       }
       return;
    }
    public void K0(List p0){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          uoa.a(5, p0, null);
       }
       return;
    }
    public void Q0(){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          uoa.a(8, null, null);
       }
       return;
    }
    public void n0(MediaMetadataCompat p0){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          uoa.a(3, p0, null);
       }
       return;
    }
    public void onEvent(String p0,Bundle p1){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          uoa.a(1, p0, p1);
       }
       return;
    }
    public void p0(int p0){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          uoa.a(12, Integer.valueOf(p0), null);
       }
       return;
    }
    public void r0(ParcelableVolumeInfo p0){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          if (p0 != null) {
             MediaControllerCompat$c uoc = new MediaControllerCompat$c(p0.b, p0.c, p0.d, p0.e, p0.f);
          }else {
             Bundle uBundle = null;
          }
          uoa.a(4, v8, null);
       }
       return;
    }
    public void w0(Bundle p0){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null) {
          uoa.a(7, p0, null);
       }
       return;
    }
}
