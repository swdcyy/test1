package djc.e1$b;
import java.lang.Runnable;
import java.lang.Object;
import djc.e1;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment;
import com.kwai.sharelib.model.PainterModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import ap7.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.model.PosterConfig;
import android.app.Activity;
import ap7.a$a;
import android.content.Context;
import com.yxcorp.utility.n;
import com.google.gson.JsonObject;
import djc.g1;
import java.lang.Throwable;
import djc.c1;

public final class e1$b implements Runnable	// class@0021e3
{
    public final Object b;
    public final e1 c;
    public final Ref$ObjectRef d;
    public final ImmerseSharePanelFragment e;
    public final PainterModel f;

    public void e1$b(Object p0,e1 p1,Ref$ObjectRef p2,ImmerseSharePanelFragment p3,PainterModel p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       RecyclerView$ViewHolder itemView;
       String str = "itemView";
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, e1$b.class, "1")) {
          return;
       }
       ViewGroup viewGroup = this.c.itemView.findViewById(R.id.poster_root_container);
       viewGroup.removeAllViews();
       FragmentActivity activity = this.e.getActivity();
       a.m(activity);
       a.o(activity, "fragment.activity!!");
       a.o(viewGroup, "this");
       itemView = this.c.itemView;
       a.o(itemView, str);
       int measuredHeig = itemView.getMeasuredHeight();
       itemView = this.c.itemView;
       a.o(itemView, str);
       int measuredWidt = itemView.getMeasuredWidth();
       this.d.element = a$a.a(this.b, activity, new PosterConfig(), this.f, viewGroup, measuredHeig, measuredWidt, false, 64, null);
       viewGroup.addView(this.d.element);
       Ref$ObjectRef element = this.d.element;
       if (element != null) {
          viewGroup = element.findViewById(R.id.poster_content_layout);
          if (viewGroup != null) {
             objArray = viewGroup;
          }else {
          label_007d :
             element = this.d.element;
             if (element != null) {
                objArray = element.findViewById(0x7f0a3752);
             }
          }
       }else {
          goto label_007d ;
       }
       if (objArray != null) {
          RecyclerView$ViewHolder itemView1 = this.c.itemView;
          a.o(itemView1, str);
          RecyclerView$ViewHolder itemView2 = this.c.itemView;
          a.o(itemView2, str);
          objArray.setPadding(n.c(itemView1.getContext(), 18.00f), 0, n.c(itemView2.getContext(), 18.00f), 0);
       }
       PatchProxy.onMethodExit(e1$b.class, "1");
       return;
    }
}
