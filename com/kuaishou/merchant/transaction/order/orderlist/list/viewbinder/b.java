package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.b;
import rk0.b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kl4.m;
import com.kuaishou.ksmvvm.command.KSCommand;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.textview.KwaiMarqueeTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.b$a;
import com.yxcorp.gifshow.widget.m;

public class b extends b	// class@0008a2
{
    public m s;
    public View t;
    public KwaiMarqueeTextView u;
    public KwaiImageView v;

    public void b(Fragment p0){
       super(p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.J0(this.s.j.h, new a(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.s = ViewModelProviders.of(this.P8()).get(m.class);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a2f1b);
       this.u = m1.f(p0, 0x7f0a2f1d);
       this.v = m1.f(p0, 0x7f0a2f1c);
       m1.b(p0, new b$a(this), R.id.order_list_announcement_view);
       return;
    }
}
