package jx9.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import y8c.g;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.d;
import qvb.i;
import al9.a;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import com.kwai.library.slide.base.log.SlidePlayLogger;

public class a	// class@002b7f
{
    public final RecyclerFragment a;
    public final QPhoto b;
    public int c;

    public void a(RecyclerFragment p0,QPhoto p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(){
       int i1;
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       PhotoDetailLogger photoDetailL = this.b();
       if (photoDetailL == null) {
          return;
       }
       if (!photoDetailL.hasStartLog()) {
          return;
       }
       if (this.c == null) {
          photoDetailL.exitStayForComments();
          a tb = this.b;
          if (tb != null && tb.isImageType()) {
             photoDetailL.exitPlayerOutOfSightByScroll();
          }
       }
       if (this.a.g7() != null && this.a.g7().getItemCount()) {
          int i = this.a.h0().getLayoutManager().i0();
          try{
             i1 = 0;
             i1 = this.a.h0().getLayoutManager().c();
          }catch(java.lang.Exception e0){
          }
          if (this.a.h0().getAdapter() instanceof d) {
             d adapter = this.a.h0().getAdapter();
             if (i1 >= adapter.b1()) {
                e0.enterStayForComments();
             }else {
                e0.exitStayForComments();
             }
             if (this.a.q() instanceof a) {
                a uoa = this.a.q();
                if (uoa.y() && i1 >= (adapter.b1() + uoa.G())) {
                   e0.enterStayForHiddenComments();
                }else {
                   e0.exitStayForHiddenComments();
                }
             }
             a tb1 = this.b;
             if (tb1 != null && tb1.isImageType()) {
                if (i >= adapter.b1()) {
                   e0.enterPlayerOutOfSightByScroll();
                }else {
                   e0.exitPlayerOutOfSightByScroll();
                }
             }
          }
       }
    label_00cf :
       return;
    }
    public final PhotoDetailLogger b(){
       SlidePlayLogger obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.getContext() instanceof PhotoDetailActivity) {
          obj = this.a.getContext().u3();
          if (obj instanceof PhotoDetailLogger) {
             return obj;
          }
       }
       return null;
    }
}
