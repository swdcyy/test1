package fh.i;
import java.lang.String;
import com.gifshow.kanim.parser.moshi.JsonReader$a;
import com.gifshow.kanim.parser.moshi.JsonReader;
import java.lang.Object;

public interface abstract i	// class@002008
{
    public static final JsonReader$a a;

    static {
       String[] stringArray = new String[]{"t","s"};
       i.a = JsonReader$a.a(stringArray);
    }
    Object a(JsonReader p0);
}
