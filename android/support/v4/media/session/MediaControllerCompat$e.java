package android.support.v4.media.session.MediaControllerCompat$e;
import android.support.v4.media.session.MediaControllerCompat$d;
import android.media.session.MediaController$TransportControls;
import java.lang.String;
import android.os.Bundle;
import android.net.Uri;
import android.os.Build$VERSION;
import java.lang.Object;
import android.os.Parcelable;
import java.lang.IllegalArgumentException;
import android.support.v4.media.session.PlaybackStateCompat$CustomAction;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.RatingCompat;
import android.media.Rating;

public class MediaControllerCompat$e extends MediaControllerCompat$d	// class@0003e8
{
    public final MediaController$TransportControls a;

    public void MediaControllerCompat$e(MediaController$TransportControls p0){
       super();
       this.a = p0;
    }
    public void a(){
       this.a.fastForward();
    }
    public void b(){
       this.a.pause();
    }
    public void c(){
       this.a.play();
    }
    public void d(String p0,Bundle p1){
       this.a.playFromMediaId(p0, p1);
    }
    public void e(String p0,Bundle p1){
       this.a.playFromSearch(p0, p1);
    }
    public void f(Uri p0,Bundle p1){
       if (Build$VERSION.SDK_INT >= 23) {
          this.a.playFromUri(p0, p1);
          return;
       }else if(p0 != null && !Uri.EMPTY.equals(p0)){
          Bundle uBundle = new Bundle();
          uBundle.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", p0);
          uBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", p1);
          this.n("android.support.v4.media.session.action.PLAY_FROM_URI", uBundle);
          return;
       }else {
          throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
       }
    }
    public void g(){
       if (Build$VERSION.SDK_INT >= 24) {
          this.a.prepare();
          return;
       }else {
          this.n("android.support.v4.media.session.action.PREPARE", null);
          return;
       }
    }
    public void h(String p0,Bundle p1){
       if (Build$VERSION.SDK_INT >= 24) {
          this.a.prepareFromMediaId(p0, p1);
          return;
       }else {
          Bundle uBundle = new Bundle();
          uBundle.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", p0);
          uBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", p1);
          this.n("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", uBundle);
          return;
       }
    }
    public void i(String p0,Bundle p1){
       if (Build$VERSION.SDK_INT >= 24) {
          this.a.prepareFromSearch(p0, p1);
          return;
       }else {
          Bundle uBundle = new Bundle();
          uBundle.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", p0);
          uBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", p1);
          this.n("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", uBundle);
          return;
       }
    }
    public void j(Uri p0,Bundle p1){
       if (Build$VERSION.SDK_INT >= 24) {
          this.a.prepareFromUri(p0, p1);
          return;
       }else {
          Bundle uBundle = new Bundle();
          uBundle.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", p0);
          uBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", p1);
          this.n("android.support.v4.media.session.action.PREPARE_FROM_URI", uBundle);
          return;
       }
    }
    public void k(){
       this.a.rewind();
    }
    public void l(long p0){
       this.a.seekTo(p0);
    }
    public void m(PlaybackStateCompat$CustomAction p0,Bundle p1){
       MediaControllerCompat.b(p0.b(), p1);
       this.a.sendCustomAction(p0.b(), p1);
    }
    public void n(String p0,Bundle p1){
       MediaControllerCompat.b(p0, p1);
       this.a.sendCustomAction(p0, p1);
    }
    public void o(boolean p0){
       Bundle uBundle = new Bundle();
       uBundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", p0);
       this.n("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", uBundle);
    }
    public void p(RatingCompat p0){
       MediaControllerCompat$e ta = this.a;
       Rating rating = (p0 != null)? p0.c(): null;
       ta.setRating(rating);
       return;
    }
    public void q(RatingCompat p0,Bundle p1){
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("android.support.v4.media.session.action.ARGUMENT_RATING", p0);
       uBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", p1);
       this.n("android.support.v4.media.session.action.SET_RATING", uBundle);
    }
    public void r(int p0){
       Bundle uBundle = new Bundle();
       uBundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", p0);
       this.n("android.support.v4.media.session.action.SET_REPEAT_MODE", uBundle);
    }
    public void s(int p0){
       Bundle uBundle = new Bundle();
       uBundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", p0);
       this.n("android.support.v4.media.session.action.SET_SHUFFLE_MODE", uBundle);
    }
    public void t(){
       this.a.skipToNext();
    }
    public void u(){
       this.a.skipToPrevious();
    }
    public void v(long p0){
       this.a.skipToQueueItem(p0);
    }
    public void w(){
       this.a.stop();
    }
}
