package com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragmentWrapper;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import i2b.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public class LocalMusicFragmentWrapper extends BaseFragment	// class@002028
{
    public final LocalMusicFragment j;

    public void LocalMusicFragmentWrapper(){
       super();
       this.j = new LocalMusicFragment();
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, LocalMusicFragmentWrapper.class, "4")) {
          return;
       }
       LocalMusicFragmentWrapper tj = this.j;
       if (tj != null) {
          tj.c0();
       }
       return;
    }
    public LocalMusicFragment ch(){
       return this.j;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalMusicFragmentWrapper.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0.U = this;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LocalMusicFragmentWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.g("LocalMusicFragmentWrapp", "onCreateView inflater:"+p0+" container:"+p1+" savedInstanceState:"+p2);
       View view = a.g(p0, R.layout.arg_RES_7f0d1016, p1, false);
       LocalMusicFragmentWrapper tj = this.j;
       if (tj != null) {
          tj.setArguments(this.getArguments());
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.v(R.id.music_local_container, this.j);
          uoe.m();
       }
       return view;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, LocalMusicFragmentWrapper.class, "3")) {
          return;
       }
       LocalMusicFragmentWrapper tj = this.j;
       if (tj != null) {
          tj.u();
       }
       return;
    }
}
