package com.yxcorp.gifshow.relation.select.half.HalfSearchUsersFragment$b;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.relation.select.half.HalfSearchUsersFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.d;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import android.widget.TextView;
import com.yxcorp.gifshow.relation.select.search.SearchUsersFragment;
import lnc.a1;
import java.lang.CharSequence;
import sbc.b;
import android.view.View$OnClickListener;
import com.kwai.library.widget.refresh.RefreshLayout;

public class HalfSearchUsersFragment$b extends f	// class@00199a
{
    public final HalfSearchUsersFragment l;

    public void HalfSearchUsersFragment$b(HalfSearchUsersFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, HalfSearchUsersFragment$b.class, "1")) {
          return;
       }
       this.l.ia().m1(this.l.K);
       this.x();
       View view = a.i(this.a, R.layout.arg_RES_7f0d05aa);
       view.findViewById(R.id.empty_tv).setText(a1.r(R.string.arg_RES_7f100241, this.l.H));
       view.setOnClickListener(new b(this));
       this.a.K(view);
       return;
    }
}
