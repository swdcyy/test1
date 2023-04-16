package androidx.emoji.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader;
import androidx.emoji.text.EmojiCompat$MetadataRepoLoader;
import android.content.Context;
import x1.d;
import androidx.emoji.text.FontRequestEmojiCompatConfig$FontProviderHelper;
import java.lang.Object;
import z1.h;
import android.database.ContentObserver;
import java.lang.Runnable;
import android.os.Handler;
import android.os.HandlerThread;
import x1.f$b;
import androidx.emoji.text.FontRequestEmojiCompatConfig$RetryPolicy;
import android.net.Uri;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.nio.ByteBuffer;
import p1.l;
import androidx.emoji.text.MetadataRepo;
import androidx.emoji.text.EmojiCompat$MetadataRepoLoaderCallback;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.os.Looper;
import androidx.emoji.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1;
import x1.f$a;
import androidx.emoji.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$2;
import androidx.emoji.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$3;

public class FontRequestEmojiCompatConfig$FontRequestMetadataLoader implements EmojiCompat$MetadataRepoLoader	// class@00075c
{
    public EmojiCompat$MetadataRepoLoaderCallback mCallback;
    public final Context mContext;
    public final FontRequestEmojiCompatConfig$FontProviderHelper mFontProviderHelper;
    public Runnable mHandleMetadataCreationRunner;
    public Handler mHandler;
    public final Object mLock;
    public ContentObserver mObserver;
    public final d mRequest;
    public FontRequestEmojiCompatConfig$RetryPolicy mRetryPolicy;
    public HandlerThread mThread;

    public void FontRequestEmojiCompatConfig$FontRequestMetadataLoader(Context p0,d p1,FontRequestEmojiCompatConfig$FontProviderHelper p2){
       super();
       this.mLock = new Object();
       h.h(p0, "Context cannot be null");
       h.h(p1, "FontRequest cannot be null");
       this.mContext = p0.getApplicationContext();
       this.mRequest = p1;
       this.mFontProviderHelper = p2;
    }
    public final void cleanUp(){
       this.mCallback = null;
       FontRequestEmojiCompatConfig$FontRequestMetadataLoader tmObserver = this.mObserver;
       if (tmObserver != null) {
          this.mFontProviderHelper.unregisterObserver(this.mContext, tmObserver);
          this.mObserver = null;
       }
       tmObserver = this.mLock;
       _monitor_enter(tmObserver);
       this.mHandler.removeCallbacks(this.mHandleMetadataCreationRunner);
       FontRequestEmojiCompatConfig$FontRequestMetadataLoader tmThread = this.mThread;
       if (tmThread != null) {
          tmThread.quit();
       }
       this.mHandler = null;
       this.mThread = null;
       _monitor_exit(tmObserver);
       return;
    }
    public void createMetadata(){
       if (this.mCallback == null) {
          return;
       }
       f$b uob = this.retrieveFontInfo();
       int i = uob.b();
       if (i == 2) {
          FontRequestEmojiCompatConfig$FontRequestMetadataLoader tmLock = this.mLock;
          _monitor_enter(tmLock);
          FontRequestEmojiCompatConfig$FontRequestMetadataLoader tmRetryPolic = this.mRetryPolicy;
          if (tmRetryPolic != null) {
             long retryDelay = tmRetryPolic.getRetryDelay();
             if (retryDelay >= 0) {
                this.scheduleRetry(uob.d(), retryDelay);
                _monitor_exit(tmLock);
                return;
             }
          }
          _monitor_exit(tmLock);
       }
       if (!i) {
          Typeface typeface = this.mFontProviderHelper.buildTypeface(this.mContext, uob);
          ByteBuffer uByteBuffer = l.f(this.mContext, null, uob.d());
          if (uByteBuffer != null) {
             this.mCallback.onLoaded(MetadataRepo.create(typeface, uByteBuffer));
             this.cleanUp();
             return;
          }else {
             throw new RuntimeException("Unable to open file.");
          }
       }else {
          throw new RuntimeException("fetchFonts result is not OK. \("+i+"\)");
       }
    }
    public void load(EmojiCompat$MetadataRepoLoaderCallback p0){
       h.h(p0, "LoaderCallback cannot be null");
       FontRequestEmojiCompatConfig$FontRequestMetadataLoader tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (this.mHandler == null) {
          HandlerThread handlerThrea = new HandlerThread("emojiCompat", 10);
          this.mThread = handlerThrea;
          handlerThrea.start();
          this.mHandler = new Handler(this.mThread.getLooper());
       }
       this.mHandler.post(new FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1(this, p0));
       _monitor_exit(tmLock);
       return;
    }
    public final f$b retrieveFontInfo(){
       try{
          f$a uoa = this.mFontProviderHelper.fetchFonts(this.mContext, this.mRequest);
          if (uoa.c()) {
             throw new RuntimeException("fetchFonts failed \("+uoa.c()+"\)");
          }
          f$b[] uobArray = uoa.b();
          if (uobArray != null && uobArray.length) {
             return uobArray[0];
          }
          throw new RuntimeException("fetchFonts failed \(empty result\)");
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          throw new RuntimeException("provider not found", e0);
       }
    }
    public final void scheduleRetry(Uri p0,long p1){
       FontRequestEmojiCompatConfig$FontRequestMetadataLoader tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (this.mObserver == null) {
          FontRequestEmojiCompatConfig$FontRequestMetadataLoader$2 uFontRequest = new FontRequestEmojiCompatConfig$FontRequestMetadataLoader$2(this, this.mHandler);
          this.mObserver = uFontRequest;
          this.mFontProviderHelper.registerObserver(this.mContext, p0, uFontRequest);
       }
       if (this.mHandleMetadataCreationRunner == null) {
          this.mHandleMetadataCreationRunner = new FontRequestEmojiCompatConfig$FontRequestMetadataLoader$3(this);
       }
       this.mHandler.postDelayed(this.mHandleMetadataCreationRunner, p1);
       _monitor_exit(tmLock);
       return;
    }
    public void setHandler(Handler p0){
       FontRequestEmojiCompatConfig$FontRequestMetadataLoader tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mHandler = p0;
       _monitor_exit(tmLock);
    }
    public void setRetryPolicy(FontRequestEmojiCompatConfig$RetryPolicy p0){
       FontRequestEmojiCompatConfig$FontRequestMetadataLoader tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mRetryPolicy = p0;
       _monitor_exit(tmLock);
    }
}
