package be8.o;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import be8.r;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.text.TextUtils;
import zi8.z;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import brd.g;
import java.security.InvalidParameterException;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class o implements g	// class@00033c
{
    public final String b;

    public void o(String p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       o tb = this.b;
       Matcher matcher = r.a.matcher(tb);
       if (matcher.matches()) {
          String str = matcher.group(1);
          if (!TextUtils.isEmpty(str)) {
             byte[] uobyteArray = z.a(str);
             if (uobyteArray != null) {
                p0.onNext(BitmapFactory.decodeByteArray(uobyteArray, 0, uobyteArray.length));
                p0.onComplete();
             label_0045 :
                return;
             }
          }
       }
       p0.onError(new InvalidParameterException("can not decode image: "+tb));
       goto label_0045 ;
    }
}
