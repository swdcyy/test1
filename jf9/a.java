package jf9.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hf9.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.slipmode.ui.AssistantItemFrameLayout;
import android.view.View;
import jf9.a$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import com.kwai.robust.PatchProxyResult;
import y8c.d;

public abstract class a extends PresenterV2	// class@002a78
{
    public d p;
    public IdentifyCircleImageView q;
    public View r;
    public AssistantItemFrameLayout s;
    public final e t;

    public void a(e p0){
       a.p(p0, "adapter");
       super();
       this.t = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       a ts = this.s;
       if (ts == null) {
          a.S("containerLayout");
       }
       ts.setWhiteCircleVisible(true);
       this.m8().setOnClickListener(new a$a(this));
       return;
    }
    public final e P8(){
       return this.t;
    }
    public final IdentifyCircleImageView R8(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("kwaiBindableImageView");
       }
       return obj;
    }
    public final View S8(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("partitionView");
       }
       return obj;
    }
    public final d V8(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("positionGetter");
       }
       return obj;
    }
    public abstract void W8();
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.assistant_item_layout);
       a.o(view, "rootView.findViewById\(R.id.assistant_item_layout\)");
       this.s = view;
       view = p0.findViewById(R.id.identify_circle);
       a.o(view, "rootView.findViewById\(R.id.identify_circle\)");
       this.q = view;
       p0 = p0.findViewById(R.id.partition);
       a.o(p0, "rootView.findViewById\(R.id.partition\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       Object obj = this.r8("ADAPTER_POSITION_GETTER");
       a.o(obj, "inject\(PageAccessIds.ADAPTER_POSITION_GETTER\)");
       this.p = obj;
       return;
    }
}
