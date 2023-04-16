package androidx.recyclerview.widget.SafeRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import j27.a;

public class SafeRecyclerView extends RecyclerView	// class@0008a9
{
    public boolean b;

    public void SafeRecyclerView(Context p0){
       super(p0);
    }
    public void SafeRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SafeRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void removeDetachedView(View p0,boolean p1){
       if (this.b == null) {
          super.removeDetachedView(p0, p1);
          return;
       }else {
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
          if (childViewHol != null && (!childViewHol.isTmpDetached() && !childViewHol.shouldIgnore())) {
             a.a(new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached."+childViewHol+this.exceptionLabel()));
             return;
          }else {
             super.removeDetachedView(p0, p1);
             return;
          }
       }
    }
    public void setIngoreTmpDetachedFlag(boolean p0){
       this.b = p0;
    }
}
