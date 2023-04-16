package l79.l;
import l79.m;
import l79.l$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import q79.d;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ec7.a;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.models.EmptyQMedia;
import java.lang.Integer;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.IllegalArgumentException;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.widget.TextView;
import java.lang.StringBuilder;
import o79.q;
import o79.i;
import java.lang.CharSequence;
import java.lang.Number;
import androidx.lifecycle.ViewModel;
import r79.a;
import w69.d;
import android.os.Bundle;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$Companion;
import kotlin.TypeCastException;
import o79.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import g79.a;
import w69.x;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Boolean;
import usd.q;

public final class l extends m	// class@002cc2
{
    public int w;
    public final int x;
    public static final l$a y;

    static {
       l.y = new l$a(null);
    }
    public void l(Fragment p0,d p1,int p2,int p3,Set p4){
       a.q(p0, "fragment");
       a.q(p1, "viewModel");
       a.q(p4, "invisibleSet");
       super(p0, p1, p2, p3, p4, false, 32, null);
       this.x = p2;
    }
    public a J0(Object p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.q(p0, "item");
          if (!p0 instanceof EmptyQMedia) {
             this.w = this.w + 1;
          }
          uoa = super.J0(p0);
          a.h(uoa, "super.add\(item\)");
       }
       return uoa;
    }
    public a K0(){
       a obj = PatchProxy.apply(null, this, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.w = 0;
       obj = super.K0();
       a.h(obj, "super.clear\(\)");
       return obj;
    }
    public boolean P0(){
       boolean b = (this.w == null)? true: false;
       return b;
    }
    public a Q0(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.e.get(p0) instanceof EmptyQMedia) {
          this.w = this.w - 1;
       }
       a uoa = super.Q0(p0);
       a.h(uoa, "super.remove\(position\)");
       return uoa;
    }
    public a R0(int p0,Object p1){
       a uoa;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          uoa = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ol, "5");
          if (uoa != PatchProxyResult.class) {
          label_0050 :
             return uoa;
          }
       }
       a.q(p1, "item");
       v0 = p1 instanceof EmptyQMedia;
       if (!uoa && this.e.get(p0) instanceof EmptyQMedia) {
          this.w = this.w + 1;
       }else if(uoa && !this.e.get(p0) instanceof EmptyQMedia){
          this.w = this.w - 1;
       }
       uoa = super.R0(p0, p1);
       a.h(uoa, "super.set\(index, item\)");
       goto label_0050 ;
    }
    public void S0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       this.e.clear();
       if (p0 == null) {
          throw new IllegalArgumentException("can not set null list".toString());
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (!uoc instanceof EmptyQMedia) {
             int i = this.w + 1;
             this.w = i;
          }
          this.e.add(uoc);
       }
       return;
    }
    public int Z0(){
       return this.w;
    }
    public void c(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "7")) {
          return;
       }
       a.q(p0, "viewHolder");
       super.c(p0);
       TextView textView = p0.itemView.findViewById(R.id.media_duration);
       a.h(textView, "mediaDurationTextView");
       textView.setText(q.i(this.e1(p0.getAdapterPosition()))+i.p(R.string.arg_RES_7f1045e8));
       textView.setVisibility(0);
       return;
    }
    public final long e1(int p0){
       ViewModel obj;
       long[] longArray;
       long l;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "10");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       obj = this.X0();
       if (obj != null) {
          Bundle uBundle = obj.s0().c().b();
          if (uBundle != null) {
             longArray = uBundle.getLongArray(MultiSelectSelectedItemViewBinder.l.a());
             if (longArray != null) {
             label_0043 :
                a.h(longArray, "\(providerViewModel\(\) as \x20\x02ST\)\n      ?: LongArray\(0\)\x00");
                l = (p0 >= longArray.length)? 0: longArray[p0];
                return l;
             }
          }
          longArray = new long[0];
          goto label_0043 ;
       }else {
          throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.vm.AlbumAssetViewModel");
       }
    }
    public void f(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "6")) {
          return;
       }
       a.q(p0, "viewHolder");
       super.f(p0);
       TextView textView = p0.itemView.findViewById(R.id.media_duration);
       if (textView != null) {
          textView.setVisibility(8);
       }
       if (!PatchProxy.applyVoid(null, null, d.class, "31")) {
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CHANGE_PICTURE_INDEX";
          uClickEvent.elementPackage = uElementPack;
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          uClickEvent.urlPackage = urlPackage;
          urlPackage.page = 313;
          a.c.f().e(uClickEvent);
       }
       return;
    }
    public int k(){
       Object obj = PatchProxy.apply(null, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.n;
    }
    public boolean m(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,RecyclerView p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, l.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "fromViewHolder");
       a.q(p1, "targetViewHolder");
       a.q(p2, "recyclerView");
       int adapterPosit = p0.getAdapterPosition();
       int i = q.u(p1.getAdapterPosition(), (this.getItemCount() - 1));
       RecyclerView$ViewHolder viewHolder = -1;
       if (adapterPosit == viewHolder || i == viewHolder) {
          return false;
       }
       boolean b = super.m(p0, p1, p2);
       TextView textView = p0.itemView.findViewById(R.id.media_duration);
       TextView textView1 = p0.itemView.findViewById(R.id.empty_media_duration);
       TextView textView2 = p1.itemView.findViewById(R.id.media_duration);
       TextView textView3 = p1.itemView.findViewById(R.id.empty_media_duration);
       String str = q.i(this.e1(i))+i.p(0x7f1045e8);
       if (textView != null) {
          textView.setText(str);
       }
       if (textView1 != null) {
          textView1.setText(str);
       }
       String str1 = q.i(this.e1(adapterPosit))+i.p(0x7f1045e8);
       if (textView2 != null) {
          textView2.setText(str1);
       }
       if (textView3 != null) {
          textView3.setText(str1);
       }
       return b;
    }
}
