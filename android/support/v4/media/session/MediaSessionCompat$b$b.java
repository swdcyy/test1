package android.support.v4.media.session.MediaSessionCompat$b$b;
import android.media.session.MediaSession$Callback;
import android.support.v4.media.session.MediaSessionCompat$b;
import android.support.v4.media.session.MediaSessionCompat$c;
import r2.c;
import android.support.v4.media.session.MediaSessionCompat$d;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.b;
import android.os.IBinder;
import android.os.IInterface;
import l1.d;
import g3.c;
import g3.a;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.Objects;
import java.util.List;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.net.Uri;
import android.support.v4.media.RatingCompat;
import android.content.Intent;
import android.media.Rating;

public class MediaSessionCompat$b$b extends MediaSession$Callback	// class@0003f2
{
    public final MediaSessionCompat$b a;

    public void MediaSessionCompat$b$b(MediaSessionCompat$b p0){
       this.a = p0;
       super();
    }
    public final void a(MediaSessionCompat$c p0){
       p0.Q(null);
    }
    public final MediaSessionCompat$d b(){
       MediaSessionCompat$b a = this.a.a;
       _monitor_enter(a);
       MediaSessionCompat$d uod = this.a.d.get();
       _monitor_exit(a);
       if (this.a == uod.H()) {
       }else {
          uod = null;
       }
       return uod;
    }
    public final void c(MediaSessionCompat$c p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return;
       }
       String str = p0.T();
       if (TextUtils.isEmpty(str)) {
          str = "android.media.session.MediaController";
       }
       p0.Q(new c(str, -1, -1));
       return;
    }
    public void onCommand(String p0,Bundle p1,ResultReceiver p2){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       MediaSessionCompat.b(p1);
       try{
          this.c(uod);
          IBinder iBinder = null;
          if (p0.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
             Bundle uBundle = new Bundle();
             MediaSessionCompat$Token token = uod.a();
             b uob = token.c();
             if (uob != null) {
                iBinder = uob.asBinder();
             }
             d.b(uBundle, "android.support.v4.media.session.EXTRA_BINDER", iBinder);
             a.c(uBundle, "android.support.v4.media.session.SESSION_TOKEN2", token.d());
             p2.send(0, uBundle);
          }else if(p0.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")){
             p1.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")){
             p1.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
             p1.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")){
             p1.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")){
             if (uod.h != null) {
                int intx = p1.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                if (intx >= 0 && intx < uod.h.size()) {
                   iBinder = uod.h.get(intx);
                }
                if (iBinder != null) {
                   Objects.requireNonNull(this.a);
                }
             }
          }else {
             Objects.requireNonNull(this.a);
          }
          this.a(e0);
          return;
       }catch(android.os.BadParcelableException e0){
       }
    }
    public void onCustomAction(String p0,Bundle p1){
       Uri parcelable;
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       MediaSessionCompat.b(p1);
       try{
          this.c(uod);
          if (p0.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
             parcelable = p1.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
             MediaSessionCompat.b(p1.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.action.PREPARE")){
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")){
             p1.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
             MediaSessionCompat.b(p1.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")){
             p1.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
             MediaSessionCompat.b(p1.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")){
             parcelable = p1.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
             MediaSessionCompat.b(p1.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")){
             p1.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")){
             p1.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")){
             p1.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.action.SET_RATING")){
             RatingCompat parcelable1 = p1.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
             MediaSessionCompat.b(p1.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
             Objects.requireNonNull(this.a);
          }else if(p0.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")){
             p1.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 0x3f800000);
             Objects.requireNonNull(this.a);
          }else {
             Objects.requireNonNull(this.a);
          }
          this.a(e0);
          return;
       }catch(android.os.BadParcelableException e0){
       }
    }
    public void onFastForward(){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public boolean onMediaButtonEvent(Intent p0){
       MediaSessionCompat$d uod = this.b();
       boolean b = false;
       if (uod == null) {
          return b;
       }
       this.c(uod);
       this.a(uod);
       if (this.a.b(p0) || super.onMediaButtonEvent(p0)) {
          b = true;
       }
       return b;
    }
    public void onPause(){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onPlay(){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onPlayFromMediaId(String p0,Bundle p1){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       MediaSessionCompat.b(p1);
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onPlayFromSearch(String p0,Bundle p1){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       MediaSessionCompat.b(p1);
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onPlayFromUri(Uri p0,Bundle p1){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       MediaSessionCompat.b(p1);
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onPrepare(){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onPrepareFromMediaId(String p0,Bundle p1){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       MediaSessionCompat.b(p1);
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onPrepareFromSearch(String p0,Bundle p1){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       MediaSessionCompat.b(p1);
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onPrepareFromUri(Uri p0,Bundle p1){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       MediaSessionCompat.b(p1);
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onRewind(){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onSeekTo(long p0){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       this.a.c(p0);
       this.a(uod);
       return;
    }
    public void onSetPlaybackSpeed(float p0){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onSetRating(Rating p0){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       RatingCompat.a(p0);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onSkipToNext(){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onSkipToPrevious(){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onSkipToQueueItem(long p0){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
    public void onStop(){
       MediaSessionCompat$d uod = this.b();
       if (uod == null) {
          return;
       }
       this.c(uod);
       Objects.requireNonNull(this.a);
       this.a(uod);
       return;
    }
}
