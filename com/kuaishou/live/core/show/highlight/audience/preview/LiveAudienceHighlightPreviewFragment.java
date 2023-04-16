package com.kuaishou.live.core.show.highlight.audience.preview.LiveAudienceHighlightPreviewFragment;
import im8.g;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import java.util.HashSet;
import com.kuaishou.live.core.show.highlight.audience.preview.LiveAudienceHighlightPreviewFragment$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import v92.e;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.util.Iterator;
import java.util.Set;
import androidx.fragment.app.c$b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.DialogFragment;
import v92.a;
import x92.p;
import x92.d;
import x92.g;
import x92.w;
import y92.e;
import w92.e;

public class LiveAudienceHighlightPreviewFragment extends LiveSafeDialogFragment implements g	// class@000be6
{
    public PresenterV2 s;
    public LiveAudienceHighlightVideoInfo t;
    public Set u;
    public a0 v;
    public b w;
    public static final int x;

    public void LiveAudienceHighlightPreviewFragment(){
       super();
       this.u = new HashSet();
       this.w = new LiveAudienceHighlightPreviewFragment$a(this);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceHighlightPreviewFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceHighlightPreviewFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceHighlightPreviewFragment.class, new e());
       }else {
          obj.put(LiveAudienceHighlightPreviewFragment.class, null);
       }
       return obj;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceHighlightPreviewFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().setBackgroundDrawableResource(0x106000d);
       uDialog.getWindow().requestFeature(1);
       uDialog.getWindow().setDimAmount(0);
       uDialog.getWindow().setGravity(80);
       uDialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103bf);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceHighlightPreviewFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0a15, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceHighlightPreviewFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          c$b uob = iterator.next();
          if (uob != null) {
             uob.n(this.getFragmentManager(), this);
          }
       }
       LiveAudienceHighlightPreviewFragment ts = this.s;
       if (ts != null) {
          ts.unbind();
          this.s.destroy();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceHighlightPreviewFragment.class, "6")) {
          return;
       }
       super.onPause();
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          c$b uob = iterator.next();
          if (uob != null) {
             uob.f(this.getFragmentManager(), this);
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceHighlightPreviewFragment.class, "5")) {
          return;
       }
       super.onResume();
       if (this.getDialog() != null && this.getDialog().getWindow() != null) {
          this.getDialog().getWindow().setLayout(-1, -2);
       }
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          c$b uob = iterator.next();
          if (uob != null) {
             uob.i(this.getFragmentManager(), this);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceHighlightPreviewFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, LiveAudienceHighlightPreviewFragment.class, "8")) {
          a uoa = new a();
          uoa.a = this.t;
          PresenterV2 presenterV2 = new PresenterV2();
          this.s = presenterV2;
          presenterV2.U7(new p());
          this.s.U7(new d());
          this.s.U7(new g());
          this.s.U7(new w());
          this.s.U7(new e());
          this.s.U7(new e());
          this.s.f(this.getView());
          Object[] objArray = new Object[]{this,uoa};
          this.s.i(objArray);
       }
       return;
    }
}
