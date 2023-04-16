package com.yxcorp.gifshow.album.home.AlbumFragment$j;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import java.util.Objects;
import w69.f;
import r79.a;
import q79.d;
import k79.m;
import jlb.b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.a;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;

public final class AlbumFragment$j implements Observer	// class@0019f5
{
    public final AlbumFragment b;

    public void AlbumFragment$j(AlbumFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       AlbumFragment z;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AlbumFragment$j.class, "1")) {
       }else {
          String str = "AlbumFragment";
          Log.g(str, "enableSceneClassify="+p0);
          AlbumFragment$j tb = this.b;
          a.h(p0, "it");
          boolean b = p0.booleanValue();
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(AlbumFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, AlbumFragment.class, "23")) {
             if (b == tb.z.d().c()) {
                Log.g(str, "changeTabsBySceneClassify, already equals.");
             }else {
                AlbumFragment y = tb.Y;
                boolean b1 = false;
                if (y != null) {
                   y.A = b1;
                }
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, tb, AlbumFragment.class, "24")) {
                   y = tb.Y;
                   if (y != null) {
                      y.a1(1);
                   }
                   Objects.requireNonNull(m.i);
                   b d = m.d;
                   String str1 = d.a();
                   a.h(str1, "defaultAlbum.name");
                   if (str1.length() > 0) {
                      b1 = true;
                   }
                   if (b1) {
                      z = tb.Y;
                      if (z != null) {
                         z.X0(d);
                      }
                   }
                }
             label_0098 :
                tb.z.d().o(b);
                tb.Jh();
                f uof = tb.z.d();
                z = tb.z;
                int[] ointArray = (b)? z.k(): z.g;
                uof.r(ointArray);
                if (b) {
                   b = tb.Y;
                   if (b != null) {
                      objArray = b.h;
                   }
                }else {
                   objArray = CollectionsKt__CollectionsKt.E();
                }
                tb.O = objArray;
                b = tb.ih();
                if (b.isEmpty() ^ 1) {
                   tb.kh();
                   tb.l.D(b);
                   b = tb.k;
                   a.h(b, "mViewPager");
                   b.setAdapter(tb.l);
                   tb.l.q();
                   tb.j.q();
                }
             }
          }
          PatchProxy.onMethodExit(AlbumFragment$j.class, "1");
       }
       return;
    }
}
