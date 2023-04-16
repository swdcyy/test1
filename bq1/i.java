package bq1.i;
import bq1.j;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import zp1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController;
import androidx.lifecycle.LiveData;
import zp1.m;
import bq1.i$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import bq1.i$b;
import android.view.View$OnClickListener;
import yh3.a;
import android.view.View;
import android.view.ViewGroup;
import lnc.a1;
import d61.j0;

public final class i extends j	// class@0003ec
{
    public ViewGroup S;
    public ImageView T;
    public final String U;
    public final b V;
    public final i W;
    public final l X;

    public void i(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.U = p0;
       this.V = p1;
       this.W = p2;
       this.X = p3;
    }
    public static final ImageView O3(i p0){
       p0 = p0.T;
       if (p0 == null) {
          a.S("multiChatCellCloseImageView");
       }
       return p0;
    }
    public void F3(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       a.p(p0, "viewModel");
       super.F3(p0);
       p0.z0().observe(this, new i$a(this));
       i tT = this.T;
       if (tT == null) {
          a.S("multiChatCellCloseImageView");
       }
       tT.setOnClickListener(new i$b(this, p0));
       return;
    }
    public int I3(){
       return 3;
    }
    public void V2(a p0){
       this.F3(p0);
    }
    public void f3(m p0){
       this.F3(p0);
    }
    public void x3(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       a.p(p0, "chatCellView");
       super.x3(p0);
       View view = p0.findViewById(R.id.live_multi_chat_cell_top_right_container);
       a.o(view, "chatCellView.findViewByI¡­cell_top_right_container\)");
       this.S = view;
       if (view == null) {
          a.S("topRightContainer");
       }
       view.setVisibility(0);
       p0 = p0.findViewById(R.id.live_chat_video_close_wrapper);
       a.o(p0, "chatCellView.findViewByI¡­chat_video_close_wrapper\)");
       this.T = p0;
       String str = "multiChatCellCloseImageView";
       if (p0 == null) {
          a.S(str);
       }
       p0.setVisibility(8);
       i tT = this.T;
       if (tT == null) {
          a.S(str);
       }
       j0.b(tT, a1.e(10.00f));
       return;
    }
    public boolean y3(){
       return false;
    }
}
