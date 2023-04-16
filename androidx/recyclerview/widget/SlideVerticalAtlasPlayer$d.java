package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$d;
import erd.g;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import java.lang.Object;
import java.lang.Long;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$VerticalLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Integer;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.a;
import java.lang.String;
import id5.v;
import java.lang.StringBuilder;
import q87.c;
import androidx.recyclerview.widget.RecyclerView$y;
import u2.i;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b;
import java.util.Objects;
import java.util.HashMap;
import java.lang.Boolean;
import ud5.e;

public final class SlideVerticalAtlasPlayer$d implements g	// class@0008cc
{
    public final SlideVerticalAtlasPlayer b;

    public void SlideVerticalAtlasPlayer$d(SlideVerticalAtlasPlayer p0){
       this.b = p0;
       super();
    }
    public final void a(Long p0){
       RecyclerView$Adapter adapter;
       SlideVerticalAtlasPlayer i1;
       SlideVerticalAtlasPlayer$d tb = this.b;
       tb.E((long)(tb.b * (float)1000));
       Integer integer = Integer.valueOf(this.b.getManager().E());
       StringBuilder str = -1;
       SlideVerticalAtlasPlayer$d uod = (integer.intValue() != str)? 1: null;
       String str1 = null;
       if (!uod) {
          integer = str1;
       }
       int i = (integer != null)? integer.intValue(): this.b.f;
       uod = this.b;
       SlideVerticalAtlasPlayer f = uod.f;
       i = i + 1;
       if (f == i) {
          i = f + 1;
       }
       uod.f = i;
       String str2 = "VerticalAtlasPlayer";
       if (SlideVerticalAtlasPlayer.x(uod, 1)) {
          tb = this.b;
          adapter = tb.getAdapter();
          a.m(adapter);
          a.o(adapter, "adapter!!");
          if (tb.f < adapter.getItemCount()) {
             RecyclerView$Adapter adapter1 = this.b.getAdapter();
             a.m(adapter1);
             a.o(adapter1, "adapter!!");
             if (this.b.getManager().E() != (adapter1.getItemCount() - 1)) {
                Object[] objArray = new Object[0];
                v.C().w(str2, "autoScroll: 下一张 "+this.b.f, objArray);
                uod = this.b;
                this.b.getManager().smoothScrollToPosition(uod, uod.mState, uod.f);
             }
          }
          integer = Integer.valueOf(this.b.getManager().c());
          v ov = (integer.intValue() != str)? 1: null;
          if (ov) {
             str1 = integer;
          }
          i = (str1 != null)? str1.intValue(): this.b.f;
          Object[] objArray1 = new Object[0];
          v.C().w(str2, "autoScroll: 已在最后一张，下一次滚动到底部 "+i, objArray1);
          SlideVerticalAtlasPlayer$d tb1 = this.b;
          this.b.getManager().smoothScrollToPosition(tb1, tb1.mState, i);
       }else {
          i1 = this.b.j;
          if (i1 != null) {
             a.m(i1);
             i1.a();
          }
          i1.f = 0;
          Object[] objArray2 = new Object[0];
          v.C().w(str2, "autoScroll: 末尾", objArray2);
          tb = this.b;
          tb.scrollToPosition(tb.f);
       }
       if (this.b.getAdapter() instanceof SlideVerticalAtlasPlayer$b) {
          adapter = this.b.getAdapter();
          Objects.requireNonNull(adapter, "null cannot be cast to non-null type androidx.recyclerview.widget.SlideVerticalAtlasPlayer.VerticalAtlasAdapter");
          if (a.g(adapter.J0().get(Integer.valueOf(this.b.f)), Boolean.TRUE)) {
             i1 = this.b.i;
             if (i1 != null) {
                i1.d(0);
             }
          }else {
             i1 = this.b.i;
             if (i1 != null) {
                i1.d(1);
             }
          }
       }
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
