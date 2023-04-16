package bc9.c0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bc9.c0$a;
import nsd.u;
import bc9.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.slipmode.ui.AssistantItemFrameLayout;
import android.view.View;
import bc9.c0$b;
import android.view.View$OnClickListener;
import y8c.d;
import android.widget.ImageView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import g9c.a;
import ac9.g;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;

public abstract class c0 extends PresenterV2	// class@0003df
{
    public d p;
    public IdentifyCircleImageView q;
    public View r;
    public AssistantItemFrameLayout s;
    public ImageView t;
    public final k u;
    public static final c0$a v;

    static {
       c0.v = new c0$a(null);
    }
    public void c0(k p0){
       a.p(p0, "adapter");
       super();
       this.u = p0;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c0.class, "11")) {
          return;
       }
       c0 ts = this.s;
       if (ts == null) {
          a.S("containerLayout");
       }
       boolean b = true;
       ts.setWhiteCircleVisible(b);
       this.m8().setOnClickListener(new c0$b(this));
       ts = this.p;
       if (ts == null) {
          a.S("positionGetter");
       }
       int i = ts.get();
       c0 tt = this.t;
       if (tt != null) {
          tt.setVisibility(4);
       }
       if (PostExperimentUtils.V()) {
          tt = this.t;
          if (tt != null) {
             tt.setVisibility(4);
          }
          g og = this.u.N0(i);
          if (og != null) {
             i = og.getReason();
             if (i != b) {
                if (i != 2) {
                   if (i != 3) {
                      ts = this.t;
                      if (ts != null) {
                         ts.setImageDrawable(objArray);
                      }
                   }else {
                      ts = this.t;
                      if (ts != null) {
                         ts.setImageResource(R.drawable.arg_RES_7f081cf9);
                      }
                   }
                }else {
                   ts = this.t;
                   if (ts != null) {
                      ts.setImageResource(R.drawable.arg_RES_7f081cd8);
                   }
                }
             }else {
                ts = this.t;
                if (ts != null) {
                   ts.setImageResource(R.drawable.arg_RES_7f081cfa);
                }
             }
          }
       }else {
          ts = this.t;
          if (ts != null) {
             ts.setVisibility(4);
          }
       }
    label_008d :
       return;
    }
    public final k P8(){
       return this.u;
    }
    public final AssistantItemFrameLayout R8(){
       c0 obj = PatchProxy.apply(null, this, c0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("containerLayout");
       }
       return obj;
    }
    public final IdentifyCircleImageView S8(){
       c0 obj = PatchProxy.apply(null, this, c0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("kwaiBindableImageView");
       }
       return obj;
    }
    public final View V8(){
       c0 obj = PatchProxy.apply(null, this, c0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("partitionView");
       }
       return obj;
    }
    public final d W8(){
       c0 obj = PatchProxy.apply(null, this, c0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("positionGetter");
       }
       return obj;
    }
    public abstract void X8();
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "10")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.assistant_item_layout);
       a.o(view, "rootView.findViewById\(R.id.assistant_item_layout\)");
       this.s = view;
       view = p0.findViewById(R.id.identify_circle);
       a.o(view, "rootView.findViewById\(R.id.identify_circle\)");
       this.q = view;
       view = p0.findViewById(R.id.partition);
       a.o(view, "rootView.findViewById\(R.id.partition\)");
       this.r = view;
       this.t = p0.findViewById(0x7f0a3433);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "9")) {
          return;
       }
       Object obj = this.r8("ADAPTER_POSITION_GETTER");
       a.o(obj, "inject\(PageAccessIds.ADAPTER_POSITION_GETTER\)");
       this.p = obj;
       return;
    }
}
