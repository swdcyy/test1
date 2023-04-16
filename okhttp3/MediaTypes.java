package okhttp3.MediaTypes;
import java.lang.String;
import okhttp3.MediaType;
import java.lang.Object;

public class MediaTypes	// class@002081
{
    public static final MediaType JSON_UTF_8;

    static {
       MediaTypes.JSON_UTF_8 = MediaType.parse("application/json; charset=utf-8");
    }
    public void MediaTypes(){
       super();
    }
}
