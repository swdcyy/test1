package androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class RecyclerView$LayoutParams extends ViewGroup$MarginLayoutParams	// class@000883
{
    public final Rect mDecorInsets;
    public boolean mInsetsDirty;
    public boolean mPendingInvalidate;
    public RecyclerView$ViewHolder mViewHolder;

    public void RecyclerView$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.mDecorInsets = new Rect();
       this.mInsetsDirty = true;
       this.mPendingInvalidate = false;
    }
    public void RecyclerView$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.mDecorInsets = new Rect();
       this.mInsetsDirty = true;
       this.mPendingInvalidate = false;
    }
    public void RecyclerView$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.mDecorInsets = new Rect();
       this.mInsetsDirty = true;
       this.mPendingInvalidate = false;
    }
    public void RecyclerView$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.mDecorInsets = new Rect();
       this.mInsetsDirty = true;
       this.mPendingInvalidate = false;
    }
    public void RecyclerView$LayoutParams(RecyclerView$LayoutParams p0){
       super(p0);
       this.mDecorInsets = new Rect();
       this.mInsetsDirty = true;
       this.mPendingInvalidate = false;
    }
    public int getAbsoluteAdapterPosition(){
       return this.mViewHolder.getAbsoluteAdapterPosition();
    }
    public int getBindingAdapterPosition(){
       return this.mViewHolder.getBindingAdapterPosition();
    }
    public int getViewAdapterPosition(){
       return this.mViewHolder.getBindingAdapterPosition();
    }
    public int getViewLayoutPosition(){
       return this.mViewHolder.getLayoutPosition();
    }
    public int getViewPosition(){
       return this.mViewHolder.getPosition();
    }
    public boolean isItemChanged(){
       return this.mViewHolder.isUpdated();
    }
    public boolean isItemRemoved(){
       return this.mViewHolder.isRemoved();
    }
    public boolean isViewInvalid(){
       return this.mViewHolder.isInvalid();
    }
    public boolean viewNeedsUpdate(){
       return this.mViewHolder.needsUpdate();
    }
}
