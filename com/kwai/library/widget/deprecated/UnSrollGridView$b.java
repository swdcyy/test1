package com.kwai.library.widget.deprecated.UnSrollGridView$b;
import java.lang.Runnable;
import com.kwai.library.widget.deprecated.UnSrollGridView;
import java.lang.Object;
import com.kwai.library.widget.deprecated.UnSrollGridView$a;

public final class UnSrollGridView$b implements Runnable	// class@000920
{
    public int b;
    public final UnSrollGridView c;

    public void UnSrollGridView$b(UnSrollGridView p0){
       this.c = p0;
       super();
    }
    public void UnSrollGridView$b(UnSrollGridView p0,UnSrollGridView$a p1){
       super(p0);
    }
    public void run(){
       this.c.b(this.b);
    }
}
