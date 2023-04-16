package njd.a;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.retrofit.model.Region;
import com.google.gson.JsonElement;
import okhttp3.Response;

public class a	// class@001f51
{
    public final Object a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final Region h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public Response m;
    public boolean n;
    public JsonElement o;

    public void a(Object p0,int p1,String p2,String p3,long p4,long p5){
       super(p0, p1, p2, p3, p4, p5, null, 0, 0, 0, 2, null);
    }
    public void a(Object p0,int p1,String p2,String p3,long p4,long p5,Region p6,long p7,long p8,int p9,int p10,JsonElement p11){
       super(p0, p1, p2, null, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }
    public void a(Object p0,int p1,String p2,String p3,String p4,long p5,long p6,Region p7,long p8,long p9,int p10,int p11,JsonElement p12){
       int i = this;
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.e = p3;
       i.d = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = p9;
       i.k = p10;
       i.l = p11;
       i.o = p12;
    }
    public Object a(){
       return this.a;
    }
    public int b(){
       return this.b;
    }
    public String c(){
       return this.c;
    }
    public String d(){
       return this.d;
    }
    public String e(){
       return this.e;
    }
    public int f(){
       return this.l;
    }
    public int g(){
       return this.k;
    }
    public long h(){
       return this.i;
    }
    public JsonElement i(){
       return this.o;
    }
    public Region j(){
       return this.h;
    }
    public long k(){
       return this.j;
    }
    public long l(){
       return this.g;
    }
    public long m(){
       return this.f;
    }
    public Response n(){
       return this.m;
    }
    public void o(Response p0){
       this.m = p0;
    }
}
