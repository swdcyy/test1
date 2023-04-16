package cdd.f;
import nfd.y3;
import cdd.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.plugin.search.result.a;
import java.util.List;
import com.yxcorp.plugin.search.SearchPage;
import nfd.o1;
import a9c.e;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import ekd.q;
import android.content.Context;
import androidx.fragment.app.Fragment;
import e7d.h;
import h8d.b;
import h8d.a;
import java.lang.String;
import y8c.g;
import com.yxcorp.plugin.search.entity.SearchItem;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Long;
import add.e;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ced.e2;
import com.yxcorp.plugin.search.result.hashtag.presenters.k0;
import i8d.v;
import r8d.a;
import i8d.r;
import ced.d2;
import com.yxcorp.plugin.search.result.hashtag.presenters.u;
import gbd.q;
import android.view.View;
import i2b.a;
import ml8.c;
import g9c.a;

public class f extends i implements y3	// class@000530
{
    public int A;
    public final ArrayList B;
    public final a y;
    public final SearchPage z;

    public void f(RecyclerFragment p0,a p1,List p2,int p3,SearchPage p4){
       super(new o1());
       this.A = -1;
       ArrayList uArrayList = new ArrayList();
       this.B = uArrayList;
       this.y = p1;
       p1.u = this;
       this.z = p4;
       uArrayList.add(p1);
       if (!q.f(p2)) {
          uArrayList.addAll(p2);
       }
       this.n1("FEED_ITEM_VIEW_PARAM", a.a(p0.getContext(), p1.c, p4, p3));
       return;
    }
    public void A(int p0){
       this.A = p0;
    }
    public int G(){
       return this.A;
    }
    public Object N0(int p0){
       return this.t1(p0);
    }
    public ArrayList a1(int p0,f p1){
       return this.B;
    }
    public long d0(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "3");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       SearchItem searchItem = this.t1(p0);
       Objects.requireNonNull(searchItem);
       searchItem = searchItem.mPhoto;
       if (searchItem == null) {
          return -2;
       }else {
          return Long.parseLong(searchItem.getPhotoId());
       }
    }
    public int f0(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       SearchItem searchItem = this.t1(p0);
       if (searchItem == null) {
          return e.b;
       }else if(searchItem.isTemplateCard()){
          return 5;
       }else if(searchItem.isMusicWeakCard()){
          return 4;
       }else {
          searchItem = searchItem.mPhoto;
          if (searchItem == null) {
             return e.b;
          }else if(searchItem.isVideoType()){
             return 1;
          }else if(searchItem.isImageType()){
             return 2;
          }else if(searchItem.isLiveStream()){
             return 3;
          }else {
             return 1;
          }
       }
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       if (p1 == 5) {
          p1 = 0x7f0d141d;
          obj.U7(new e2());
       }else if(p1 == 4){
          p1 = 0x7f0d141c;
          obj.U7(new k0());
       }else {
          obj.U7(new v());
          obj.U7(new a());
          if (p1 == 3) {
             obj.U7(new r());
          }else {
             obj.U7(new d2());
             obj.U7(new u());
          }
          obj.U7(new q());
          p1 = 0x7f0d141b;
       }
       return new f(a.i(p0, p1), obj);
    }
    public SearchItem t1(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return super.N0(p0);
    }
}
