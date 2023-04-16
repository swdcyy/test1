package com.kuaishou.gifshow.kuaishan.logic.c1;
import erd.o;
import java.lang.Object;
import java.util.List;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import java.util.ArrayList;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import u80.g;
import java.lang.String;

public final class c1 implements o	// class@001a04
{
    public static final c1 b;

    static {
       c1.b = new c1();
    }
    public void c1(){
       super();
    }
    public final Object apply(Object p0){
       ArrayList uArrayList = new ArrayList();
       for (int i = 0; i < p0.size(); i = i + 1) {
          KSTemplateDetailInfo kSTemplateDe = p0.get(i);
          uArrayList.add(new g(kSTemplateDe.mTemplateId, kSTemplateDe.mName, kSTemplateDe.mIconUrls, kSTemplateDe.mColor));
       }
       return uArrayList;
    }
}
