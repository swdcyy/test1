package com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordPreviewFragment;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ij2.d0;
import java.util.Map;
import java.util.HashMap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.screenrecord.j;

public class LiveAudienceScreenRecordPreviewFragment extends BaseFragment implements g	// class@000fd9
{
    public PresenterV2 j;
    public File k;
    public long l;
    public LiveAudienceScreenRecordContainerFragment$c m;
    public a0 n;
    public m o;
    public static final int p;

    public void LiveAudienceScreenRecordPreviewFragment(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceScreenRecordPreviewFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceScreenRecordPreviewFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceScreenRecordPreviewFragment.class, new d0());
       }else {
          obj.put(LiveAudienceScreenRecordPreviewFragment.class, null);
       }
       return obj;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceScreenRecordPreviewFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = (y.d(this.getActivity()))? 0x7f0d0a48: 0x7f0d0a46;
       return a.g(p0, i, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceScreenRecordPreviewFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       LiveAudienceScreenRecordPreviewFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
          this.j = null;
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceScreenRecordPreviewFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       LiveAudienceScreenRecordPreviewFragment tj = this.j;
       if (tj != null) {
          tj.unbind();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceScreenRecordPreviewFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, LiveAudienceScreenRecordPreviewFragment.class, "4");
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new j());
          presenterV2.f(this.getView());
          Object[] objArray = new Object[]{this};
          presenterV2.i(objArray);
          PatchProxy.onMethodExit(LiveAudienceScreenRecordPreviewFragment.class, "4");
       }
       this.j = presenterV2;
       return;
    }
}
