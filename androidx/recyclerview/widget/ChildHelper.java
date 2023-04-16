package androidx.recyclerview.widget.ChildHelper;
import androidx.recyclerview.widget.ChildHelper$a;
import java.lang.Object;
import androidx.recyclerview.widget.ChildHelper$Bucket;
import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.RuntimeException;

public class ChildHelper	// class@000868
{
    public final ChildHelper$Bucket mBucket;
    public final ChildHelper$a mCallback;
    public final List mHiddenViews;

    public void ChildHelper(ChildHelper$a p0){
       super();
       this.mCallback = p0;
       this.mBucket = new ChildHelper$Bucket();
       this.mHiddenViews = new ArrayList();
    }
    public void addView(View p0,int p1,boolean p2){
       p1 = (p1 < 0)? this.mCallback.getChildCount(): this.getOffset(p1);
       this.mBucket.insert(p1, p2);
       if (p2) {
          this.hideViewInternal(p0);
       }
       this.mCallback.addView(p0, p1);
       return;
    }
    public void addView(View p0,boolean p1){
       this.addView(p0, -1, p1);
    }
    public void attachViewToParent(View p0,int p1,ViewGroup$LayoutParams p2,boolean p3){
       p1 = (p1 < 0)? this.mCallback.getChildCount(): this.getOffset(p1);
       this.mBucket.insert(p1, p3);
       if (p3) {
          this.hideViewInternal(p0);
       }
       this.mCallback.f(p0, p1, p2);
       return;
    }
    public void detachViewFromParent(int p0){
       p0 = this.getOffset(p0);
       this.mBucket.remove(p0);
       this.mCallback.g(p0);
    }
    public View findHiddenNonRemovedView(int p0){
       View view;
       int i = this.mHiddenViews.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          view = this.mHiddenViews.get(i1);
          RecyclerView$ViewHolder viewHolder = this.mCallback.d(view);
          if (viewHolder.getLayoutPosition() == p0 && (!viewHolder.isInvalid() && !viewHolder.isRemoved())) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return view;
    }
    public View getChildAt(int p0){
       return this.mCallback.getChildAt(this.getOffset(p0));
    }
    public int getChildCount(){
       return (this.mCallback.getChildCount() - this.mHiddenViews.size());
    }
    public final int getOffset(int p0){
       if (p0 < 0) {
          return -1;
       }
       int childCount = this.mCallback.getChildCount();
       int i = p0;
       while (true) {
          if (i >= childCount) {
             return -1;
          }
          int i1 = i - this.mBucket.countOnesBefore(i);
          i1 = p0 - i1;
          if (!i1) {
             while (this.mBucket.get(i)) {
                i = i + 1;
             }
             return i;
          }else {
             i = i + i1;
          }
       }
    }
    public View getUnfilteredChildAt(int p0){
       return this.mCallback.getChildAt(p0);
    }
    public int getUnfilteredChildCount(){
       return this.mCallback.getChildCount();
    }
    public void hide(View p0){
       int i = this.mCallback.h(p0);
       if (i < 0) {
          throw new IllegalArgumentException("view is not a child, cannot hide "+p0);
       }
       this.mBucket.set(i);
       this.hideViewInternal(p0);
       return;
    }
    public final void hideViewInternal(View p0){
       this.mHiddenViews.add(p0);
       this.mCallback.e(p0);
    }
    public int indexOfChild(View p0){
       int i = this.mCallback.h(p0);
       int i1 = -1;
       if (i == i1) {
          return i1;
       }
       if (this.mBucket.get(i)) {
          return i1;
       }
       return (i - this.mBucket.countOnesBefore(i));
    }
    public boolean isHidden(View p0){
       return this.mHiddenViews.contains(p0);
    }
    public void removeAllViewsUnfiltered(){
       this.mBucket.reset();
       for (int i = this.mHiddenViews.size() - 1; i >= 0; i = i - 1) {
          this.mCallback.i(this.mHiddenViews.get(i));
          this.mHiddenViews.remove(i);
       }
       this.mCallback.removeAllViews();
       return;
    }
    public void removeView(View p0){
       int i = this.mCallback.h(p0);
       if (i < 0) {
          return;
       }
       if (this.mBucket.remove(i)) {
          this.unhideViewInternal(p0);
       }
       this.mCallback.removeViewAt(i);
       return;
    }
    public void removeViewAt(int p0){
       p0 = this.getOffset(p0);
       View childAt = this.mCallback.getChildAt(p0);
       if (childAt == null) {
          return;
       }
       if (this.mBucket.remove(p0)) {
          this.unhideViewInternal(childAt);
       }
       this.mCallback.removeViewAt(p0);
       return;
    }
    public boolean removeViewIfHidden(View p0){
       int i = this.mCallback.h(p0);
       if (i == -1) {
          this.unhideViewInternal(p0);
          return true;
       }else if(this.mBucket.get(i)){
          this.mBucket.remove(i);
          this.unhideViewInternal(p0);
          this.mCallback.removeViewAt(i);
          return true;
       }else {
          return false;
       }
    }
    public String toString(){
       return this.mBucket.toString()+", hidden list:"+this.mHiddenViews.size();
    }
    public void unhide(View p0){
       int i = this.mCallback.h(p0);
       if (i < 0) {
          throw new IllegalArgumentException("view is not a child, cannot hide "+p0);
       }
       if (!this.mBucket.get(i)) {
          throw new RuntimeException("trying to unhide a view that was not hidden"+p0);
       }
       this.mBucket.clear(i);
       this.unhideViewInternal(p0);
       return;
    }
    public final boolean unhideViewInternal(View p0){
       if (!this.mHiddenViews.remove(p0)) {
          return false;
       }
       this.mCallback.i(p0);
       return true;
    }
}
