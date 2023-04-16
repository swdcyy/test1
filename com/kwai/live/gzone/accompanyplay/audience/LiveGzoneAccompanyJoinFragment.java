package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyJoinFragment;
import com.kwai.live.gzone.accompanyplay.audience.o;
import androidx.fragment.app.Fragment;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kwai.live.gzone.accompanyplay.audience.p0$e;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.audience.i0;
import m37.b;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyJoinFragment$a;

public class LiveGzoneAccompanyJoinFragment extends Fragment implements o	// class@000b58
{
    public PresenterV2 b;
    public LiveGzoneAccompanyTabHostFragment$e c;
    public k0$g d;
    public p0$e e;

    public void LiveGzoneAccompanyJoinFragment(){
       super();
    }
    public void R2(k0$g p0,p0$e p1){
       this.d = p0;
       this.e = p1;
    }
    public void W5(LiveGzoneAccompanyTabHostFragment$e p0){
       this.c = p0;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGzoneAccompanyJoinFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0b61, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyJoinFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       this.b.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAccompanyJoinFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.b = presenterV2;
       presenterV2.U7(new i0());
       this.b.U7(new b());
       this.b.f(p0);
       LiveGzoneAccompanyJoinFragment$a uoa = new LiveGzoneAccompanyJoinFragment$a();
       uoa.b = this.d;
       uoa.c = this.c;
       uoa.e = this.e;
       Object[] objArray = new Object[]{uoa};
       this.b.i(objArray);
       return;
    }
}
