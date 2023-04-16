package com.yxcorp.gifshow.util.resource.m;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse;
import com.yxcorp.gifshow.util.resource.n;
import lnc.s6;
import boc.e;
import com.yxcorp.gifshow.util.resource.MagicModel;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig;
import qfc.a;
import q87.c;
import java.util.List;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper$MagicModelConfig;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;
import boc.f;
import java.lang.Runnable;
import t45.c;
import boc.s;
import ekd.k1;

public final class m implements o	// class@000cf1
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final Object apply(Object p0){
       int i = 0;
       if (s6.f()) {
          YlabModelConfigResponse$ModelConfig modelConfigB = p0.getModelConfigByKey(e.B.mResource);
          YlabModelConfigResponse$ModelConfig modelConfigB1 = p0.getModelConfigByKey("magic_ycnn_beautify_assets_base");
          if (modelConfigB != null && modelConfigB1 != null) {
             Object[] objArray = new Object[i];
             a.C().w("resourcemanager", "replace beautify assets url", objArray);
             modelConfigB.mModelUrls = modelConfigB1.mModelUrls;
             p0.mModelConfigs.remove(modelConfigB1);
          }
       }
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       Iterator iterator = p0.getModelList().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          MagicModel magicModel = MagicEmojiResourceHelper.a.get(str);
          if (magicModel == null) {
             magicModel = new MagicModel(str);
          }
          uConcurrentH.put(str, magicModel);
       }
       MagicEmojiResourceHelper.a = uConcurrentH;
       Object[] objArray1 = new Object[i];
       a.C().t("MagicEmojiResourceHelper", "setMagicModelList from net "+MagicEmojiResourceHelper.a.size(), objArray1);
       MagicEmojiResourceHelper$MagicModelConfig magicModelCo = new MagicEmojiResourceHelper$MagicModelConfig();
       magicModelCo.mModels = new ArrayList(MagicEmojiResourceHelper.a.keySet());
       c.a(new f(magicModelCo));
       k1.o(new s(p0));
       return p0;
    }
}
