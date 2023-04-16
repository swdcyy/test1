package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$g;
import pn9.b;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import mn9.b;
import jn9.b;
import mn9.a;
import java.util.List;
import src.j;
import src.m;
import src.k;
import src.l;

public final class RecommendMusicViewBinderV2$g extends b	// class@001113
{
    public final RecommendMusicViewBinderV2 c;
    public final View d;

    public void RecommendMusicViewBinderV2$g(RecommendMusicViewBinderV2 p0,View p1,View p2){
       this.c = p0;
       this.d = p1;
       super(p2);
    }
    public RecyclerView D(){
       return this.c.g;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, RecommendMusicViewBinderV2$g.class, "2")) {
          return;
       }
       this.c.h.setVisibility(8);
       this.c.i.setVisibility(8);
       this.c.f.setVisibility(0);
       if (!this.c.e.n().hasMore() && this.c.e.i("EMPTY_ITEM_ID") == null) {
          this.c.e.u(new j(), this.c.e.r().size());
       }
       if (!this.c.H()) {
          this.c.e.t(new m(), 0);
       }
       return;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, RecommendMusicViewBinderV2$g.class, "3")) {
          return;
       }
       int i = 8;
       if (this.c.J()) {
          this.c.h.setVisibility(0);
          this.c.i.setVisibility(i);
          this.c.f.setVisibility(i);
       }else {
          this.c.h.setVisibility(i);
          this.c.i.setVisibility(i);
          this.c.f.setVisibility(0);
          if (!this.c.H()) {
             this.c.e.t(new m(), 0);
          }
          if (this.c.e.i("FAILED_ITEM_ID") == null) {
             this.c.e.A("EMPTY_ITEM_ID");
             this.c.e.A("LOADING_ITEM_ID");
             this.c.e.u(new k(), 0);
          }
       }
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, RecommendMusicViewBinderV2$g.class, "1")) {
          return;
       }
       int i = 8;
       if (this.c.J()) {
          this.c.h.setVisibility(i);
          this.c.i.setVisibility(0);
          this.c.f.setVisibility(i);
       }else {
          this.c.h.setVisibility(i);
          this.c.i.setVisibility(i);
          this.c.f.setVisibility(0);
          if (!this.c.H()) {
             this.c.e.t(new m(), 0);
          }
          if (this.c.e.i("LOADING_ITEM_ID") == null) {
             this.c.e.A("EMPTY_ITEM_ID");
             this.c.e.A("FAILED_ITEM_ID");
             this.c.e.u(new l(), 0);
          }
       }
       return;
    }
}
