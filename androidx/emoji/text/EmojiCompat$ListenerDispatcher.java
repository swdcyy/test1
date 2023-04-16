package androidx.emoji.text.EmojiCompat$ListenerDispatcher;
import java.lang.Runnable;
import androidx.emoji.text.EmojiCompat$InitCallback;
import java.lang.Object;
import z1.h;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Throwable;
import java.util.ArrayList;

public class EmojiCompat$ListenerDispatcher implements Runnable	// class@000748
{
    public final List mInitCallbacks;
    public final int mLoadState;
    public final Throwable mThrowable;

    public void EmojiCompat$ListenerDispatcher(EmojiCompat$InitCallback p0,int p1){
       EmojiCompat$InitCallback[] initCallback = new EmojiCompat$InitCallback[]{p0};
       h.h(p0, "initCallback cannot be null");
       super(Arrays.asList(initCallback), p1, null);
    }
    public void EmojiCompat$ListenerDispatcher(Collection p0,int p1){
       super(p0, p1, null);
    }
    public void EmojiCompat$ListenerDispatcher(Collection p0,int p1,Throwable p2){
       super();
       h.h(p0, "initCallbacks cannot be null");
       this.mInitCallbacks = new ArrayList(p0);
       this.mLoadState = p1;
       this.mThrowable = p2;
    }
    public void run(){
       int i1;
       int i = this.mInitCallbacks.size();
       if (this.mLoadState != 1) {
          for (i1 = 0; i1 < i; i1 = i1 + 1) {
             this.mInitCallbacks.get(i1).onFailed(this.mThrowable);
          }
       }else {
          for (; i1 < i; i1 = i1 + 1) {
             this.mInitCallbacks.get(i1).onInitialized();
          }
       }
       return;
    }
}
