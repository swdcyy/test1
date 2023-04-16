package com.yxcorp.gifshow.channel.stagger.banner.CustomLinearLayoutManager$a;
import androidx.recyclerview.widget.o;
import com.yxcorp.gifshow.channel.stagger.banner.CustomLinearLayoutManager;
import android.content.Context;
import android.util.DisplayMetrics;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class CustomLinearLayoutManager$a extends o	// class@001062
{
    public final CustomLinearLayoutManager q;

    public void CustomLinearLayoutManager$a(CustomLinearLayoutManager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public float v(DisplayMetrics p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomLinearLayoutManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (super.v(p0) * 5.00f);
    }
}
