package com.yxcorp.gifshow.albumwrapper.imagecrop.b;
import com.kwai.feature.post.api.feature.mix.model.IMixImportTimeLineTextFormatter;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import java.lang.Double;

public final class b implements IMixImportTimeLineTextFormatter, Serializable	// class@001b64
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final String formatTime(double p0){
       Object[] objArray = new Object[]{Double.valueOf(p0)};
       return String.format("%.1f", objArray);
    }
}
