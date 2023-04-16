package ck.g$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import ck.g;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import ck.g$k;
import java.lang.Object;
import ck.g$g;
import android.os.Bundle;
import androidx.appcompat.view.menu.h;
import java.lang.String;
import android.util.SparseArray;
import ck.g$e;
import android.view.View;
import com.google.android.material.internal.ParcelableSparseArray;
import ck.g$f;
import android.widget.TextView;
import java.lang.CharSequence;
import com.google.android.material.internal.NavigationMenuItemView;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import a2.i0;
import android.view.ViewGroup;
import ck.g$b;
import ck.g$i;
import android.view.LayoutInflater;
import ck.g$j;
import ck.g$h;
import android.view.View$OnClickListener;
import ck.g$d;
import androidx.appcompat.view.menu.e;
import android.view.SubMenu;
import android.view.MenuItem;
import java.lang.RuntimeException;

public class g$c extends RecyclerView$Adapter	// class@000d1e
{
    public final ArrayList e;
    public h f;
    public boolean g;
    public final g h;

    public void g$c(g p0){
       this.h = p0;
       super();
       this.e = new ArrayList();
       this.P0();
    }
    public void E0(RecyclerView$ViewHolder p0){
       this.O0(p0);
    }
    public final void J0(int p0,int p1){
       while (p0 < p1) {
          this.e.get(p0).b = true;
          p0++;
       }
       return;
    }
    public Bundle K0(){
       Bundle uBundle = new Bundle();
       g$c tf = this.f;
       if (tf != null) {
          uBundle.putInt("android:menu:checked", tf.getItemId());
       }
       SparseArray sparseArray = new SparseArray();
       int i = 0;
       int i1 = this.e.size();
       while (i < i1) {
          g$e uoe = this.e.get(i);
          if (uoe instanceof g$g) {
             h oh = uoe.a();
             View actionView = (oh != null)? oh.getActionView(): null;
             if (actionView != null) {
                ParcelableSparseArray parcelableSp = new ParcelableSparseArray();
                actionView.saveHierarchyState(parcelableSp);
                sparseArray.put(oh.getItemId(), parcelableSp);
             }
          }
          i = i + 1;
       }
       uBundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
       return uBundle;
    }
    public h L0(){
       return this.f;
    }
    public void M0(g$k p0,int p1){
       int i = this.f0(p1);
       if (i) {
          if (i != 1) {
             if (i == 2) {
                g$f uof = this.e.get(p1);
                i = uof.b();
                p0.itemView.setPadding(0, i, 0, uof.a());
             }
          }else {
             p0.itemView.setText(this.e.get(p1).a().getTitle());
          }
       }else {
          RecyclerView$ViewHolder itemView = p0.itemView;
          itemView.setIconTintList(this.h.l);
          g$c th = this.h;
          if (th.j != null) {
             itemView.setTextAppearance(th.i);
          }
          g k = this.h.k;
          if (k != null) {
             itemView.setTextColor(k);
          }
          k = this.h.m;
          Drawable uDrawable = (k != null)? k.getConstantState().newDrawable(): null;
          i0.v0(itemView, uDrawable);
          g$g og = this.e.get(p1);
          itemView.setNeedsEmptyIcon(og.b);
          itemView.setHorizontalPadding(this.h.n);
          itemView.setIconPadding(this.h.o);
          itemView.k(og.a(), 0);
       }
       return;
    }
    public g$k N0(ViewGroup p0,int p1){
       if (p1) {
          if (p1 == 1) {
             return new g$j(this.h.h, p0);
          }
          if (p1 == 2) {
             return new g$i(this.h.h, p0);
          }
          if (p1 != 3) {
             return null;
          }
          return new g$b(this.h.c);
       }else {
          g$c th = this.h;
          return new g$h(th.h, p0, th.r);
       }
    }
    public void O0(g$k p0){
       if (p0 instanceof g$h) {
          p0.itemView.D();
       }
       return;
    }
    public final void P0(){
       g$g og;
       g$c uoc = this;
       if (uoc.g != null) {
          return;
       }
       uoc.g = true;
       uoc.e.clear();
       uoc.e.add(new g$d());
       g$c uoc1 = -1;
       int i = uoc.h.e.G().size();
       int i1 = 0;
       boolean b = false;
       int i2 = 0;
       while (i1 < i) {
          h oh = uoc.h.e.G().get(i1);
          if (oh.isChecked()) {
             uoc.R0(oh);
          }
          if (oh.isCheckable()) {
             oh.u(false);
          }
          if (oh.hasSubMenu()) {
             SubMenu subMenu = oh.getSubMenu();
             if (subMenu.hasVisibleItems()) {
                if (i1) {
                   uoc.e.add(new g$f(uoc.h.q, false));
                }
                uoc.e.add(new g$g(oh));
                e uoe = uoc.e.size();
                int i3 = subMenu.size();
                int i4 = 0;
                int i5 = 0;
                while (i4 < i3) {
                   h item = subMenu.getItem(i4);
                   if (item.isVisible()) {
                      if (!i5 && item.getIcon() != null) {
                         i5 = 1;
                      }
                      if (item.isCheckable()) {
                         item.u(false);
                      }
                      if (oh.isChecked()) {
                         uoc.R0(oh);
                      }
                      uoc.e.add(new g$g(item));
                   }
                   i4 = i4 + 1;
                   og = 1;
                }
                if (i5) {
                   uoc.J0(uoe, uoc.e.size());
                }
             }
          }else {
             int groupId = oh.getGroupId();
             if (groupId != uoc1) {
                i2 = uoc.e.size();
                b = (oh.getIcon() != null)? true: false;
                if (i1) {
                   i2 = i2 + 1;
                   uoc.e.add(new g$f(uoc.h.q, uoc.h.q));
                }
             }else if(!b && oh.getIcon() != null){
                uoc.J0(i2, uoc.e.size());
                b = true;
             }
             g$g og1 = new g$g(oh);
             og1.b = b;
             uoc.e.add(og1);
             uoc1 = groupId;
          }
          i1 = i1 + 1;
          og = 1;
       }
       uoc.g = false;
       return;
    }
    public void Q0(Bundle p0){
       int i = 0;
       int intx = p0.getInt("android:menu:checked", i);
       if (intx) {
          this.g = true;
          int i1 = this.e.size();
          int i2 = 0;
          while (i2 < i1) {
             g$e uoe = this.e.get(i2);
             if (uoe instanceof g$g) {
                h oh = uoe.a();
                if (oh != null && oh.getItemId() == intx) {
                   this.R0(oh);
                   break ;
                }
             }
             i2 = i2 + 1;
          }
          this.g = i;
          this.P0();
       }
       SparseArray sparseParcel = p0.getSparseParcelableArray("android:menu:action_views");
       if (sparseParcel != null) {
          intx = this.e.size();
          while (i < intx) {
             g$e uoe1 = this.e.get(i);
             if (uoe1 instanceof g$g) {
                h oh1 = uoe1.a();
                if (oh1 != null) {
                   View actionView = oh1.getActionView();
                   if (actionView != null) {
                      ParcelableSparseArray parcelableSp = sparseParcel.get(oh1.getItemId());
                      if (parcelableSp != null) {
                         actionView.restoreHierarchyState(parcelableSp);
                      }
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public void R0(h p0){
       if (this.f != p0 && p0.isCheckable()) {
          g$c tf = this.f;
          if (tf != null) {
             tf.setChecked(false);
          }
          this.f = p0;
          p0.setChecked(true);
       }
       return;
    }
    public void S0(boolean p0){
       this.g = p0;
    }
    public void T0(){
       this.P0();
       this.k0();
    }
    public long d0(int p0){
       return (long)p0;
    }
    public int f0(int p0){
       g$e uoe = this.e.get(p0);
       if (uoe instanceof g$f) {
          return 2;
       }
       if (uoe instanceof g$d) {
          return 3;
       }
       if (!uoe instanceof g$g) {
          throw new RuntimeException("Unknown item type.");
       }
       if (uoe.a().hasSubMenu()) {
          return 1;
       }
       return 0;
    }
    public int getItemCount(){
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.M0(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.N0(p0, p1);
    }
}
