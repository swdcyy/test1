package com.yxcorp.plugin.search.entity.template.aggregate.b;
import ok.h;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.String;
import ekd.k0;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplatePhotoType;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import fg6.a;
import com.google.gson.JsonElement;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import java.lang.Class;
import com.google.gson.Gson;
import com.yxcorp.plugin.search.entity.ExtInfo;
import com.yxcorp.gifshow.log.model.FeedLogCtx;

public final class b implements h	// class@0013b4
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       TemplatePhotoType templatePhot = TemplatePhotoType.fromInt(k0.f(p0, "type", 0));
       TemplateBaseFeed templateBase = templatePhot.createFeed();
       templateBase.mId = k0.h(p0, "id", "");
       templateBase.mType = templatePhot;
       templateBase.mSubType = k0.h(p0, "subType", "");
       Gson a = a.a;
       templateBase.mCoverExtInfo = a.c(p0.e0("coverInfo"), CoverExtInfo.class);
       templateBase.mExtInfo = a.c(p0.e0("extInfo"), ExtInfo.class);
       templateBase.mFeedLogCtx = a.c(p0.e0("feedLogCtx"), FeedLogCtx.class);
       return templateBase;
    }
}
