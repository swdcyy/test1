package ua.a$b;
import android.content.Context;
import java.lang.Object;
import com.facebook.cache.disk.a;
import ua.a;
import ab.h;

public class a$b	// class@0025c7
{
    public int a;
    public String b;
    public h c;
    public long d;
    public long e;
    public long f;
    public b g;
    public CacheErrorLogger h;
    public CacheEventListener i;
    public b j;
    public boolean k;
    public final Context l;

    public void a$b(Context p0){
       super();
       this.a = 1;
       this.b = "image_cache";
       this.d = 0x2800000;
       this.e = 0xa00000;
       this.f = 0x200000;
       this.g = new a();
       this.l = p0;
    }
    public a a(){
       return new a(this);
    }
    public a$b b(h p0){
       this.c = p0;
       return this;
    }
    public a$b c(boolean p0){
       this.k = p0;
       return this;
    }
    public a$b d(long p0){
       this.d = p0;
       return this;
    }
}
