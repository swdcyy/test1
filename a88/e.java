package a88.e;
import com.mini.codescan.view.BaseQRCodeView$f;
import com.mini.codescan.CodeScanActivity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.CheckBox;
import android.widget.TextView;
import com.kwai.sdk.kbar.qrdetection.DecodeRet;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$DecodeStatus;
import java.lang.CharSequence;
import android.text.TextUtils;

public class e implements BaseQRCodeView$f	// class@00004c
{
    public final View a;
    public final CodeScanActivity b;

    public void e(CodeScanActivity p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "3")) {
          return;
       }
       uoe = this.a;
       int i = 0;
       int i1 = (p0)? 0: 8;
       uoe.setVisibility(i1);
       CodeScanActivity j = this.b.j;
       i1 = (p0)? 0: 8;
       j.setVisibility(i1);
       j = this.b.k;
       if (!p0) {
          i = 8;
       }
       j.setVisibility(i);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.b.finish();
       return;
    }
    public void c(DecodeRet[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       if (p0 != null && p0.length > 0) {
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (oobject != null && (oobject.getDecodeStatus() == DecodeRet$DecodeStatus.DECODE_SUCCESS && !TextUtils.isEmpty(oobject.getUrl()))) {
                p0.l = oobject.getUrl();
                break ;
             }
             i = i + 1;
          }
       }
       this.b.finish();
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e tb = this.b;
       tb.l = p0;
       tb.finish();
       return;
    }
}
