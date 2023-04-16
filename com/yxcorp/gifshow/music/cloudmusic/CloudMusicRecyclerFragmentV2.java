package com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s2b.d;
import java.util.Map;
import android.os.Bundle;
import yob.d;
import lob.p;
import erd.g;
import com.trello.rxlifecycle3.components.support.RxFragment;
import crd.b;
import eoc.f;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2$a;
import androidx.recyclerview.widget.RecyclerView$r;

public abstract class CloudMusicRecyclerFragmentV2 extends CloudMusicRecyclerFragment	// class@001fe0
{
    public KwaiImageView Q;
    public View R;
    public int S;
    public static final int T;

    static {
       CloudMusicRecyclerFragmentV2.T = a1.e(20.00f);
    }
    public void CloudMusicRecyclerFragmentV2(){
       super();
       this.S = 0;
    }
    public RecyclerView$n Lh(){
       Object obj = PatchProxy.apply(null, this, CloudMusicRecyclerFragmentV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CloudMusicRecyclerFragmentV2$b(this);
    }
    public void Nh(){
       if (PatchProxy.applyVoid(null, this, CloudMusicRecyclerFragmentV2.class, "5")) {
          return;
       }
       this.C.e();
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CloudMusicRecyclerFragmentV2.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(CloudMusicRecyclerFragmentV2.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CloudMusicRecyclerFragmentV2.class, "1")) {
          return;
       }
       super.onCreate(p0);
       f.b(d.class, new p(this), this);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CloudMusicRecyclerFragmentV2.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.h0().setVerticalScrollBarEnabled(false);
       p0 = p0.findViewById(R.id.divider_line);
       this.R = p0;
       p0.setVisibility(false);
       this.R.setAlpha(0);
       this.h0().addOnScrollListener(new CloudMusicRecyclerFragmentV2$a(this));
       return;
    }
}
