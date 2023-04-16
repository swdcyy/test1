package ag2.a;
import ok.x;
import ag2.f;
import java.lang.Object;
import java.util.Objects;
import com.google.gson.JsonObject;
import dg2.d;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;

public final class a implements x	// class@0000c7
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final Object get(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("count", Integer.valueOf(tb.L.e().a()));
       return jsonObject;
    }
}
