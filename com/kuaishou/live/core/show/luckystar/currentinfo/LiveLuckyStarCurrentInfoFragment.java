package com.kuaishou.live.core.show.luckystar.currentinfo.LiveLuckyStarCurrentInfoFragment;
import im8.g;
import com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarBaseDialogFragment;
import com.google.common.base.Optional;
import ac2.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ac2.e;
import java.util.Map;
import java.util.HashMap;
import androidx.fragment.app.KwaiDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.os.Bundle;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;

public class LiveLuckyStarCurrentInfoFragment extends LiveLuckyStarBaseDialogFragment implements g	// class@000cc0
{
    public PresenterV2 s;
    public i t;
    public Optional u;
    public Runnable v;
    public static final int w;

    public void LiveLuckyStarCurrentInfoFragment(){
       super();
       this.u = Optional.absent();
       this.v = new a(this);
    }
    public int getLayoutResId(){
       return 0x7f0d0c7b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLuckyStarCurrentInfoFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveLuckyStarCurrentInfoFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveLuckyStarCurrentInfoFragment.class, new e());
       }else {
          obj.put(LiveLuckyStarCurrentInfoFragment.class, null);
       }
       return obj;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarCurrentInfoFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.s.unbind();
       this.s.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLuckyStarCurrentInfoFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.s = presenterV2;
       presenterV2.U7(new c());
       this.s.f(p0);
       Object[] objArray = new Object[]{this.t,this};
       this.s.i(objArray);
       return;
    }
    public View th(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLuckyStarCurrentInfoFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a2116);
    }
}
