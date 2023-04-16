package com.kwai.feature.component.searchhistory.d$b;
import com.kwai.feature.component.searchhistory.a$c;
import com.kwai.feature.component.searchhistory.d;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kwai.feature.component.searchhistory.SearchHistoryData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.component.searchhistory.d$b$a;
import com.kwai.feature.component.searchhistory.a$d;
import com.yxcorp.utility.n;

public class d$b implements a$c	// class@0012a4
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView$ViewHolder p0,SearchHistoryData p1,int p2){
       if (PatchProxy.isSupport(d$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, d$b.class, "2")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       TextView textView = p0.itemView.findViewById(R.id.group_name);
       p1 = p1.mHeaderId;
       if (p1 == 1) {
          textView.setText(R.string.arg_RES_7f1031c7);
       }else if(p1 == 2){
          textView.setText(R.string.arg_RES_7f1014fc);
       }
       return;
    }
    public RecyclerView$ViewHolder d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d$b$a(this, n.H(p0, this.a.C.a()));
    }
}
