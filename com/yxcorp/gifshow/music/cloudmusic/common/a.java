package com.yxcorp.gifshow.music.cloudmusic.common.a;
import y8c.g;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import lob.f;
import androidx.recyclerview.widget.f;
import oob.a;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$a;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import g9c.a;
import im8.c;
import java.lang.Number;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.MusicType;
import com.yxcorp.gifshow.music.cloudmusic.common.c$c;
import com.yxcorp.gifshow.music.cloudmusic.common.c$a;
import com.yxcorp.gifshow.music.cloudmusic.common.c$b;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.content.Context;
import i2b.a;
import qob.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tob.q;
import com.yxcorp.gifshow.music.cloudmusic.common.viewbinder.AbsCategoryMusicItemViewBinder;
import c35.c;
import com.kuaishou.viewbinder.IViewBinder;
import jpb.b;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kuaishou.viewbinder.BaseViewBinder;
import xob.f;
import tob.d0;
import tob.b;
import tob.a;
import tob.b0;
import tob.p;
import com.yxcorp.gifshow.music.utils.CloudMusicViewFactory$ElementType;
import com.yxcorp.gifshow.music.utils.CloudMusicViewFactory;
import tob.j;
import tob.o;
import wob.h;
import wob.k;
import qob.a;
import com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter;
import qob.d;
import ml8.c;
import java.util.List;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Collection;
import ekd.q;

public class a extends g	// class@002000
{
    public String A;
    public AbsCategoryMusicItemViewBinder B;
    public f C;
    public final boolean D;
    public final CloudMusicHelper$a E;
    public boolean F;
    public List G;
    public final f w;
    public CloudMusicHelper x;
    public int y;
    public c z;

    public void a(CloudMusicHelper p0,f p1,f p2,boolean p3){
       super();
       this.y = -1;
       a uoa = new a(this);
       this.E = uoa;
       this.F = true;
       this.w = p2;
       this.x = p0;
       p0.g(uoa);
       this.C = p1;
       this.D = p3;
       this.p1(true);
    }
    public ArrayList a1(int p0,f p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "5");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(this.N0(p0));
       uArrayList.add(this.C);
       uArrayList.add(new c("CLOUD_MUSIC_PAGE_LIST", this.C.i));
       return uArrayList;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Object obj1 = this.N0(p0);
       if (obj1 instanceof Music) {
          if (obj1.mType == MusicType.LIP) {
             return 3;
          }else if(obj1.mIsMockForGroupTitle != null){
             return 4;
          }else {
             return 2;
          }
       }else if(obj1 instanceof c$c){
          return 1;
       }else if(obj1 instanceof c$a){
          return 0;
       }else if(obj1 instanceof c$b){
          return 6;
       }else {
          return 5;
       }
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       View view;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       if (p1) {
          if (p1 != 1) {
             int i = 2;
             if (p1 != i && p1 != 3) {
                if (p1 != 4) {
                   if (p1 != 6) {
                      view = new View(p0.getContext());
                   }else {
                      view = a.i(p0, R.layout.arg_RES_7f0d0ff7);
                      obj.U7(new b(this.k.getActivity(), this.x));
                   }
                }else {
                   view = a.i(p0, R.layout.arg_RES_7f0d102a);
                   obj.U7(new q());
                }
             }else {
                AbsCategoryMusicItemViewBinder uAbsCategory = b.a(this.A, AbsCategoryMusicItemViewBinder.class, this.z);
                this.B = uAbsCategory;
                View bindedView = uAbsCategory.getBindedView(LayoutInflater.from(p0.getContext()), p0, null);
                this.B.bindViews(bindedView);
                f uof = new f(this.B);
                uof.U7(new d0());
                uof.P8(new b());
                uof.P8(new a());
                uof.P8(new b0());
                if (this.D != null) {
                   uof.U7(new p());
                }
                if (this.B.A() != null) {
                   CloudMusicViewFactory.d(this.B.A(), CloudMusicViewFactory$ElementType.FAVORITE);
                   uof.V7(R.id.favorite_btn, new j());
                }
                if (p1 == i && this.B.z() != null) {
                   CloudMusicViewFactory.d(this.B.z(), CloudMusicViewFactory$ElementType.SCISSORS);
                   uof.V7(R.id.scissor_btn, new o());
                }
                ViewGroup viewGroup = this.B.y();
                if (viewGroup != null) {
                   viewGroup.setVisibility(8);
                }
                obj.U7(uof);
                view = bindedView;
             }
          }else {
             obj.U7(new h(this.A, this.z, this.w));
             obj.U7(new k(this));
             view = a.i(p0, R.layout.arg_RES_7f0d1020);
          }
       }else {
          view = a.i(p0, R.layout.arg_RES_7f0d0ff6);
          obj.U7(new a(this.k.getActivity(), this.x));
          obj.U7(new CategoryOptPresenter());
          obj.U7(new d());
       }
       return new f(view, obj);
    }
    public void j1(boolean p0,boolean p1,List p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, a.class, "3")) {
          return;
       }
       if (this.F != null) {
          this.W0(p2);
          this.k0();
       }else {
          this.G = p2;
       }
       return;
    }
    public void r1(boolean p0){
       this.F = p0;
    }
    public void s1(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       if (!q.f(this.G)) {
          this.W0(this.G);
          this.k0();
       }
       return;
    }
}
