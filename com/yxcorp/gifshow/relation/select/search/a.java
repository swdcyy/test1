package com.yxcorp.gifshow.relation.select.search.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.select.search.SearchBarFragment$a;
import java.lang.Object;
import wbc.c;
import android.view.View$OnClickListener;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import android.widget.EditText;
import android.widget.ImageView;

public final class a implements Runnable	// class@0019c0
{
    public final SearchBarFragment$a b;

    public void a(SearchBarFragment$a p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       tb.q.setOnClickListener(new c(tb));
       tb.u.setVisibility(0);
       tb.r.setText("");
       tb.r.setHint("");
       tb.r.setVisibility(8);
       tb.s.setVisibility(8);
       tb.t.setVisibility(8);
       tb.p.setVisibility(8);
    }
}
