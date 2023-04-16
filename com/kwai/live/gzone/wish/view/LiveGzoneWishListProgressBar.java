package com.kwai.live.gzone.wish.view.LiveGzoneWishListProgressBar;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.live.gzone.wish.view.LiveGzoneWishListProgressBar$a;
import java.util.List;

public final class LiveGzoneWishListProgressBar extends LinearLayout	// class@000e98
{
    public final List b;
    public final List c;
    public final int d;
    public final Context e;
    public HashMap f;

    public void LiveGzoneWishListProgressBar(Context p0,AttributeSet p1){
       a.p(p0, "mContext");
       a.p(p1, "attr");
       super(p0, p1);
       this.e = p0;
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.d = a1.e(4.00f);
    }
    public final int getProgressWidth(){
       Object obj1;
       int i3;
       Iterator obj = PatchProxy.apply(null, this, LiveGzoneWishListProgressBar.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (this.b.isEmpty() ^ 0x01) {
          obj = this.b.iterator();
          int i1 = 0;
          int i2 = 0;
          while (obj.hasNext()) {
             obj1 = obj.next();
             i3 = i2 + 1;
             if (i2 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             float f = (float)obj1.d() / (float)obj1.b();
             if (f) {
                i1 = i2;
             }
             i2 = i3;
          }
          List list = this.b.subList(i, (i1 + 1));
          if (!list.isEmpty()) {
             Iterator iterator = list.iterator();
             i2 = 0;
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                i3 = i2 + 1;
                if (i2 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                int i4 = list.size() - 1;
                if (i2 != i4) {
                   i2 = obj1.c() + this.d;
                }else {
                   float f1 = (float)obj1.d() / (float)obj1.b();
                   f1 = f1 * (float)obj1.c();
                   i2 = (int)f1;
                }
                i = i + i2;
                i2 = i3;
             }
          }
       }
       return i;
    }
}
