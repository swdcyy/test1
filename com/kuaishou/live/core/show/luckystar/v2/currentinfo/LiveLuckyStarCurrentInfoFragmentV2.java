package com.kuaishou.live.core.show.luckystar.v2.currentinfo.LiveLuckyStarCurrentInfoFragmentV2;
import im8.g;
import com.kuaishou.live.core.show.luckystar.v2.LiveLuckyStarBaseDialogFragmentV2;
import lnc.a1;
import com.google.common.base.Optional;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hc2.c;
import java.util.Map;
import java.util.HashMap;
import androidx.fragment.app.KwaiDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.os.Bundle;
import com.kuaishou.live.core.show.luckystar.v2.currentinfo.b;

public class LiveLuckyStarCurrentInfoFragmentV2 extends LiveLuckyStarBaseDialogFragmentV2 implements g	// class@000cfc
{
    public PresenterV2 B;
    public i C;
    public Optional D;
    public static final int E;

    static {
       LiveLuckyStarCurrentInfoFragmentV2.E = a1.e(456.00f);
    }
    public void LiveLuckyStarCurrentInfoFragmentV2(){
       super();
       this.D = Optional.absent();
    }
    public int Lh(){
       return LiveLuckyStarCurrentInfoFragmentV2.E;
    }
    public int Mh(){
       return 0x7f0d04e6;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLuckyStarCurrentInfoFragmentV2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveLuckyStarCurrentInfoFragmentV2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveLuckyStarCurrentInfoFragmentV2.class, new c());
       }else {
          obj.put(LiveLuckyStarCurrentInfoFragmentV2.class, null);
       }
       return obj;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarCurrentInfoFragmentV2.class, "3")) {
          return;
       }
       super.onDestroyView();
       LiveLuckyStarCurrentInfoFragmentV2 tB = this.B;
       if (tB != null) {
          tB.unbind();
          this.B.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLuckyStarCurrentInfoFragmentV2.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.C != null) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.B = presenterV2;
          presenterV2.U7(new b());
          this.B.f(p0);
          Object[] objArray = new Object[]{this.C,this};
          this.B.i(objArray);
       }
       return;
    }
}
