package androidx.emoji.text.EmojiCompat;
import java.lang.Object;
import androidx.emoji.text.EmojiCompat$Config;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.ArraySet;
import java.util.Set;
import java.util.Collection;
import androidx.emoji.text.EmojiCompat$CompatInternal19;
import java.lang.String;
import z1.h;
import android.view.inputmethod.InputConnection;
import android.text.Editable;
import androidx.emoji.text.EmojiProcessor;
import android.view.KeyEvent;
import androidx.emoji.text.EmojiCompat$CompatInternal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.lang.CharSequence;
import java.lang.Throwable;
import java.util.ArrayList;
import androidx.emoji.text.EmojiCompat$ListenerDispatcher;
import java.lang.Runnable;
import androidx.emoji.text.EmojiCompat$InitCallback;
import androidx.emoji.text.EmojiProcessor$GlyphChecker;
import android.view.inputmethod.EditorInfo;

public class EmojiCompat	// class@00074f
{
    public final int[] mEmojiAsDefaultStyleExceptions;
    public final int mEmojiSpanIndicatorColor;
    public final boolean mEmojiSpanIndicatorEnabled;
    public final EmojiCompat$CompatInternal mHelper;
    public final Set mInitCallbacks;
    public final ReadWriteLock mInitLock;
    public int mLoadState;
    public final Handler mMainHandler;
    public final int mMetadataLoadStrategy;
    public final EmojiCompat$MetadataRepoLoader mMetadataLoader;
    public final boolean mReplaceAll;
    public final boolean mUseEmojiAsDefaultStyle;
    public static EmojiCompat sInstance;
    public static final Object sInstanceLock;

    static {
       EmojiCompat.sInstanceLock = new Object();
    }
    public void EmojiCompat(EmojiCompat$Config p0){
       super();
       this.mInitLock = new ReentrantReadWriteLock();
       this.mLoadState = 3;
       this.mReplaceAll = p0.mReplaceAll;
       this.mUseEmojiAsDefaultStyle = p0.mUseEmojiAsDefaultStyle;
       this.mEmojiAsDefaultStyleExceptions = p0.mEmojiAsDefaultStyleExceptions;
       this.mEmojiSpanIndicatorEnabled = p0.mEmojiSpanIndicatorEnabled;
       this.mEmojiSpanIndicatorColor = p0.mEmojiSpanIndicatorColor;
       this.mMetadataLoader = p0.mMetadataLoader;
       this.mMetadataLoadStrategy = p0.mMetadataLoadStrategy;
       this.mMainHandler = new Handler(Looper.getMainLooper());
       ArraySet uArraySet = new ArraySet();
       this.mInitCallbacks = uArraySet;
       EmojiCompat$Config mInitCallbac = p0.mInitCallbacks;
       if (mInitCallbac != null && !mInitCallbac.isEmpty()) {
          uArraySet.addAll(p0.mInitCallbacks);
       }
       this.mHelper = new EmojiCompat$CompatInternal19(this);
       this.loadMetadata();
       return;
    }
    public static EmojiCompat get(){
       Object sInstanceLoc = EmojiCompat.sInstanceLock;
       _monitor_enter(sInstanceLoc);
       boolean b = (EmojiCompat.sInstance != null)? true: false;
       h.i(b, "EmojiCompat is not initialized. Please call EmojiCompat.init\(\) first");
       _monitor_exit(sInstanceLoc);
       return EmojiCompat.sInstance;
    }
    public static boolean handleDeleteSurroundingText(InputConnection p0,Editable p1,int p2,int p3,boolean p4){
       return EmojiProcessor.handleDeleteSurroundingText(p0, p1, p2, p3, p4);
    }
    public static boolean handleOnKeyDown(Editable p0,int p1,KeyEvent p2){
       return EmojiProcessor.handleOnKeyDown(p0, p1, p2);
    }
    public static EmojiCompat init(EmojiCompat$Config p0){
       if (EmojiCompat.sInstance == null) {
          Object sInstanceLoc = EmojiCompat.sInstanceLock;
          _monitor_enter(sInstanceLoc);
          if (EmojiCompat.sInstance == null) {
             EmojiCompat.sInstance = new EmojiCompat(p0);
          }
          _monitor_exit(sInstanceLoc);
       }
       return EmojiCompat.sInstance;
    }
    public static EmojiCompat reset(EmojiCompat$Config p0){
       Object sInstanceLoc = EmojiCompat.sInstanceLock;
       _monitor_enter(sInstanceLoc);
       EmojiCompat.sInstance = new EmojiCompat(p0);
       _monitor_exit(sInstanceLoc);
       return EmojiCompat.sInstance;
    }
    public static EmojiCompat reset(EmojiCompat p0){
       Object sInstanceLoc = EmojiCompat.sInstanceLock;
       _monitor_enter(sInstanceLoc);
       EmojiCompat.sInstance = p0;
       _monitor_exit(sInstanceLoc);
       return EmojiCompat.sInstance;
    }
    public String getAssetSignature(){
       h.i(this.isInitialized(), "Not initialized yet");
       return this.mHelper.getAssetSignature();
    }
    public int getEmojiSpanIndicatorColor(){
       return this.mEmojiSpanIndicatorColor;
    }
    public int getLoadState(){
       this.mInitLock.readLock().lock();
       this.mInitLock.readLock().unlock();
       return this.mLoadState;
    }
    public boolean hasEmojiGlyph(CharSequence p0){
       h.i(this.isInitialized(), "Not initialized yet");
       h.h(p0, "sequence cannot be null");
       return this.mHelper.hasEmojiGlyph(p0);
    }
    public boolean hasEmojiGlyph(CharSequence p0,int p1){
       h.i(this.isInitialized(), "Not initialized yet");
       h.h(p0, "sequence cannot be null");
       return this.mHelper.hasEmojiGlyph(p0, p1);
    }
    public boolean isEmojiSpanIndicatorEnabled(){
       return this.mEmojiSpanIndicatorEnabled;
    }
    public final boolean isInitialized(){
       boolean b = true;
       if (this.getLoadState() == b) {
       }else {
          b = false;
       }
       return b;
    }
    public void load(){
       boolean b = true;
       if (this.mMetadataLoadStrategy == b) {
       }else {
          b = false;
       }
       h.i(b, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
       if (this.isInitialized()) {
          return;
       }else {
          this.mInitLock.writeLock().lock();
          if (this.mLoadState == null) {
             this.mInitLock.writeLock().unlock();
             return;
          }else {
             this.mLoadState = 0;
             this.mInitLock.writeLock().unlock();
             this.mHelper.loadMetadata();
             return;
          }
       }
    }
    public final void loadMetadata(){
       this.mInitLock.writeLock().lock();
       if (this.mMetadataLoadStrategy == null) {
          this.mLoadState = 0;
       }
       this.mInitLock.writeLock().unlock();
       if (!this.getLoadState()) {
          this.mHelper.loadMetadata();
       }
       return;
    }
    public void onMetadataLoadFailed(Throwable p0){
       ArrayList uArrayList = new ArrayList();
       this.mInitLock.writeLock().lock();
       this.mLoadState = 2;
       uArrayList.addAll(this.mInitCallbacks);
       this.mInitCallbacks.clear();
       this.mInitLock.writeLock().unlock();
       this.mMainHandler.post(new EmojiCompat$ListenerDispatcher(uArrayList, this.mLoadState, p0));
    }
    public void onMetadataLoadSuccess(){
       ArrayList uArrayList = new ArrayList();
       this.mInitLock.writeLock().lock();
       this.mLoadState = 1;
       uArrayList.addAll(this.mInitCallbacks);
       this.mInitCallbacks.clear();
       this.mInitLock.writeLock().unlock();
       this.mMainHandler.post(new EmojiCompat$ListenerDispatcher(uArrayList, this.mLoadState));
    }
    public CharSequence process(CharSequence p0){
       int i = (p0 == null)? 0: p0.length();
       return this.process(p0, 0, i);
    }
    public CharSequence process(CharSequence p0,int p1,int p2){
       return this.process(p0, p1, p2, Integer.MAX_VALUE);
    }
    public CharSequence process(CharSequence p0,int p1,int p2,int p3){
       return this.process(p0, p1, p2, p3, 0);
    }
    public CharSequence process(CharSequence p0,int p1,int p2,int p3,int p4){
       EmojiCompat uEmojiCompat;
       h.i(this.isInitialized(), "Not initialized yet");
       h.e(p1, "start cannot be negative");
       h.e(p2, "end cannot be negative");
       h.e(p3, "maxEmojiCount cannot be negative");
       int i = 1;
       boolean b = (p1 <= p2)? true: false;
       h.b(b, "start should be <= than end");
       if (p0 == null) {
          return p0;
       }else if(p1 <= p0.length()){
          b = true;
       }else {
          b = false;
       }
       h.b(b, "start should be < than charSequence length");
       b = (p2 <= p0.length())? true: false;
       h.b(b, "end should be < than charSequence length");
       if (p0.length() && p1 != p2) {
          if (p4 != i) {
             uEmojiCompat = (p4 != 2)? this.mReplaceAll: false;
          }else {
             uEmojiCompat = true;
          }
          p0 = this.mHelper.process(p0, p1, p2, p3, uEmojiCompat);
       }
       return p0;
    }
    public void registerInitCallback(EmojiCompat$InitCallback p0){
       h.h(p0, "initCallback cannot be null");
       this.mInitLock.writeLock().lock();
       EmojiCompat tmLoadState = this.mLoadState;
       if (tmLoadState == 1 || tmLoadState == 2) {
          this.mMainHandler.post(new EmojiCompat$ListenerDispatcher(p0, tmLoadState));
       }else {
          this.mInitCallbacks.add(p0);
       }
       this.mInitLock.writeLock().unlock();
       return;
    }
    public void setGlyphChecker(EmojiProcessor$GlyphChecker p0){
       this.mHelper.setGlyphChecker(p0);
    }
    public void unregisterInitCallback(EmojiCompat$InitCallback p0){
       h.h(p0, "initCallback cannot be null");
       this.mInitLock.writeLock().lock();
       this.mInitCallbacks.remove(p0);
       this.mInitLock.writeLock().unlock();
    }
    public void updateEditorInfoAttrs(EditorInfo p0){
       if (this.isInitialized() && (p0 != null && p0.extras != null)) {
          this.mHelper.updateEditorInfoAttrs(p0);
       }
    label_0011 :
       return;
    }
}
