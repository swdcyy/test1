package com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.DetailAtmosphereViewBinder$mTimerCallback$2$a;
import gi4.a;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.DetailAtmosphereViewBinder$mTimerCallback$2;
import java.lang.Object;
import com.kuaishou.merchant.transaction.detail.self.uitimer.UiTimerInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.DetailAtmosphereViewBinder;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import com.kuaishou.ksmvvm.command.KSCommand;
import android.widget.TextView;

public final class DetailAtmosphereViewBinder$mTimerCallback$2$a implements a	// class@000762
{
    public final DetailAtmosphereViewBinder$mTimerCallback$2 a;

    public void DetailAtmosphereViewBinder$mTimerCallback$2$a(DetailAtmosphereViewBinder$mTimerCallback$2 p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,UiTimerInfo p1){
       if (PatchProxy.isSupport(DetailAtmosphereViewBinder$mTimerCallback$2$a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, DetailAtmosphereViewBinder$mTimerCallback$2$a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return false;
    }
    public void b(String p0){
       PatchProxy.applyVoidOneRefs(p0, this, DetailAtmosphereViewBinder$mTimerCallback$2$a.class, "4");
    }
    public void c(){
       PatchProxy.applyVoid(null, this, DetailAtmosphereViewBinder$mTimerCallback$2$a.class, "3");
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, DetailAtmosphereViewBinder$mTimerCallback$2$a.class, "1")) {
          return;
       }
       DetailAtmosphereViewBinder x = this.a.this$0.x;
       if (x == null) {
          a.S("mDetailViewModel");
       }
       x.z.a();
       return;
    }
    public void onError(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailAtmosphereViewBinder$mTimerCallback$2$a.class, "2")) {
          return;
       }
       DetailAtmosphereViewBinder z = this.a.this$0.z;
       if (z == null) {
          a.S("mDescTextView");
       }
       z.setVisibility(8);
       return;
    }
}
