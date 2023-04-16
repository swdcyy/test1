package aq1.j;
import aq1.a;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import zp1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import aq1.j$a;
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

public final class j extends a	// class@00028b
{
    public ViewGroup U;
    public ImageView V;
    public final String W;
    public final b X;
    public final i Y;
    public final l Z;

    public void j(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.W = p0;
       this.X = p1;
       this.Y = p2;
       this.Z = p3;
    }
    public void F3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          return;
       }
       a.p(p0, "viewModel");
       super.F3(p0);
       j tV = this.V;
       if (tV == null) {
          a.S("multiChatCellCloseImageView");
       }
       tV.setOnClickListener(new j$a(this, p0));
       return;
    }
    public Integer G3(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Integer.valueOf(3);
    }
    public void J3(){
    }
    public void V2(a p0){
       this.F3(p0);
    }
    public void f3(m p0){
       this.F3(p0);
    }
    public void x3(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       a.p(p0, "chatCellView");
       super.x3(p0);
       View view = p0.findViewById(R.id.live_multi_chat_cell_top_right_container);
       a.o(view, "chatCellView.findViewByI¡­cell_top_right_container\)");
       this.U = view;
       if (view == null) {
          a.S("topRightContainer");
       }
       view.setVisibility(0);
       p0 = p0.findViewById(R.id.live_chat_video_close_wrapper);
       a.o(p0, "chatCellView.findViewByI¡­chat_video_close_wrapper\)");
       this.V = p0;
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
