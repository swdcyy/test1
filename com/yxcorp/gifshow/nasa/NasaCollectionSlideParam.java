package com.yxcorp.gifshow.nasa.NasaCollectionSlideParam;
import com.yxcorp.gifshow.nasa.NasaCollectionSlideParam$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class NasaCollectionSlideParam	// class@0020bb
{
    public final String mBizType;
    public final String mFrom;
    public final String mHsDepartmentId;
    public final String mPhotoId;

    public void NasaCollectionSlideParam(){
       super(new NasaCollectionSlideParam$a(""));
    }
    public void NasaCollectionSlideParam(NasaCollectionSlideParam$a p0){
       super();
       this.mBizType = p0.a;
       this.mPhotoId = p0.b;
       this.mHsDepartmentId = p0.c;
       this.mFrom = p0.d;
    }
    public boolean isHealthyType(){
       Object obj = PatchProxy.apply(null, this, NasaCollectionSlideParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("HEALTHY_SLIDE").equals(this.mBizType);
    }
}
