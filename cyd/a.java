package cyd.a;
import retrofit2.h$a;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import retrofit2.q;
import retrofit2.h;
import el.a;
import com.google.gson.TypeAdapter;
import retrofit2.converter.gson.GsonRequestBodyConverter;
import retrofit2.converter.gson.GsonResponseBodyConverter;

public final class a extends h$a	// class@000c9e
{
    public final Gson a;

    public void a(Gson p0){
       super();
       this.a = p0;
    }
    public static a a(){
       return a.b(new Gson());
    }
    public static a b(Gson p0){
       Objects.requireNonNull(p0, "gson == null");
       return new a(p0);
    }
    public h requestBodyConverter(Type p0,Annotation[] p1,Annotation[] p2,q p3){
       return new GsonRequestBodyConverter(this.a, this.a.j(a.get(p0)));
    }
    public h responseBodyConverter(Type p0,Annotation[] p1,q p2){
       return new GsonResponseBodyConverter(this.a, this.a.j(a.get(p0)));
    }
}
