package aja.j;
import x2b.a;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import aja.j$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import uv8.a;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import aja.e;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import java.util.List;
import g9c.a;
import jia.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import l66.c;
import va5.b;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import kp.r1;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.k2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.log.d0;
import com.yxcorp.gifshow.log.c0;
import aja.h;
import k2b.e0;
import java.lang.Runnable;
import t45.c;
import android.view.ViewGroup;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class j extends a	// class@000091
{
    public b g;
    public boolean h;
    public e0 i;
    public b j;
    public final RecyclerView$i k;

    public void j(RecyclerView p0,g p1){
       super(p0, p1);
       this.h = false;
       j$a uoa = new j$a(this);
       this.k = uoa;
       this.g = RxBus.f.f(a.class).observeOn(d.a).subscribe(new e(this), e.b);
       p1.F0(uoa);
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "11")) {
          return;
       }
       this.j();
       this.i = objArray;
       this.c.I0(this.k);
       return;
    }
    public void e(){
       int i6;
       int i7;
       View view1;
       Object obj2;
       d0 uod0;
       int i = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, i, j.class, "1")) {
          return;
       }
       if (i.h != null) {
          this.j();
       }
       i3 obj = PatchProxy.apply(objArray, i, j.class, "2");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          boolean i1 = Math.max(this.b(), i.d);
          i.d = i1;
          if (i1 != -1 && i.b.getAdapter() != null) {
             List list = i.c.Q0();
             i1 = Math.min(i.d, (i.b.getAdapter().getItemCount() - 1));
             if (this.h() != null) {
                i1 = i1 - this.h().t1();
             }
             int i2 = Math.min(i1, (list.size() - 1));
             int i3 = this.a();
             int i4 = (this.h() != null)? this.h().t1(): 0;
             float f = 0;
             b uob = null;
             ClientEvent$ExpTagTrans[] uExpTagTrans = null;
             int i5 = 0;
             while (i5 <= i2) {
                Object obj1 = list.get(i5);
                if (TextUtils.x(obj1.getPhotoId()) || i.c(obj1)) {
                   i6 = i5;
                   i7 = i4;
                }else if(f - uob <= 0){
                   obj1.setDirection(1);
                   f = f + obj1.getCoverAspectRatioPrioritizeAdCover();
                }else {
                   obj1.setDirection(2);
                   uob = uob + obj1.getCoverAspectRatioPrioritizeAdCover();
                }
                float f1 = f;
                float f2 = uob;
                obj1.setPosition(i5);
                View view = i.g(i5, i3, i4);
                if (obj1.mEntity != null) {
                   c.a().b(new b(obj1.mEntity, view));
                }
                obj = PatchProxy.applyOneRefs(obj1, i, j.class, "6");
                if (obj != PatchProxyResult.class) {
                   i1 = obj.booleanValue();
                }else if(r1.k2(obj1.mEntity) || r1.U2(obj1.mEntity)){
                   i1 = obj1.isShowed();
                }else if(obj1.isShowed() || obj1.getCoverMetaExtra("KWAI_IMAGE_CALLER_CONTEXT") == null){
                   i1 = true;
                }else {
                   i1 = false;
                }
                if (i1) {
                   i6 = i5;
                   i7 = i4;
                   f = f1;
                   uob = f2;
                }else {
                   obj1.setShowed(1);
                   obj = PatchProxy.applyOneRefs(obj1, i, j.class, "4");
                   if (obj != PatchProxyResult.class) {
                   }else {
                      obj = i3.f();
                      obj.c("video_start_type", Integer.valueOf(obj1.getVideoColdStartType()));
                      obj.c("support_type", Integer.valueOf(obj1.getSupportType()));
                      if (r1.l3(obj1.mEntity)) {
                         obj.d("photo_type", "PANORAMIC_PHOTO");
                      }
                   }
                   if (!PatchProxy.applyVoidTwoRefs(obj1, obj, i, j.class, "5")) {
                      if (r1.S2(obj1.getEntity())) {
                         ClientEvent$ExpTagTransList uExpTagTrans1 = new ClientEvent$ExpTagTransList();
                         uExpTagTrans = new ClientEvent$ExpTagTrans[1];
                         uExpTagTrans1.expTagTrans = uExpTagTrans;
                         ClientEvent$ExpTagTrans uExpTagTrans2 = new ClientEvent$ExpTagTrans();
                         uExpTagTrans2.serverExpTag = r1.I1(obj1.mEntity);
                         uExpTagTrans1.expTagTrans[b] = uExpTagTrans2;
                         k2 ok2 = b.a(0x4b316083).Q();
                         if (ok2 != null) {
                            ClientEvent$UrlPackage urlPackage = ok2.e(1);
                            if (!TextUtils.x(urlPackage.entryPageSource)) {
                               urlPackage = urlPackage.entryPageSource;
                            label_01a8 :
                               uod0 = d0.f(obj1.mEntity, urlPackage, uExpTagTrans1);
                               uod0.c(obj.e());
                               c0.q().n(uod0);
                            }
                         }
                         String str = null;
                         goto label_01a8 ;
                      }else {
                         uod0 = d0.e(obj1.mEntity);
                         uod0.c(obj.e());
                         c0.q().n(uod0);
                      }
                   }
                   j i8 = i.i;
                   if (PatchProxy.isSupport(j.class)) {
                      view1 = view;
                      obj2 = obj1;
                      i6 = i5;
                      i7 = i4;
                      if (PatchProxy.applyVoidFourRefs(obj1, Integer.valueOf(i5), view, i8, this, j.class, "7")) {
                      label_0213 :
                         f = f1;
                         uob = f2;
                         uExpTagTrans = 1;
                      }
                   }else {
                      view1 = view;
                      obj2 = obj1;
                      i6 = i5;
                      i7 = i4;
                   }
                   h oh = new h(this, obj2, i6, view1, i8);
                   c.a(i4);
                   goto label_0213 ;
                }
                i5 = i6 + 1;
                i4 = i7;
                QPhoto qPhoto = null;
             }
             b = uExpTagTrans;
          }
       }
       i.h = b;
       return;
    }
    public View g(int p0,int p1,int p2){
       if (PatchProxy.isSupport(j.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, j.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = (p0 + p2) - p1;
       if (p0 < 0) {
          return null;
       }else {
          return this.b.getChildAt(p0);
       }
    }
    public final g h(){
       j obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj instanceof HomeFollowFragment) {
          return obj.g7();
       }
       return null;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       if (this.b.getAdapter() == null) {
          return;
       }
       int i = Math.max(this.b(), this.d);
       this.d = i;
       if (i == -1) {
          return;
       }
       List list = this.c.Q0();
       int i1 = this.b.getAdapter().getItemCount() - 1;
       int i2 = Math.min(this.d, i1);
       if (this.h() != null) {
          i2 = i2 - this.h().t1();
       }
       i1 = list.size() - 1;
       i2 = Math.min(i2, i1);
       i1 = this.a();
       int i3 = 0;
       int i4 = (this.h() != null)? this.h().t1(): 0;
       while (i3 <= i2) {
          QPhoto qPhoto = list.get(i3);
          View view = this.g(i3, i1, i4);
          if (qPhoto != null && qPhoto.mEntity != null) {
             c.a().b(new b(qPhoto.mEntity, view));
          }
          i3 = i3 + 1;
       }
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, j.class, "12")) {
          return;
       }
       j tg = this.g;
       if (tg != null && !tg.isDisposed()) {
          this.g.dispose();
       }
       return;
    }
}
