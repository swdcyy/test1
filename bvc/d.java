package bvc.d;
import java.lang.String;
import huc.s;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager;
import java.lang.Object;
import java.util.List;
import trd.t;
import android.app.Application;
import o56.a;
import android.content.Context;
import androidx.core.content.ContextCompat;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class d	// class@0004a0
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final TextStyleDataManager$a d;
    public static final List e;
    public static final List f;

    static {
       d.a = s.a(0xff000000);
       d.b = s.a(0);
       String str = s.a(-1);
       d.c = str;
       d.d = new TextStyleDataManager$a(new TextStyleDataManager$TextColors("SKY_BLUE", TextStyleDataManager.b(0x7f061a5b)));
       d.e = t.k(str);
       String[] stringArray = new String[]{str,s.a(ContextCompat.getColor(a.b(), 0x7f060657))};
       d.f = CollectionsKt__CollectionsKt.L(stringArray);
    }
    public static final String a(){
       return d.a;
    }
    public static final String b(){
       return d.b;
    }
    public static final String c(){
       return d.c;
    }
}
