package fx2.h$c;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import fx2.h;
import android.view.View;
import java.lang.Object;
import kotlin.jvm.internal.a;
import rsd.e;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt;
import android.widget.LinearLayout;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class h$c extends RecyclerView$ViewHolder	// class@002a05
{
    public final e a;
    public final e b;
    public final e c;
    public final e d;
    public final h e;
    public static final n[] f;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(h$c.class, "coverImageView", "getCoverImageView\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0)),m0.r(new PropertyReference1Impl(h$c.class, "nameTextView", "getNameTextView\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(h$c.class, "maskView", "getMaskView\(\)Landroid/widget/LinearLayout;", 0)),m0.r(new PropertyReference1Impl(h$c.class, "moreImageView", "getMoreImageView\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0))};
       h$c.f = onArray;
    }
    public void h$c(h p0,View p1){
       a.p(p1, "itemView");
       this.e = p0;
       super(p1);
       this.a = KotterKnifeKt.c(this, 0x7f0a0d72);
       this.b = KotterKnifeKt.c(this, 0x7f0a0d77);
       this.c = KotterKnifeKt.c(this, 0x7f0a2c0e);
       this.d = KotterKnifeKt.c(this, 0x7f0a0d76);
    }
    public final LinearLayout a(){
       Object obj = PatchProxy.apply(null, this, h$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.a(this, h$c.f[2]);
    }
}
