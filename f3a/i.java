package f3a.i;
import com.yxcorp.gifshow.fragment.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.view.View;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;
import android.content.Context;
import i2b.a;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import g9c.d;
import f3a.i$a;
import android.view.View$OnClickListener;

public final class i extends e	// class@002284
{
    public View i;
    public ViewGroup j;

    public void i(RecyclerFragment p0){
       super(p0);
    }
    public void d(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "2")) {
          return;
       }
       this.j();
       e tf = this.f;
       if (tf != null) {
          tf.setVisibility(0);
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, i.class, "8")) {
          return;
       }
       i ti = this.i;
       if (ti != null) {
          ti.setVisibility(8);
       }
       return;
    }
    public void k(boolean p0,Throwable p1){
       e uoe;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oi, "7")) {
          return;
       }
       a.p(p1, "error");
       if (p1 instanceof KwaiException) {
          String message = p1.getMessage();
          uoe = (message == null || !message.length())? 1: null;
          if (!uoe) {
             String message1 = p1.getMessage();
             a.m(message1);
             i.d(R.style.arg_RES_7f11066a, message1);
             return;
          }
       }
       uoe = this.f;
       if (uoe != null) {
          uoe.setVisibility(8);
       }
       i ti = this.i;
       if (ti != null) {
          ti.setVisibility(0);
       }
       return;
    }
    public void u(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       a.p(p0, "context");
       ViewGroup viewGroup = a.a(p0, R.layout.arg_RES_7f0d10e1);
       this.j = viewGroup;
       this.c.Q0(viewGroup, new ViewGroup$MarginLayoutParams(-1, -1));
       i tj = this.j;
       View view = null;
       KwaiLoadingView kwaiLoadingV = (tj != null)? tj.findViewById(R.id.loading_tips): view;
       this.f = kwaiLoadingV;
       tj = this.j;
       if (tj != null) {
          view = tj.findViewById(R.id.error_tips);
       }
       this.i = view;
       if (view != null) {
          view.setOnClickListener(new i$a(this));
       }
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       e tf = this.f;
       if (tf != null) {
          tf.setVisibility(8);
       }
       return;
    }
}
