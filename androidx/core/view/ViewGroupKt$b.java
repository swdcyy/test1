package androidx.core.view.ViewGroupKt$b;
import java.util.Iterator;
import osd.d;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import java.lang.IndexOutOfBoundsException;

public final class ViewGroupKt$b implements Iterator, d	// class@00071e
{
    public int b;
    public final ViewGroup c;

    public void ViewGroupKt$b(ViewGroup p0){
       this.c = p0;
       super();
    }
    public View a(){
       ViewGroupKt$b tb = this.b;
       this.b = tb + 1;
       View childAt = this.c.getChildAt(tb);
       if (childAt != null) {
          return childAt;
       }
       throw new IndexOutOfBoundsException();
    }
    public boolean hasNext(){
       boolean b = (this.b < this.c.getChildCount())? true: false;
       return b;
    }
    public Object next(){
       return this.a();
    }
    public void remove(){
       int i = this.b - 1;
       this.b = i;
       this.c.removeViewAt(i);
    }
}
