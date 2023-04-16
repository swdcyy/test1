package com.kuaishou.merchant.api.core.model.live.shop.LiveShopRMCModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopRMCModel$Row;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopComponentModel;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopRMCModel$UpdateData;

public class LiveShopRMCModel implements Serializable	// class@00154d
{
    public List mRows;
    public Map mUpdateComponentsMap;
    public List mUpdateData;
    public static final long serialVersionUID = 0x2b22dd0345b06f88;

    public void LiveShopRMCModel(){
       super();
       this.mUpdateComponentsMap = new HashMap();
    }
    public final void a(LiveShopRMCModel p0,int p1){
       Iterator iterator;
       LiveShopComponentModel mBusinessTyp;
       if (PatchProxy.isSupport(LiveShopRMCModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveShopRMCModel.class, "2")) {
          return;
       }
       LiveShopRMCModel$Row rowByIndex = p0.getRowByIndex(p1);
       if (this.mRows == null) {
          this.mRows = new ArrayList();
       }
       LiveShopRMCModel$Row rowByIndex1 = this.getRowByIndex(p1);
       if (rowByIndex1 == null && rowByIndex != null) {
          this.mRows.add(rowByIndex);
       }else if(rowByIndex1 != null && (rowByIndex != null && (!q.f(rowByIndex.mComponents) && (q.f(rowByIndex1.mComponents) || PatchProxy.applyVoidTwoRefs(rowByIndex, rowByIndex1, this, LiveShopRMCModel.class, "3"))))){
          iterator = rowByIndex.mComponents.iterator();
          while (iterator.hasNext()) {
             mBusinessTyp = iterator.next();
             Iterator iterator1 = rowByIndex1.mComponents.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   LiveShopComponentModel liveShopComp1 = iterator1.next();
                   if (mBusinessTyp.mCode == liveShopComp1.mCode) {
                      liveShopComp1.incrementMerge(mBusinessTyp);
                   }
                }else {
                   continue ;
                }
             }
          }
       }
       if (rowByIndex1 == null || (!q.f(rowByIndex1.mComponents) && !PatchProxy.applyVoidOneRefs(rowByIndex1, this, LiveShopRMCModel.class, "4"))) {
          iterator = rowByIndex1.mComponents.iterator();
          while (iterator.hasNext()) {
             LiveShopComponentModel liveShopComp = iterator.next();
             mBusinessTyp = liveShopComp.mBusinessType;
             if (mBusinessTyp != null && this.mUpdateComponentsMap.containsKey(Integer.valueOf(mBusinessTyp))) {
                mBusinessTyp = this.mUpdateComponentsMap.get(Integer.valueOf(liveShopComp.mBusinessType));
                if (mBusinessTyp != null && liveShopComp.mCode == mBusinessTyp.mCode) {
                   liveShopComp.incrementMerge(mBusinessTyp);
                   break ;
                }
             }
          }
       }
       return;
    }
    public LiveShopRMCModel$Row getRowByIndex(int p0){
       Iterator obj;
       if (PatchProxy.isSupport(LiveShopRMCModel.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveShopRMCModel.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!q.f(this.mRows)) {
          obj = this.mRows.iterator();
          while (obj.hasNext()) {
             LiveShopRMCModel$Row row = obj.next();
             if (row.mIndex == p0) {
                return row;
             }
          }
       }
       return null;
    }
    public void incrementMerge(LiveShopRMCModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopRMCModel.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.mRows == null) {
          this.mRows = p0.mRows;
       }else {
          LiveShopRMCModel mUpdateData = p0.mUpdateData;
          if (!PatchProxy.applyVoidOneRefs(mUpdateData, this, LiveShopRMCModel.class, "5") && !q.f(mUpdateData)) {
             Iterator iterator = mUpdateData.iterator();
             while (iterator.hasNext()) {
                LiveShopRMCModel$UpdateData updateData = iterator.next();
                if (updateData.mComponent != null) {
                   LiveShopRMCModel$UpdateData mBizType = updateData.mBizType;
                   if (mBizType != null) {
                      this.mUpdateComponentsMap.put(Integer.valueOf(mBizType), updateData.mComponent);
                   }
                }
             }
          }
          this.a(p0, 0);
          this.a(p0, 1);
       }
       return;
    }
}
