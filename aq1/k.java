package aq1.k;
import aq1.l;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import zp1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import aq1.g;
import aq1.k$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import yh3.a;
import zp1.m;
import android.view.View;
import android.view.ViewGroup;
import lnc.a1;
import d61.j0;

public final class k extends l	// class@00028e
{
    public ViewGroup Q;
    public ImageView R;
    public final String S;
    public final b T;
    public final i U;
    public final l V;

    public void k(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.S = p0;
       this.T = p1;
       this.U = p2;
       this.V = p3;
    }
    public void F3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       a.p(p0, "viewModel");
       super.F3(p0);
       k tR = this.R;
       if (tR == null) {
          a.S("multiChatCellCloseImageView");
       }
       tR.setOnClickListener(new k$a(this, p0));
       return;
    }
    public Integer G3(){
       Object obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Integer.valueOf(3);
    }
    public void V2(a p0){
       this.F3(p0);
    }
    public void f3(m p0){
       this.F3(p0);
    }
    public void x3(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       a.p(p0, "chatCellView");
       View view = p0.findViewById(R.id.live_multi_chat_cell_top_right_container);
       a.o(view, "chatCellView.findViewByI¡­cell_top_right_container\)");
       this.Q = view;
       if (view == null) {
          a.S("topRightContainer");
       }
       view.setVisibility(0);
       p0 = p0.findViewById(R.id.live_chat_video_close_wrapper);
       a.o(p0, "chatCellView.findViewByI¡­chat_video_close_wrapper\)");
       this.R = p0;
       if (p0 == null) {
          a.S("multiChatCellCloseImageView");
       }
       j0.b(p0, a1.e(10.00f));
       return;
    }
    public boolean y3(){
       return false;
    }
}
