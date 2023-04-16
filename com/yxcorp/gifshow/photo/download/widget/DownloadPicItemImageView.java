package com.yxcorp.gifshow.photo.download.widget.DownloadPicItemImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.n;
import android.app.Activity;
import lnc.a1;

public class DownloadPicItemImageView extends KwaiImageView	// class@000f39
{

    public void DownloadPicItemImageView(Context p0){
       super(p0);
    }
    public void DownloadPicItemImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(DownloadPicItemImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DownloadPicItemImageView.class, "1")) {
          return;
       }
       Context context = this.getContext();
       Object obj = PatchProxy.applyOneRefs(context, null, DownloadPicItemImageView.class, "2");
       if (obj != PatchProxyResult.class) {
          context = obj.intValue();
       }else {
          obj = n.z(context);
          if (context instanceof Activity && n.I(context)) {
             obj = n.j(context);
          }
          context = (obj - a1.e(54.00f)) / 3;
       }
       this.setMeasuredDimension(context, ((context * 4) / 3));
       return;
    }
}
