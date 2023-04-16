package com.yxcorp.gifshow.autoplay.live.e$a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.playeradapter.model.LiveStatusQueryBizType;
import t99.z;
import com.yxcorp.gifshow.autoplay.live.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class e$a	// class@001c17
{
    public int A;
    public int B;
    public final int C;
    public String D;
    public final String E;
    public long F;
    public BaseFeed a;
    public BaseFragment b;
    public z c;
    public int d;
    public boolean e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String j;
    public boolean k;
    public String l;
    public boolean m;
    public long n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public String u;
    public Map v;
    public String w;
    public int x;
    public int y;
    public int z;

    public void e$a(BaseFeed p0,BaseFragment p1,int p2,String p3){
       super();
       this.f = 1;
       this.g = true;
       this.h = true;
       this.i = true;
       this.j = LiveStatusQueryBizType.AUTO_PLAY_CARD.mValue;
       this.y = 0;
       this.z = 0;
       this.A = 1;
       this.F = 0;
       this.a = p0;
       this.b = p1;
       this.C = p2;
       this.E = p3;
    }
    public void e$a(BaseFeed p0,z p1,int p2,String p3){
       super();
       this.f = 1;
       this.g = true;
       this.h = true;
       this.i = true;
       this.j = LiveStatusQueryBizType.AUTO_PLAY_CARD.mValue;
       this.y = 0;
       this.z = 0;
       this.A = 1;
       this.F = 0;
       this.a = p0;
       this.c = p1;
       this.C = p2;
       this.E = p3;
    }
    public e$a a(int p0){
       this.z = p0;
       return this;
    }
    public e b(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e(this);
    }
    public e$a c(String p0){
       this.l = p0;
       return this;
    }
    public e$a d(boolean p0){
       this.i = p0;
       return this;
    }
    public e$a e(boolean p0){
       this.h = p0;
       return this;
    }
    public e$a f(int p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(this.w) && p0 > 0) {
          this.B = p0;
       }
       return this;
    }
    public e$a g(boolean p0){
       this.t = p0;
       return this;
    }
    public e$a h(int p0){
       this.x = p0;
       return this;
    }
    public e$a i(int p0){
       this.d = p0;
       return this;
    }
    public e$a j(boolean p0){
       this.g = p0;
       return this;
    }
    public e$a k(String p0){
       this.w = p0;
       return this;
    }
    public e$a l(int p0){
       this.B = p0;
       return this;
    }
    public e$a m(boolean p0){
       this.e = p0;
       return this;
    }
    public e$a n(boolean p0){
       this.m = p0;
       return this;
    }
}
