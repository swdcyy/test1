package bk5.g;
import com.kwai.emotionsdk.bean.EmotionResponse;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class g	// class@0004bd
{
    public List a;
    public String b;
    public final int c;
    public final EmotionResponse d;

    public void g(int p0,EmotionResponse p1){
       a.p(p1, "response");
       super();
       this.c = p0;
       this.d = p1;
       this.a = CollectionsKt__CollectionsKt.E();
       this.b = "";
    }
    public final List a(){
       return this.a;
    }
    public final String b(){
       return this.b;
    }
    public final int c(){
       return this.c;
    }
    public final EmotionResponse d(){
       return this.d;
    }
}
