package com.kwai.live.gzone.promotion.LiveGzonePromotionGameRecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.content.Context;
import s67.e;
import java.util.List;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Iterator;
import t67.a;
import fq5.b;
import lnc.a1;
import com.kwai.framework.model.feed.BaseFeed;
import s67.i1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import y8c.g;
import s67.b;
import qvb.i;
import com.kwai.live.gzone.promotion.LiveGzonePromotionGameRecyclerFragment$a;

public class LiveGzonePromotionGameRecyclerFragment extends RecyclerFragment	// class@000dae
{
    public final Context F;
    public e G;
    public List H;
    public boolean I;
    public boolean J;

    public void LiveGzonePromotionGameRecyclerFragment(Context p0,e p1,List p2){
       super();
       this.G = p1;
       this.F = p0;
       this.H = p2;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGzonePromotionGameRecyclerFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.eh(p0.cloneInContext(this.F), p1, p2);
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzonePromotionGameRecyclerFragment.class, "2")) {
          return;
       }
       super.fh(p0, p1);
       p0.setBackgroundResource(R.color.arg_RES_7f06008c);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzonePromotionGameRecyclerFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveGzonePromotionGameRecyclerFragment.class, null);
       return objectsByTag;
    }
    public boolean i0(){
       return this.J;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveGzonePromotionGameRecyclerFragment.class, "7")) {
          return;
       }
       super.onDestroy();
       this.h0().setAdapter(null);
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzonePromotionGameRecyclerFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.h0().setAdapter(objArray);
       if (!PatchProxy.applyVoid(objArray, this, LiveGzonePromotionGameRecyclerFragment.class, "9")) {
          LiveGzonePromotionGameRecyclerFragment tH = this.H;
          if (tH != null && !tH.isEmpty()) {
             Iterator iterator = this.H.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                if (uoa != null) {
                   uoa.e = false;
                }
             }
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveGzonePromotionGameRecyclerFragment.class, "3")) {
          return;
       }
       if (this.I == null) {
          i1.i(this.G.e.d(), this.G.e.getLiveStreamId(), a1.p(R.string.arg_RES_7f102429), i1.c(this.G.f), this.G.e.a());
          this.I = true;
       }
       super.onResume();
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveGzonePromotionGameRecyclerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this.G);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveGzonePromotionGameRecyclerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGzonePromotionGameRecyclerFragment$a(this.H);
    }
}
