package wj1.c;
import java.lang.String;
import android.text.SpannableString;
import java.io.File;
import java.util.List;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import com.kuaishou.live.core.show.gift.GiftMessage;

public interface abstract c	// class@004549
{

    float[] a(int p0);
    String b(int p0);
    boolean c();
    SpannableString d(int p0,int p1);
    File e(int p0);
    void f(List p0,List p1);
    Drawable g();
    boolean h();
    int[] i(GiftSlotMessage p0);
    boolean j();
    File k(GiftMessage p0);
    int[] l(GiftMessage p0);
    boolean m();
}
