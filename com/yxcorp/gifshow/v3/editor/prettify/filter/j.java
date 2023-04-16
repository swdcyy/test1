package com.yxcorp.gifshow.v3.editor.prettify.filter.j;
import msd.l;
import java.lang.Object;
import java.lang.Integer;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;

public final class j implements l	// class@001177
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final Object invoke(Object p0){
       return Filters.getFilterConfigFromFeatureId(p0.intValue(), FilterVideoPlugin$FilterEntranceType.EDIT);
    }
}
