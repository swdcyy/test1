package b56.c0;
import sc6.d;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.detail.view.ScaleAnimSeekBar;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.AbsSeekBar;
import sc6.d$a;
import java.util.Set;
import java.lang.Boolean;

public class c0 implements d	// class@0003f8
{
    public ScaleAnimSeekBar a;
    public final Set b;

    public void c0(){
       super();
       this.b = new HashSet();
    }
    public void a(int p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc0, "4")) {
          return;
       }
       uoc0 = this.a;
       if (uoc0 != null) {
          uoc0.setSecondaryProgress(p0);
       }
       return;
    }
    public void b(int p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc0, "6")) {
          return;
       }
       uoc0 = this.a;
       if (uoc0 != null) {
          uoc0.setMaxProgress(p0);
       }
       return;
    }
    public void c(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "11")) {
          return;
       }
       c0 ta = this.a;
       if (ta != null) {
          ta.setThumbDrawable(p0);
       }
       return;
    }
    public int d(){
       c0 obj = PatchProxy.apply(null, this, c0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.getSecondaryProgress();
       }
       return 0;
    }
    public int e(){
       c0 obj = PatchProxy.apply(null, this, c0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.getMaxProgress();
       }
       return 0;
    }
    public void f(int p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc0, "10")) {
          return;
       }
       uoc0 = this.a;
       if (uoc0 != null) {
          uoc0.setProgressWidth(p0);
       }
       return;
    }
    public AbsSeekBar g(){
       return null;
    }
    public int getProgress(){
       c0 obj = PatchProxy.apply(null, this, c0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.getProgress();
       }
       return 0;
    }
    public void h(d$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "9")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
    public void i(boolean p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc0, "12")) {
          return;
       }
       uoc0 = this.a;
       if (uoc0 != null) {
          uoc0.setSeekBarStatePressed(p0);
       }
       return;
    }
    public void j(d$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "8")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public void setProgress(int p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc0, "3")) {
          return;
       }
       uoc0 = this.a;
       if (uoc0 != null) {
          uoc0.setProgress(p0);
       }
       return;
    }
}
