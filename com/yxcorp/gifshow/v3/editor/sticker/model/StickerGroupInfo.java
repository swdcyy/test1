package com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import java.io.Serializable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.String;
import java.lang.Integer;
import java.util.List;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;

public class StickerGroupInfo implements Serializable	// class@001275
{
    public final String mGroupId;
    public final String mGroupName;
    public final int mGroupType;
    public final boolean mOnTab;
    public List mStickerDetailInfoList;
    public static final long serialVersionUID = 0xe91638338f2fd8c9;

    public void StickerGroupInfo(MaterialGroupInfo p0){
       super();
       this.mStickerDetailInfoList = Lists.b();
       this.mGroupId = p0.getGroupId();
       this.mGroupName = p0.getGroupName();
       int i = (p0.getGroupType() == null)? 0: p0.getGroupType().intValue();
       this.mGroupType = i;
       this.mOnTab = true;
       return;
    }
    public void StickerGroupInfo(StickerGroupInfo p0){
       super();
       this.mStickerDetailInfoList = Lists.b();
       this.mGroupId = p0.mGroupId;
       this.mGroupName = p0.mGroupName;
       this.mGroupType = p0.mGroupType;
       this.mOnTab = p0.mOnTab;
       this.mStickerDetailInfoList = Lists.c(p0.getStickerInfos());
    }
    public void addStickerDetailInfo(StickerDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerGroupInfo.class, "1")) {
          return;
       }
       this.mStickerDetailInfoList.add(p0);
       return;
    }
    public List getStickerInfos(){
       return this.mStickerDetailInfoList;
    }
    public void updateStickerDetailInfoListAll(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerGroupInfo.class, "2")) {
          return;
       }
       this.mStickerDetailInfoList.clear();
       if (q.f(p0)) {
          return;
       }
       this.mStickerDetailInfoList.addAll(p0);
       return;
    }
}
