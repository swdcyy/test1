package com.yxcorp.gifshow.photo.download.utils.a;
import com.yxcorp.gifshow.fragment.ProgressFragment$a;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import android.view.View$OnClickListener;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import kxb.e;
import kxb.d;

public final class a implements ProgressFragment$a	// class@000f21
{
    public final ProgressFragment a;
    public final QPhoto b;
    public final String c;
    public final int d;
    public final boolean e;
    public final View$OnClickListener f;

    public void a(ProgressFragment p0,QPhoto p1,String p2,int p3,boolean p4,View$OnClickListener p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final void a(){
       a ta = this.a;
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       ta.Lh();
       ta.sh();
       e.g(tb.mEntity, tc, td, te, true);
       d uod = new d(tb, tc, td, te, this.f);
       ta.Bh(v7);
    }
}
