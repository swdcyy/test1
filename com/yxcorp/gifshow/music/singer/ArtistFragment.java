package com.yxcorp.gifshow.music.singer.ArtistFragment;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import com.yxcorp.gifshow.music.util.RealTimeLogger;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.music.singer.ArtistFragment$a;
import s2b.a;
import s2b.d;
import y8c.g;
import hqb.a;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import qvb.i;
import com.yxcorp.gifshow.music.singer.ArtistFragment$b;
import java.util.Objects;
import hqb.b;
import qvb.n0;

public class ArtistFragment extends CloudMusicRecyclerFragment	// class@002079
{
    public String Q;
    public b R;
    public RealTimeLogger S;

    public void ArtistFragment(){
       super();
       this.S = new RealTimeLogger(0);
    }
    public int M(){
       return 4;
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, ArtistFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ClientContent$ContentPackage();
    }
    public int getLayoutResId(){
       return 0x7f0d0ff0;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ArtistFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ArtistFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 52;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ArtistFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.Q = this.getArguments().getString("artist_name");
       this.H = 9999;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ArtistFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.C.h(new ArtistFragment$a(this));
       this.S.a(this);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ArtistFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.Hh());
    }
    public i yh(){
       ArtistFragment$b obj = PatchProxy.apply(null, this, ArtistFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArtistFragment$b(this, this.I);
       this.R = obj;
       ArtistFragment tQ = this.Q;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(tQ, obj, b.class, "1")) {
          obj.q = tQ;
          obj.invalidate();
       }
       return this.R;
    }
}
