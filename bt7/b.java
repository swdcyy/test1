package bt7.b;
import android.view.View;
import android.view.Window;
import java.lang.Object;
import android.content.Context;
import android.graphics.Bitmap;
import il9.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.SparseArray;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import il9.e$a;
import il9.e$b;
import lnc.a1;
import kl9.a$b;
import jl9.c;
import jl9.d$a;
import com.yxcorp.utility.n;

public class b	// class@00046b
{
    public View a;
    public Window b;
    public EmojiFireWorkAnimView c;
    public e d;

    public void b(View p0,Window p1){
       super();
       this.d = null;
       this.a = p0;
       this.b = p1;
    }
    public final e a(Context p0,Bitmap p1){
       SparseArray obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SparseArray();
       obj.put(R.drawable.arg_RES_7f0804b0, CdnResource$ResourceKey.combo_number_0);
       obj.put(R.drawable.arg_RES_7f0804b1, CdnResource$ResourceKey.combo_number_1);
       obj.put(R.drawable.arg_RES_7f0804b2, CdnResource$ResourceKey.combo_number_2);
       obj.put(R.drawable.arg_RES_7f0804b3, CdnResource$ResourceKey.combo_number_3);
       obj.put(R.drawable.arg_RES_7f0804b4, CdnResource$ResourceKey.combo_number_4);
       obj.put(R.drawable.arg_RES_7f0804b5, CdnResource$ResourceKey.combo_number_5);
       obj.put(R.drawable.arg_RES_7f0804b6, CdnResource$ResourceKey.combo_number_6);
       obj.put(R.drawable.arg_RES_7f0804b7, CdnResource$ResourceKey.combo_number_7);
       obj.put(R.drawable.arg_RES_7f0804b8, CdnResource$ResourceKey.combo_number_8);
       obj.put(R.drawable.arg_RES_7f0804b9, CdnResource$ResourceKey.combo_number_9);
       obj.put(R.drawable.arg_RES_7f0804c6, CdnResource$ResourceKey.combo_text_0);
       obj.put(R.drawable.arg_RES_7f0804c5, CdnResource$ResourceKey.combo_text_1);
       obj.put(R.drawable.arg_RES_7f0804c7, CdnResource$ResourceKey.combo_text_2);
       e$a uoa = e$a.b(p0, "");
       uoa.d(new int[10]{R.drawable.arg_RES_7f0804b0,0x7f0804b1,R.drawable.arg_RES_7f0804b2,0x7f0804b3,R.drawable.arg_RES_7f0804b4,0x7f0804b5,R.drawable.arg_RES_7f0804b6,0x7f0804b7,R.drawable.arg_RES_7f0804b8,0x7f0804b9});
       int[] ointArray = new int[]{0x7f0804ba};
       uoa = uoa.i(CdnResource$ResourceKey.combo_particle, ointArray);
       uoa.f(obj);
       uoa.k = p1;
       e$b[] uobArray = new e$b[]{e$b.a(0x7f0804c6, 0)};
       uoa.e(uobArray);
       uoa.c(160, 290);
       uoa.g(a1.e(38.00f));
       uoa.j(c.a(0x3fb33333, 2.00f));
       uoa.h(((float)n.z(p0) * 0x3f47ae14));
       uoa.m(((float)n.z(p0) * 0x3f5c28f6));
       uoa.l(700);
       uoa.o = true;
       uoa.q = a1.e(32.00f);
       uoa.p = a1.e(22.00f);
       uoa.l = true;
       uoa.m = 3;
       uoa.n = 6;
       return uoa.a();
    }
}
