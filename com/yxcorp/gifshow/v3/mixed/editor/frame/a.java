package com.yxcorp.gifshow.v3.mixed.editor.frame.a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.mixed.editor.frame.b;
import com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.mixed.editor.frame.b$b;
import hwc.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.util.Pair;
import lnc.v6;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class a extends m	// class@00154d
{
    public final MixFrameAdjustInfo c;
    public final b d;

    public void a(b p0,MixFrameAdjustInfo p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.d.g.a(this.c);
       String logInfo = this.c.getLogInfo();
       if (!PatchProxy.applyVoidOneRefs(logInfo, null, c.class, "17")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SELECT_ADJUST_VIDEO_SIZE";
          Pair[] pairArray = new Pair[]{new Pair("adjust_item", logInfo)};
          uElementPack.params = logInfo.a(pairArray);
          c.e(uElementPack);
       }
       this.d.k0();
       return;
    }
}
