package com.yxcorp.gifshow.music.cloudmusic.billboard.BillboardMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mob.h;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import mob.d;
import s2b.a;
import s2b.d;
import qvb.i;
import y8c.g;
import mob.c;
import com.yxcorp.gifshow.music.cloudmusic.billboard.BillboardMusicFragment$a;

public class BillboardMusicFragment extends RecyclerFragment	// class@001ff0
{
    public int F;
    public int G;

    public void BillboardMusicFragment(){
       super();
    }
    public int M(){
       return 4;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BillboardMusicFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, BillboardMusicFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(BillboardMusicFragment.class, new h());
       }else {
          obj.put(BillboardMusicFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 50;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BillboardMusicFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.F = this.getArguments().getInt("enter_type", 0);
       this.G = this.getArguments().getInt("duration", Integer.MIN_VALUE);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BillboardMusicFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, BillboardMusicFragment.class, "3")) {
          this.C.h(new d(this));
       }
       this.q().invalidate();
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, BillboardMusicFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, BillboardMusicFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BillboardMusicFragment$a(this);
    }
}
