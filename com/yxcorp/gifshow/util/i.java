package com.yxcorp.gifshow.util.i;
import erd.g;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import y8c.q;
import java.lang.Object;
import com.yxcorp.gifshow.util.i$a;
import com.yxcorp.gifshow.util.i$b;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import com.yxcorp.gifshow.util.h;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import y8c.c;
import g9c.a;
import android.view.View;
import java.lang.String;
import yx.j0;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Math;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import g9c.d;
import android.view.ViewGroup;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public abstract class i implements g	// class@001f83
{
    public final RecyclerView b;
    public final g c;
    public int d;
    public final RecyclerView$i e;
    public q f;
    public boolean g;
    public boolean h;
    public final RecyclerView$r i;
    public b j;

    public void i(RecyclerView p0,g p1,q p2){
       super();
       this.d = -1;
       i$a uoa = new i$a(this);
       this.e = uoa;
       this.h = true;
       i$b uob = new i$b(this);
       this.i = uob;
       this.b = p0;
       this.c = p1;
       this.f = p2;
       p0.addOnScrollListener(uob);
       p1.F0(uoa);
       this.j = this.f.Vg().i().subscribe(new h(this));
    }
    public abstract QPhoto a(Object p0);
    public void accept(Object p0){
       c a = p0.a;
       boolean b = true;
       if (a != b) {
          if (a != 4) {
             if (a != 5) {
                if (a == 6 && (p0.b != null && !p0.c.g7().R0())) {
                   this.d();
                   this.d = -1;
                }
             }else {
                this.c();
             }
          }else {
             this.g = b;
             this.d();
          }
       }else {
          this.g = false;
       }
       return;
    }
    public abstract void b(QPhoto p0,View p1);
    public void c(){
       this.b.removeOnScrollListener(this.i);
       this.c.I0(this.e);
       i tj = this.j;
       if (tj != null && !tj.isDisposed()) {
          this.j.dispose();
       }
       return;
    }
    public void d(){
       int i2;
       int i4;
       int i6;
       int i = 0;
       if (this.b.getAdapter() == null) {
          Object[] objArray = new Object[i];
          j0.c("CommercialBasePhotoShowConsumer", "reportRealShowItems adapter is null", objArray);
          return;
       }else {
          RecyclerView$LayoutManager layoutManage = this.b.getLayoutManager();
          int i1 = -1;
          if (layoutManage instanceof StaggeredGridLayoutManager) {
             i oi = (layoutManage.getSpanCount() == 2)? 1: null;
             if (!oi) {
             label_0054 :
                i2 = -1;
             }else {
                int[] ointArray2 = this.b.getLayoutManager().findLastVisibleItemPositions(null);
                i4 = ointArray2.length;
                i2 = -1;
                for (i6 = 0; i6 < i4; i6 = i6 + 1) {
                   i2 = Math.max(ointArray2[i6], i2);
                }
             }
          }else if(layoutManage instanceof LinearLayoutManager){
             i2 = layoutManage.c();
          }else {
             goto label_0054 ;
          }
          int i3 = Math.max(i2, this.d);
          this.d = i3;
          if (i3 == i1) {
             return;
          }else {
             List list = this.c.Q0();
             i4 = Math.min(this.d, (this.b.getAdapter().getItemCount() - 1));
             if (this.b.getAdapter() instanceof d) {
                i4 = i4 - this.b.getAdapter().b1();
             }
             i4 = Math.min(i4, (list.size() - 1));
             RecyclerView$LayoutManager layoutManage1 = this.b.getLayoutManager();
             if (layoutManage1 instanceof StaggeredGridLayoutManager) {
                int[] ointArray = this.b.getLayoutManager().findFirstVisibleItemPositions(null);
                if (ointArray != null && ointArray.length > 0) {
                   i1 = ointArray[i];
                }
                if (ointArray != null) {
                   i2 = ointArray.length;
                   for (int i5 = 0; i5 < i2; i5 = i5 + 1) {
                      i1 = Math.min(ointArray[i5], i1);
                   }
                }
             }else if(layoutManage1 instanceof LinearLayoutManager){
                i1 = layoutManage1.i0();
             }
             i6 = (this.b.getAdapter() instanceof d)? this.b.getAdapter().b1(): 0;
             float f = 0;
             float f1 = 0;
             int i7 = 0;
             while (i7 <= i4) {
                QPhoto qPhoto = this.a(list.get(i7));
                if (qPhoto == null) {
                   Object[] objArray1 = new Object[i];
                   j0.f("CommercialBasePhotoShowConsumer", "reportRealShowItems get photo is null", objArray1);
                }else if(f - f1 <= 0){
                   qPhoto.setDirection(1);
                   f = f + qPhoto.getCoverAspectRatioPrioritizeAdCover();
                }else {
                   qPhoto.setDirection(2);
                   f1 = f1 + qPhoto.getCoverAspectRatioPrioritizeAdCover();
                }
                qPhoto.setPosition(i7);
                int i8 = i7 + i6;
                i8 = i8 - i1;
                int[] ointArray1 = (i8 < 0)? null: this.b.getChildAt(i8);
                if (!TextUtils.x(qPhoto.getPhotoId()) && qPhoto.isAd()) {
                   this.b(qPhoto, ointArray1);
                }
                i7 = i7 + 1;
             }
             return;
          }
       }
    }
}
