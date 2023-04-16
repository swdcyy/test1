package com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import ml8.d;
import com.yxcorp.gifshow.music.cloudmusic.common.TabMusicFragment;
import tkd.b;
import tkd.d;
import kob.i;
import voc.a0;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragmentWrapper;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment$c;
import jqb.j;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import kob.n;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.util.rx.RxBus;
import yob.b;
import android.view.View;
import java.util.List;
import y8c.q;
import b9c.u;
import java.util.ArrayList;
import java.util.Collection;
import bpb.f;
import java.util.Map;
import android.os.Bundle;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment$a;
import s2b.a;
import s2b.d;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.app.Activity;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import bpb.b;
import com.yxcorp.gifshow.music.cloudmusic.local.a;
import erd.g;
import crd.b;
import y8c.g;
import bpb.a;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import qvb.i;
import com.yxcorp.gifshow.music.cloudmusic.local.d;

public class LocalMusicFragment extends TabMusicFragment implements d	// class@002027
{
    public BaseFragment U;
    public final a0 V;
    public String W;
    public static final int X;

    public void LocalMusicFragment(){
       super();
       this.V = d.a(0x2be267d).Af();
    }
    public t Bh(){
       LocalMusicFragment$c uoc;
       LocalMusicFragment$b obj = PatchProxy.apply(null, this, LocalMusicFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.U instanceof LocalMusicFragmentWrapper)? new LocalMusicFragment$b(this, this): new LocalMusicFragment$c(this, this);
       obj.u((float)j.g);
       return obj;
    }
    public void Ph(){
       if (PatchProxy.applyVoid(null, this, LocalMusicFragment.class, "10")) {
          return;
       }
       d.a(0x2be267d).O9(this.L.f(), this.getActivity());
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, LocalMusicFragment.class, "3")) {
          return;
       }
       super.c0();
       RxBus.f.b(new b(false));
       return;
    }
    public void doBindView(View p0){
    }
    public List fg(){
       Object obj = PatchProxy.apply(null, this, LocalMusicFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(this.W);
       ArrayList uArrayList1 = new ArrayList(u.a(this));
       uArrayList1.add(this.F);
       uArrayList1.add(uArrayList);
       return uArrayList1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalMusicFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LocalMusicFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LocalMusicFragment.class, new f());
       }else {
          obj.put(LocalMusicFragment.class, null);
       }
       return obj;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalMusicFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.C.h(new LocalMusicFragment$a(this));
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, LocalMusicFragment.class, "2")) {
          return;
       }
       super.u();
       GifshowActivity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       String str = "android.permission.WRITE_EXTERNAL_STORAGE";
       if (PermissionUtils.a(activity, str)) {
          return;
       }
       a.g(activity, str).subscribe(new b(this), a.b);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LocalMusicFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this, this.Hh(), this.V, this.N);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LocalMusicFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(this.H, this.J, this.V);
    }
}
