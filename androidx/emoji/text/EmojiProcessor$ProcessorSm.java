package androidx.emoji.text.EmojiProcessor$ProcessorSm;
import androidx.emoji.text.MetadataRepo$Node;
import java.lang.Object;
import androidx.emoji.text.EmojiMetadata;
import java.util.Arrays;

public final class EmojiProcessor$ProcessorSm	// class@000754
{
    public int mCurrentDepth;
    public MetadataRepo$Node mCurrentNode;
    public final int[] mEmojiAsDefaultStyleExceptions;
    public MetadataRepo$Node mFlushNode;
    public int mLastCodepoint;
    public final MetadataRepo$Node mRootNode;
    public int mState;
    public final boolean mUseEmojiAsDefaultStyle;

    public void EmojiProcessor$ProcessorSm(MetadataRepo$Node p0,boolean p1,int[] p2){
       super();
       this.mState = 1;
       this.mRootNode = p0;
       this.mCurrentNode = p0;
       this.mUseEmojiAsDefaultStyle = p1;
       this.mEmojiAsDefaultStyleExceptions = p2;
    }
    public static boolean isEmojiStyle(int p0){
       boolean b = (p0 == 0xfe0f)? true: false;
       return b;
    }
    public static boolean isTextStyle(int p0){
       boolean b = (p0 == 0xfe0e)? true: false;
       return b;
    }
    public int check(int p0){
       MetadataRepo$Node node = this.mCurrentNode.get(p0);
       int i = 3;
       if (this.mState != 2) {
          if (node == null) {
             i = this.reset();
          }else {
             this.mState = 2;
             this.mCurrentNode = node;
             this.mCurrentDepth = 1;
          label_001a :
             i = 2;
          }
       }else if(node != null){
          this.mCurrentNode = node;
          this.mCurrentDepth = this.mCurrentDepth + 1;
          goto label_001a ;
       }else if(EmojiProcessor$ProcessorSm.isTextStyle(p0)){
          i = this.reset();
       }else if(EmojiProcessor$ProcessorSm.isEmojiStyle(p0)){
          goto label_001a ;
       }else if(this.mCurrentNode.getData() != null){
          if (this.mCurrentDepth == 1) {
             if (this.shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                this.mFlushNode = this.mCurrentNode;
                this.reset();
             }else {
                i = this.reset();
             }
          }else {
             this.mFlushNode = this.mCurrentNode;
             this.reset();
          }
       }else {
          i = this.reset();
       }
       this.mLastCodepoint = p0;
       return i;
    }
    public EmojiMetadata getCurrentMetadata(){
       return this.mCurrentNode.getData();
    }
    public EmojiMetadata getFlushMetadata(){
       return this.mFlushNode.getData();
    }
    public boolean isInFlushableState(){
       boolean b = true;
       if (this.mState != 2 || (this.mCurrentNode.getData() == null || (this.mCurrentDepth <= b && !this.shouldUseEmojiPresentationStyleForSingleCodepoint()))) {
          b = false;
       }
       return b;
    }
    public final int reset(){
       this.mState = 1;
       this.mCurrentNode = this.mRootNode;
       this.mCurrentDepth = 0;
       return 1;
    }
    public final boolean shouldUseEmojiPresentationStyleForSingleCodepoint(){
       if (this.mCurrentNode.getData().isDefaultEmoji()) {
          return true;
       }
       if (EmojiProcessor$ProcessorSm.isEmojiStyle(this.mLastCodepoint)) {
          return true;
       }
       if (this.mUseEmojiAsDefaultStyle != null) {
          if (this.mEmojiAsDefaultStyleExceptions == null) {
             return true;
          }else if(Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0){
             return true;
          }
       }
       return 0;
    }
}
