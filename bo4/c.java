package bo4.c;
import com.kuaishou.pagedy.b$a;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.bowl.core.component.a;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class c implements b$a	// class@0003a9
{
    public final String a;

    public void c(String p0){
       this.a = p0;
    }
    public final boolean a(a p0){
       return TextUtils.equals(this.a, p0.getInstanceId());
    }
}
