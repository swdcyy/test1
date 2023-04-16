package com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView;
import jd5.h;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import java.util.HashSet;
import com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$a;
import android.util.AttributeSet;
import jd5.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import jd5.f;
import jd5.g;
import java.lang.Integer;
import java.lang.Boolean;
import id5.v;
import java.lang.StringBuilder;
import q87.c;
import jd5.c;
import java.lang.Runnable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.android.model.feed.ImageFeed;
import com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$e;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import g9c.a;
import java.util.Collection;
import android.view.View;
import ekd.p0;
import java.util.Objects;
import com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$LinearScrollLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$r;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;

public class AtlasScrollPlayerView extends RecyclerView implements h	// class@000a15
{
    public AtlasScrollPlayerView$c b;
    public AtlasScrollPlayerView$LinearScrollLayoutManager c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public boolean h;
    public Set i;
    public Set j;
    public RecyclerView$r k;

    public void AtlasScrollPlayerView(Context p0){
       super(p0);
       this.f = 0;
       this.g = false;
       this.h = false;
       this.i = new HashSet();
       this.j = new HashSet();
       this.k = new AtlasScrollPlayerView$a(this);
       this.x(p0);
    }
    public void AtlasScrollPlayerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = 0;
       this.g = false;
       this.h = false;
       this.i = new HashSet();
       this.j = new HashSet();
       this.k = new AtlasScrollPlayerView$a(this);
       this.x(p0);
    }
    public void AtlasScrollPlayerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = 0;
       this.g = false;
       this.h = false;
       this.i = new HashSet();
       this.j = new HashSet();
       this.k = new AtlasScrollPlayerView$a(this);
       this.x(p0);
    }
    public void c(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasScrollPlayerView.class, "9")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       this.i.remove(p0);
       return;
    }
    public void g(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasScrollPlayerView.class, "11")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       this.j.remove(p0);
       return;
    }
    public int getCurrentIndex(){
       return g.a(this);
    }
    public void h(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(AtlasScrollPlayerView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, AtlasScrollPlayerView.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       v.C().w("AtlasScrollPlayerView", "seek: position:"+p0+", offset:"+p1, objArray);
       this.f = p0;
       if (p2) {
          this.postDelayed(new c(this, p1), 32);
       }else {
          this.c.scrollToPositionWithOffset(p0, p1);
       }
       return;
    }
    public void l(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasScrollPlayerView.class, "10")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       this.j.add(p0);
       return;
    }
    public boolean m(){
       return this.e;
    }
    public void p(ImageFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasScrollPlayerView.class, "13")) {
          return;
       }
       if (this.b == null) {
          AtlasScrollPlayerView$c uoc = new AtlasScrollPlayerView$c(this.getContext());
          this.b = uoc;
          this.setAdapter(uoc);
       }
       ArrayList uArrayList = new ArrayList();
       boolean b = false;
       if (p0.mImageModel.getAtlasList() != null) {
          int i = p0.mImageModel.getAtlasList().size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             AtlasScrollPlayerView$e uoe = AtlasScrollPlayerView$e.class;
             if (PatchProxy.isSupport(uoe)) {
                uoe = PatchProxy.applyTwoRefs(p0, Integer.valueOf(i1), null, uoe, "1");
                if (uoe != PatchProxyResult.class) {
                label_0067 :
                   uArrayList.add(uoe);
                }
             }
             uoe = new AtlasScrollPlayerView$e();
             uoe.a = p0.mImageModel.getAtlasSize(i1);
             uoe.b = p0.mImageModel.getAtlasPhotosCdn(i1);
             goto label_0067 ;
          }
       }
       if (uArrayList.size() > 1) {
          b = true;
       }
       this.e = b;
       this.b.W0(uArrayList);
       this.b.k0();
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, AtlasScrollPlayerView.class, "6")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       boolean b = false;
       this.d = b;
       this.stopScroll();
       g.n(this.i);
       if (this.g != null) {
          int i = this.c.i0();
          View childAt = this.getChildAt(b);
          if (childAt != null) {
             b = childAt.getTop();
          }
          g.o(this.j, i, b, this.d);
       }else {
          g.o(this.j, this.f, b, this.d);
       }
       return;
    }
    public void play(){
       if (PatchProxy.applyVoid(null, this, AtlasScrollPlayerView.class, "2")) {
          return;
       }
       if (this.d != null || (this.m() && p0.C(this.getContext()))) {
          this.d = true;
          this.y();
          g.p(this.i);
       }
    label_002c :
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, AtlasScrollPlayerView.class, "7")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       this.f = 0;
       this.d = false;
       this.h = true;
       this.stopScroll();
       this.scrollToPosition(0);
       g.q(this.i);
       return;
    }
    public void reset(){
       this.h = false;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, AtlasScrollPlayerView.class, "5")) {
          return;
       }
       if (this.d == null && this.m()) {
          this.d = true;
          Objects.requireNonNull(this.b);
          this.smoothScrollToPosition(0x7ffffffd);
          g.p(this.i);
       }
       return;
    }
    public void setImageVisibility(int p0){
       if (PatchProxy.isSupport(AtlasScrollPlayerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AtlasScrollPlayerView.class, "12")) {
          return;
       }
       super.setVisibility(p0);
       return;
    }
    public void w(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasScrollPlayerView.class, "8")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       this.i.add(p0);
       return;
    }
    public final void x(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasScrollPlayerView.class, "1")) {
          return;
       }
       AtlasScrollPlayerView$LinearScrollLayoutManager linearScroll = new AtlasScrollPlayerView$LinearScrollLayoutManager(this, p0);
       this.c = linearScroll;
       linearScroll.setOrientation(1);
       this.setNestedScrollingEnabled(false);
       this.setLayoutManager(this.c);
       this.addOnScrollListener(this.k);
       b uob = new b();
       uob.g(KwaiRadiusStyles.R8);
       this.setBackground(uob.a());
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, AtlasScrollPlayerView.class, "4")) {
          return;
       }
       this.scrollToPosition(this.f);
       Objects.requireNonNull(this.b);
       this.smoothScrollToPosition(0x7ffffffd);
       return;
    }
}
