package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$animationInterpolator$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$snapHelper$2;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$atlasAdapter$2;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$manager$2;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$e;
import java.util.HashSet;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$PageAutoScrollLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$l;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$r;
import g9c.a;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$c;
import crd.b;
import lnc.b9;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.lang.Iterable;
import jd5.i;
import java.util.Set;
import id5.v;
import java.lang.StringBuilder;
import q87.c;
import androidx.recyclerview.widget.RecyclerView$y;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import usd.q;
import java.util.concurrent.TimeUnit;
import brd.h;
import brd.z;
import io.reactivex.android.schedulers.a;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$f;
import erd.g;
import java.security.InvalidParameterException;
import com.yxcorp.utility.f;
import brd.t;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$g;
import android.view.animation.PathInterpolator;
import xb.t$b;
import u2.i;
import ud5.c;
import ud5.e;
import java.util.Objects;
import com.kuaishou.android.model.feed.ImageFeed;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;

public final class SlideHorizontalAtlasPlayer extends RecyclerView	// class@0008bd
{
    public final float b;
    public final int c;
    public final p d;
    public final float e;
    public final p f;
    public final p g;
    public final p h;
    public i i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final RecyclerView$r n;
    public final Set o;
    public boolean p;
    public b q;
    public Drawable r;
    public boolean s;
    public t$b t;
    public QPhoto u;
    public boolean v;
    public c w;
    public e x;
    public long y;
    public b z;
    public static final SlideHorizontalAtlasPlayer$a A;

    static {
       SlideHorizontalAtlasPlayer.A = new SlideHorizontalAtlasPlayer$a(null);
    }
    public void SlideHorizontalAtlasPlayer(Context p0){
       super(p0, null, 2, null);
    }
    public void SlideHorizontalAtlasPlayer(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = 2.50f;
       this.c = 1000;
       this.d = s.c(SlideHorizontalAtlasPlayer$animationInterpolator$2.INSTANCE);
       this.e = 2.50f;
       this.f = s.c(SlideHorizontalAtlasPlayer$snapHelper$2.INSTANCE);
       this.g = s.c(new SlideHorizontalAtlasPlayer$atlasAdapter$2(this));
       this.h = s.c(new SlideHorizontalAtlasPlayer$manager$2(this, p0));
       SlideHorizontalAtlasPlayer$e uoe = new SlideHorizontalAtlasPlayer$e(this);
       this.n = uoe;
       this.o = new HashSet();
       this.p = true;
       this.setLayoutManager(this.getManager());
       this.setNestedScrollingEnabled(false);
       b uob = new b();
       uob.g(KwaiRadiusStyles.R8);
       this.setBackground(uob.a());
       this.setItemAnimator(null);
       this.setAdapter(this.getAtlasAdapter());
       this.getSnapHelper().b(this);
       this.addOnScrollListener(uoe);
       this.setHasFixedSize(true);
       this.y = 2500;
    }
    public void SlideHorizontalAtlasPlayer(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public static void J(SlideHorizontalAtlasPlayer p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = (int)(p0.b * (float)1000);
       }
       p0.I(p1);
       return;
    }
    public final boolean A(){
       SlideHorizontalAtlasPlayer$c uoc = this.getAtlasAdapter().N0(this.j);
       boolean b = (uoc != null)? uoc.d(): false;
       return b;
    }
    public final void B(){
       b9.a(this.z);
    }
    public final boolean C(int p0){
       boolean b = (p0 != 2 && (p0 != 3 && (p0 != 4 && (p0 != 5 && (p0 != 6 && (p0 != 7 && (p0 == 9 || p0 == 12)))))))? true: false;
       return b;
    }
    public final boolean D(){
       boolean b = (!this.getManager().c())? true: false;
       return b;
    }
    public final boolean E(){
       return this.s;
    }
    public final boolean F(){
       int i = 1;
       if (this.getManager().c() == (this.getAtlasAdapter().getItemCount() - i)) {
       }else {
          i = false;
       }
       return i;
    }
    public final void G(boolean p0){
       this.m = p0;
    }
    public final boolean H(){
       SlideHorizontalAtlasPlayer tq = this.q;
       boolean b = (tq != null && !tq.isDisposed())? true: false;
       return b;
    }
    public final void I(int p0){
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this.j, p0);
       }
       return;
    }
    public final void K(int p0){
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public final void L(){
       this.l = true;
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().c();
       }
       return;
    }
    public final void M(i p0){
       a.p(p0, "listener");
       this.o.remove(p0);
    }
    public final void N(int p0){
       Object[] objArray = new Object[0];
       v.C().w("SlideAtlasRecyclerView", "seek: 初始化图片位置 "+p0+" 并强制定位到该位置", objArray);
       this.j = p0;
       this.getManager().scrollToPosition(this.j);
    }
    public final void O(int p0){
       Object[] objArray = new Object[0];
       v.C().w("SlideAtlasRecyclerView", "seek: 滑动到图片位置 "+p0, objArray);
       this.j = p0;
       this.getManager().smoothScrollToPosition(this, this.mState, this.j);
    }
    public final void P(int p0,int p1){
       boolean b = false;
       this.l = b;
       SlideHorizontalAtlasPlayer tq = this.q;
       if (tq != null && !tq.isDisposed()) {
          return;
       }
       tq = this.u;
       List atlasList = (tq != null)? tq.getAtlasList(): null;
       g og = (atlasList == null || atlasList.isEmpty())? 1: null;
       if (og) {
          return;
       }else if(p0 <= (this.getAtlasAdapter().getItemCount() - 1)){
          Object[] objArray = new Object[b];
          v.C().s("SlideAtlasRecyclerView", "startAutoScroll: "+p0+" reason："+p1, objArray);
          if (p0 != -1) {
             this.getManager().scrollToPosition(p0);
             this.j = p0;
          }
          SlideHorizontalAtlasPlayer te = this.e;
          if (p1 == 13) {
             te = 0x3f000000;
             objArray = new Object[b];
             v.C().w("SlideAtlasRecyclerView", "从详情页返回，停留时间 0.5", objArray);
          }
          int i = 1000;
          if (this.C(p1)) {
             long l = q.o(0, (this.y - (long)100));
             this.y = l;
             te = (float)l / (float)i;
             Object[] objArray1 = new Object[b];
             v.C().w("SlideAtlasRecyclerView", "切tab/面板后返回，剩余停留时间 "+te, objArray1);
          }
          float f = (float)i;
          float f1 = te * f;
          long l1 = (long)f1;
          this.Q(l1);
          if (this.C(p1)) {
             this.I((int)f1);
          }else if(p1 == 13){
             this.I(b);
          }else {
             SlideHorizontalAtlasPlayer.J(this, b, 1, null);
          }
          this.q = h.n(l1, (long)(this.b * f), TimeUnit.MILLISECONDS).u().t(a.c()).z(new SlideHorizontalAtlasPlayer$f(this));
          return;
       }else {
          throw new InvalidParameterException("图集自动播放位置超出限制");
       }
    }
    public final void Q(long p0){
       this.B();
       this.y = p0;
       Object[] objArray = new Object[0];
       v.C().w("SlideAtlasRecyclerView", "打开计时器, 时长 "+p0, objArray);
       this.z = f.d().b(p0, 100).subscribe(new SlideHorizontalAtlasPlayer$g(this));
    }
    public final void R(int p0){
       int i = 0;
       Object[] objArray = new Object[i];
       v.C().s("SlideAtlasRecyclerView", "stopAutoScroll: reason："+p0, objArray);
       SlideHorizontalAtlasPlayer tq = this.q;
       if (tq != null) {
          tq.dispose();
       }
       this.B();
       Object[] objArray1 = new Object[i];
       v.C().w("SlideAtlasRecyclerView", "关闭计时器, 剩余时长 "+this.y, objArray1);
       if (p0 == 11) {
          this.K(this.j);
       }else if(p0 == 13){
          this.L();
          this.K(this.j);
       }else if(this.C(p0) && p0 != 9){
          this.L();
       }
       return;
    }
    public final void S(int p0){
       this.j = p0;
       Object[] objArray = new Object[0];
       v.C().s("SlideAtlasRecyclerView", "seekToPosition: seekToPosition "+this.j, objArray);
       this.getManager().scrollToPosition(this.j);
       this.K(this.j);
    }
    public final void T(int p0){
       this.j = p0;
       this.getManager().smoothScrollToPosition(this, this.mState, this.j);
    }
    public final PathInterpolator getAnimationInterpolator(){
       return this.d.getValue();
    }
    public final g getAtlasAdapter(){
       return this.g.getValue();
    }
    public final int getCurrentPosition(){
       return this.j;
    }
    public final boolean getEnableScroll(){
       return this.p;
    }
    public final Drawable getItemBackground(){
       return this.r;
    }
    public final t$b getItemImageScaleType(){
       return this.t;
    }
    public final SlideHorizontalAtlasPlayer$PageAutoScrollLayoutManager getManager(){
       return this.h.getValue();
    }
    public final t getSnapHelper(){
       return this.f.getValue();
    }
    public final void release(){
       this.j = 0;
       this.k = true;
       this.stopScroll();
       this.getManager().scrollToPosition(0);
       Object[] objArray = new Object[0];
       v.C().t("SlideAtlasRecyclerView", "release: "+this.j+' '+this.hashCode(), objArray);
    }
    public void scrollToPosition(int p0){
    }
    public final void setCurrentPosition(int p0){
       this.j = p0;
    }
    public final void setEnableScroll(boolean p0){
       this.p = p0;
    }
    public final void setItemBackground(Drawable p0){
       this.r = p0;
    }
    public final void setItemImageMatchParent(boolean p0){
       this.s = p0;
    }
    public final void setItemImageScaleType(t$b p0){
       this.t = p0;
    }
    public final void setPageScrollToEndListener(i p0){
       a.p(p0, "listener");
       this.i = p0;
    }
    public final void x(i p0){
       a.p(p0, "listener");
       this.o.add(p0);
    }
    public final void y(QPhoto p0,boolean p1,c p2,e p3){
       a.p(p0, "photo");
       a.p(p2, "listener");
       a.p(p3, "loadingCallBack");
       this.u = p0;
       this.w = p2;
       this.x = p3;
       this.v = p1;
       p0 = p0.mEntity;
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.android.model.feed.ImageFeed");
       ArrayList uArrayList = new ArrayList();
       ImageFeed mImageModel = p0.mImageModel;
       String str = "imageFeed.mImageModel";
       a.o(mImageModel, str);
       if (mImageModel.getAtlasList() != null) {
          mImageModel = p0.mImageModel;
          a.o(mImageModel, str);
          int i = mImageModel.getAtlasList().size();
          for (int i1 = 0; i1 < i; i1++) {
             SlideHorizontalAtlasPlayer$c uoc = new SlideHorizontalAtlasPlayer$c(p0.mImageModel.getAtlasSize(i1), p0.mImageModel.getAtlasPhotosCdn(i1), i1, false, false, 24, null);
             uArrayList.add(v8);
          }
       }
       this.getAtlasAdapter().W0(uArrayList);
       this.getAtlasAdapter().k0();
       return;
    }
    public final boolean z(){
       SlideHorizontalAtlasPlayer$c uoc = this.getAtlasAdapter().N0(this.j);
       boolean b = (uoc != null)? uoc.e(): false;
       return b;
    }
}
