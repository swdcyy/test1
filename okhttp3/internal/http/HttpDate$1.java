package okhttp3.internal.http.HttpDate$1;
import java.lang.ThreadLocal;
import java.lang.Object;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.String;
import okhttp3.internal.Util;
import java.util.TimeZone;

public class HttpDate$1 extends ThreadLocal	// class@001f88
{

    public void HttpDate$1(){
       super();
    }
    public Object initialValue(){
       return this.initialValue();
    }
    public DateFormat initialValue(){
       SimpleDateFormat simpleDateFo = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss \'GMT\'", Locale.US);
       simpleDateFo.setLenient(false);
       simpleDateFo.setTimeZone(Util.UTC);
       return simpleDateFo;
    }
}
