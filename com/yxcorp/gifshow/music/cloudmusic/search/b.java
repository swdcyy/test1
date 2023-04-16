package com.yxcorp.gifshow.music.cloudmusic.search.b;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvb.n0;
import com.yxcorp.gifshow.music.network.model.response.MusicItemWrapperResponse;
import hpb.a;
import upb.a;
import upb.f;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import dpb.n;
import java.util.List;
import qvb.a;
import la6.b;
import java.util.Iterator;
import vpb.a;
import com.kuaishou.android.model.music.Music;
import android.app.Application;
import o56.a;

public class b extends f	// class@002034
{
    public final int p;
    public String q;
    public String r;
    public String s;
    public int t;
    public int u;

    public void b(int p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.q)) {
          return objArray;
       }
       Object[] objArray1 = (TextUtils.x(this.s))? objArray: this.s;
       if (!this.K()) {
          objArray = this.L0().getCursor();
       }
       b tu = this.u;
       return f.a().c(this.q, this.p, objArray, objArray1, tu, a.a.a(this.p, tu)).map(new e()).observeOn(d.c).map(new n(this)).observeOn(d.a);
    }
    public void M1(Object p0,List p1){
       this.j2(p0, p1);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       super.clear();
       this.q = null;
       return;
    }
    public void d2(b p0,List p1){
       this.j2(p0, p1);
    }
    public String h2(){
       return this.q;
    }
    public String i2(){
       return this.r;
    }
    public void j2(MusicItemWrapperResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       super.d2(p0, p1);
       int i = 0;
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa.c() || uoa.a() == null) {
             continue ;
          }else {
             Music music = uoa.a();
             music.mIsSearchResult = true;
             music.mCategoryName = a.b().getString(0x7f100f55);
             music.mUssid = p0.getUssid();
             music.mSearchKeyWord = this.q;
             music.mCategoryId = 9999;
             music.mDisplayPhotoCount = p0.isDisplayPhotoCount();
             if (music.mIsMockForGroupTitle == null && music.mIsMagicRecommend == null) {
                int i1 = i + 1;
                music.mDataListIndex = i;
                i = i1;
             }
          }
       }
       this.r = p0.getUssid();
       return;
    }
}
