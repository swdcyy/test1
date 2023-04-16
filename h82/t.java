package h82.t;
import ok.x;
import h82.z;
import java.lang.Object;
import java.util.Objects;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;

public final class t implements x	// class@002ceb
{
    public final z b;

    public void t(z p0){
       this.b = p0;
    }
    public final Object get(){
       t tb = this.b;
       Objects.requireNonNull(tb);
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("if_follow", Integer.valueOf(tb.e9()));
       return jsonObject;
    }
}
