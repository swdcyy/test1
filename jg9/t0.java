package jg9.t0;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import jg9.t0$a;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jg9.z0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import jg9.v;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import jg9.t0$b;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.widget.RoundedImageView;
import java.lang.CharSequence;
import android.graphics.Bitmap;
import android.widget.ImageView;
import jg9.w0;
import android.view.View$OnClickListener;
import jg9.x0;
import android.view.ViewGroup;
import android.content.Context;
import i2b.a;

public final class t0 extends RecyclerView$Adapter	// class@002ab6
{
    public final CopyOnWriteArrayList e;
    public final HashMap f;
    public final float g;
    public v h;
    public HashSet i;
    public final RecyclerView j;
    public final BaseFragment k;
    public final MultiPicturePreviewHelper l;
    public static final t0$a m;

    static {
       t0.m = new t0$a(null);
    }
    public void t0(RecyclerView p0,BaseFragment p1,MultiPicturePreviewHelper p2){
       a.p(p0, "recyclerView");
       a.p(p1, "fragment");
       a.p(p2, "previewHelper");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.e = new CopyOnWriteArrayList();
       this.f = new HashMap();
       this.g = 0x3fa00000;
       this.i = new HashSet();
    }
    public final void J0(int p0,boolean p1){
       z0 a;
       t0 tk;
       ClientEvent$ElementPackage uElementPack;
       int i2;
       int b1;
       t0 ot0 = t0.class;
       if (PatchProxy.isSupport(ot0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ot0, "7")) {
          return;
       }
       if (p0 >= this.e.size()) {
          return;
       }
       MultiTakePictrueItem multiTakePic = this.e.get(p0);
       int i = -1;
       int i1 = 0;
       boolean b = (multiTakePic.b() == i)? true: false;
       if (b) {
          t0 te = this.e;
          if (!te instanceof Collection || !te.isEmpty()) {
             Iterator iterator = te.iterator();
             i2 = 0;
             while (iterator.hasNext()) {
                b1 = (iterator.next().b() > i)? true: false;
                if (b1) {
                   i2 = i2 + 1;
                   if (i2 < 0) {
                      CollectionsKt__CollectionsKt.V();
                   }
                }
             }
             i1 = i2;
          }
          multiTakePic.h(i1);
          if (p1) {
             a = z0.a;
             tk = this.k;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(tk, a, z0.class, "1")) {
                a.p(tk, "page");
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "PICK_PICTURE";
                u1.M("", tk, 1, uElementPack, null, null);
             }
          }
       }else {
          int i3 = multiTakePic.b();
          multiTakePic.h(i);
          Iterator iterator1 = this.e.iterator();
          while (iterator1.hasNext()) {
             Object obj = iterator1.next();
             i2 = i1 + 1;
             if (i1 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (obj.b() > i3) {
                b1 = obj.b() - 1;
                obj.h(b1);
                this.l0(i1);
             }
             i1 = i2;
          }
          if (p1) {
             a = z0.a;
             tk = this.k;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(tk, a, z0.class, "2")) {
                a.p(tk, "page");
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "CANCEL_PICTURE";
                u1.M("", tk, 1, uElementPack, null, null);
             }
          }
       }
       this.l0(p0);
       t0 th = this.h;
       if (th != null) {
          th.l1(p0, b);
       }
       return;
    }
    public final CopyOnWriteArrayList K0(){
       return this.e;
    }
    public final MultiPicturePreviewHelper L0(){
       return this.l;
    }
    public final HashSet M0(){
       return this.i;
    }
    public final void N0(v p0){
       this.h = p0;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, t0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public final RecyclerView h0(){
       return this.j;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       boolean i;
       t0 ot0 = t0.class;
       if (!PatchProxy.isSupport(ot0) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ot0, "4")) {
          a.p(p0, "holder");
          if (p1 >= 0 && p1 < this.e.size()) {
             MultiTakePictrueItem multiTakePic = this.e.get(p1);
             boolean b = false;
             if (this.i.contains(multiTakePic.c())) {
                i = 4;
                n.Y(p0.a(), i, b);
                n.Y(p0.b(), i, b);
             }else {
                n.Y(p0.a(), b, b);
                n.Y(p0.b(), b, b);
             }
             TextView textView = p0.a();
             MultiTakePictrueItem multiTakePic1 = -1;
             i = (multiTakePic.b() > multiTakePic1)? true: false;
             textView.setSelected(i);
             textView = p0.a();
             String str = (multiTakePic.b() > multiTakePic1)? String.valueOf((multiTakePic.b() + 1)): "";
             textView.setText(str);
             Bitmap uBitmap = this.f.get(multiTakePic.c());
             if (uBitmap != null) {
                a.o(uBitmap, "bitmapMap[item.path] ?: return");
                p0.b().setImageBitmap(uBitmap);
                p0.b().setContentRotation(((float)multiTakePic.e * 0xbf800000));
                p0.c.setOnClickListener(new w0(this, p0));
                t0$b d = p0.d;
                if (!multiTakePic.d()) {
                   b = 8;
                }
                d.setVisibility(b);
                p0.itemView.setOnClickListener(new x0(this, p0));
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       t0$b uob;
       t0 ot0 = t0.class;
       if (PatchProxy.isSupport(ot0)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ot0, "2");
          if (uob != PatchProxyResult.class) {
          label_0034 :
             return uob;
          }
       }
       a.p(p0, "parent");
       View view = a.d(p0.getContext(), R.layout.arg_RES_7f0d0fe7, p0, false);
       a.o(view, "KwaiLayoutInflater.infla¡­em, parent, false\n      \)");
       uob = new t0$b(view);
       goto label_0034 ;
    }
}
