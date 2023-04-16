package com.yxcorp.gifshow.util.resource.g;
import com.yxcorp.gifshow.util.resource.f;
import android.content.Context;
import boc.b;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import com.kwai.feature.post.api.model.DownloadStatus;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin;
import com.yxcorp.gifshow.util.resource.g$d;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import java.util.Collection;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import java.util.Map;
import java.lang.Float;
import com.yxcorp.gifshow.util.resource.g$c;
import java.lang.Enum;
import android.widget.ProgressBar;
import qfc.a;
import java.lang.String;
import q87.c;
import android.app.Dialog;
import ekd.p0;
import java.util.Set;
import java.util.Iterator;
import com.yxcorp.gifshow.util.resource.Category;
import brd.t;
import com.yxcorp.gifshow.util.resource.g$a;
import brd.y;
import com.yxcorp.gifshow.util.resource.g$b;
import j16.b;
import java.lang.StringBuilder;

public class g extends f	// class@000ceb
{
    public final Map m;
    public g$d n;

    public void g(Context p0,b p1){
       super(p0);
       this.m = new HashMap();
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(p1);
       this.n(uArrayList);
    }
    public void g(Context p0,DownloadStatus p1,List p2){
       super(p0);
       this.i = p1;
       this.m = new HashMap();
       this.n(p2);
    }
    public void g(Context p0,List p1){
       super(p0, null, p1);
    }
    public void g(Context p0,List p1,List p2,FilterVideoPlugin p3){
       super(p0, null, p1);
       this.n = new g$d(p3);
       if (!p3.gf(FilterVideoPlugin$FilterEntranceType.EDIT)) {
          p0.b = true;
       }else {
          this.n.a.addAll(p2);
       }
       return;
    }
    public void d(n$c p0){
       n.a(p0);
    }
    public void f(b p0,DownloadStatus p1,float p2){
       if (this.m.containsKey(p0)) {
          f ti = this.i;
          DownloadStatus dOWNLOAD_FAI = DownloadStatus.DOWNLOAD_FAILED;
          if (ti != dOWNLOAD_FAI) {
             DownloadStatus dOWNLOAD_NET = DownloadStatus.DOWNLOAD_NETWORK_UNCONNECTED;
             if (ti != dOWNLOAD_NET) {
                this.m.put(p0, Float.valueOf(p2));
                int i = g$c.a[p1.ordinal()];
                if (i != 1) {
                   if (i != 2) {
                      if (i == 0.00f) {
                         this.k(DownloadStatus.DOWNLOADING);
                         if ((int)((float)this.d.getMax() * this.l()) > this.d.getProgress()) {
                            f td = this.d;
                            td.setProgress((int)((float)td.getMax() * this.l()));
                         }else {
                            Object[] objArray = new Object[0];
                            a.C().t("CategoryDialog", "Progress ValueError", objArray);
                         }
                      }
                   }else if(!p0.C(this.getContext())){
                      this.k(dOWNLOAD_NET);
                   }else {
                      this.k(dOWNLOAD_FAI);
                   }
                }else if(!this.l() - 0x3f800000){
                   this.k(DownloadStatus.DOWNLOAD_SUCCESS);
                }
             }
          }
       }
       return;
    }
    public void g(boolean p0){
       g tn;
       if (!this.m.size()) {
          tn = this.n;
          if (tn == null || (tn.b == null && tn.a.isEmpty())) {
             this.k(DownloadStatus.DOWNLOAD_FAILED);
             return;
          }
       }
       this.k(DownloadStatus.DOWNLOADING);
       Iterator iterator = this.m.keySet().iterator();
       while (iterator.hasNext()) {
          n.l(iterator.next());
       }
       tn = this.n;
       if (tn != null) {
          if (tn.b != null || !tn.a.isEmpty()) {
             this.m.put(Category.FILTER_HOLDER, Float.valueOf(0));
          }
          if (!tn.a.isEmpty()) {
             this.m(tn);
          }else if(tn.b != null){
             tn.c.PQ(FilterVideoPlugin$FilterEntranceType.EDIT).subscribe(new g$a(this, tn.c.V4(), tn));
          }
       }
       return;
    }
    public final float l(){
       float f = 0;
       if (!this.m.size()) {
          return f;
       }
       Iterator iterator = this.m.values().iterator();
       while (iterator.hasNext()) {
          f = f + iterator.next().floatValue();
       }
       return (f / (float)this.m.size());
    }
    public void m(g$d p0){
       p0.c.JC(p0.a, new g$b(this));
    }
    public final void n(List p0){
       if (p0 != null && p0.size() > 0) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             this.m.put(iterator.next(), Float.valueOf(0));
          }
          Object[] objArray = new Object[0];
          a.C().w("CategoryDialog", "initCategoriesProgressMap "+p0.toString(), objArray);
       }
       return;
    }
}
