package vc.m;
import android.content.Context;
import eb.a;
import yc.b;
import yc.d;
import vc.f;
import com.facebook.common.memory.b;
import tc.v;
import tc.g;
import tc.h;
import sc.d;
import vc.a;
import java.lang.Object;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.content.res.AssetManager;
import tc.d;
import id.b0;
import id.a;
import id.k0;
import com.facebook.imagepipeline.producers.ThreadHandoffProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheGetProducer;
import com.facebook.imagepipeline.producers.b;
import java.util.concurrent.Executor;
import ab.i;
import java.lang.Runnable;
import ab.h;
import id.n;
import id.o;
import com.facebook.imagepipeline.producers.h;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.k;
import com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer;
import com.facebook.imagepipeline.producers.n;
import com.facebook.imagepipeline.producers.m;
import ld.d;
import com.facebook.imagepipeline.producers.r;
import id.j0;
import com.facebook.imagepipeline.producers.t;

public class m	// class@002697
{
    public ContentResolver a;
    public Resources b;
    public AssetManager c;
    public final a d;
    public final b e;
    public final d f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final f j;
    public final b k;
    public final g l;
    public final g m;
    public final v n;
    public final v o;
    public final h p;
    public final d q;
    public final d r;
    public final d s;
    public final int t;
    public final int u;
    public boolean v;
    public final a w;
    public final int x;
    public final boolean y;

    public void m(Context p0,a p1,b p2,d p3,boolean p4,boolean p5,boolean p6,f p7,b p8,v p9,v p10,g p11,g p12,h p13,d p14,int p15,int p16,boolean p17,int p18,a p19,boolean p20,int p21){
       int i = this;
       int i1 = p21;
       super();
       i.a = p0.getApplicationContext().getContentResolver();
       i.b = p0.getApplicationContext().getResources();
       i.c = p0.getApplicationContext().getAssets();
       i.d = p1;
       i.e = p2;
       i.f = p3;
       i.g = p4;
       i.h = p5;
       i.i = p6;
       i.j = p7;
       i.k = p8;
       i.o = p9;
       i.n = p10;
       i.l = p11;
       i.m = p12;
       i.p = p13;
       i.s = p14;
       i.q = new d(i1);
       i.r = new d(i1);
       i.t = p15;
       i.u = p16;
       i.v = p17;
       i.x = p18;
       i.w = p19;
       i.y = p20;
    }
    public static a a(b0 p0){
       return new a(p0);
    }
    public b0 b(b0 p0,k0 p1){
       return new ThreadHandoffProducer(p0, p1);
    }
    public BitmapMemoryCacheGetProducer c(b0 p0){
       return new BitmapMemoryCacheGetProducer(this.o, this.p, p0);
    }
    public b d(b0 p0){
       b uob = new b(this.d, this.j.h(), this.e, this.f, this.g, this.h, this.i, p0, this.x, this.w, null, i.b);
       return v13;
    }
    public n e(b0 p0){
       return new n(this.l, this.m, this.p, p0);
    }
    public o f(b0 p0){
       return new o(this.p, this.y, p0);
    }
    public h g(){
       return new h(this.j.b(), this.k, this.a);
    }
    public LocalExifThumbnailProducer h(){
       return new LocalExifThumbnailProducer(this.j.g(), this.k, this.a);
    }
    public k i(){
       return new k(this.j.b(), this.k);
    }
    public LocalVideoThumbnailProducer j(){
       return new LocalVideoThumbnailProducer(this.j.b(), this.a);
    }
    public b0 k(n p0){
       return new m(this.k, this.d, p0);
    }
    public r l(b0 p0,boolean p1,d p2){
       r or = new r(this.j.a(), this.k, p0, p1, p2);
       return v6;
    }
    public j0 m(b0 p0){
       return new j0(p0);
    }
    public t n(b0 p0){
       return new t(this.j.a(), this.k, p0);
    }
}
