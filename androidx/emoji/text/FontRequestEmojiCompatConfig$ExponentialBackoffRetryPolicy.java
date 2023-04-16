package androidx.emoji.text.FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy;
import androidx.emoji.text.FontRequestEmojiCompatConfig$RetryPolicy;
import android.os.SystemClock;
import java.lang.Math;

public class FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy extends FontRequestEmojiCompatConfig$RetryPolicy	// class@000757
{
    public long mRetryOrigin;
    public final long mTotalMs;

    public void FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy(long p0){
       super();
       this.mTotalMs = p0;
    }
    public long getRetryDelay(){
       long l = 0;
       if (!this.mRetryOrigin - l) {
          this.mRetryOrigin = SystemClock.uptimeMillis();
          return l;
       }else {
          long l1 = SystemClock.uptimeMillis() - this.mRetryOrigin;
          if (l1 - this.mTotalMs > 0) {
             return -1;
          }
          return Math.min(Math.max(l1, 1000), (this.mTotalMs - l1));
       }
    }
}
