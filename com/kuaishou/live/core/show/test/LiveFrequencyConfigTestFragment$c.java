package com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment;
import java.util.List;
import com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment$b;
import il2.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment$d;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.TextView;
import il2.i;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import lnc.a1;
import android.view.View;

public class LiveFrequencyConfigTestFragment$c extends RecyclerView$Adapter	// class@00118d
{
    public final LiveFrequencyConfigTestFragment$b e;
    public final List f;
    public final LiveFrequencyConfigTestFragment g;

    public void LiveFrequencyConfigTestFragment$c(LiveFrequencyConfigTestFragment p0,List p1,LiveFrequencyConfigTestFragment$b p2,g p3){
       this.g = p0;
       super();
       this.f = p1;
       this.e = p2;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LiveFrequencyConfigTestFragment$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       LiveFrequencyConfigTestFragment$c uoc = LiveFrequencyConfigTestFragment$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          p0.a.setText(this.f.get(p1));
          p0.a.setOnClickListener(new i(this, p1));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveFrequencyConfigTestFragment$d uod;
       LiveFrequencyConfigTestFragment$c uoc = LiveFrequencyConfigTestFragment$c.class;
       if (PatchProxy.isSupport(uoc)) {
          uod = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (uod != PatchProxyResult.class) {
          label_0048 :
             return uod;
          }
       }
       TextView textView = new TextView(p0.getContext());
       textView.setTextSize(1, 16.00f);
       textView.setPadding(0, a1.e(8.00f), 0, a1.e(8.00f));
       textView.setTextColor(a1.a(R.color.arg_RES_7f061f7d));
       uod = new LiveFrequencyConfigTestFragment$d(this.g, textView);
       goto label_0048 ;
    }
}
