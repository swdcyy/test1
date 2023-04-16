package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.ToDeleteMagicFace;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;

public class ToDeleteMagicFace extends MagicEmoji$MagicFace	// class@001bd3
{
    public boolean mIsSelected;
    public int mItemType;
    public static final long serialVersionUID = 0x1651f768db60c6dc;

    public void ToDeleteMagicFace(){
       super();
    }
    public static List transMagicFaceList(List p0,int p1){
       ArrayList obj;
       if (PatchProxy.isSupport(ToDeleteMagicFace.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ToDeleteMagicFace.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       if (!q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             obj.add(ToDeleteMagicFace.transToDeleteMagicFace(iterator.next(), p1));
          }
       }
       return obj;
    }
    public static ToDeleteMagicFace transToDeleteMagicFace(MagicEmoji$MagicFace p0,int p1){
       ToDeleteMagicFace obj;
       if (PatchProxy.isSupport(ToDeleteMagicFace.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ToDeleteMagicFace.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ToDeleteMagicFace();
       if (p0 != null) {
          obj.mId = p0.mId;
          obj.mName = p0.mName;
          obj.mImages = p0.mImages;
          obj.mImage = p0.mImage;
          obj.mChecksum = p0.mChecksum;
          obj.mGifIconUrls = p0.mGifIconUrls;
          obj.mGifMaxShowCount = p0.mGifMaxShowCount;
          obj.mGifShowStartTime = p0.mGifShowStartTime;
          obj.mGifShowEndTime = p0.mGifShowEndTime;
          obj.mItemType = p1;
       }
       return obj;
    }
}
