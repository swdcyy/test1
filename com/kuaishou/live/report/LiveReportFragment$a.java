package com.kuaishou.live.report.LiveReportFragment$a;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;

public class LiveReportFragment$a extends d	// class@000f4f
{

    public void LiveReportFragment$a(RecyclerView$Adapter p0){
       super(p0);
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       LiveReportFragment$a uoa = LiveReportFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       super.v0(p0, p1);
       if (!p1) {
          if (p1 == (this.getItemCount() - 1)) {
             p0.itemView.setBackgroundResource(R.drawable.arg_RES_7f08145d);
          }else {
             p0.itemView.setBackgroundResource(R.drawable.arg_RES_7f08145e);
          }
       }else if(p1 == (this.getItemCount() - 2)){
          p0.itemView.setBackgroundResource(R.drawable.arg_RES_7f08145b);
       }else if(p1 != (this.getItemCount() - 1)){
          p0.itemView.setBackgroundResource(R.drawable.arg_RES_7f08145c);
       }
       return;
    }
}
