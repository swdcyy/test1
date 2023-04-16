package com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$f;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;

public final class RecyclerTabWithIndicatorView$f extends RecyclerView$ViewHolder	// class@0018b2
{
    public TextView a;

    public void RecyclerTabWithIndicatorView$f(View p0){
       a.p(p0, "itemView");
       super(p0);
       p0 = p0.findViewById(1);
       a.o(p0, "itemView.findViewById\(TEXT_ID\)");
       this.a = p0;
    }
    public final TextView a(){
       return this.a;
    }
}
