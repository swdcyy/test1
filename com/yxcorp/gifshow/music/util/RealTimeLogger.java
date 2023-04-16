package com.yxcorp.gifshow.music.util.RealTimeLogger;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.music.util.RealTimeLogger$a;
import androidx.recyclerview.widget.RecyclerView$r;
import qvb.i;
import com.yxcorp.gifshow.music.util.RealTimeLogger$b;
import qvb.q;
import qvb.j;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import g9c.d;
import java.util.ArrayList;
import y8c.g;
import g9c.a;
import com.kuaishou.android.model.music.Music;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import jqb.k;
import java.lang.Integer;
import mr4.a$b;
import mr4.a$d;
import mr4.a$c;
import com.kuaishou.android.model.music.MusicType;
import s00.b$b;
import s00.b;
import com.google.protobuf.nano.MessageNano;
import upb.a;
import upb.f;
import brd.t;
import cjd.e;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Math;

public class RealTimeLogger implements LifecycleObserver	// class@002081
{
    public RecyclerFragment b;
    public int c;
    public int d;
    public RealTimeLogger$b e;
    public i f;

    public void RealTimeLogger(int p0){
       super();
       this.c = -1;
       this.d = p0;
    }
    public void a(RecyclerFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealTimeLogger.class, "1")) {
          return;
       }
       this.b = p0;
       RecyclerView recyclerView = p0.h0();
       if (recyclerView != null) {
          recyclerView.addOnScrollListener(new RealTimeLogger$a(this));
       }
       i oi = this.b.q();
       this.f = oi;
       if (oi != null && recyclerView != null) {
          RealTimeLogger$b uob = new RealTimeLogger$b(this, recyclerView);
          this.e = uob;
          oi.h(uob);
       }
       this.b.getLifecycle().addObserver(this);
       return;
    }
    public void b(){
       this.c = -1;
    }
    public void c(){
       k obj;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RealTimeLogger.class, "3")) {
          return;
       }
       RealTimeLogger tb = this.b;
       if (tb == null) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = tb.h0().getLayoutManager();
       if (layoutManage instanceof LinearLayoutManager) {
          int i = layoutManage.c() - this.b.ia().b1();
          ArrayList uArrayList = new ArrayList();
          int i1 = 1;
          int i2 = this.c + i1;
          while (i2 <= i) {
             obj = this.b.g7().O0(i2);
             if (obj instanceof Music && (!TextUtils.x(obj.mId) && obj.mType != null)) {
                uArrayList.add(obj);
             }
          label_0059 :
             i2 = i2 + 1;
          }
          if (!uArrayList.isEmpty()) {
             RealTimeLogger td = this.d;
             obj = k.class;
             if (!PatchProxy.isSupport(obj) || (!PatchProxy.applyVoidTwoRefs(uArrayList, Integer.valueOf(td), objArray, obj, "2") && !uArrayList.isEmpty())) {
                int i3 = 0;
                Music music = uArrayList.get(i3);
                a$b uob = new a$b();
                a$d uod = new a$d();
                if (music.isSearchDispatchMusic()) {
                   uod.a = music.mUssid;
                   a$c[] uocArray = new a$c[uArrayList.size()];
                   uod.b = uocArray;
                   for (; i3 < uArrayList.size(); i3 = i3 + 1) {
                      a$c uoc = new a$c();
                      uoc.c = uArrayList.get(i3).mId;
                      uoc.a = uArrayList.get(i3).mType.mValue;
                      uod.b[i3] = uoc;
                   }
                   uob.a = i1;
                   uob.b = uod;
                }else if(music.isRecommendMusic()){
                   uod.a = music.mLlsid;
                   a$c[] uocArray1 = new a$c[uArrayList.size()];
                   uod.b = uocArray1;
                   for (; i3 < uArrayList.size(); i3 = i3 + 1) {
                      a$c uoc1 = new a$c();
                      uoc1.c = uArrayList.get(i3).mId;
                      uoc1.a = uArrayList.get(i3).mType.mValue;
                      uod.b[i3] = uoc1;
                   }
                   uob.b(uod);
                }
                uob.c = td;
                f.a().o3(b.b().a(MessageNano.toByteArray(uob))).map(new e()).subscribe(Functions.d(), Functions.d());
             }
          }
          this.c = Math.max(this.c, i);
       }
       return;
    }
    public void onFragmentDestroy(){
       if (PatchProxy.applyVoid(null, this, RealTimeLogger.class, "2")) {
          return;
       }
       RealTimeLogger tf = this.f;
       if (tf != null) {
          RealTimeLogger te = this.e;
          if (te != null) {
             tf.f(te);
             this.e = null;
          }
          this.f = null;
       }
       tf = this.b;
       if (tf != null) {
          tf.getLifecycle().removeObserver(this);
       }
       return;
    }
}
