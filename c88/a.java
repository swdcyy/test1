package c88.a;
import java.util.TimerTask;
import com.mini.codescan.view.BaseQRCodeView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.mini.codescan.view.CameraPreview;
import android.view.View;

public class a extends TimerTask	// class@0003bf
{
    public final BaseQRCodeView b;

    public void a(BaseQRCodeView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       BaseQRCodeView c = this.b.c;
       if (c != null && c.d()) {
          a tb = this.b;
          tb.c.b((float)(tb.d.getLeft() + (this.b.d.getWidth() / 2)), (float)(this.b.d.getTop() + (this.b.d.getHeight() / 2)), this.b.d.getWidth(), this.b.d.getHeight());
       }
       return;
    }
}
