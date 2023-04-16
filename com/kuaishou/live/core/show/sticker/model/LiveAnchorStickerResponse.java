package com.kuaishou.live.core.show.sticker.model.LiveAnchorStickerResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class LiveAnchorStickerResponse implements CursorResponse, Serializable	// class@0010b6
{
    public String cursor;
    public boolean mEnableLocalSticker;
    public int mEnableMaxStickerSize;
    public LiveStickerBannedTips mLiveStickerBannedTips;
    public List mStickers;
    public static final long serialVersionUID = 0xeebfc6507a03839b;

    public void LiveAnchorStickerResponse(){
       super();
       this.mEnableLocalSticker = false;
       this.mEnableMaxStickerSize = 1;
       this.cursor = "no_more";
    }
    public String getCursor(){
       return this.cursor;
    }
    public List getItems(){
       return this.mStickers;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorStickerResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.getCursor());
    }
}
