package androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$animationInterpolator$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$manager$2;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$c;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.View;
import crd.b;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$VerticalLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import id5.v;
import q87.c;
import java.lang.StringBuilder;
import java.util.concurrent.TimeUnit;
import brd.h;
import brd.z;
import io.reactivex.android.schedulers.a;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$d;
import erd.g;
import com.yxcorp.utility.f;
import brd.t;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$e;
import java.lang.Integer;
import java.lang.Number;
import android.view.animation.PathInterpolator;
import u2.i;
import ud5.c;
import ud5.e;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b;
import qrd.l1;
import lnc.b9;

public final class SlideVerticalAtlasPlayer extends RecyclerView	// class@0008cf
{
    public final float b;
    public final float c;
    public final int d;
    public final p e;
    public int f;
    public final p g;
    public b h;
    public e i;
    public i j;
    public final RecyclerView$r k;
    public QPhoto l;
    public long m;
    public b n;
    public static final SlideVerticalAtlasPlayer$a o;

    static {
       SlideVerticalAtlasPlayer.o = new SlideVerticalAtlasPlayer$a(null);
    }
    public void SlideVerticalAtlasPlayer(Context p0){
       super(p0, null, 2, null);
    }
    public void SlideVerticalAtlasPlayer(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = 2.50f;
       this.c = 2.50f;
       this.d = 800;
       this.e = s.c(SlideVerticalAtlasPlayer$animationInterpolator$2.INSTANCE);
       this.g = s.c(new SlideVerticalAtlasPlayer$manager$2(this, p0));
       SlideVerticalAtlasPlayer$c uoc = new SlideVerticalAtlasPlayer$c(this);
       this.k = uoc;
       this.addOnScrollListener(uoc);
    }
    public void SlideVerticalAtlasPlayer(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public static void G(SlideVerticalAtlasPlayer p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 0;
       }
       p0.F(p1);
       return;
    }
    public static final boolean x(SlideVerticalAtlasPlayer p0,int p1){
       return super.canScrollVertically(p1);
    }
    public final boolean A(int p0){
       boolean b = (p0 != 2 && (p0 != 3 && (p0 != 4 && (p0 != 5 && (p0 != 6 && (p0 != 7 && (p0 == 9 || p0 == 12)))))))? true: false;
       return b;
    }
    public final boolean B(){
       SlideVerticalAtlasPlayer th = this.h;
       boolean b = (th != null && !th.isDisposed())? true: false;
       return b;
    }
    public final void C(int p0,int p1){
       this.getManager().scrollToPositionWithOffset(p0, p1);
       this.H();
    }
    public final void D(int p0,int p1,int p2){
       SlideVerticalAtlasPlayer th = this.h;
       if (th != null && !th.isDisposed()) {
          return;
       }
       th = this.l;
       List atlasList = (th != null)? th.getAtlasList(): null;
       int i = 1;
       int i1 = 0;
       RecyclerView$Adapter uAdapter = (atlasList == null || atlasList.isEmpty())? 1: null;
       if (uAdapter) {
          return;
       }else {
          uAdapter = this.getAdapter();
          a.m(uAdapter);
          a.o(uAdapter, "adapter!!");
          if (p0 > (uAdapter.getItemCount() - i)) {
             Object[] objArray = new Object[i1];
             v.C().s("VerticalAtlasPlayer", "长图自动播放位置超出限制", objArray);
             return;
          }else {
             Object[] objArray1 = new Object[i1];
             v.C().w("VerticalAtlasPlayer", "startAutoScroll: position："+p0+" reason： "+p2+" offset："+p1+' ', objArray1);
             if (p0 != -1) {
                this.getManager().scrollToPositionWithOffset(p0, p1);
                this.f = p0;
             }
             SlideVerticalAtlasPlayer tc = this.c;
             if (p2 == 13) {
                tc = 0x3f000000;
                Object[] objArray2 = new Object[i1];
                v.C().w("VerticalAtlasPlayer", "从详情页返回，停留时间 0.5", objArray2);
             }
             p2 = 1000;
             if (this.A(p2)) {
                tc = (float)this.m / (float)p2;
                Object[] objArray3 = new Object[i1];
                v.C().w("VerticalAtlasPlayer", "切tab/面板后返回，剩余停留时间 "+tc, objArray3);
             }
             float f = (float)p2;
             long l = (long)(tc * f);
             this.E(l);
             this.h = h.n(l, (long)(this.b * f), TimeUnit.MILLISECONDS).u().t(a.c()).z(new SlideVerticalAtlasPlayer$d(this));
             return;
          }
       }
    }
    public final void E(long p0){
       this.z();
       this.m = p0;
       Object[] objArray = new Object[0];
       v.C().w("VerticalAtlasPlayer", "打开计时器, 时长 "+p0, objArray);
       this.n = f.d().b(p0, 100).subscribe(new SlideVerticalAtlasPlayer$e(this));
    }
    public final void F(int p0){
       int i = 0;
       Object[] objArray = new Object[i];
       v.C().w("VerticalAtlasPlayer", "stopAutoScroll: reason： "+p0, objArray);
       SlideVerticalAtlasPlayer th = this.h;
       if (th != null) {
          th.dispose();
       }
       this.z();
       Object[] objArray1 = new Object[i];
       v.C().w("VerticalAtlasPlayer", "关闭计时器, 剩余时长 "+this.m, objArray1);
       return;
    }
    public final void H(){
       Integer integer = Integer.valueOf(this.getManager().h());
       int i = -1;
       int i1 = 0;
       SlideVerticalAtlasPlayer$VerticalLayoutManager verticalLayo = (integer.intValue() != i)? 1: null;
       Integer integer1 = null;
       if (!verticalLayo) {
          integer = integer1;
       }
       int i2 = (integer != null)? integer.intValue(): this.getManager().i0();
       Integer integer2 = Integer.valueOf(this.getManager().E());
       i = (integer2.intValue() != i)? 1: 0;
       if (i) {
          integer1 = integer2;
       }
       int i3 = (integer1 != null)? integer1.intValue(): this.getManager().c();
       if ((i3 - i2) > 1) {
          i2 = i3 - 1;
       }
       this.f = i2;
       Object[] objArray = new Object[i1];
       v.C().s("VerticalAtlasPlayer", "syncCurrentForcePosition: "+this.f, objArray);
       return;
    }
    public boolean canScrollVertically(int p0){
       return false;
    }
    public final PathInterpolator getAnimationInterpolator(){
       return this.e.getValue();
    }
    public final SlideVerticalAtlasPlayer$VerticalLayoutManager getManager(){
       return this.g.getValue();
    }
    public final void setPageScrollToEndListener(i p0){
       a.p(p0, "listener");
       this.j = p0;
    }
    public final void y(QPhoto p0,c p1,e p2){
       a.p(p0, "photo");
       a.p(p1, "listener");
       a.p(p2, "loadingCallBack");
       this.l = p0;
       this.setLayoutManager(this.getManager());
       this.i = p2;
       SlideVerticalAtlasPlayer$b uob = new SlideVerticalAtlasPlayer$b(p0);
       uob.N0(p1);
       Integer integer = Integer.valueOf(uob.getItemCount());
       int i = 1;
       if (integer.intValue() > i) {
       }else {
          i = 0;
       }
       if (!i) {
          integer = null;
       }
       if (integer != null) {
          integer.intValue();
          this.scrollToPosition(0);
       }
       this.setAdapter(uob);
       return;
    }
    public final void z(){
       b9.a(this.n);
    }
}
