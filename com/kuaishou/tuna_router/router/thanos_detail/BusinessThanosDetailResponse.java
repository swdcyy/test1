package com.kuaishou.tuna_router.router.thanos_detail.BusinessThanosDetailResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.tuna_router.router.thanos_detail.BusinessThanosDetailModel;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Boolean;
import la6.a;

public class BusinessThanosDetailResponse implements Serializable, b	// class@001181
{
    public BusinessThanosDetailModel mBusinessThanosDetailModel;
    public static final long serialVersionUID = 0x48741df0147034bd;

    public void BusinessThanosDetailResponse(){
       super();
    }
    public String getCursor(){
       return this.mBusinessThanosDetailModel.mCursor;
    }
    public List getItems(){
       BusinessThanosDetailResponse obj = PatchProxy.apply(null, this, BusinessThanosDetailResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBusinessThanosDetailModel;
       if (obj != null) {
          BusinessThanosDetailModel mQPhotos = obj.mQPhotos;
          if (mQPhotos != null && mQPhotos.length > 0) {
             return Arrays.asList(mQPhotos);
          }
       }
       return new ArrayList();
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, BusinessThanosDetailResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mBusinessThanosDetailModel.mCursor);
    }
}
