package a.a.a.a.b.f.a$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class a$a extends Enum	// class@00001a
{
    public static final a$a a;
    public static final a$a b;
    public static final a$a c;
    public static final a$a[] d;

    static {
       a$a uoa = new a$a("UNKNOWN", 0);
       a$a.a = uoa;
       a$a uoa1 = new a$a("ARMEABI_V7A", 1);
       a$a.b = uoa1;
       a$a uoa2 = new a$a("ARM64_V8A", 2);
       a$a.c = uoa2;
       a$a[] uoaArray = new a$a[]{uoa,uoa1,uoa2};
       a$a.d = uoaArray;
    }
    public void a$a(String p0,int p1){
       super(p0, p1);
    }
    public static a$a valueOf(String p0){
       return Enum.valueOf(a$a.class, p0);
    }
    public static a$a[] values(){
       return a$a.d.clone();
    }
}
