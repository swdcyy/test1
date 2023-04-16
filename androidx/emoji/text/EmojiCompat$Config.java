package androidx.emoji.text.EmojiCompat$Config;
import androidx.emoji.text.EmojiCompat$MetadataRepoLoader;
import java.lang.Object;
import z1.h;
import androidx.emoji.text.EmojiCompat$InitCallback;
import androidx.collection.ArraySet;
import java.util.Set;
import java.util.List;
import java.util.Iterator;
import java.lang.Integer;
import java.util.Arrays;

public abstract class EmojiCompat$Config	// class@000746
{
    public int[] mEmojiAsDefaultStyleExceptions;
    public int mEmojiSpanIndicatorColor;
    public boolean mEmojiSpanIndicatorEnabled;
    public Set mInitCallbacks;
    public int mMetadataLoadStrategy;
    public final EmojiCompat$MetadataRepoLoader mMetadataLoader;
    public boolean mReplaceAll;
    public boolean mUseEmojiAsDefaultStyle;

    public void EmojiCompat$Config(EmojiCompat$MetadataRepoLoader p0){
       super();
       this.mEmojiSpanIndicatorColor = -16711936;
       this.mMetadataLoadStrategy = 0;
       h.h(p0, "metadataLoader cannot be null.");
       this.mMetadataLoader = p0;
    }
    public final EmojiCompat$MetadataRepoLoader getMetadataRepoLoader(){
       return this.mMetadataLoader;
    }
    public EmojiCompat$Config registerInitCallback(EmojiCompat$InitCallback p0){
       h.h(p0, "initCallback cannot be null");
       if (this.mInitCallbacks == null) {
          this.mInitCallbacks = new ArraySet();
       }
       this.mInitCallbacks.add(p0);
       return this;
    }
    public EmojiCompat$Config setEmojiSpanIndicatorColor(int p0){
       this.mEmojiSpanIndicatorColor = p0;
       return this;
    }
    public EmojiCompat$Config setEmojiSpanIndicatorEnabled(boolean p0){
       this.mEmojiSpanIndicatorEnabled = p0;
       return this;
    }
    public EmojiCompat$Config setMetadataLoadStrategy(int p0){
       this.mMetadataLoadStrategy = p0;
       return this;
    }
    public EmojiCompat$Config setReplaceAll(boolean p0){
       this.mReplaceAll = p0;
       return this;
    }
    public EmojiCompat$Config setUseEmojiAsDefaultStyle(boolean p0){
       return this.setUseEmojiAsDefaultStyle(p0, null);
    }
    public EmojiCompat$Config setUseEmojiAsDefaultStyle(boolean p0,List p1){
       this.mUseEmojiAsDefaultStyle = p0;
       if (p0 && p1 != null) {
          int[] ointArray = new int[p1.size()];
          this.mEmojiAsDefaultStyleExceptions = ointArray;
          int i = 0;
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             int i1 = i + 1;
             this.mEmojiAsDefaultStyleExceptions[i] = iterator.next().intValue();
             i = i1;
          }
          Arrays.sort(this.mEmojiAsDefaultStyleExceptions);
       }else {
          this.mEmojiAsDefaultStyleExceptions = null;
       }
       return this;
    }
    public EmojiCompat$Config unregisterInitCallback(EmojiCompat$InitCallback p0){
       h.h(p0, "initCallback cannot be null");
       EmojiCompat$Config tmInitCallba = this.mInitCallbacks;
       if (tmInitCallba != null) {
          tmInitCallba.remove(p0);
       }
       return this;
    }
}
