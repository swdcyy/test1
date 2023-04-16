package com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder$badMediaChecker$1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Collection;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;

public final class AlbumLimitOption$Builder	// class@0019bb
{
    public String A;
    public boolean B;
    public int C;
    public boolean D;
    public IBadMediaChecker E;
    public int a;
    public String b;
    public long c;
    public String d;
    public int e;
    public int f;
    public String g;
    public long h;
    public String i;
    public long j;
    public long k;
    public String l;
    public String m;
    public boolean n;
    public boolean o;
    public String p;
    public ArrayList q;
    public ArrayList r;
    public int s;
    public int t;
    public String u;
    public Long v;
    public MediaFilterList w;
    public String x;
    public boolean y;
    public int z;

    public void AlbumLimitOption$Builder(){
       super();
       this.a = 31;
       this.c = Long.MAX_VALUE;
       this.e = 1000;
       this.h = Long.MAX_VALUE;
       this.k = Long.MAX_VALUE;
       this.q = new ArrayList();
       this.r = new ArrayList();
       this.x = "post_asset_picker";
       this.z = 1;
       this.C = 2;
       this.E = new AlbumLimitOption$Builder$badMediaChecker$1();
    }
    public final AlbumLimitOption$Builder a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumLimitOption$Builder.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "_a");
       this.x = p0;
       return this;
    }
    public final AlbumLimitOption$Builder b(ArrayList p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumLimitOption$Builder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "_a");
       this.q.addAll(p0);
       return this;
    }
    public final AlbumLimitOption$Builder c(String p0){
       if (p0 != null) {
          this.p = p0;
       }
       return this;
    }
    public final AlbumLimitOption d(){
       Object obj = PatchProxy.apply(null, this, AlbumLimitOption$Builder.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AlbumLimitOption(this);
    }
    public final AlbumLimitOption$Builder e(ArrayList p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumLimitOption$Builder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "_a");
       this.r.addAll(p0);
       return this;
    }
    public final AlbumLimitOption$Builder f(boolean p0){
       this.o = p0;
       return this;
    }
    public final AlbumLimitOption$Builder g(int p0){
       this.a = p0;
       if (p0 == 1) {
          this.n = true;
       }
       return this;
    }
    public final AlbumLimitOption$Builder h(String p0){
       if (p0 != null) {
          this.b = p0;
       }
       return this;
    }
    public final AlbumLimitOption$Builder i(long p0){
       this.c = p0;
       return this;
    }
    public final AlbumLimitOption$Builder j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumLimitOption$Builder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "_a");
       this.d = p0;
       return this;
    }
    public final AlbumLimitOption$Builder k(int p0){
       this.e = p0;
       return this;
    }
    public final AlbumLimitOption$Builder l(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumLimitOption$Builder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "_a");
       this.g = p0;
       return this;
    }
    public final AlbumLimitOption$Builder m(int p0){
       this.z = p0;
       if (p0 < 1) {
          this.z = 1;
       }
       return this;
    }
    public final AlbumLimitOption$Builder n(int p0){
       this.C = p0;
       return this;
    }
    public final AlbumLimitOption$Builder o(IMediaSelectableFilter p0){
       AlbumLimitOption$Builder obj = PatchProxy.applyOneRefs(p0, this, AlbumLimitOption$Builder.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "_a");
       if (this.w == null) {
          this.w = new MediaFilterList();
       }
       obj = this.w;
       if (obj != null) {
          obj.add(p0);
       }
       return this;
    }
    public final AlbumLimitOption$Builder p(boolean p0){
       this.n = p0;
       return this;
    }
}
