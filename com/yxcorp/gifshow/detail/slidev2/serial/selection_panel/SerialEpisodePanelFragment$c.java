package com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$c;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout$b;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import zl5.j;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialPanelBaseFragment;
import zl5.h;
import java.lang.NullPointerException;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.widget.NestedScrollChildRelativeLayout;
import java.util.Objects;
import vsd.n;
import rsd.e;

public final class SerialEpisodePanelFragment$c implements NestedParentRelativeLayout$b	// class@0019ee
{
    public final SerialEpisodePanelFragment a;

    public void SerialEpisodePanelFragment$c(SerialEpisodePanelFragment p0){
       this.a = p0;
       super();
    }
    public final boolean a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SerialEpisodePanelFragment obj = PatchProxy.applyWithListener(objArray, this, SerialEpisodePanelFragment$c.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a.r1;
       if (obj == null) {
          a.S("lm");
       }
       if (!obj.i0()) {
          j oj = this.a.Ih();
          if (oj != null) {
             if (oj.r0()) {
             label_0041 :
                if (!this.a.di().b()) {
                   SerialEpisodePanelFragment$c ta = this.a;
                   Objects.requireNonNull(ta);
                   Object obj1 = PatchProxy.apply(objArray, ta, SerialEpisodePanelFragment.class, "10");
                   if (obj1 != patchProxyRe) {
                   }else {
                      obj1 = ta.c1.a(ta, SerialEpisodePanelFragment.B1[9]);
                   }
                   if (!obj1.b()) {
                      b = true;
                   label_0077 :
                      PatchProxy.onMethodExit(SerialEpisodePanelFragment$c.class, "1");
                      return b;
                   }
                }
             }
          }else {
             PatchProxy.onMethodExit(SerialEpisodePanelFragment$c.class, "1");
             throw new NullPointerException("null cannot be cast to non-null type com.kwai.feature.api.corona.network.SerialPanelPageList");
          }
       }else {
          goto label_0041 ;
       }
       b = false;
       goto label_0077 ;
    }
}
