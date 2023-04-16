package com.yxcorp.gifshow.util.i$a;
import androidx.recyclerview.widget.RecyclerView$i;
import com.yxcorp.gifshow.util.i;
import lnc.w0;
import java.lang.Runnable;
import android.view.ViewGroup;

public class i$a extends RecyclerView$i	// class@001f80
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void g(){
       this.a.b.post(new w0(this));
    }
}
