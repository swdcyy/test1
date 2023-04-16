package com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.KuaiShanSegmentPicEditFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import grc.f;
import java.util.HashMap;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.model.KeyFrameTransform;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;

public final class KuaiShanSegmentPicEditFragment extends BaseFragment	// class@001018
{
    public View j;
    public f k;
    public HashMap l;

    public void KuaiShanSegmentPicEditFragment(){
       super(null, null, null, null, 15, null);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KuaiShanSegmentPicEditFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d04d5, p1, false);
       a.o(view, "KwaiLayoutInflater\n     ¡­c_edit, container, false\)");
       this.j = view;
       if (view == null) {
          a.S("mRootView");
       }
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KuaiShanSegmentPicEditFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       KuaiShanSegmentPicEditFragment tk = this.k;
       if (tk != null) {
          tk.C();
       }
       if (!PatchProxy.applyVoid(null, this, KuaiShanSegmentPicEditFragment.class, "7")) {
          tk = this.l;
          if (tk != null) {
             tk.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KuaiShanSegmentPicEditFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       p1 = this.getArguments();
       String str = null;
       Serializable serializable = (p1 != null)? SerializableHook.getSerializable(p1, "intent_key_qmedia"): str;
       if (!serializable instanceof QMedia) {
          serializable = str;
       }
       Bundle arguments = this.getArguments();
       Serializable serializable1 = (arguments != null)? SerializableHook.getSerializable(arguments, "intent_key_transform"): str;
       if (serializable1 instanceof KeyFrameTransform) {
          str = serializable1;
       }
       if (serializable == null || str == null) {
          PostUtils.D("KuaiShanSegmentPicEditFragment", "media param is null", new IllegalArgumentException("media param is null"));
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             activity.finish();
          }
          return;
       }else if(PatchProxy.applyVoidThreeRefs(serializable, str, p0, this, KuaiShanSegmentPicEditFragment.class, "4")){
          f uof = new f(this, serializable, str, p0);
          this.k = uof;
          uof.B();
       }
       return;
    }
}
