package a88.d;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.mini.codescan.CodeScanActivity;
import java.lang.Object;
import android.widget.CompoundButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.mini.codescan.view.BaseQRCodeView;
import com.yxcorp.utility.Log;
import com.mini.codescan.view.CameraPreview;
import c88.c;
import android.hardware.Camera;
import android.widget.TextView;

public class d implements CompoundButton$OnCheckedChangeListener	// class@00004b
{
    public final CodeScanActivity b;

    public void d(CodeScanActivity p0){
       this.b = p0;
       super();
    }
    public void onCheckedChanged(CompoundButton p0,boolean p1){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, d.class, "1")) {
          return;
       }
       if (p1) {
          CodeScanActivity i = this.b.i;
          Objects.requireNonNull(i);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, i, BaseQRCodeView.class, "16")) {
             Log.d("KBAR_QRCodeView", "openFlashlight");
             p1 = true;
             i.n = p1;
             BaseQRCodeView c = i.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoid(objArray, c, CameraPreview.class, "8") && c.a()) {
                CameraPreview g = c.g;
                CameraPreview b = c.b;
                Objects.requireNonNull(g);
                if (!PatchProxy.applyVoidOneRefs(b, g, c.class, "11")) {
                   g.b(b, p1);
                }
             }
          }
          this.b.k.setText(R.string.arg_RES_7f1035ed);
       }else {
          this.b.i.o();
          this.b.k.setText(R.string.arg_RES_7f1035ee);
       }
       return;
    }
}
