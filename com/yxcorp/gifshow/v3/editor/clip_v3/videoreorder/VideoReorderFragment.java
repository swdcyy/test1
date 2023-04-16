package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.VideoReorderFragment;
import hka.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import ei0.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import faa.a;
import q87.c;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ipc.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.VideoReorderFragment$b;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderPanelCloseAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Number;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import ag6.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.VideoReorderFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import mpc.c;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import opc.f;

public class VideoReorderFragment extends BaseFragment implements a	// class@000dfb
{
    public c j;
    public View k;
    public ArrayList l;
    public VideoReorderFragment$b m;
    public VideoSDKPlayerView n;
    public f o;
    public f p;

    public void VideoReorderFragment(){
       super();
       this.l = new ArrayList();
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, VideoReorderFragment.class, "6")) {
          return;
       }
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       return;
    }
    public void dh(){
       if (PatchProxy.applyVoid(null, this, VideoReorderFragment.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("videoReorderFragment", "hideFragment", objArray);
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          e uoe = activity.getSupportFragmentManager().beginTransaction();
          uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
          uoe.s(this).m();
       }
       return;
    }
    public boolean onBackPressed(){
       VideoReorderFragment obj = PatchProxy.apply(null, this, VideoReorderFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("videoReorderFragment", "onBackPressed", objArray);
       if (!this.isVisible()) {
          return 0;
       }
       this.dh();
       obj = this.m;
       if (obj != null) {
          obj.a(new a(0, 0));
       }
       this.j.t0(new ReorderPanelCloseAction(0));
       return true;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VideoReorderFragment.class, "2");
       if (p2 != patchProxyRe) {
          return p2;
       }
       p2 = PatchProxy.apply(null, this, VideoReorderFragment.class, "3");
       if (p2 != patchProxyRe) {
          i = p2.intValue();
       }else if(PostExperimentUtils.U()){
          i = 0x7f0d051f;
       }else {
          i = 0x7f0d051e;
       }
       View view = a.c(p0, i, p1, false);
       this.k = view;
       return view;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(VideoReorderFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoReorderFragment.class, "5")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, VideoReorderFragment.class, "7")) {
             Iterator iterator = this.l.iterator();
             while (iterator.hasNext()) {
                iterator.next().C();
             }
             if (this.getActivity() instanceof GifshowActivity) {
                this.getActivity().l3(this);
             }
          }
       }else {
          this.ch();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoReorderFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.j = ViewModelProviders.of(this, new VideoReorderFragment$a(this)).get(c.class);
       b uob = new b(this, p0, this.j, this.m, this.n, this.o);
       this.l.add(v7);
       this.ch();
       return;
    }
}
