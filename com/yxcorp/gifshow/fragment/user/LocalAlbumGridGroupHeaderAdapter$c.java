package com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter$c;
import z8c.b;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter;
import java.util.Objects;
import ika.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.util.ListIterator;
import ika.a$b;
import java.lang.Boolean;

public final class LocalAlbumGridGroupHeaderAdapter$c extends b	// class@00127a
{
    public boolean f;
    public boolean g;
    public boolean h;

    public void LocalAlbumGridGroupHeaderAdapter$c(int p0,int p1){
       super(p0, p1);
       this.h = true;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       b ta;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LocalAlbumGridGroupHeaderAdapter$c.class, "2")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       RecyclerView$Adapter adapter = p2.getAdapter();
       if (adapter instanceof LocalAlbumGridGroupHeaderAdapter) {
          int i = p2.getChildAdapterPosition(p1) - this.f;
          if (i < 0) {
             return;
          }else {
             Objects.requireNonNull(adapter);
             a uoa = a.class;
             int i1 = 0;
             int i2 = -1;
             if (PatchProxy.isSupport(uoa)) {
                uoa = PatchProxy.applyOneRefs(Integer.valueOf(i), adapter, uoa, "9");
                if (uoa != PatchProxyResult.class) {
                   i2 = uoa.intValue();
                }else if(adapter.Q0(i) == i2){
                   uoa = adapter.k;
                   ListIterator listIterator = uoa.listIterator(uoa.size());
                   while (true) {
                      if (listIterator.hasPrevious()) {
                         p3 = listIterator.previous();
                         ta = (p3.a() < i)? 1: null;
                         if (!ta) {
                            continue ;
                         }
                      }else {
                         p3 = null;
                      }
                      if (p3 != null) {
                         i2 = i2 + (i - p3.a());
                      }
                   }
                }
             }else {
                goto label_005a ;
             }
             if (this.g != null && i2 < this.a) {
                p0.top = this.b;
             }
             if (this.h == null) {
                if (!(i2 % this.a)) {
                   p0.left = i1;
                }else {
                   p0.left = this.b;
                }
             }else {
                b tb = this.b;
                ta = this.a;
                p0.left = (int)(((((float)tb * 0x3f800000) * (float)(i2 % ta)) / (float)ta) + 0x3f000000);
                p0.right = (int)((((float)tb * 0x3f800000) * (float)((ta - 1) - (i2 % ta))) / (float)ta);
                p0.bottom = tb;
             }
          }
       }else {
          super.c(p0, p1, p2, p3);
       }
       return;
    }
    public b g(boolean p0){
       LocalAlbumGridGroupHeaderAdapter$c uoc = LocalAlbumGridGroupHeaderAdapter$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       super.g(p0);
       a.o(this, "super.setHasHeaderView\(hasHeaderView\)");
       return this;
    }
}
