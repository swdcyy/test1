package com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import fa6.e;
import fa6.b;

public class GeneralBottomBarInfo implements Serializable	// class@000a67
{
    public int mBottomBizType;
    public GeneralBottomBarInfo$BottomStyleInfo mBottomStyleInfo;
    public Map mEventTrackData;
    public String mFeedType;
    public String mId;
    public static final long serialVersionUID = 0x89a782ca7806bf1c;

    public void GeneralBottomBarInfo(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, GeneralBottomBarInfo.class, "1")) {
          return;
       }
       e uoe = new e(GeneralBottomBarInfo.class, "bottomEntryInfo", "generalBottomBarInfo");
       uoe.a(null);
       c.a.e(PhotoMeta.class, uoe);
       return;
    }
}
