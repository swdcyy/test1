package com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog$a;
import androidx.viewpager2.widget.ViewPager2$h;
import com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import dxb.o;
import e17.i;
import com.yxcorp.gifshow.photo.download.image.c;
import com.yxcorp.gifshow.photo.download.image.c$a;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import lnc.a1;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.yxcorp.utility.n;
import dxb.d;
import java.lang.Runnable;
import java.lang.StringBuilder;
import dxb.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import fxb.a;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.HashSet;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;

public class ImageDownloadForSearchDialog$a extends ViewPager2$h	// class@000ecf
{
    public boolean a;
    public final ImageDownloadForSearchDialog b;

    public void ImageDownloadForSearchDialog$a(ImageDownloadForSearchDialog p0){
       this.b = p0;
       super();
       this.a = false;
    }
    public void c(int p0){
       ImageDownloadForSearchDialog q;
       int i2;
       View[] viewArray;
       ImageDownloadForSearchDialog$a uoa = ImageDownloadForSearchDialog$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.b.q.n = p0;
       int i = 1;
       if (p0 == (this.b.q.h - i) && this.a == null) {
          this.a = i;
          i.a(R.style.arg_RES_7f11066a, 0x7f101c7e);
       }
       uoa = this.b;
       ImageDownloadForSearchDialog r = uoa.r;
       uoa.H.a(r.b[r.a.n]);
       uoa = this.b;
       Objects.requireNonNull(uoa);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, uoa, ImageDownloadForSearchDialog.class, "11")) {
          q = uoa.D;
          i2 = q.length;
          for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
             object oobject = q[i3];
             oobject.setBackground(objArray);
             oobject.setTextColor(a1.a(R.color.arg_RES_7f061e52));
          }
          if (uoa.q.b()) {
             r = uoa.u;
          }else if(uoa.q.c()){
             r = uoa.v;
          }else {
             r = uoa.w;
          }
          GradientDrawable gradientDraw = new GradientDrawable();
          gradientDraw.setColor(-1);
          gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f070461));
          r.setBackground(gradientDraw);
          r.setTextColor(a1.a(R.color.arg_RES_7f061d77));
       }
       uoa = this.b;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(objArray, uoa, ImageDownloadForSearchDialog.class, "12")) {
          if (uoa.q.c()) {
             uoa.x.setVisibility(8);
          }else {
             uoa.x.setVisibility(0);
             i2 = 2;
             if (uoa.q.b()) {
                viewArray = new View[i2];
                viewArray[0] = uoa.y;
                viewArray[i] = uoa.z;
                n.Z(0, viewArray);
                View[] viewArray1 = new View[i];
                viewArray1[0] = uoa.A;
                n.Z(8, viewArray1);
                uoa.z.post(new d(uoa));
             }else {
                viewArray = new View[i];
                viewArray[0] = uoa.A;
                n.Z(0, viewArray);
                viewArray = new View[i2];
                viewArray[0] = uoa.y;
                viewArray[i] = uoa.z;
                n.Z(8, viewArray);
                uoa.A.post(new e(uoa, ((uoa.q.n - uoa.q.m) + i)+"/"+uoa.q.i));
             }
          }
       }
       ImageDownloadForSearchDialog$a tb = this.b;
       q = tb.q;
       a.e(this.b.q.a(), q.e, q.f, tb.r.d(), this.b.q.i);
       if (this.b.q.d()) {
          this.b.C.setVisibility(0);
          Iterator iterator = this.b.E.iterator();
          while (iterator.hasNext()) {
             int i1 = p0 - this.b.q.m;
             iterator.next().onPageSelected(i1);
          }
       }else {
          this.b.C.setVisibility(8);
       }
       return;
    }
}
