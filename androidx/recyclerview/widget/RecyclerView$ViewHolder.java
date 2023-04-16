package androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import java.util.Collections;
import android.view.View;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.ArrayList;
import a2.i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.StringBuilder;
import androidx.recyclerview.widget.RecyclerView$t;
import java.lang.Class;
import java.lang.Integer;

public abstract class RecyclerView$ViewHolder	// class@000887
{
    public final View itemView;
    public RecyclerView$Adapter mBindingAdapter;
    public int mFlags;
    public boolean mInChangeScrap;
    public int mIsRecyclableCount;
    public long mItemId;
    public int mItemViewType;
    public WeakReference mNestedRecyclerView;
    public int mOldPosition;
    public RecyclerView mOwnerRecyclerView;
    public List mPayloads;
    public int mPendingAccessibilityState;
    public int mPosition;
    public int mPreLayoutPosition;
    public RecyclerView$t mScrapContainer;
    public RecyclerView$ViewHolder mShadowedHolder;
    public RecyclerView$ViewHolder mShadowingHolder;
    public List mUnmodifiedPayloads;
    public int mWasImportantForAccessibilityBeforeHidden;
    public static final List FULLUPDATE_PAYLOADS;

    static {
       RecyclerView$ViewHolder.FULLUPDATE_PAYLOADS = Collections.emptyList();
    }
    public void RecyclerView$ViewHolder(View p0){
       super();
       int i = -1;
       this.mPosition = i;
       this.mOldPosition = i;
       this.mItemId = -1;
       this.mItemViewType = i;
       this.mPreLayoutPosition = i;
       this.mShadowedHolder = null;
       this.mShadowingHolder = null;
       this.mPayloads = null;
       this.mUnmodifiedPayloads = null;
       this.mIsRecyclableCount = 0;
       this.mScrapContainer = null;
       this.mInChangeScrap = false;
       this.mWasImportantForAccessibilityBeforeHidden = 0;
       this.mPendingAccessibilityState = i;
       if (p0 == null) {
          throw new IllegalArgumentException("itemView may not be null");
       }
       this.itemView = p0;
       return;
    }
    public void addChangePayload(Object p0){
       int i = 1024;
       if (p0 == null) {
          this.addFlags(i);
       }else if(!(i & this.mFlags)){
          this.createPayloadsIfNeeded();
          this.mPayloads.add(p0);
       }
       return;
    }
    public void addFlags(int p0){
       this.mFlags = p0 | this.mFlags;
    }
    public void clearOldPosition(){
       this.mOldPosition = -1;
       this.mPreLayoutPosition = -1;
    }
    public void clearPayload(){
       RecyclerView$ViewHolder tmPayloads = this.mPayloads;
       if (tmPayloads != null) {
          tmPayloads.clear();
       }
       this.mFlags = this.mFlags & 0xfbff;
       return;
    }
    public void clearReturnedFromScrapFlag(){
       this.mFlags = this.mFlags & 0xdf;
    }
    public void clearTmpDetachFlag(){
       this.mFlags = this.mFlags & 0xfeff;
    }
    public final void createPayloadsIfNeeded(){
       if (this.mPayloads == null) {
          ArrayList uArrayList = new ArrayList();
          this.mPayloads = uArrayList;
          this.mUnmodifiedPayloads = Collections.unmodifiableList(uArrayList);
       }
       return;
    }
    public boolean doesTransientStatePreventRecycling(){
       boolean b = (!(this.mFlags & 0x10) && i0.V(this.itemView))? true: false;
       return b;
    }
    public void flagRemovedAndOffsetPosition(int p0,int p1,boolean p2){
       this.addFlags(8);
       this.offsetPosition(p1, p2);
       this.mPosition = p0;
    }
    public final int getAbsoluteAdapterPosition(){
       RecyclerView$ViewHolder tmOwnerRecyc = this.mOwnerRecyclerView;
       if (tmOwnerRecyc == null) {
          return -1;
       }
       return tmOwnerRecyc.getAdapterPositionInRecyclerView(this);
    }
    public final int getAdapterPosition(){
       return this.getBindingAdapterPosition();
    }
    public final RecyclerView$Adapter getBindingAdapter(){
       return this.mBindingAdapter;
    }
    public final int getBindingAdapterPosition(){
       int i = -1;
       if (this.mBindingAdapter == null) {
          return i;
       }
       RecyclerView$ViewHolder tmOwnerRecyc = this.mOwnerRecyclerView;
       if (tmOwnerRecyc == null) {
          return i;
       }
       RecyclerView$Adapter adapter = tmOwnerRecyc.getAdapter();
       if (adapter == null) {
          return i;
       }
       int adapterPosit = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this);
       if (adapterPosit == i) {
          return i;
       }
       return adapter.c0(this.mBindingAdapter, this, adapterPosit);
    }
    public final long getItemId(){
       return this.mItemId;
    }
    public final int getItemViewType(){
       return this.mItemViewType;
    }
    public final int getLayoutPosition(){
       RecyclerView$ViewHolder tmPreLayoutP = this.mPreLayoutPosition;
       if (tmPreLayoutP == -1) {
          tmPreLayoutP = this.mPosition;
       }
       return tmPreLayoutP;
    }
    public final int getOldPosition(){
       return this.mOldPosition;
    }
    public final int getPosition(){
       RecyclerView$ViewHolder tmPreLayoutP = this.mPreLayoutPosition;
       if (tmPreLayoutP == -1) {
          tmPreLayoutP = this.mPosition;
       }
       return tmPreLayoutP;
    }
    public List getUnmodifiedPayloads(){
       if (this.mFlags & 0x0400) {
          return RecyclerView$ViewHolder.FULLUPDATE_PAYLOADS;
       }
       RecyclerView$ViewHolder tmPayloads = this.mPayloads;
       if (tmPayloads == null || !tmPayloads.size()) {
          return RecyclerView$ViewHolder.FULLUPDATE_PAYLOADS;
       }
       return this.mUnmodifiedPayloads;
    }
    public boolean hasAnyOfTheFlags(int p0){
       boolean b = (p0 & this.mFlags)? true: false;
       return b;
    }
    public boolean isAdapterPositionUnknown(){
       boolean b = ((this.mFlags & 0x0200) || this.isInvalid())? true: false;
       return b;
    }
    public boolean isAttachedToTransitionOverlay(){
       boolean b = (this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView)? true: false;
       return b;
    }
    public boolean isBound(){
       int i = 1;
       if (this.mFlags & i) {
       }else {
          i = false;
       }
       return i;
    }
    public boolean isInvalid(){
       boolean b = (this.mFlags & 0x04)? true: false;
       return b;
    }
    public final boolean isRecyclable(){
       boolean b = (!(this.mFlags & 0x10) && !i0.V(this.itemView))? true: false;
       return b;
    }
    public boolean isRemoved(){
       boolean b = (this.mFlags & 0x08)? true: false;
       return b;
    }
    public boolean isScrap(){
       boolean b = (this.mScrapContainer != null)? true: false;
       return b;
    }
    public boolean isTmpDetached(){
       boolean b = (this.mFlags & 0x0100)? true: false;
       return b;
    }
    public boolean isUpdated(){
       boolean b = (this.mFlags & 0x02)? true: false;
       return b;
    }
    public boolean needsUpdate(){
       boolean b = (this.mFlags & 0x02)? true: false;
       return b;
    }
    public void offsetPosition(int p0,boolean p1){
       if (this.mOldPosition == -1) {
          this.mOldPosition = this.mPosition;
       }
       if (this.mPreLayoutPosition == -1) {
          this.mPreLayoutPosition = this.mPosition;
       }
       if (p1) {
          this.mPreLayoutPosition = this.mPreLayoutPosition + p0;
       }
       this.mPosition = this.mPosition + p0;
       if (this.itemView.getLayoutParams() != null) {
          p0.mInsetsDirty = true;
       }
       return;
    }
    public void onEnteredHiddenState(RecyclerView p0){
       RecyclerView$ViewHolder tmPendingAcc = this.mPendingAccessibilityState;
       this.mWasImportantForAccessibilityBeforeHidden = (tmPendingAcc != -1)? tmPendingAcc: i0.z(this.itemView);
       p0.setChildImportantForAccessibilityInternal(this, 4);
       return;
    }
    public void onLeftHiddenState(RecyclerView p0){
       p0.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
       this.mWasImportantForAccessibilityBeforeHidden = 0;
    }
    public void resetInternal(){
       this.mFlags = 0;
       this.mPosition = -1;
       this.mOldPosition = -1;
       this.mItemId = -1;
       this.mPreLayoutPosition = -1;
       this.mIsRecyclableCount = 0;
       this.mShadowedHolder = null;
       this.mShadowingHolder = null;
       this.clearPayload();
       this.mWasImportantForAccessibilityBeforeHidden = 0;
       this.mPendingAccessibilityState = -1;
       RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }
    public void saveOldPosition(){
       if (this.mOldPosition == -1) {
          this.mOldPosition = this.mPosition;
       }
       return;
    }
    public void setFlags(int p0,int p1){
       this.mFlags = (p0 & p1) | (this.mFlags & (~ p1));
    }
    public final void setIsRecyclable(boolean p0){
       int i = 1;
       RecyclerView$ViewHolder tmIsRecyclab = this.mIsRecyclableCount;
       int i1 = (p0)? tmIsRecyclab - i: tmIsRecyclab + i;
       this.mIsRecyclableCount = i1;
       if (i1 < 0) {
          this.mIsRecyclableCount = 0;
          "isRecyclable decremented below 0: unmatched pair of setIsRecyable\(\) calls for "+this;
       }else if(!p0 && i1 == i){
          this.mFlags = this.mFlags | 0x10;
       }else if(p0 && !i1){
          this.mFlags = this.mFlags & 0xef;
       }
       return;
    }
    public void setScrapContainer(RecyclerView$t p0,boolean p1){
       this.mScrapContainer = p0;
       this.mInChangeScrap = p1;
    }
    public boolean shouldBeKeptAsChild(){
       boolean b = (this.mFlags & 0x10)? true: false;
       return b;
    }
    public boolean shouldIgnore(){
       boolean b = (this.mFlags & 0x0080)? true: false;
       return b;
    }
    public void stopIgnoring(){
       this.mFlags = this.mFlags & 0xff7f;
    }
    public String toString(){
       String str = (this.getClass().isAnonymousClass())? "ViewHolder": this.getClass().getSimpleName();
       StringBuilder str1 = str+"{"+Integer.toHexString(this.hashCode())+" position="+this.mPosition+" id="+this.mItemId+", oldPos="+this.mOldPosition+", pLpos:"+this.mPreLayoutPosition;
       if (this.isScrap()) {
          str1 = str1+" scrap ";
          str = (this.mInChangeScrap != null)? "[changeScrap]": "[attachedScrap]";
          str1 = str1+str;
       }
       if (this.isInvalid()) {
          str1 = str1+" invalid";
       }
       if (!this.isBound()) {
          str1 = str1+" unbound";
       }
       if (this.needsUpdate()) {
          str1 = str1+" update";
       }
       if (this.isRemoved()) {
          str1 = str1+" removed";
       }
       if (this.shouldIgnore()) {
          str1 = str1+" ignored";
       }
       if (this.isTmpDetached()) {
          str1 = str1+" tmpDetached";
       }
       if (!this.isRecyclable()) {
          str1 = str1+" not recyclable\("+this.mIsRecyclableCount+"\)";
       }
       if (this.isAdapterPositionUnknown()) {
          str1 = str1+" undefined adapter position";
       }
       if (this.itemView.getParent() == null) {
          str1 = str1+" no parent";
       }
       return str1+"}";
    }
    public void unScrap(){
       this.mScrapContainer.J(this);
    }
    public boolean wasReturnedFromScrap(){
       boolean b = (this.mFlags & 0x20)? true: false;
       return b;
    }
}
