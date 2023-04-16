package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vh.FontItemVH$fontImageWrapper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import android.widget.RelativeLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Paint;

public final class FontItemVH$fontImageWrapper$2 extends Lambda implements a	// class@000ba9
{
    public final View $itemView;

    public void FontItemVH$fontImageWrapper$2(View p0){
       this.$itemView = p0;
       super(0);
    }
    public final RelativeLayout invoke(){
       RelativeLayout obj = PatchProxy.apply(null, this, FontItemVH$fontImageWrapper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$itemView.findViewById(R.id.image_wrapper);
       obj.setLayerType(1, null);
       this.$itemView.setLayerType(1, null);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
