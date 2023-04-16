package j02.k;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import xp5.i;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import j02.o;
import android.widget.FrameLayout$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.a1;
import androidx.lifecycle.LiveData;
import k02.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;

public final class k	// class@002a20
{
    public boolean a;
    public LiveAudienceTreasureBoxWidgetView b;
    public o c;
    public long d;
    public final ViewGroup e;
    public final LifecycleOwner f;
    public final i g;
    public final a h;

    public void k(ViewGroup p0,LifecycleOwner p1,i p2,a p3){
       a.p(p0, "containerView");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "liveLogPackageProvider");
       a.p(p3, "isLiteStreamType");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
    }
    public final FrameLayout$LayoutParams a(o p0){
       FrameLayout$LayoutParams obj = PatchProxy.applyOneRefs(p0, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FrameLayout$LayoutParams(-2, -2);
       if (this.h.invoke().booleanValue()) {
          obj.gravity = 51;
          obj.topMargin = a1.d(0x7f070289);
          obj.leftMargin = a1.d(0x7f070271);
       }else if(this.b(p0)){
          obj.gravity = 51;
          obj.topMargin = a1.d(0x7f0702ae);
          obj.leftMargin = a1.d(0x7f070271);
       }else {
          obj.gravity = 85;
          obj.bottomMargin = a1.d(0x7f0702db);
          obj.rightMargin = a1.d(0x7f070271);
       }
       return obj;
    }
    public final boolean b(o p0){
       a obj = PatchProxy.applyOneRefs(p0, this, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.u0().getValue();
       obj = (obj != null)? obj.a: null;
       boolean b = true;
       if (obj == AudienceBizRelation.VOICE_PARTY_VIDEO) {
          a value = p0.u0().getValue();
          if (value != null && value.b == b) {
          label_003a :
             return b;
          }
       }
       b = false;
       goto label_003a ;
    }
    public final void c(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = this.a(p0);
       k tb = this.b;
       if (tb != null) {
          tb.setLayoutParams(layoutParams);
       }
       k tb1 = this.b;
       if (tb1 != null) {
          tb1.setTranslationX(0);
       }
       tb1 = this.b;
       if (tb1 != null) {
          tb1.setTranslationY(0);
       }
       return;
    }
}
