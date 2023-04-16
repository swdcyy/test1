package g99.w;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.ToolbarStyle;
import java.lang.Object;
import java.lang.Float;
import com.yxcorp.gifshow.detail.nonslide.toolbar.ImmersiveStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LiveData;
import g99.w$a;
import java.lang.Enum;

public class w extends ViewModel	// class@002455
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final MutableLiveData c;

    public void w(){
       super();
       this.a = new MutableLiveData(ToolbarStyle.SCROLL_SENSITIVE);
       this.b = new MutableLiveData(Float.valueOf(0x3f800000));
       this.c = new MutableLiveData(ImmersiveStatus.DISABLED);
    }
    public void o0(){
       if (PatchProxy.applyVoid(null, this, w.class, "4")) {
          return;
       }
       this.c.setValue(ImmersiveStatus.DISABLED);
       return;
    }
    public void p0(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "3")) {
          return;
       }
       ow = this.c;
       ImmersiveStatus dARK_TEXT = (p0)? ImmersiveStatus.DARK_TEXT: ImmersiveStatus.LIGHT_TEXT;
       ow.setValue(dARK_TEXT);
       return;
    }
    public boolean q0(){
       ImmersiveStatus obj = PatchProxy.apply(null, this, w.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c.getValue();
       if (obj == null || w$a.a[obj.ordinal()] != 1) {
          return false;
       }
       return true;
    }
    public boolean r0(){
       Object obj = PatchProxy.apply(null, this, w.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c.getValue() != ImmersiveStatus.DISABLED)? true: false;
       return b;
    }
    public LiveData s0(){
       return this.b;
    }
    public void t0(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "7")) {
          return;
       }
       if (this.r0()) {
          ow = this.c;
          ImmersiveStatus dARK_TEXT = (p0)? ImmersiveStatus.DARK_TEXT: ImmersiveStatus.LIGHT_TEXT;
          ow.setValue(dARK_TEXT);
       }
       return;
    }
    public void u0(float p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ow, "2")) {
          return;
       }
       this.b.setValue(Float.valueOf(p0));
       return;
    }
}
