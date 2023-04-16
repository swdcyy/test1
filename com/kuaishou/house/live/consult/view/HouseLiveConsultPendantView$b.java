package com.kuaishou.house.live.consult.view.HouseLiveConsultPendantView$b;
import ug0.d$a;
import com.kuaishou.house.live.consult.view.HouseLiveConsultPendantView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.house.live.consult.view.HouseLiveConsultPendantView$a;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage;
import kotlin.jvm.internal.a;
import ug0.d;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;

public final class HouseLiveConsultPendantView$b implements d$a	// class@000779
{
    public final HouseLiveConsultPendantView a;

    public void HouseLiveConsultPendantView$b(HouseLiveConsultPendantView p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, HouseLiveConsultPendantView$b.class, "4")) {
          return;
       }
       HouseLiveConsultPendantView e = this.a.e;
       if (e != null) {
          e.a();
       }
       return;
    }
    public void b(HouseConsultPendantMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveConsultPendantView$b.class, "2")) {
          return;
       }
       a.p(p0, "viewModel");
       HouseLiveConsultPendantView e = this.a.e;
       if (e != null) {
          e.b(p0);
       }
       return;
    }
    public void c(HouseConsultPendantMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveConsultPendantView$b.class, "3")) {
          return;
       }
       a.p(p0, "viewModel");
       HouseLiveConsultPendantView e = this.a.e;
       if (e != null) {
          e.b(p0);
       }
       return;
    }
    public void d(d p0){
       ViewGroup$MarginLayoutParams marginLayout;
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveConsultPendantView$b.class, "1")) {
          return;
       }
       HouseLiveConsultPendantView$b ta = this.a;
       View contentView = (p0 != null)? p0.getContentView(): null;
       ta.b = contentView;
       HouseLiveConsultPendantView b = this.a.b;
       if (b != null) {
          if (p0 != null) {
             marginLayout = p0.b();
             if (marginLayout != null) {
             label_002c :
                this.a.removeAllViews();
                this.a.addView(b, marginLayout);
                HouseLiveConsultPendantView$b ta1 = this.a;
                b = ta1.e;
                if (b != null) {
                   b.c(ta1);
                }
             }
          }
          marginLayout = new ViewGroup$MarginLayoutParams(-2, -2);
          goto label_002c ;
       }
       return;
    }
}
