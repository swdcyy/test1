package com.kuaishou.house.live.consult.view.HouseLiveConsultPendantView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.house.live.consult.view.HouseLiveConsultPendantView$b;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import ug0.d;
import com.kuaishou.house.live.consult.view.HouseLiveConsultPendantView$a;

public final class HouseLiveConsultPendantView extends FrameLayout	// class@00077a
{
    public View b;
    public HouseConsultPendantMessage c;
    public d d;
    public HouseLiveConsultPendantView$a e;
    public final d$a f;
    public HashMap g;

    public void HouseLiveConsultPendantView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.f = new HouseLiveConsultPendantView$b(this);
    }
    public void HouseLiveConsultPendantView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.f = new HouseLiveConsultPendantView$b(this);
    }
    public void HouseLiveConsultPendantView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.f = new HouseLiveConsultPendantView$b(this);
    }
    public final void a(int p0){
       if (PatchProxy.isSupport(HouseLiveConsultPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HouseLiveConsultPendantView.class, "4")) {
          return;
       }
       HouseLiveConsultPendantView td = this.d;
       if (td != null) {
          td.a(p0);
       }
       return;
    }
    public final void setViewStateListener(HouseLiveConsultPendantView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveConsultPendantView.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.e = p0;
       return;
    }
}
