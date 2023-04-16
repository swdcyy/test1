package a88.c;
import java.lang.Runnable;
import com.mini.codescan.CodeScanActivity;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import fo7.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import om.f;
import om.p;

public final class c implements Runnable	// class@00004a
{
    public final CodeScanActivity b;
    public final String c;

    public void c(CodeScanActivity p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tb = this.b;
       Objects.requireNonNull(tb);
       String str = b.a(BitmapFactory.decodeFile(this.c));
       if (!TextUtils.isEmpty(str)) {
          tb.l = str;
          tb.finish();
       }else {
          p.a(R.string.arg_RES_7f1035ec);
       }
       return;
    }
}
