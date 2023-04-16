package com.yxcorp.gifshow.homepage.krn.b$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;

public class b$a extends RecyclerView$ViewHolder	// class@001766
{
    public TextView a;
    public KwaiImageView b;

    public void b$a(View p0,boolean p1){
       super(p0);
       if (p1) {
          return;
       }
       this.a = p0.findViewById(0x7f0a3720);
       this.b = p0.findViewById(0x7f0a3721);
       return;
    }
}
