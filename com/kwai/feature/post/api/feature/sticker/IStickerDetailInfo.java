package com.kwai.feature.post.api.feature.sticker.IStickerDetailInfo;
import java.io.Serializable;
import java.lang.String;

public interface abstract IStickerDetailInfo implements Serializable	// class@0013c6
{

    String getStickerDefaultText();
    boolean isTagSticker();
    boolean isVoteSticker();
    void setStickerDefaultText(String p0);
}
