package com.yxcorp.gifshow.detail.player.panel.savetraffic.PhotoSaveTrafficControlFragment$c;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import com.yxcorp.gifshow.detail.player.panel.savetraffic.PhotoSaveTrafficControlFragment;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.player.panel.savetraffic.PhotoSaveTrafficControlFragment$b;
import kotlin.jvm.internal.a;

public final class PhotoSaveTrafficControlFragment$c implements SlipSwitchButton$a	// class@001631
{
    public final PhotoSaveTrafficControlFragment b;

    public void PhotoSaveTrafficControlFragment$c(PhotoSaveTrafficControlFragment p0){
       this.b = p0;
       super();
    }
    public void r(SlipSwitchButton p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport2(PhotoSaveTrafficControlFragment$c.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, PhotoSaveTrafficControlFragment$c.class, "1")) {
          return;
       }
       PhotoSaveTrafficControlFragment$c tb = this.b;
       Objects.requireNonNull(tb);
       PhotoSaveTrafficControlFragment photoSaveTra = PatchProxy.apply(null, tb, PhotoSaveTrafficControlFragment.class, "1");
       if (photoSaveTra != PatchProxyResult.class) {
       }else {
          photoSaveTra = tb.z;
          if (photoSaveTra == null) {
             a.S("onSelListener");
          }
       }
       photoSaveTra.a(p1);
       PatchProxy.onMethodExit(PhotoSaveTrafficControlFragment$c.class, "1");
       return;
    }
}
