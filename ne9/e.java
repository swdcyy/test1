package ne9.e;
import com.google.gson.JsonObject;
import java.lang.Object;

public final class e	// class@00316c
{
    public final JsonObject persistentData;
    public final JsonObject transientData;

    public void e(JsonObject p0,JsonObject p1){
       super();
       this.persistentData = p0;
       this.transientData = p1;
    }
    public final JsonObject a(){
       return this.persistentData;
    }
    public final JsonObject b(){
       return this.transientData;
    }
}
