package com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$a;
import java.lang.Object;
import nsd.u;
import ilc.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialPanelBaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import fm5.a;
import y8a.c;

public final class SerialEpisodePanelFragment$a	// class@0019ec
{

    public void SerialEpisodePanelFragment$a(){
       super();
    }
    public void SerialEpisodePanelFragment$a(u p0){
       super();
    }
    public final SerialEpisodePanelFragment a(a p0,PhotoDetailParam p1,c p2,boolean p3){
       SerialEpisodePanelFragment obj;
       c a;
       if (PatchProxy.isSupport(SerialEpisodePanelFragment$a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, SerialEpisodePanelFragment$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       obj = new SerialEpisodePanelFragment();
       obj.L = p0;
       a uoa = obj.Hh();
       if (uoa != null) {
          QPhoto qPhoto = uoa.w0();
          if (qPhoto != null) {
             obj.x1 = qPhoto;
             StandardSerialInfo standardSeri = a.t(qPhoto);
             obj.y1 = standardSeri;
             a = c.a;
             obj.J = a.b(standardSeri);
             obj.Rh(a.a(obj.y1));
          }
       }
       obj.i1 = p1;
       obj.j1 = p2;
       obj.A1 = p3;
       p0 = p0.k;
       if (p0 == null) {
          String str = "";
       }
       obj.s1 = p0;
       return obj;
    }
}
