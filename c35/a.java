package c35.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import c35.a$a;
import android.content.Context;
import com.kuaishou.viewbinder.IViewBinder;
import c35.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.os.Bundle;
import java.util.Objects;
import android.view.View$OnClickListener;

public abstract class a extends RecyclerView$Adapter	// class@000408
{
    public g e;
    public h f;
    public final View$OnClickListener g;

    public void a(){
       super();
       this.g = new a$a(this);
    }
    public abstract IViewBinder J0(Context p0,int p1);
    public abstract void K0(b p0,int p1);
    public abstract b L0(View p0,int p1,IViewBinder p2);
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          a.p(p0, "holder");
          this.K0(p0, p1);
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       b uob;
       RecyclerView$ViewHolder itemView;
       String str = "1";
       if (PatchProxy.isSupport(a.class)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, a.class, str);
          if (uob != PatchProxyResult.class) {
          }else {
          label_0019 :
             a.p(p0, "parent");
             Context context = p0.getContext();
             a.o(context, "parent.context");
             IViewBinder iViewBinder = this.J0(context, p1);
             LayoutInflater layoutInflat = LayoutInflater.from(p0.getContext());
             a.o(layoutInflat, "LayoutInflater.from\(parent.context\)");
             View bindedView = iViewBinder.getBindedView(layoutInflat, p0, null);
             uob = this.L0(bindedView, p1, iViewBinder);
             Objects.requireNonNull(uob);
             if (!PatchProxy.applyVoid(null, uob, b.class, str)) {
                itemView = uob.itemView;
                a.o(itemView, "itemView");
                uob.a.bindViews(itemView);
             }
             bindedView.setOnClickListener(this.g);
             if (!PatchProxy.applyVoidOneRefs(bindedView, this, a.class, "2")) {
                a.p(bindedView, "itemView");
             }
          }
       }else {
          goto label_0019 ;
       }
       return uob;
    }
}
