package com.yxcorp.gifshow.music.cloudmusic.search.a;
import c35.i;
import y8c.g;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import java.util.HashMap;
import dpb.j;
import com.kuaishou.viewbinder.IViewBinder;
import com.yxcorp.gifshow.music.cloudmusic.common.viewbinder.AbsSearchMusicItemViewBinder;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import vpb.a;
import com.kuaishou.android.model.music.Music;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import y8c.f;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import lob.f;
import ekd.j;
import uob.a;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment;
import fpb.b;
import java.lang.Number;
import com.kuaishou.android.model.music.MusicType;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import uob.j;
import android.content.Context;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kuaishou.viewbinder.BaseViewBinder;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$b;
import lnc.a1;
import xob.f;
import tob.d0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tob.b;
import tob.a;
import vob.c;
import com.yxcorp.gifshow.music.utils.CloudMusicViewFactory$ElementType;
import com.yxcorp.gifshow.music.utils.CloudMusicViewFactory;
import vob.a;
import vob.b;
import tob.p;
import ml8.c;
import c35.c;
import jpb.b;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$a;

public class a extends g implements i	// class@002033
{
    public a A;
    public c B;
    public String C;
    public MusicSearchUiOption D;
    public final CloudMusicHelper$a E;
    public final boolean w;
    public CloudMusicHelper x;
    public AbsSearchMusicItemViewBinder y;
    public Map z;

    public void a(CloudMusicHelper p0,boolean p1){
       super();
       this.z = new HashMap();
       this.E = new j(this);
       this.x = p0;
       this.w = p1;
    }
    public IViewBinder O1(){
       return this.y;
    }
    public IViewBinder V5(int p0){
       return this.r1(p0);
    }
    public void W0(List p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "8")) {
          return;
       }
       super.W0(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "9") && !q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uoa = iterator.next();
             if (uoa == null) {
                continue ;
             }else if(uoa.c() == 1){
                this.A = uoa;
             }else if(!uoa.c() && (uoa.a() != null && !TextUtils.x(uoa.a().mId))){
                this.z.put(uoa.a().mId, uoa);
             }
          }
       }
       return;
    }
    public ArrayList a1(int p0,f p1){
       Object[] objArray;
       ArrayList uArrayList;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "5");
          if (p1 != patchProxyRe) {
             return p1;
          }
       }
       g tk = this.k;
       int i = 0;
       int i1 = 1;
       if (tk instanceof CloudMusicRecyclerFragment) {
          objArray = new Object[]{tk,tk.Gh()};
          uArrayList = j.a(objArray);
       }else {
          objArray = new Object[i1];
          objArray[i] = tk;
          uArrayList = j.a(objArray);
       }
       a uoa1 = this.N0(p0);
       if (uoa1 != null) {
          uArrayList.add(uoa1);
          if (!uoa1.c()) {
             uArrayList.add(uoa1.a());
          }else if(uoa1.c() == i1){
             uoa = new a();
             uoa.b = uoa1.b;
             String str = PatchProxy.apply(null, uoa1, a.class, "1");
             if (str != patchProxyRe) {
             }else {
                str = TextUtils.k(uoa1.c);
             }
             uoa.c = str;
             uArrayList.add(uoa);
          }
          g tk1 = this.k;
          if (tk1 instanceof SearchMusicFragment) {
             uArrayList.add(tk1.Oh());
          }
          uoa1 = this.D;
          if (uoa1 != null) {
             uArrayList.add(uoa1);
          }
       }
       return uArrayList;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a uoa1 = this.N0(p0);
       int i = 0;
       if (uoa1 == null) {
          return i;
       }else if(!uoa1.c()){
          if (uoa1.a().mType == MusicType.LIP) {
             return 3;
          }else {
             return 1;
          }
       }else if(uoa1.c() == 1){
          return 4;
       }else {
          return i;
       }
    }
    public f h1(ViewGroup p0,int p1){
       AbsSearchMusicItemViewBinder obj;
       View view;
       j oj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 4) {
          view = a.i(p0, R.layout.arg_RES_7f0d101a);
          oj = new j();
       }else {
          obj = this.r1(p1);
          this.y = obj;
          view = obj.getBindedView(LayoutInflater.from(p0.getContext()), p0, null);
          this.y.bindViews(view);
          uoa = this.D;
          if (uoa != null && MusicSearchUiOption.Companion.a(uoa.getMainColorId())) {
             view.setBackgroundColor(a1.a(this.D.getMainColorId()));
          }
          f uof = new f(this.y);
          uof.U7(new d0());
          uof.P8(new b());
          uof.P8(new a());
          uof.P8(new c());
          if (this.y.z() != null) {
             CloudMusicViewFactory.d(this.y.z(), CloudMusicViewFactory$ElementType.FAVORITE);
             uof.V7(R.id.favorite_btn, new a());
          }
          if (p1 == 1 && this.y.y() != null) {
             CloudMusicViewFactory.d(this.y.y(), CloudMusicViewFactory$ElementType.SCISSORS);
             uof.V7(R.id.scissor_btn, new b());
          }
          if (p1 == 1 && this.w != null) {
             uof.U7(new p());
          }
          oj = uof;
       }
       return new f(view, oj);
    }
    public AbsSearchMusicItemViewBinder r1(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(this.C, AbsSearchMusicItemViewBinder.class, this.B);
    }
    public a s1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.get(p0);
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.u0(p0);
       this.x.g(this.E);
       return;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       super.z0(p0);
       this.x.n(this.E);
       return;
    }
}
