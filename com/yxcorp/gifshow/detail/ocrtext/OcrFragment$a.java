package com.yxcorp.gifshow.detail.ocrtext.OcrFragment$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import androidx.fragment.app.Fragment;

public final class OcrFragment$a	// class@0015fc
{

    public void OcrFragment$a(){
       super();
    }
    public void OcrFragment$a(u p0){
       super();
    }
    public final OcrFragment a(QPhoto p0){
       OcrFragment obj = PatchProxy.applyOneRefs(p0, this, OcrFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "mPhoto");
       obj = new OcrFragment();
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("OCR_PHOTO_INFO", b.c(p0));
       obj.setArguments(uBundle);
       return obj;
    }
}
