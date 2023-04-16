package com.kwai.feature.post.api.encode.b;
import erd.g;
import java.lang.Object;
import com.kwai.feature.post.api.feature.encode.model.EncodeConfigResponse;
import com.kwai.feature.post.api.encode.d;
import lnc.p3;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import q87.c;
import exc.b;
import java.lang.Class;
import lnc.pa;
import lnc.qa;

public final class b implements g	// class@00130d
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       p0 = p0.mEncodeConfig;
       Object[] objArray = new Object[0];
       p3.D().w("EncodeConfigResponse", "response w:"+p0.getWidth()+" h:"+p0.getHeight()+"allowHE:"+p0.isAllowHardwareEncodeTest(), objArray);
       p0 = qa.r(b.class);
       if (p0 != null) {
          p0.YC();
       }
       return;
    }
}
