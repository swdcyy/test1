package com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor$commit$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import java.lang.Number;

public final class FilterPicTemplateProcessor$commit$1$1 extends Lambda implements l	// class@001164
{
    public static final FilterPicTemplateProcessor$commit$1$1 INSTANCE;

    static {
       FilterPicTemplateProcessor$commit$1$1.INSTANCE = new FilterPicTemplateProcessor$commit$1$1();
    }
    public void FilterPicTemplateProcessor$commit$1$1(){
       super(1);
    }
    public final FilterConfig invoke(int p0){
       if (PatchProxy.isSupport(FilterPicTemplateProcessor$commit$1$1.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, FilterPicTemplateProcessor$commit$1$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Filters.getFilterConfigFromFeatureId(p0, FilterVideoPlugin$FilterEntranceType.EDIT);
    }
    public Object invoke(Object p0){
       return this.invoke(p0.intValue());
    }
}
