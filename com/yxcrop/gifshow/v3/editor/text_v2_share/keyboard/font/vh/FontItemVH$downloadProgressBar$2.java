package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vh.FontItemVH$downloadProgressBar$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import com.yxcorp.gifshow.widget.MagicFaceDownloadProgressBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FontItemVH$downloadProgressBar$2 extends Lambda implements a	// class@000ba7
{
    public final View $itemView;

    public void FontItemVH$downloadProgressBar$2(View p0){
       this.$itemView = p0;
       super(0);
    }
    public final MagicFaceDownloadProgressBar invoke(){
       Object obj = PatchProxy.apply(null, this, FontItemVH$downloadProgressBar$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$itemView.findViewById(0x7f0a1482);
    }
    public Object invoke(){
       return this.invoke();
    }
}